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


BufferA					byte			50	dup(?);用于保存第一个操作数
BufferB					byte			50  dup(?);第二个操作数
BufferUnion				byte			100	dup(?);合成之后的操作数
BufferPre				byte			100	dup(?)
BufferAns				byte			100	dup(?);结果
BufferSymbol			byte			50	dup(?);符号
BufferSymbol1			byte			50	dup(?)
BufferSymboltmp			byte			50	dup(?)
BufferALen				dd				0
BufferBLen				dd				0
BufferSymbolLen			dd				0
tempA					dq				0.0;临时数据
tempB					dq				0.0;临时数据
tempAns					dq				0.0;临时数据
temp					dq				180.0;临时数据


;输出调试
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
	finit	;寄存器的初始化
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
	.elseif	BufferSymbol[esi] == 99								;cos,参数为度数
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
	.elseif	BufferSymbol[esi] == 115							;sin,参数为度数
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
;清空寄存器和变量值
_RegClearAll	proc
;清空寄存器
	invoke	RtlZeroMemory, addr BufferA, sizeof BufferA
	invoke	RtlZeroMemory, addr BufferB, sizeof BufferB
	invoke	RtlZeroMemory, addr BufferUnion, sizeof BufferUnion
	invoke	RtlZeroMemory, addr BufferSymbol, sizeof BufferSymbol
	invoke	RtlZeroMemory, addr BufferAns, sizeof BufferAns
;清空长度
	mov	BufferALen, 0
	mov	BufferBLen, 0
	mov	BufferSymbolLen, 0
	mov esi, 0
	mov BufferAns, 0
_RegClearAll	endp
_UnionBuffer	proc	stdcall	a:dword, b:dword
	mov	esi, a
	mov	ebx, b
	.if	ebx ==	0	;表示输入了数字
		mov	edx, 0
		.if	BufferSymbolLen == 0
				add	BufferALen, 1
				invoke	strcat, offset BufferA, esi		;将输入的数字拼接到BufferA后面
				invoke	strcat, offset BufferUnion, esi
		.else															;符号不为空，表示输入了第二个操作数
				add	BufferBLen, 1
				invoke	strcat, offset BufferB, esi		;表示符号不为0，则拼接到B后面
				invoke	strcat, offset BufferUnion, esi
		.endif
	.elseif	ebx == 1	;表示输入了符号
		invoke	strcpy, offset BufferSymbol, esi;直接覆盖原来的符号
		.if	esi == offset busin || esi == offset bucos 
			mov BufferSymbolLen, 3
			.if	BufferALen > 0	;表示用户首先按下了数字,则应该调整符号和数字的位置
				invoke	strcpy, offset BufferPre, offset BufferUnion
				invoke	strcat, offset BufferUnion, offset BufferSymbol	;将符号覆盖到BufferUnion中
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
			.if	BufferALen > 0	;表示用户首先按下了数字,则应该调整符号和数字的位置
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
				invoke	strcpy, offset BufferUnion, offset BufferA	;把操作数复制进去
				invoke	strcat, offset BufferUnion, offset BufferSymbol	;将符号覆盖到BufferUnion中
			.endif
			.if	esi == offset bumod
				mov BufferSymbolLen, 3
			.else
				mov BufferSymbolLen, 1
			.endif
		.endif	
		invoke strcpy, offset BufferSymbol1, offset BufferSymbol
	.endif

	;当用户输入的是三角函数
	mov ebx, 0
	.if  BufferSymbol[ebx] == 99 ||  BufferSymbol[ebx] == 115 
		.if BufferPre == 0
			invoke	strcat, offset BufferA, offset BufferB
			invoke	RtlZeroMemory, addr BufferB, sizeof BufferB
			mov	edx, BufferBLen
			add	BufferALen, edx
			mov	BufferBLen, 0
			invoke	strcpy, offset BufferUnion, offset BufferSymbol	;将符号覆盖到BufferUnion中
			invoke	strcat, offset BufferUnion, offset BufferA	;把操作数复制进去
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
			invoke	strcat, offset BufferUnion, offset buequ ;将等号拼接到合成字符串的后面
			invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
			invoke SendMessage,hEditAns,WM_SETTEXT,0,addr BufferAns
			invoke _RegClearAll
		.endif
	.else  ;否则按默认处理方法处理消息
		invoke DefWindowProc,hWnd,uMsg,wParam,lParam
		ret
	.endif
	xor eax,eax 
	ret
