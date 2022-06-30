.386
.model flat,stdcall
option casemap:none

include windows.inc
include gdi32.inc
includelib gdi32.lib
include user32.inc
includelib user32.lib
include kernel32.inc
includelib kernel32.lib
;includelib msvcrt.lib
;include	msvcrt.inc
includelib msvcrt.lib
include Comdlg32.inc
includelib Comdlg32.lib
;include masm32rt.inc有这个会报错：fopen等重复定义
;includelib masm32rt.lib

fopen	proto c:dword,:dword
fgets	proto c:dword,:dword,:dword
fclose  proto c:dword
strcmp	proto c:dword,:dword
strlen	proto c:dword
strcat  proto c:dword,:dword
printf	proto c:dword,:vararg
_itoa	proto c:dword,:dword,:dword
MessageBoxA proto :DWORD, :DWORD, :DWORD, :DWORD 
MessageBox 	equ   <MessageBoxA>

.data

;strline	byte	1024 dup(0)	
flag	dword	0			
pre	dword	0
next	dword	0
temp0	byte	0
_hWnd	dword	0
_uMsg	dword	0
_wParam	dword	0
_lParam	dword	0
bug 	byte	"%d",0ah,0			;

hInstance dd ? 
hWinMain dd ? 
button db 'button',0
edit db 'edit',0
static byte 'static',0

bu0 db ' ',0
bu1 db 'A',0
bu2 db 'B',0

map	db	0,0,0,2,2
	db	0,0,0,0,0
	db	0,0,0,0,1
	db	0,1,1,0,0
	db	0,1,0,0,0

.const
szClassName db 'MyClass',0
szCaptionMain db 'CompareFiles',0

.code
_invasion proc ,hWnd,uMsg,wParam,lParam				
	mov eax, _hWnd
	mov hWnd, eax
	mov eax, _uMsg
	mov uMsg, eax
	mov eax, _lParam
	mov lParam, eax
	mov eax, _wParam
	mov wParam, eax
	mov edx,pre
	.if eax>=edx
		sub eax,edx
	.else
		sub edx,eax
		mov eax,edx
	.endif
	.if eax==1||eax==5||eax==4||eax==6;规则：斜正方形	
		mov eax,wParam
		mov next,eax
		xor eax,eax
		mov flag,eax
		invoke SetDlgItemText,hWnd,next,addr bu1 ;返回值为bool，存入eax
		mov ebx,offset map
		mov edx,1
		add ebx,next
		mov [ebx],dl
		mov ebx,offset map
		mov edx,1
		mov eax,next
		add eax,1
		.if eax>=0 && eax<25 && map[eax]==2;必须要有空格
			push eax
			invoke SetDlgItemText,hWnd,eax,addr bu1
			pop eax
			mov [ebx+eax],dl
		.endif

		mov eax,next
		.if eax>0
			sub eax,1
			.if eax>=0 && eax<25 && map[eax]==2
				push eax
				invoke SetDlgItemText,hWnd,eax,addr bu1
				pop eax
				mov [ebx+eax],dl
			.endif
		.endif
		mov eax,next
		add eax,5
		.if eax>=0 && eax<25 && map[eax]==2
			push eax
			invoke SetDlgItemText,hWnd,eax,addr bu1
			pop eax
			mov [ebx+eax],dl
		.endif
		mov eax,next
		.if eax>5
			sub eax,5
			.if eax>=0 && eax<25 && map[eax]==2
				push eax
				invoke SetDlgItemText,hWnd,eax,addr bu1
				pop eax
				mov [ebx+eax],dl
				mov al,map[eax]
				mov temp0, al
			.endif
		.endif
		xor eax,eax
		mov pre,eax
		mov next,eax

	.elseif eax==2||eax==10;规则：斜正方形
					
		mov eax,wParam
		mov next,eax
		xor eax,eax
		mov flag,eax
		invoke SetDlgItemText,hWnd,pre,addr bu0
		invoke SetDlgItemText,hWnd,next,addr bu1
		mov ebx,offset map
		mov edx,0
		add ebx,pre
		mov [ebx],dl 	;mov map[pre],edx不可行
		mov ebx,offset map
		mov edx,1
		add ebx,next
		mov [ebx],dl
		mov ebx,offset map
		mov edx,1
		mov eax,next
		add eax,1
		.if eax>=0 && eax<25 && map[eax]==2;必须要有空格
			push eax
			invoke SetDlgItemText,hWnd,eax,addr bu1
			pop eax
			mov [ebx+eax],dl
		.endif

		mov eax,next
		.if eax>0
			sub eax,1
			.if eax>=0 && eax<25 && map[eax]==2
				push eax
				invoke SetDlgItemText,hWnd,eax,addr bu1
				pop eax
				mov [ebx+eax],dl
			.endif
		.endif

		mov eax,next
		add eax,5
		.if eax>=0 && eax<25 && map[eax]==2
			push  eax
			invoke SetDlgItemText,hWnd,eax,addr bu1
			pop eax
			mov [ebx+eax],dl
		.endif
		mov eax,next
		.if eax>5
			sub eax,5

			.if eax>=0 && eax<25 && map[eax]==2
				push eax
				invoke SetDlgItemText,hWnd,eax,addr bu1
				pop eax
				mov [ebx+eax],dl
				mov al,map[eax]
				mov temp0,al
			.endif
		.endif
		xor eax,eax
		mov pre,eax
		mov next,eax

	.endif
	ret
