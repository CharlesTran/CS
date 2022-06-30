.386
.model flat, stdcall
option casemap : none

includelib msvcrt.lib

printf   PROTO C :ptr sbyte, :VARARG
scanf   PROTO C :ptr sbyte , :VARARG
strlen PROTO C :ptr sbyte, :VARARG

.data 
szMsg sbyte 'Please Enter a number:', 0ah, 0
szInFmtStr sbyte '%s', 0
outputMsg byte "the result is %s",0ah,0
CharA byte 100 dup(0)
CharB byte 100 dup(0)
resultChar byte 200 dup(0)
IntA dword 100 dup(0)
IntB dword 100 dup(0)
resultInt dword 200 dup(0)
lengthA dword 0
lengthB dword 0
lengthC dword 0
ten dword 10

.code
char2int_reverse proc far C numChar: ptr byte, numInt: ptr dword, len: dword
	mov ecx, len
	mov esi, numChar
L1:
	movzx eax, byte ptr [esi]
	sub eax, 30H
	push eax
	inc esi
	loop L1;
	mov ecx, len
	mov esi, numInt
L2:
	pop eax
	mov dword ptr [esi], eax
	add esi, 4
	loop L2
	ret
char2int_reverse endp
int2char_reverse proc far C
	mov ecx, lengthC 
	mov esi, 0 
L1:
	mov eax, dword ptr resultInt[4 * esi] 
	add eax, 30H 
	push eax
	inc esi
	loop L1 ;
	mov ecx, lengthC
	mov esi, 0
L2:
	pop eax
	mov byte ptr resultChar[esi], al
	inc esi
	loop L2
	ret
int2char_reverse endp
BIG_MUL proc far C
	xor ebx, ebx
L1:
	inc ebx
	cmp ebx, lengthA
	ja  endLoop
	xor ecx, ecx
L2:
	xor edx, edx
	mov esi, ecx
	add esi, ebx
	dec esi
	mov eax, IntA[4*ebx-4]
	mul IntB[4*ecx]
	add resultInt[4*esi], eax
	inc ecx
	cmp ecx, lengthB
	jz L1
	jmp L2
endLoop:
	mov ecx, lengthA
	add ecx, lengthB
	;inc ecx
	mov esi, offset lengthC
	mov [esi], ecx
	xor ebx,ebx
	xor edx,edx
	xor esi,esi
Carry:
	cmp ebx,ecx
	jz removez_pre
	mov eax, resultInt[4*ebx]
	add eax,esi
	xor edx,edx;除法之前EDX一定要清零
	div ten
	mov esi,eax
	mov resultInt[4*ebx],edx
	inc ebx
	jmp Carry
removez_pre:
	mov ecx, lengthC
removezero:
	cmp dword ptr resultInt[4 * ecx], 0
	jnz endwhile1 
	dec ecx 
	jmp removezero
endwhile1:
	inc ecx 
	mov esi, offset lengthC
	mov [esi], ecx
	invoke int2char_reverse 
	ret
BIG_MUL endp
main proc
	invoke printf, offset szMsg
	invoke scanf, offset szInFmtStr, offset CharA
	invoke printf, offset szMsg
	invoke scanf, offset szInFmtStr, offset CharB
	invoke strlen, offset CharA
	mov lengthA, eax
	invoke char2int_reverse, offset CharA, offset IntA, lengthA
	invoke strlen, offset CharB
	mov lengthB, eax
	invoke char2int_reverse, offset CharB, offset IntB, lengthB
	invoke BIG_MUL
	invoke printf, offset outputMsg, offset resultChar
	ret
main endp
end main