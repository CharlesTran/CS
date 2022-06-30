.386
.model flat,stdcall
option casemap:none

includelib				msvcrt.lib
include					windows.inc
include					gdi32.inc
includelib				gdi32.lib
include					user32.inc
includelib				user32.lib
include					kernel32.inc
includelib				kernel32.lib
include					shell32.inc
includelib				shell32.lib
include					comctl32.inc
includelib				comctl32.lib
include					masm32.inc
includelib				masm32.lib

fopen	proto c:dword,:dword
fgets	proto c:dword,:dword,:dword
fclose  proto c:dword
strcmp	proto c:dword,:dword
strlen	proto c:dword
strcat  proto c:dword,:dword
printf	proto c:dword,:vararg
strcpy	PROTO C:dword,:dword
_itoa	proto c:dword,:dword,:dword
MessageBoxA proto :DWORD, :DWORD, :DWORD, :DWORD 
MessageBox 	equ   <MessageBoxA>

.data
;strline	byte	1024 dup(0)	
flag	dword	0			
temp0	byte	0
_hWnd	dword	0
_uMsg	dword	0
_wParam	dword	0
_lParam	dword	0
numA	byte	50 dup(?)

hEdit					dd				?	
hEditAns				dd				?
hInstance dd ? 
hWinMain dd ? 
button db 'button',0
Edit db 'Edit',0
edit db 'edit',0
static byte 'static',0

bu0 db '0',0
bu1 db '1',0
bu2 db '2',0
bu3 db '3',0
bu4 db '4',0
bu5 db '5',0
bu6 db '6',0
bu7 db '7',0
bu8 db '8',0
bu9 db '9',0
budot db '.',0
buadd db '+',0
busub db '-',0
bumul db '*',0
budiv db '/',0
buequ db '=',0
busin db 'sin',0
bucos db 'cos',0
bumod db '%',0
buc db 'C',0


BufferA					byte			50	dup(?);���ڱ����һ��������
BufferB					byte			50  dup(?);�ڶ���������
BufferUnion				byte			100	dup(?);�ϳ�֮��Ĳ�����
BufferPre				byte			100	dup(?)
BufferAns				byte			100	dup(?);���
BufferSymbol			byte			50	dup(?);����
BufferSymbol1			byte			50	dup(?)
BufferSymboltmp			byte			50	dup(?)
BufferALen				dd				0
BufferBLen				dd				0
BufferSymbolLen			dd				0
tempA					dq				0.0;��ʱ����
tempB					dq				0.0;��ʱ����
tempAns					dq				0.0;��ʱ����
temp					dq				180.0;��ʱ����


;�������
OutputNum				db				'%d', 0
OutputChar				db				'%c', 0
OutputStr				db				'%s', 0
OutputFloat				db				'%lf', 0
OutputNewLine			db				0ah, 0

.const
szClassName db 'MyClass',0
szCaptionMain db 'Calculator',0