_invasion	endp
	
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
		mov esi,0
		.while esi<5
			mov edi,0
			.while edi<5
				mov eax,esi
				imul eax,40
				mov ebx,edi
				imul ebx,40
				mov ecx,esi
				imul ecx,5
				add ecx,edi

				mov dl,map[ecx]

				.if dl==0
					invoke CreateWindowEx,NULL,offset button,offset bu0,WS_CHILD or WS_VISIBLE,ebx,eax,40,40,hWnd,ecx,hInstance,NULL
				.elseif dl==1
					invoke CreateWindowEx,NULL,offset button,offset bu1,WS_CHILD or WS_VISIBLE,ebx,eax,40,40,hWnd,ecx,hInstance,NULL
				.elseif dl==2
					invoke CreateWindowEx,NULL,offset button,offset bu2,WS_CHILD or WS_VISIBLE,ebx,eax,40,40,hWnd,ecx,hInstance,NULL
				.endif
				inc edi
			.endw
			inc esi
		.endw
		
	.elseif eax==WM_COMMAND
		mov eax,wParam	
		mov dl,map[eax]
		;mov temp,edx
		;invoke printf, offset bug,temp

		.if dl==0
			;调试
			;invoke SetDlgItemText,hWnd,0,addr bu0

			.if flag==1
				;如果是负数会溢出

				;mov temp,eax
				;invoke printf, offset bug,temp
				mov eax, hWnd
				mov _hWnd, eax
				mov eax, uMsg
				mov _uMsg, eax
				mov eax, wParam
				mov _wParam, eax
				mov eax, lParam
				mov _lParam, eax
				call _invasion
				

			.endif
		
		.elseif dl==1
			;调试
			;invoke SetDlgItemText,hWnd,0,addr bu1

			mov pre,eax
			;invoke printf, offset bug,pre
			mov eax,1
			mov flag,eax
			;push eax好像没用诶  push pop最好在一段程序里，否则容易出现其他未知值，少用

			;invoke SetDlgItemText,hWnd,eax,addr bu1
		.elseif dl==2
			;调试
			;invoke SetDlgItemText,hWnd,0,addr bu2

			
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
			WS_OVERLAPPEDWINDOW,100,100,570,350,\	;szClassName是建立窗口使用的类名字符串指针，这里是'MyClass'，表示用'MyClass'类来建立这个窗口，这个窗口拥有'MyClass'的所有属性
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