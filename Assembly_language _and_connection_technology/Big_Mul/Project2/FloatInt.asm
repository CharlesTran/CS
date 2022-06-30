.386
.model flat, stdcall
option casemap:none

includelib  msvcrt.lib
printf   PROTO C :ptr sbyte, :VARARG
scanf   PROTO C :ptr sbyte , :VARARG

.data
szMsg  sbyte    'Please Enter', 0ah, 0
szOutput sbyte  '%lf',0ah,0
ans   real8  ? 
szInFmtStr sbyte  '%lf %lf %lf', 0
m   real8  ?
n   real8  ?
x   real8  ?
.code
main   proc
    invoke   printf, offset szMsg
    invoke   scanf,offset szInFmtStr, offset m, offset n, offset x
    finit
    fld     m
    fmul    n
    fsub    x
    fst     ans
    INVOKE   printf, offset szOutput, ans
    ret
main   endp
end    main