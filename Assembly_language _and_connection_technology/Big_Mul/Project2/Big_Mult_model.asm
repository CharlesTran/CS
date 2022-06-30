.386
.model flat, stdcall
option casemap : none

includelib msvcrt.lib
include msvcrt.inc

.data
;numcharA/B�������100���ֽڵ��ַ���ȫ����ʼ��Ϊ0
numCharA byte 100 dup(0)
numCharB byte 100 dup(0)
resultChar byte 200 dup(0)
numIntA dword 100 dup(0)
numIntB dword 100 dup(0)
result dword 200 dup(0)
;����ĸ�ʽ
inputMsg byte "please input a large multiplier: ",0
szFmt_s byte "%s", 0
szFmt_d byte "%d", 0
;����ĸ�ʽ
outputMsg byte "the result is %s",0ah,0
outputMsg2 byte "the result is %s%s",0ah,0
;��lenthA/B/C��ʼ��Ϊ0
lengthA dword 0
lengthB dword 0
lengthC dword 0
;���ű�־λ����ʼֵΪ0����ʾΪ����Ϊ1��ʾΪ��	
radix dword 10
negativeFlag byte 0
negativeImg byte "-"

.code
;=================================================================================
;�ַ����е�����������ջ��Ȼ���ջ��ʵ�ַ�ת���ܣ�����byte������ת��Ϊdword������
;��תǰΪnumChar,Ϊbyte�����飬ÿ��byte�洢�ַ�'0'~'9'����ת��ΪnumInt��Ϊdword�����飬ÿ��dword�洢����0~9
;SS:ESPָʾ����ջ�е�λ��
str2int_reverse proc far C numChar:ptr byte, numInt:ptr dword, len:dword
	mov ecx, len ;�ַ������ȼ�Ϊѭ���Ĵ���
	mov esi, numChar
L1:
	movzx eax, byte ptr [esi] ;��λ0��չ
	sub eax, 30H ;30H��Ӧ'0'���ַ�'0'~'9' - '0'�õ�����0~9
	push eax ;eax��ջ
	inc esi ;esi++
	loop L1 ;��byte����numCharȫ����ջ�����λ����ջ�����λ�����ջ

	mov ecx, len
	mov esi, numInt
L2:
	pop eax
	mov dword ptr [esi], eax
	add esi, 4
	loop L2	;��byte����numChar���γ�ջ�浽dword�����У����λ�ȳ�ջ�����λ����ջ

	ret
str2int_reverse endp


;===============================================================
;�ַ����е�����������ջ��Ȼ���ջ��ʵ�ַ�ת���ܣ�����dword������ת��Ϊbyte������
;��תǰΪnumInt,Ϊdword�����飬ÿ��dword�洢����0~9����ת��ΪnumChar��Ϊbyte�����飬ÿ��byte�洢�ַ�'0'~'9'
;SS:ESPָʾ����ջ�е�λ��
int2str_reverse proc far C uses eax esi ecx 
	mov ecx, lengthC ;����ĳ���Ϊѭ���Ĵ���
	mov esi, 0 
L1:
	mov eax, dword ptr result[4 * esi] 
	add eax, 30H ;����0~9 + '0'�õ��ַ�'0'~'9'
	push eax
	inc esi
	loop L1 ;��dword����numIntȫ����ջ�����λ����ջ�����λ�����ջ

	mov ecx, lengthC
	mov esi, 0
L2:
	pop eax
	mov byte ptr resultChar[esi], al ;���γ�ջ���ѵͰ�λ����resultChar�Ķ�Ӧλ���У����λ�ȳ�ջ������resultChar�����λ��
	inc esi
	loop L2
	
	ret
int2str_reverse endp


;=======================================================================================================
;������A�ĳ��ȸ���lengthA,������str2int_reverse
getStringALen proc far C uses eax
	.if numCharA == 2DH	;2DH��ӦASCII��Ϊ'-'
		xor negativeFlag, 1 
		invoke crt_strlen, addr (numCharA + 1) ;�����������ַ������ȣ������eax��
		mov lengthA, eax
		invoke str2int_reverse, addr (numCharA + 1), addr numIntA, lengthA ;�ַ�����ת����byte����תdword����
	.else ;���AΪ����
		invoke crt_strlen, addr numCharA ;���ַ������ȣ��������eax��
		mov lengthA, eax
		invoke str2int_reverse, addr numCharA, addr numIntA, lengthA
	.endif
	ret
