.386
.model flat, stdcall
option casemap : none

includelib msvcrt.lib
include msvcrt.inc

.data
;numcharA/B最多容纳100个字节的字符，全部初始化为0
numCharA byte 100 dup(0)
numCharB byte 100 dup(0)
resultChar byte 200 dup(0)
numIntA dword 100 dup(0)
numIntB dword 100 dup(0)
result dword 200 dup(0)
;输入的格式
inputMsg byte "please input a large multiplier: ",0
szFmt_s byte "%s", 0
szFmt_d byte "%d", 0
;输出的格式
outputMsg byte "the result is %s",0ah,0
outputMsg2 byte "the result is %s%s",0ah,0
;把lenthA/B/C初始化为0
lengthA dword 0
lengthB dword 0
lengthC dword 0
;符号标志位，初始值为0，表示为正，为1表示为负	
radix dword 10
negativeFlag byte 0
negativeImg byte "-"

.code
;=================================================================================
;字符串中的内容依次入栈，然后出栈，实现反转功能，并将byte型数组转化为dword型数组
;反转前为numChar,为byte型数组，每个byte存储字符'0'~'9'，反转后为numInt，为dword型数组，每个dword存储数字0~9
;SS:ESP指示处于栈中的位置
str2int_reverse proc far C numChar:ptr byte, numInt:ptr dword, len:dword
	mov ecx, len ;字符串长度即为循环的次数
	mov esi, numChar
L1:
	movzx eax, byte ptr [esi] ;高位0扩展
	sub eax, 30H ;30H对应'0'，字符'0'~'9' - '0'得到数字0~9
	push eax ;eax入栈
	inc esi ;esi++
	loop L1 ;把byte数组numChar全部入栈，最高位先入栈，最低位最后入栈

	mov ecx, len
	mov esi, numInt
L2:
	pop eax
	mov dword ptr [esi], eax
	add esi, 4
	loop L2	;把byte数组numChar依次出栈存到dword数组中，最低位先出栈，最高位最后出栈

	ret
str2int_reverse endp


;===============================================================
;字符串中的内容依次入栈，然后出栈，实现反转功能，并将dword型数组转化为byte型数组
;反转前为numInt,为dword型数组，每个dword存储数字0~9，反转后为numChar，为byte型数组，每个byte存储字符'0'~'9'
;SS:ESP指示处于栈中的位置
int2str_reverse proc far C uses eax esi ecx 
	mov ecx, lengthC ;结果的长度为循环的次数
	mov esi, 0 
L1:
	mov eax, dword ptr result[4 * esi] 
	add eax, 30H ;数字0~9 + '0'得到字符'0'~'9'
	push eax
	inc esi
	loop L1 ;把dword数组numInt全部入栈，最高位先入栈，最低位最后入栈

	mov ecx, lengthC
	mov esi, 0
L2:
	pop eax
	mov byte ptr resultChar[esi], al ;依次出栈，把低八位存在resultChar的对应位置中，最低位先出栈，存在resultChar的最低位中
	inc esi
	loop L2
	
	ret
int2str_reverse endp


;=======================================================================================================
;将数组A的长度赋给lengthA,并调用str2int_reverse
getStringALen proc far C uses eax
	.if numCharA == 2DH	;2DH对应ASCII码为'-'
		xor negativeFlag, 1 
		invoke crt_strlen, addr (numCharA + 1) ;跳过负号求字符串长度，结果在eax中
		mov lengthA, eax
		invoke str2int_reverse, addr (numCharA + 1), addr numIntA, lengthA ;字符串反转，且byte数组转dword数组
	.else ;如果A为正数
		invoke crt_strlen, addr numCharA ;求字符串长度，结果放在eax中
		mov lengthA, eax
		invoke str2int_reverse, addr numCharA, addr numIntA, lengthA
	.endif
	ret
getStringALen endp

;将数组B的长度赋给lengthB,并调用str2int_reverse
getStringBLen proc far C uses eax
	.if numCharB == 2DH	;2DH对应ASCII码为'-'
		xor negativeFlag, 1 
		invoke crt_strlen, addr (numCharB + 1) ;跳过负号求字符串长度，结果在eax中
		mov lengthB, eax
		invoke str2int_reverse, addr (numCharB + 1), addr numIntB, lengthB ;字符串反转，且byte数组转dword数组
	.else ;如果A为正数
		invoke crt_strlen, addr numCharB ;求字符串长度，结果放在eax中
		mov lengthB, eax
		invoke str2int_reverse, addr numCharB, addr numIntB, lengthB
	.endif
	ret
getStringBLen endp
;=============================================================================================================
;模拟手算的大数相乘算法
high_multiply proc far C uses eax ecx esi ebx
	mov ebx, -1
OuterLoop: 
	inc ebx
	cmp ebx, lengthA
	jnb endLoop1 ;如果ebx >= lengthA,结束循环
	xor ecx, ecx
InnerLoop:
	xor edx, edx
	mov eax, dword ptr numIntA[4 * ebx]
	mul numIntB[4 * ecx] ;numIntA[4 * ebx] * numIntB[4 * ecx]结果放在EDX:EAX中,最大9*9 = 81也不会超过8个字节，所以结果只在EAX中
	mov esi, ecx
	add esi, ebx ;esi = ecx + ebx，即两个下标之和
	add result[4 * esi], eax ;把两个位相乘的结果加到result的相应位上
	inc ecx
	cmp ecx, lengthB 
	jnb OuterLoop ;无符号数ecx>=lengthB时，下标超过lengthB - 1时跳出内层循环重新进行外层循环
	jmp InnerLoop	;不超过则继续进行内层循环
endLoop1:
	mov ecx, lengthA
	add ecx, lengthB
	inc ecx	;ecx = lengthA + lengthB + 1
	mov esi, offset lengthC
	mov [esi], ecx ;将ecx赋给lengthC

	xor ebx, ebx
CarryCul:
	cmp ebx, ecx
	jnb endLoop2 ;ebx >= ecx跳到endLoop2,跳出求进位的循环
	mov eax, result[4  * ebx]
	xor edx, edx
	div radix
	add result[4 * ebx + 4], eax ;result[i+1] += result[i]/10
	mov result[4 * ebx], edx ;result[i] = result[i] % 10
	inc ebx
	jmp CarryCul
endLoop2: 
	mov ecx, lengthC ;让MoveZero从最后一位开始检查
MoveZero:
	cmp dword ptr result[4 * ecx], 0
	jnz endwhile1 ;result的末位不为0
	dec ecx ;每检测到一个0，实际长度减一 
	jmp MoveZero
endwhile1:
	inc ecx ;实际长度为最大下标加一
	mov esi, offset lengthC
	mov [esi], ecx ;将ecx赋给lengthC
	invoke int2str_reverse ;将dword数组逆序并转化为byte数组

	ret
high_multiply endp

;======================================================================================
;主函数
main proc
	;键盘分别输入A和B，并存储为byte数组
	invoke crt_printf, addr inputMsg
	invoke crt_scanf, addr szFmt_s, addr numCharA 
	invoke crt_printf, addr inputMsg
	invoke crt_scanf, addr szFmt_s, addr numCharB

	invoke getStringALen ;将数组A的长度赋给lengthA,并调用str2int_reverse
	invoke getStringBLen ;将数组B的长度赋给lengthB,并调用str2int_reverse
	
	invoke high_multiply ;调用大数乘法子函数

	.if negativeFlag == 1
		invoke crt_printf, addr outputMsg2,addr negativeImg, addr resultChar
	.else 
		invoke crt_printf, addr outputMsg, addr resultChar
	.endif

	ret
main endp
end main
