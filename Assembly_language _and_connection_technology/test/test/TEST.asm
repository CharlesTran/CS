.386
.model flat, stdcall
option casemap : none
includelib msvcrt.lib
includelib ucrt.lib
includelib legacy_stdio_definitions.lib
printf proto c:dword,:vararg
scanf proto c:dword,:vararg
.data
Mars_PrintInt byte "%d",0ah,0
Mars_GetInt byte "%d",0
Mars_PrintStr0 byte "The sum is :",0ah,0
Mars_PrintStr1 byte "All perfect numbers within 100:",0ah,0
.code
perfectNumber proc far C n:dword
local p[80]:dword
local i:dword
local num:dword
local count:dword
local s:dword
local k:dword
local @1:dword
local @12:dword
local @14:dword
local @4:dword
local @3:dword
local @2:dword
local @6:dword
local @5:dword
local @11:dword
local @7:dword
local @8:dword
local @9:dword
local @10:dword
local @13:dword
push 0
pop k
push 2
pop num
@IterationCheckL0:
mov eax, num
cmp eax, n
jnb @IterationEndL1
push 0
pop count
push num
pop s
push 1
pop i
@IterationCheckL3:
xor edx, edx
mov eax, num
mov ebx, 2
div ebx
mov @4, eax
mov eax, @4
mov ebx, 1
add eax, ebx
mov @3, eax
mov eax, i
cmp eax, @3
jnb @IterationEndL4
xor edx, edx
mov eax, num
mov ebx, i
div ebx
mov @6, edx
mov eax, @6
cmp eax, 0
jnz @IfFalseL6
push count
pop @7
inc count
push 0
pop @9
mov eax, @9
mov ebx, @7
add eax, ebx
mov @9, eax
mov edi, @9
mov eax,dword ptr p[edi*4]
mov @10, eax
push i
pop @10
mov eax,@10
mov dword ptr p[edi*4], eax
mov eax, s
mov ebx, i
sub eax, ebx
mov s, eax
jmp @IfEndL7
@IfFalseL6:
@IfEndL7:
@IterationNextL5:
push i
pop @11
inc i
jmp @IterationCheckL3
@IterationEndL4:
mov eax, 0
cmp eax, s
jnz @IfFalseL8
mov eax,num
invoke printf, addr Mars_PrintInt, eax
push k
pop @13
inc k
jmp @IfEndL9
@IfFalseL8:
@IfEndL9:
@IterationNextL2:
push num
pop @14
inc num
jmp @IterationCheckL0
@IterationEndL1:
invoke printf, addr Mars_PrintStr0
mov eax,k
invoke printf, addr Mars_PrintInt, eax
ret
perfectNumber endp
main proc
invoke printf, addr Mars_PrintStr1
invoke perfectNumber, 100
mov eax, 0
ret
main endp
end main
