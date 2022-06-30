.386
.model				flat, stdcall								;模式定义
option				casemap:none

includelib	msvcrt.lib											;引入库函数
printf				PROTO			C:dword,:vararg				;使用：printf(str)
scanf				PROTO			C:dword,:vararg				;使用：scanf("%d", &op)
strlen				PROTO			C:dword,:vararg				;使用：strlen(&op)	
getchar				PROTO			C:vararg
	
.data															;数据部分
Anum				byte		1000 dup(?)						;被乘数
AnumR				byte		1000 dup(?)						;被乘数反转， 比如123反转为321
Bnum				byte		1000 dup(?)						;乘数
BnumR				byte		1000 dup(?)						;乘数反转
Ans					byte		1000 dup(0)						;积
AnsR				byte		1000 dup(?)						;积的反转
infoA				byte		'请输入被乘数A：', 0ah, 0		;请输入被乘数提示
infoB				byte		'请输入乘数B：', 0ah, 0			;请输入乘数提示
infoAns				byte		'A乘以B等于：', 0ah, 0			;打印结果提示	
formatInput			byte		'%s',0							;scanf输入格式化字符串
formatOutputStr		byte		'%s',0ah,0						;printf输出格式化字符串
formatOutputNum		byte		'%d',0							;printf输出格式化整数
formatOutputChar	byte		'%c',0							;输出单个字符
Alen				dword		0								;A的长度
Blen				dword		0								;B的长度
Anslen				dword		0								;结果的长度
Blank				byte		' ',0							;空格符号
NewLine				byte		0ah,0							;换行
NegativeSign		byte		'-',0							;负号
temp1				dword		?								;被乘数的下标
temp2				dword		?								;乘数的下标
temp3				dword		0								;结果下标
SignA				dword		0								;结果符号
SignB				dword		0								;结果符号

.code															;代码部分
VisitB	proc	stdcall a:dword
		mov temp2, 0
		mov temp3, 0
		mov eax, a
		add temp3,eax											;每次循环，结果数组下标为Anum数下标与Bnum数下标和
		PrintB:
			mov eax, temp1										;取出被乘数当前位
			mov al, AnumR[eax]
			sub al, 48											;减去48
			mov ebx, temp2										;取出乘数当前位
			mov bl, BnumR[ebx]
			sub bl, 48
			mul bl												;计算乘积，结果保存在al中
			mov ebx, temp3										;取出结果数组中的数，并让这个数加上al
			add al, Ans[ebx]
			mov bl, 10
			div bl												;用al除以10，商即进位位保存在al中，余数即当前位保存在ah中
			mov ebx, temp3										;保存商,当前的下一位
			inc ebx
			add al, Ans[ebx]
			mov Ans[ebx], al	
			
			mov ebx, temp3										;保存余数
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
		invoke printf,offset infoA								;输入被乘数和乘数
		invoke scanf, offset formatInput, offset Anum			
		invoke printf, offset infoB								
		invoke scanf, offset formatInput, offset Bnum			
		
		invoke strlen, offset Anum								;计算被乘数和乘数的长度					
		mov Alen, eax
		invoke strlen, offset Bnum
		mov Blen, eax
		
		mov eax, 0												;判断被乘数符号
		mov al, Anum[eax]										
		cmp al, 02DH											
		jg	RevearseAContinue
		add SignA, 1											;如果是负号则让SignA加1
		sub Alen, 1												;同时让A数据长度减1

		RevearseAContinue:
		mov edi, SignA											;反转A字符串，根据符号确定是否去掉第一个字符
		mov ebx, Alen
		dec ebx													;让ebx的值为Alen-1
		RevearseAnum:											
			mov al, Anum[edi]
			mov AnumR[ebx], al
			inc edi
			dec ebx
			cmp ebx, 0
			jl RevearseAnumOver
			loop RevearseAnum
		RevearseAnumOver:

		mov eax, 0												;判断乘数符号
		mov al, Bnum[eax]										
		cmp al, 02DH											
		jg	RevearseBContinue
		add SignB, 1
		sub Blen, 1

		RevearseBContinue:
		mov edi, SignB											;反转B字符串
		mov ebx, Blen
		dec ebx													;让ebx的值为Alen-1
		RevearseBnum:											
			mov al, Bnum[edi]
			mov BnumR[ebx], al
			inc edi
			dec ebx
			cmp ebx, 0
			jl RevearseBnumOver
			loop RevearseBnum
		RevearseBnumOver:
		
		mov temp1, 0											;遍历A字符串
		VisitA:
			invoke VisitB, temp1								;调用函数遍历B字符串
			add temp1, 1
			mov eax, temp1
			cmp eax, Alen										;比较Anum数组的下标是否大于Anum数组的元素个数
			je VisitAOver
			loop VisitA											;循环Anum

		VisitAOver:
		
		CutZero:												;去除结果前多余的0
			mov eax, temp3						
			cmp Ans[eax], 0
			jg	Continue
			sub temp3, 1
			cmp temp3, 0										;如果temp3为0，则直接打印0，并退出
			je	PrintAndOver
			loop CutZero

		PrintAndOver:											;打印0
			invoke printf, offset infoAns
			invoke printf, offset formatOutputNum, temp3
			invoke printf, offset NewLine
			ret

		Continue:
		mov ebx, temp3;
		mov Anslen, ebx	
		mov edi, 0												;反转积字符串												;
		RevearseAns:											
			mov al, Ans[ebx]
			mov AnsR[edi], al
			inc edi
			dec ebx
			cmp edi, Anslen
			jg RevearseAnsOver
			loop RevearseAns
		RevearseAnsOver:
		
		invoke printf, offset infoAns							;打印结果
		mov eax, SignA											;根据乘数和被乘数符号打印负号
		mov ebx, SignB
		cmp eax, ebx	
		je	PrintAnsContinue
		invoke printf, offset NegativeSign

		PrintAnsContinue:										;输出最终结果
		mov ebx, 0
		PrintAns:
			invoke printf, offset formatOutputNum, AnsR[ebx]
			inc ebx
			cmp ebx, temp3
			jg PrintAnsOver
			loop PrintAns
		PrintAnsOver:
			;invoke printf, offset NewLine
		invoke getchar											;用于让exe文件控制台悬停
		invoke getchar
		ret
main	endp
end		main