.code
_Calculator	proc
	finit	;�Ĵ����ĳ�ʼ��
	mov	esi, 0
	.if	BufferSymbol[esi] == 43								;+
		invoke StrToFloat,addr BufferA,addr tempA
		invoke StrToFloat,addr BufferB,addr tempB
		fld tempA
		fld tempB
		fadd st(0), st(1)
		fst tempAns
		invoke FloatToStr,tempAns,addr BufferAns
	.elseif	BufferSymbol[esi] == 45								;-
		invoke StrToFloat,addr BufferA,addr tempA
		invoke StrToFloat,addr BufferB,addr tempB
		fld tempB
		fld tempA
		fsub st(0), st(1)
		fst tempAns
		invoke FloatToStr,tempAns,addr BufferAns
	.elseif	BufferSymbol[esi] == 42								;*
		invoke StrToFloat,addr BufferA,addr tempA
		invoke StrToFloat,addr BufferB,addr tempB
		fld tempA
		fld tempB
		fmul st(0), st(1)
		fst tempAns
		invoke FloatToStr,tempAns,addr BufferAns
	.elseif	BufferSymbol[esi] == 47								;/
		invoke StrToFloat,addr BufferA,addr tempA
		invoke StrToFloat,addr BufferB,addr tempB
		fld tempB
		fld tempA
		fdiv st(0), st(1)
		fst tempAns
		invoke FloatToStr,tempAns,addr BufferAns
	.elseif	BufferSymbol[esi] == 99								;cos,����Ϊ����
		invoke StrToFloat,addr BufferA,addr tempA
		fld tempA
		fldpi
		fmul st(0), st(1)
		fld temp
		fdiv st(1), st(0)
		fstp temp
		fcos
		fst tempAns
		invoke FloatToStr,tempAns,addr BufferAns
	.elseif	BufferSymbol[esi] == 115							;sin,����Ϊ����
		.if BufferPre==0
			invoke StrToFloat,addr BufferA,addr tempA
		.else
			invoke StrToFloat,addr BufferB,addr tempA
		.endif
		fld tempA
		fldpi
		fmul st(0), st(1)
		fld temp
		fdiv st(1), st(0)
		fstp temp
		fsin
		fst tempAns
		invoke FloatToStr,tempAns,addr BufferAns
	.elseif	BufferSymbol[esi] == 109							;mod
		invoke StrToFloat,addr BufferA,addr tempA
		invoke StrToFloat,addr BufferB,addr tempB
		fld tempB
		fld tempA
		fprem
		fst tempAns
		invoke FloatToStr,tempAns,addr BufferAns
	.else			
		invoke StrToFloat,addr BufferA,addr tempA
		invoke FloatToStr,tempA,addr BufferAns
	.endif
	ret
_Calculator	endp
;��ռĴ����ͱ���ֵ
_RegClearAll	proc
;��ռĴ���
	invoke	RtlZeroMemory, addr BufferA, sizeof BufferA
	invoke	RtlZeroMemory, addr BufferB, sizeof BufferB
	invoke	RtlZeroMemory, addr BufferUnion, sizeof BufferUnion
	invoke	RtlZeroMemory, addr BufferSymbol, sizeof BufferSymbol
	invoke	RtlZeroMemory, addr BufferAns, sizeof BufferAns
;��ճ���
	mov	BufferALen, 0
	mov	BufferBLen, 0
	mov	BufferSymbolLen, 0
	mov esi, 0
	mov BufferAns, 0