getStringALen endp

;������B�ĳ��ȸ���lengthB,������str2int_reverse
getStringBLen proc far C uses eax
	.if numCharB == 2DH	;2DH��ӦASCII��Ϊ'-'
		xor negativeFlag, 1 
		invoke crt_strlen, addr (numCharB + 1) ;�����������ַ������ȣ������eax��
		mov lengthB, eax
		invoke str2int_reverse, addr (numCharB + 1), addr numIntB, lengthB ;�ַ�����ת����byte����תdword����
	.else ;���AΪ����
		invoke crt_strlen, addr numCharB ;���ַ������ȣ��������eax��
		mov lengthB, eax
		invoke str2int_reverse, addr numCharB, addr numIntB, lengthB
	.endif
	ret
getStringBLen endp
;=============================================================================================================
;ģ������Ĵ�������㷨
high_multiply proc far C uses eax ecx esi ebx
	mov ebx, -1
OuterLoop: 
	inc ebx
	cmp ebx, lengthA
	jnb endLoop1 ;���ebx >= lengthA,����ѭ��
	xor ecx, ecx
InnerLoop:
	xor edx, edx
	mov eax, dword ptr numIntA[4 * ebx]
	mul numIntB[4 * ecx] ;numIntA[4 * ebx] * numIntB[4 * ecx]�������EDX:EAX��,���9*9 = 81Ҳ���ᳬ��8���ֽڣ����Խ��ֻ��EAX��
	mov esi, ecx
	add esi, ebx ;esi = ecx + ebx���������±�֮��
	add result[4 * esi], eax ;������λ��˵Ľ���ӵ�result����Ӧλ��
	inc ecx
	cmp ecx, lengthB 
	jnb OuterLoop ;�޷�����ecx>=lengthBʱ���±곬��lengthB - 1ʱ�����ڲ�ѭ�����½������ѭ��
	jmp InnerLoop	;����������������ڲ�ѭ��
endLoop1:
	mov ecx, lengthA
	add ecx, lengthB
	inc ecx	;ecx = lengthA + lengthB + 1
	mov esi, offset lengthC
	mov [esi], ecx ;��ecx����lengthC

	xor ebx, ebx
CarryCul:
	cmp ebx, ecx
	jnb endLoop2 ;ebx >= ecx����endLoop2,�������λ��ѭ��
	mov eax, result[4  * ebx]
	xor edx, edx
	div radix
	add result[4 * ebx + 4], eax ;result[i+1] += result[i]/10
	mov result[4 * ebx], edx ;result[i] = result[i] % 10
	inc ebx
	jmp CarryCul
endLoop2: 
	mov ecx, lengthC ;��MoveZero�����һλ��ʼ���
MoveZero:
	cmp dword ptr result[4 * ecx], 0
	jnz endwhile1 ;result��ĩλ��Ϊ0
	dec ecx ;ÿ��⵽һ��0��ʵ�ʳ��ȼ�һ 
	jmp MoveZero
endwhile1:
	inc ecx ;ʵ�ʳ���Ϊ����±��һ
	mov esi, offset lengthC
	mov [esi], ecx ;��ecx����lengthC
	invoke int2str_reverse ;��dword��������ת��Ϊbyte����

	ret
high_multiply endp

;======================================================================================
;������
main proc
	;���̷ֱ�����A��B�����洢Ϊbyte����
	invoke crt_printf, addr inputMsg
	invoke crt_scanf, addr szFmt_s, addr numCharA 
	invoke crt_printf, addr inputMsg
	invoke crt_scanf, addr szFmt_s, addr numCharB

	invoke getStringALen ;������A�ĳ��ȸ���lengthA,������str2int_reverse
	invoke getStringBLen ;������B�ĳ��ȸ���lengthB,������str2int_reverse
	
	invoke high_multiply ;���ô����˷��Ӻ���

	.if negativeFlag == 1
		invoke crt_printf, addr outputMsg2,addr negativeImg, addr resultChar
	.else 
		invoke crt_printf, addr outputMsg, addr resultChar
	.endif

	ret
main endp
end main
