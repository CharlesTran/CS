.386
.model				flat, stdcall								;ģʽ����
option				casemap:none

includelib	msvcrt.lib											;����⺯��
printf				PROTO			C:dword,:vararg				;ʹ�ã�printf(str)
scanf				PROTO			C:dword,:vararg				;ʹ�ã�scanf("%d", &op)
strlen				PROTO			C:dword,:vararg				;ʹ�ã�strlen(&op)	
getchar				PROTO			C:vararg
	
.data															;���ݲ���
Anum				byte		1000 dup(?)						;������
AnumR				byte		1000 dup(?)						;��������ת�� ����123��תΪ321
Bnum				byte		1000 dup(?)						;����
BnumR				byte		1000 dup(?)						;������ת
Ans					byte		1000 dup(0)						;��
AnsR				byte		1000 dup(?)						;���ķ�ת
infoA				byte		'�����뱻����A��', 0ah, 0		;�����뱻������ʾ
infoB				byte		'���������B��', 0ah, 0			;�����������ʾ
infoAns				byte		'A����B���ڣ�', 0ah, 0			;��ӡ�����ʾ	
formatInput			byte		'%s',0							;scanf�����ʽ���ַ���
formatOutputStr		byte		'%s',0ah,0						;printf�����ʽ���ַ���
formatOutputNum		byte		'%d',0							;printf�����ʽ������
formatOutputChar	byte		'%c',0							;��������ַ�
Alen				dword		0								;A�ĳ���
Blen				dword		0								;B�ĳ���
Anslen				dword		0								;����ĳ���
Blank				byte		' ',0							;�ո����
NewLine				byte		0ah,0							;����
NegativeSign		byte		'-',0							;����
temp1				dword		?								;���������±�
temp2				dword		?								;�������±�
temp3				dword		0								;����±�
SignA				dword		0								;�������
SignB				dword		0								;�������

.code															;���벿��
VisitB	proc	stdcall a:dword
		mov temp2, 0
		mov temp3, 0
		mov eax, a
		add temp3,eax											;ÿ��ѭ������������±�ΪAnum���±���Bnum���±��
		PrintB:
			mov eax, temp1										;ȡ����������ǰλ
			mov al, AnumR[eax]
			sub al, 48											;��ȥ48
			mov ebx, temp2										;ȡ��������ǰλ
			mov bl, BnumR[ebx]
			sub bl, 48
			mul bl												;����˻������������al��
			mov ebx, temp3										;ȡ����������е������������������al
			add al, Ans[ebx]
			mov bl, 10
			div bl												;��al����10���̼���λλ������al�У���������ǰλ������ah��
			mov ebx, temp3										;������,��ǰ����һλ
			inc ebx
			add al, Ans[ebx]
			mov Ans[ebx], al	
			
			mov ebx, temp3										;��������
			mov Ans[ebx], ah	

			add temp2, 1
			add temp3, 1

			mov eax, temp2
			cmp eax, Blen
			je	VisitBOver
			loop PrintB
		
		VisitBOver:
			ret
VisitB	endp

main	proc
		invoke printf,offset infoA								;���뱻�����ͳ���
		invoke scanf, offset formatInput, offset Anum			
		invoke printf, offset infoB								
		invoke scanf, offset formatInput, offset Bnum			
		
		invoke strlen, offset Anum								;���㱻�����ͳ����ĳ���					
		mov Alen, eax
		invoke strlen, offset Bnum
		mov Blen, eax
		
		mov eax, 0												;�жϱ���������
		mov al, Anum[eax]										
		cmp al, 02DH											
		jg	RevearseAContinue
		add SignA, 1											;����Ǹ�������SignA��1
		sub Alen, 1												;ͬʱ��A���ݳ��ȼ�1

		RevearseAContinue:
		mov edi, SignA											;��תA�ַ��������ݷ���ȷ���Ƿ�ȥ����һ���ַ�
		mov ebx, Alen
		dec ebx													;��ebx��ֵΪAlen-1
		RevearseAnum:											
			mov al, Anum[edi]
			mov AnumR[ebx], al
			inc edi
			dec ebx
			cmp ebx, 0
			jl RevearseAnumOver
			loop RevearseAnum
		RevearseAnumOver:

		mov eax, 0												;�жϳ�������
		mov al, Bnum[eax]										
		cmp al, 02DH											
		jg	RevearseBContinue
		add SignB, 1
		sub Blen, 1

		RevearseBContinue:
		mov edi, SignB											;��תB�ַ���
		mov ebx, Blen
		dec ebx													;��ebx��ֵΪAlen-1
		RevearseBnum:											
			mov al, Bnum[edi]
			mov BnumR[ebx], al
			inc edi
			dec ebx
			cmp ebx, 0
			jl RevearseBnumOver
			loop RevearseBnum
		RevearseBnumOver:
		
		mov temp1, 0											;����A�ַ���
		VisitA:
			invoke VisitB, temp1								;���ú�������B�ַ���
			add temp1, 1
			mov eax, temp1
			cmp eax, Alen										;�Ƚ�Anum������±��Ƿ����Anum�����Ԫ�ظ���
			je VisitAOver
			loop VisitA											;ѭ��Anum

		VisitAOver:
		
		CutZero:												;ȥ�����ǰ�����0
			mov eax, temp3						
			cmp Ans[eax], 0
			jg	Continue
			sub temp3, 1
			cmp temp3, 0										;���temp3Ϊ0����ֱ�Ӵ�ӡ0�����˳�
			je	PrintAndOver
			loop CutZero

		PrintAndOver:											;��ӡ0
			invoke printf, offset infoAns
			invoke printf, offset formatOutputNum, temp3
			invoke printf, offset NewLine
			ret

		Continue:
		mov ebx, temp3;
		mov Anslen, ebx	
		mov edi, 0												;��ת���ַ���												;
		RevearseAns:											
			mov al, Ans[ebx]
			mov AnsR[edi], al
			inc edi
			dec ebx
			cmp edi, Anslen
			jg RevearseAnsOver
			loop RevearseAns
		RevearseAnsOver:
		
		invoke printf, offset infoAns							;��ӡ���
		mov eax, SignA											;���ݳ����ͱ��������Ŵ�ӡ����
		mov ebx, SignB
		cmp eax, ebx	
		je	PrintAnsContinue
		invoke printf, offset NegativeSign

		PrintAnsContinue:										;������ս��
		mov ebx, 0
		PrintAns:
			invoke printf, offset formatOutputNum, AnsR[ebx]
			inc ebx
			cmp ebx, temp3
			jg PrintAnsOver
			loop PrintAns
		PrintAnsOver:
			;invoke printf, offset NewLine
		invoke getchar											;������exe�ļ�����̨��ͣ
		invoke getchar
		ret
main	endp
end		main