_RegClearAll	endp
_UnionBuffer	proc	stdcall	a:dword, b:dword
	mov	esi, a
	mov	ebx, b
	.if	ebx ==	0	;��ʾ����������
		mov	edx, 0
		.if	BufferSymbolLen == 0
				add	BufferALen, 1
				invoke	strcat, offset BufferA, esi		;�����������ƴ�ӵ�BufferA����
				invoke	strcat, offset BufferUnion, esi
		.else															;���Ų�Ϊ�գ���ʾ�����˵ڶ���������
				add	BufferBLen, 1
				invoke	strcat, offset BufferB, esi		;��ʾ���Ų�Ϊ0����ƴ�ӵ�B����
				invoke	strcat, offset BufferUnion, esi
		.endif
	.elseif	ebx == 1	;��ʾ�����˷���
		invoke	strcpy, offset BufferSymbol, esi;ֱ�Ӹ���ԭ���ķ���
		.if	esi == offset busin || esi == offset bucos 
			mov BufferSymbolLen, 3
			.if	BufferALen > 0	;��ʾ�û����Ȱ���������,��Ӧ�õ������ź����ֵ�λ��
				invoke	strcpy, offset BufferPre, offset BufferUnion
				invoke	strcat, offset BufferUnion, offset BufferSymbol	;�����Ÿ��ǵ�BufferUnion��
				ret
				;invoke	strcat, offset BufferA, offset BufferB
				;invoke	RtlZeroMemory, addr BufferB, sizeof BufferB
				;invoke	strcat, offset BufferUnion, offset BufferA
			.elseif	
				mov eax, 0
				.if	BufferUnion[eax] == 48
					mov BufferUnion[eax], 0
				.endif
					invoke	strcat, offset BufferUnion, offset BufferSymbol
			.endif
		.else
			.if	BufferALen > 0	;��ʾ�û����Ȱ���������,��Ӧ�õ������ź����ֵ�λ��
				.if	BufferSymbolLen > 0
					invoke strcpy, offset BufferSymboltmp, offset BufferSymbol
					invoke strcpy, offset BufferSymbol, offset BufferSymbol1
					invoke _Calculator
					invoke strcpy, offset BufferSymbol, offset BufferSymboltmp
					invoke	strcpy, offset BufferA, offset BufferAns
					mov BufferBLen,0
					mov BufferB,0
					invoke	strcpy, offset BufferUnion, offset BufferAns
					invoke	strcat, offset BufferUnion, offset BufferSymbol
				.elseif			
					invoke	strcat, offset BufferUnion, offset BufferSymbol
				.endif
			.elseif	BufferBLen > 0
				invoke	strcat, offset BufferA, offset BufferB
				invoke	RtlZeroMemory, addr BufferB, sizeof BufferB
				mov	edx, BufferBLen
				add	BufferALen, edx
				mov	BufferBLen, 0
				invoke	strcpy, offset BufferUnion, offset BufferA	;�Ѳ��������ƽ�ȥ
				invoke	strcat, offset BufferUnion, offset BufferSymbol	;�����Ÿ��ǵ�BufferUnion��
			.endif
			.if	esi == offset bumod
				mov BufferSymbolLen, 3
			.else
				mov BufferSymbolLen, 1
			.endif
		.endif	
		invoke strcpy, offset BufferSymbol1, offset BufferSymbol
	.endif

	;���û�����������Ǻ���
	mov ebx, 0
	.if  BufferSymbol[ebx] == 99 ||  BufferSymbol[ebx] == 115 
		.if BufferPre == 0
			invoke	strcat, offset BufferA, offset BufferB
			invoke	RtlZeroMemory, addr BufferB, sizeof BufferB
			mov	edx, BufferBLen
			add	BufferALen, edx
			mov	BufferBLen, 0
			invoke	strcpy, offset BufferUnion, offset BufferSymbol	;�����Ÿ��ǵ�BufferUnion��
			invoke	strcat, offset BufferUnion, offset BufferA	;�Ѳ��������ƽ�ȥ
		.endif
	.endif
	ret
