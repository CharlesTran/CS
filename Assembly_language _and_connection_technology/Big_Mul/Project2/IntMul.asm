.386
.model flat, stdcall
option casemap:none

includelib  msvcrt.lib
printf   PROTO C :ptr sbyte, :VARARG
scanf   PROTO C :dword , :VARARG

.data
szMsg  sbyte    'Please Enter', 0ah, 0
szOutput sbyte  '%d',0ah,0
ans   dword  ? 
szInFmtStr byte  '%d %d %d', 0
m   dword  ?
n   dword  ?
x   dword  ?
.code
main   proc
    invoke   printf, offset szMsg
    invoke   scanf,offset szInFmtStr, offset m, offset n, offset x
    MOV    EAX,m
    IMUL   EAX,n
    SUB    EAX,x
    mov    ans,EAX
    INVOKE   printf, offset szOutput, ans
    ret
main   endp
end    main