_ProcWinMain endp
_WinMain proc  ;窗口程序
	local @stWndClass:WNDCLASSEX  ;定义了一个结构变量，它的类型是WNDCLASSEX，一个窗口类定义了窗口的一些主要属性，图标，光标，背景色等，这些参数不是单个传递，而是封装在WNDCLASSEX中传递的。
	local @stMsg:MSG	;还定义了stMsg，类型是MSG，用来作消息传递的	

	invoke GetModuleHandle,NULL  ;得到应用程序的句柄，把该句柄的值放在hInstance中，句柄是什么？简单点理解就是某个事物的标识，有文件句柄，窗口句柄，可以通过句柄找到对应的事物
	mov hInstance,eax

	invoke RtlZeroMemory,addr @stWndClass,sizeof @stWndClass  ;将stWndClass初始化全0

	;注册窗口类
	invoke LoadCursor,0,IDC_ARROW
	mov @stWndClass.hCursor,eax					;---------------------------------------
	push hInstance
	pop @stWndClass.hInstance
	mov @stWndClass.cbSize,sizeof WNDCLASSEX			;这部分是初始化stWndClass结构中各字段的值，即窗口的各种属性
	mov @stWndClass.style,CS_HREDRAW or CS_VREDRAW			
	mov @stWndClass.lpfnWndProc,offset _ProcWinMain	
	;上面这条语句其实就是指定了该窗口程序的窗口过程是_ProcWinMain
	mov @stWndClass.hbrBackground,COLOR_WINDOW+1
	mov @stWndClass.lpszClassName,offset szClassName		;---------------------------------------
	invoke RegisterClassEx,addr @stWndClass  ;注册窗口类，注册前先填写参数WNDCLASSEX结构

	invoke CreateWindowEx,WS_EX_CLIENTEDGE,\  ;建立窗口
			offset szClassName,offset szCaptionMain,\  ;szClassName和szCaptionMain是在常量段中定义的字符串常量
			WS_OVERLAPPEDWINDOW,100,100,300,300,\	;szClassName是建立窗口使用的类名字符串指针，这里是'MyClass'，表示用'MyClass'类来建立这个窗口，这个窗口拥有'MyClass'的所有属性
			NULL,NULL,hInstance,NULL		;如果改成'button'那么建立的将是一个按钮，szCaptionMain代表的则是窗口的名称，该名称会显示在标题栏中
	mov hWinMain,eax  ;建立窗口后句柄会放在eax中，现在把句柄放在hWinMain中。
	invoke ShowWindow,hWinMain,SW_SHOWNORMAL  ;显示窗口，注意到这个函数传递的参数是窗口的句柄，正如前面所说的，通过句柄可以找到它所标识的事物
	invoke UpdateWindow,hWinMain  ;刷新窗口客户区

	.while TRUE  ;进入无限的消息获取和处理的循环
		invoke GetMessage,addr @stMsg,NULL,0,0  ;从消息队列中取出第一个消息，放在stMsg结构中
		.break .if eax==0  ;如果是退出消息，eax将会置成0，退出循环
		invoke TranslateMessage,addr @stMsg  ;这是把基于键盘扫描码的按键信息转换成对应的ASCII码，如果消息不是通过键盘输入的，这步将跳过
		invoke DispatchMessage,addr @stMsg  ;这条语句的作用是找到该窗口程序的窗口过程，通过该窗口过程来处理消息
	.endw
	ret
_WinMain endp

main proc
	call _WinMain  ;主程序就调用了窗口程序和结束程序两个函数
	invoke ExitProcess,NULL
	ret
main endp
end main