_UnionBuffer	endp
_ProcWinMain proc uses ebx edi esi,hWnd,uMsg,wParam,lParam
	local @stPs:PAINTSTRUCT
	local @stRect:RECT
	local @hDc
	mov eax,uMsg 
	.if eax==WM_PAINT 
		invoke BeginPaint,hWnd,addr @stPs
		mov @hDc,eax

		invoke GetClientRect,hWnd,addr @stRect
		;invoke DrawText,@hDc,addr szText,-1,addr @stRect,DT_SINGLELINE or DT_CENTER or DT_VCENTER 
		invoke EndPaint,hWnd,addr @stPs
	.elseif eax==WM_CLOSE  
		invoke DestroyWindow,hWinMain
		invoke PostQuitMessage,NULL

	.elseif eax==WM_CREATE
		invoke CreateWindowEx,NULL,offset Edit,offset bu0,WS_CHILD or WS_VISIBLE,0,0,500,20,hWnd,90,hInstance,NULL
		mov hEdit,eax
		invoke CreateWindowEx,NULL,offset Edit,offset NULL,WS_CHILD or WS_VISIBLE,0,20,500,20,hWnd,91,hInstance,NULL
		mov hEditAns,eax
		invoke CreateWindowEx,NULL,offset button,offset busin,WS_CHILD or WS_VISIBLE,0,40,40,40,hWnd,10,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset bucos,WS_CHILD or WS_VISIBLE,40,40,40,40,hWnd,11,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset bumod,WS_CHILD or WS_VISIBLE,80,40,40,40,hWnd,12,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset budiv,WS_CHILD or WS_VISIBLE,120,40,40,40,hWnd,13,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset bu7,WS_CHILD or WS_VISIBLE,0,80,40,40,hWnd,7,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset bu8,WS_CHILD or WS_VISIBLE,40,80,40,40,hWnd,8,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset bu9,WS_CHILD or WS_VISIBLE,80,80,40,40,hWnd,9,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset bumul,WS_CHILD or WS_VISIBLE,120,80,40,40,hWnd,14,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset bu4,WS_CHILD or WS_VISIBLE,0,120,40,40,hWnd,4,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset bu5,WS_CHILD or WS_VISIBLE,40,120,40,40,hWnd,5,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset bu6,WS_CHILD or WS_VISIBLE,80,120,40,40,hWnd,6,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset busub,WS_CHILD or WS_VISIBLE,120,120,40,40,hWnd,15,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset bu1,WS_CHILD or WS_VISIBLE,0,160,40,40,hWnd,1,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset bu2,WS_CHILD or WS_VISIBLE,40,160,40,40,hWnd,2,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset bu3,WS_CHILD or WS_VISIBLE,80,160,40,40,hWnd,3,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset buadd,WS_CHILD or WS_VISIBLE,120,160,40,40,hWnd,16,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset buc,WS_CHILD or WS_VISIBLE,0,200,40,40,hWnd,17,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset bu0,WS_CHILD or WS_VISIBLE,40,200,40,40,hWnd,0,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset budot,WS_CHILD or WS_VISIBLE,80,200,40,40,hWnd,18,hInstance,NULL
		invoke CreateWindowEx,NULL,offset button,offset buequ,WS_CHILD or WS_VISIBLE,120,200,40,40,hWnd,19,hInstance,NULL
	.elseif eax==WM_COMMAND
		mov eax,wParam
		.if eax == 0
			invoke _UnionBuffer, offset bu0, 0
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 1
			invoke _UnionBuffer, offset bu1, 0
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 2
			invoke _UnionBuffer, offset bu2, 0
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 3
			invoke _UnionBuffer, offset bu3, 0
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 4
			invoke _UnionBuffer, offset bu4, 0
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 5
			invoke _UnionBuffer, offset bu5, 0
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 6
			invoke _UnionBuffer, offset bu6, 0
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 7
			invoke _UnionBuffer, offset bu7, 0
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 8
			invoke _UnionBuffer, offset bu8, 0
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 9
			invoke _UnionBuffer, offset bu9, 0
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 10
			invoke _UnionBuffer, offset busin, 1
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 11
			invoke _UnionBuffer, offset bucos, 1
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 12
			invoke _UnionBuffer, offset bumod, 1
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 13
			invoke _UnionBuffer, offset budiv, 1
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 14
			invoke _UnionBuffer, offset bumul, 1
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 15
			invoke _UnionBuffer, offset busub, 1
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 16
			invoke _UnionBuffer, offset buadd, 1
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 17
			invoke _RegClearAll
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr bu0
			invoke SendMessage,hEditAns,WM_SETTEXT,0,addr bu0
		.elseif eax == 18
			invoke _UnionBuffer, offset budot, 0
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
		.elseif eax == 19
			invoke _Calculator
			.if BufferPre != 0
				invoke strcpy, offset BufferB, offset BufferAns
				invoke strcpy, offset BufferSymbol, offset BufferSymbol1
				invoke _Calculator
				mov BufferPre, 0
			.endif
			invoke	strcat, offset BufferUnion, offset buequ ;���Ⱥ�ƴ�ӵ��ϳ��ַ����ĺ���
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
			invoke SendMessage,hEditAns,WM_SETTEXT,0,addr BufferAns
			invoke _RegClearAll
		.endif
	.else  ;����Ĭ�ϴ�����������Ϣ
		invoke DefWindowProc,hWnd,uMsg,wParam,lParam
		ret
	.endif
	xor eax,eax 
	ret
_ProcWinMain endp
_WinMain proc  ;���ڳ���
	local @stWndClass:WNDCLASSEX  ;������һ���ṹ����������������WNDCLASSEX��һ�������ඨ���˴��ڵ�һЩ��Ҫ���ԣ�ͼ�꣬��꣬����ɫ�ȣ���Щ�������ǵ������ݣ����Ƿ�װ��WNDCLASSEX�д��ݵġ�
	local @stMsg:MSG	;��������stMsg��������MSG����������Ϣ���ݵ�	

	invoke GetModuleHandle,NULL  ;�õ�Ӧ�ó���ľ�����Ѹþ����ֵ����hInstance�У������ʲô���򵥵�������ĳ������ı�ʶ�����ļ���������ھ��������ͨ������ҵ���Ӧ������
	mov hInstance,eax

	invoke RtlZeroMemory,addr @stWndClass,sizeof @stWndClass  ;��stWndClass��ʼ��ȫ0

	;ע�ᴰ����
	invoke LoadCursor,0,IDC_ARROW
	mov @stWndClass.hCursor,eax					;---------------------------------------
	push hInstance
	pop @stWndClass.hInstance
	mov @stWndClass.cbSize,sizeof WNDCLASSEX			;�ⲿ���ǳ�ʼ��stWndClass�ṹ�и��ֶε�ֵ�������ڵĸ�������
	mov @stWndClass.style,CS_HREDRAW or CS_VREDRAW			
	mov @stWndClass.lpfnWndProc,offset _ProcWinMain	
	;�������������ʵ����ָ���˸ô��ڳ���Ĵ��ڹ�����_ProcWinMain
	mov @stWndClass.hbrBackground,COLOR_WINDOW+1
	mov @stWndClass.lpszClassName,offset szClassName		;---------------------------------------
	invoke RegisterClassEx,addr @stWndClass  ;ע�ᴰ���࣬ע��ǰ����д����WNDCLASSEX�ṹ

	invoke CreateWindowEx,WS_EX_CLIENTEDGE,\  ;��������
			offset szClassName,offset szCaptionMain,\  ;szClassName��szCaptionMain���ڳ������ж�����ַ�������
			WS_OVERLAPPEDWINDOW,100,100,300,300,\	;szClassName�ǽ�������ʹ�õ������ַ���ָ�룬������'MyClass'����ʾ��'MyClass'��������������ڣ��������ӵ��'MyClass'����������
			NULL,NULL,hInstance,NULL		;����ĳ�'button'��ô�����Ľ���һ����ť��szCaptionMain��������Ǵ��ڵ����ƣ������ƻ���ʾ�ڱ�������
	mov hWinMain,eax  ;�������ں��������eax�У����ڰѾ������hWinMain�С�
	invoke ShowWindow,hWinMain,SW_SHOWNORMAL  ;��ʾ���ڣ�ע�⵽����������ݵĲ����Ǵ��ڵľ��������ǰ����˵�ģ�ͨ����������ҵ�������ʶ������
	invoke UpdateWindow,hWinMain  ;ˢ�´��ڿͻ���

	.while TRUE  ;�������޵���Ϣ��ȡ�ʹ����ѭ��
		invoke GetMessage,addr @stMsg,NULL,0,0  ;����Ϣ������ȡ����һ����Ϣ������stMsg�ṹ��
		.break .if eax==0  ;������˳���Ϣ��eax�����ó�0���˳�ѭ��
		invoke TranslateMessage,addr @stMsg  ;���ǰѻ��ڼ���ɨ����İ�����Ϣת���ɶ�Ӧ��ASCII�룬�����Ϣ����ͨ����������ģ��ⲽ������
		invoke DispatchMessage,addr @stMsg  ;���������������ҵ��ô��ڳ���Ĵ��ڹ��̣�ͨ���ô��ڹ�����������Ϣ
	.endw
	ret
_WinMain endp

main proc
	call _WinMain  ;������͵����˴��ڳ���ͽ���������������
	invoke ExitProcess,NULL
	ret
main endp
end main