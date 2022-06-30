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
include	msvcrt.inc
includelib masm32rt.lib
sprintf	PROTO C :ptr sbyte, :ptr sbyte, :VARARG

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
flagmode	dword	0
playwith	dword	0
pre	dword	0
next	dword	0
next_player	dword	0
temp0	byte	0
bug 	byte	"%d",0ah,0			;
pointA dword 0
pointB dword 0
_hWnd	dword	0
_uMsg	dword	0
_wParam	dword	0
_lParam	dword	0
randX DW 0
randY dw 0
szFontName byte 'Conquer and Command', 0

hInstance dd ? 
hWinMain dd ? 
button db 'button',0
edit db 'edit',0
static byte 'static',0
hW dd ?
hFont0 dd ?

bu0 db ' ',0
bu1 db 'A',0
bu2 db 'B',0
buend db '!',0

map	db	0,0,2,2,2,0
	db	0,0,0,0,2,0
	db	0,2,0,2,0,0
	db	0,0,0,0,0,0
	db	0,0,0,0,0,0
	db	0,0,1,1,1,0

.const
sz  equ	6
szClassName db 'MyClass',0
szCaptionMain db 'Conquer and Command',0
szMy	db 'My point: %d',0AH,0
szRival db 'Rival point: %d',0AH,0
szResult db 'Game Over',0AH,0
szWin db 'You Win!',0AH,0
szLose db 'You Lose!',0AH,0
szStart db 'Game Start!',0AH,0
szText1 db 'PointA: %d',0
szText2	db 'PointB: %d',0
szText3 db 'Single-player mode',0
szText4 db 'Double-player mode',0
szGG db 'Game Over!',0AH,0


.code
random proc value:DWORD 
 ;随机范围为0~value
 getR:
  invoke GetTickCount
  xor edx,edx
  mov ecx,value
  div ecx
  mov eax,edx
 .if eax<1
  jmp getR
 .endif
 ret
random endp

changeRandom proc
 local ft:DWORD
 
 invoke random,10
 mov ft,eax
 invoke random,38
 mov bl,10
 mul bl
 .if ft>5
  mov randX,ax
 .elseif ft<6
  mov randY,ax
 .endif
 
 ret
changeRandom endp
forward proc C 
	local temp,flag1,location,row,column:dword
	push esi
	push edi
	mov location,ecx
	mov eax,location
	xor edx,edx
	mov ebx,sz
	div ebx
	mov row,eax;eax是商为当前随机行数，edx是余数当前随机列数
	mov column,edx
	invoke random,12
	;mov eax,3;ebx存随机数
	xor edx,edx
	mov ebx,12
	div ebx
	mov ecx,edx;余数转移到ecx,随机走的方向
	mov esi,0
	mov flag1,esi
	.while esi<12;12个走的位置
		mov edi,location
		.if cl>7 && cl<12
			.if cl==8
				sub edi,sz
				sub edi,sz
			.elseif cl==9
				.if column>2
					sub edi,2
				.endif
			.elseif cl==10
				.if column<sz-2
					add edi,2
				.endif
			.elseif cl==11
				add edi,sz
				add edi,sz
			.endif
			.if edi>=0 && edi<sz*sz && map[edi]==0
				push eax
				push edx
				invoke SetDlgItemText,hW,location,addr bu0
				invoke SetDlgItemText,hW,edi,addr bu2
				pop edx
				pop eax
				mov ebx,offset map
				mov edx,0
				add ebx,location
				mov [ebx],dl 	;mov map[pre],edx不可行
				mov ebx,offset map
				mov edx,2
				add ebx,edi
				mov [ebx],dl
				mov edx,1
				mov flag1,edx
				.break
			.endif
		.elseif cl>=0 && cl<=7
			.if cl==0
				.if column>0
					sub edi,sz
					sub edi,1
				.endif
			.elseif cl==1
				sub edi,sz
			.elseif cl==2
				.if column<sz-1
					sub edi,sz
					add edi,1
				.endif
			.elseif cl==3
				.if column>0
					sub edi,1
				.endif
			.elseif cl==4
				.if column<sz-1
					add edi,1
				.endif
			.elseif cl==5
				.if column>0
					add edi,sz
					sub edi,1
				.endif
			.elseif cl==6
				add edi,sz
			.elseif cl==7
				.if column<sz-1
					add edi,sz
					add edi,1
				.endif
			.endif

			.if edi>=0 && edi<sz*sz && map[edi]==0
				push eax
				push edx
				invoke SetDlgItemText,hW,edi,addr bu2
				pop edx
				pop eax
				mov ebx,offset map
				mov edx,2
				add ebx,edi
				mov [ebx],dl
				mov edx,1
				mov flag1,edx
				.break
			.endif

		.endif
		inc esi
		inc cl
		.if cl==12
			mov cl,0
		.endif
	.endw
	.if flag1==1
		mov location,edi;edi中存那个位置
		mov ebx,offset map
		mov cl,sz
		mov eax,location
		div cl
		mov cl,ah;ah余数
		mov edx,2
		.if cl<sz-1
			mov eax,location
			add eax,1
			.if map[eax]==1
				push eax
				push edx
				push ecx
				invoke SetDlgItemText,hW,eax,addr bu2
				pop ecx
				pop edx
				pop eax
				mov [ebx+eax],dl
			.endif
		.endif
		.if cl>0
			mov eax,location
			sub eax,1
			.if map[eax]==1
				push eax
				push edx
				push ecx
				invoke SetDlgItemText,hW,eax,addr bu2
				pop ecx
				pop edx
				pop eax
				mov [ebx+eax],dl
			.endif
		.endif
		mov eax,location
		add eax,sz
		.if eax<sz*sz && map[eax]==1
			push eax
			push edx
			push ecx
			invoke SetDlgItemText,hW,eax,addr bu2
			pop ecx
			pop edx
			pop eax
			mov [ebx+eax],dl
		.endif
		mov eax,location
		.if eax>sz
			sub eax,sz
			.if eax>=0 && map[eax]==1
				push eax
				push ecx
				push edx
				invoke SetDlgItemText,hW,eax,addr bu2
				pop edx
				pop ecx
				pop eax
				mov [ebx+eax],dl
				mov al,map[eax]
				mov temp0, al
			.endif
		.endif


	.endif
	pop edi
	pop esi
	mov ebx,flag1
	ret
forward endp
call_B proc C
	local row,column:dword
	invoke random, sz*sz
	;invoke changeRandom
	;mov eax,ebx
	xor edx,edx
	mov ebx,sz
	div ebx
	mov row,eax;eax是商为当前随机行数，edx是余数当前随机列数
	mov column,edx
	mov esi,row
			.while esi<sz
				mov edi,edx
				mov edx,0
				.while edi<sz
					mov eax,esi
					imul eax,40
					mov ebx,edi
					imul ebx,40
					mov ecx,esi
					imul ecx,sz
					add ecx,edi

					mov dl,map[ecx]

					.if dl==2
						;判断能不能走
						;如果能走，走，走完结束循环,跳到最后
						invoke forward
						.if ebx==1
							jmp last
						.endif

					.endif
					inc edi
				.endw
				inc esi
			.endw
	mov esi,0
		.while esi<sz
			mov edi,0
			.while edi<sz && (esi<row || edi<column)
					mov eax,esi
					imul eax,40
					mov ebx,edi
					imul ebx,40
					mov ecx,esi
					imul ecx,sz
					add ecx,edi

					mov dl,map[ecx]

					.if dl==2
						;判断能不能走
						;如果能走，走，走完结束循环，跳到最后
						invoke forward
						.if ebx==1
							jmp last
						.endif

					.endif
					inc edi
			.endw
			inc esi
		.endw
last:
	mov eax,0
	mov next_player,eax
	ret
call_B endp

_sleep proc
	delay: 
		push ax
		push dx
		mov dx,1000h
		mov ax,0
		s1: sub ax,1
		sbb dx,0
		cmp ax,0
		jne s1
		cmp dx,0 
		jne s1
		pop dx
		pop ax
		ret
_sleep endp


judge proc buFlag:byte,rival:byte
	;遍历找到对方的棋子，若一个棋子都没有，我赢；
	;对每一个棋子，判断其是否有一步/两步可走，若每一个棋子都无路可走，我赢
	local mynum:dword
	local rivalnum:dword
	local myarr[1005]:dword
	local rivalarr[1005]:dword
	local flag_ctn:dword
	local tmpText[1005]:dword

	xor esi,esi
	mov mynum,esi
	mov rivalnum,esi
	mov flag_ctn,esi
	mov esi,-1;map的
	.while TRUE
		inc esi
		.break .if esi>=sz*sz || esi<0
		mov dl,map[esi]
		.if dl==buFlag;本方棋子
			inc mynum
		.elseif dl==rival;敌方
			inc rivalnum
			xor ebx,ebx
			.while TRUE
				inc ebx
				.break .if ebx>=sz*sz || ebx<0
				.if esi>ebx
					mov ecx,esi
					sub ecx,ebx
				.else
					mov ecx,ebx
					sub ecx,esi
				.endif

				mov al,map[ebx]
				.if ecx==1||ecx==sz||ecx==sz-1||ecx==sz+1||ecx==2||ecx==sz+sz
					.if al==0 
						mov flag_ctn,1
					.endif
				.endif
			.endw
		.endif
	.endw

	.if buFlag==1
		xor esi,esi
		mov esi,mynum
		mov pointA,esi
		xor esi,esi
		mov esi,rivalnum
		mov pointB,esi
	.elseif buFlag==2
		xor esi,esi
		mov esi,rivalnum
		mov pointA,esi
		xor esi,esi
		mov esi,mynum
		mov pointB,esi
	.endif
	
	invoke sprintf,addr tmpText,offset szText1,pointA
	mov ebx,1000
	invoke SetDlgItemText,hW,ebx,addr tmpText

	invoke sprintf,addr tmpText,offset szText2,pointB
	mov ebx,1001
	invoke SetDlgItemText,hW,ebx,addr tmpText 

	;invoke sprintf,addr myarr,offset szMy,mynum
	;invoke sprintf,addr rivalarr,offset szRival,rivalnum
	;invoke MessageBox,NULL,addr myarr,offset szMy,MB_OK+MB_ICONQUESTION
	;invoke MessageBox,NULL,addr rivalarr,offset szRival,MB_OK+MB_ICONQUESTION

	.if rivalnum==0||flag_ctn==0
		.if buFlag==1
			invoke MessageBox,NULL,addr szWin,addr szResult,MB_OK
		.elseif buFlag==2
			invoke MessageBox,NULL,addr szLose,addr szResult,MB_OK
		.endif
		mov esi,0
		.while esi<sz
			mov edi,0
			.while edi<sz
				mov eax,esi
				imul eax,40
				mov ebx,edi
				imul ebx,40
				mov ecx,esi
				imul ecx,sz
				add ecx,edi
				mov dl,map[ecx]
				.if buFlag==1
					invoke CreateWindowEx,NULL,offset button,offset bu1,\
					WS_CHILD or WS_VISIBLE or WS_BORDER,ebx,eax,40,40,hW,ecx,hInstance,NULL
				.elseif buFlag==2
					invoke CreateWindowEx,NULL,offset button,offset bu2,\
					WS_CHILD or WS_VISIBLE or WS_BORDER,ebx,eax,40,40,hW,ecx,hInstance,NULL
				.endif
				inc edi
				invoke _sleep;10000000h
			.endw
			inc esi
		.endw
		invoke _sleep
	.endif
	.if rivalnum==0||flag_ctn==0
		invoke MessageBox,NULL,addr szGG,addr szGG,MB_OK
		invoke ExitProcess,NULL
	.endif
	ret
judge endp




_ProcWinMain proc uses ebx edi esi,hWnd,uMsg,wParam,lParam  
	local @stPs:PAINTSTRUCT
	local @stRect:RECT
	local @hDc
	local tmpText[1005]:dword

	mov eax,hWnd
	mov hW,eax

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
		invoke ExitProcess,NULL

	.elseif eax==WM_CREATE 
		.if flagmode==0
			;invoke CreateFont, 105, 48, 0, 0, FW_BOLD, FALSE, FALSE, FALSE, DEFAULT_CHARSET, OUT_CHARACTER_PRECIS, CLIP_CHARACTER_PRECIS, DEFAULT_QUALITY, DEFAULT_PITCH or FF_DONTCARE, addr szFontName
			;mov hFont0, eax

			invoke CreateWindowEx,NULL,offset button,addr szText3,\;不能用offset
			WS_CHILD or WS_VISIBLE,170,180,200,40,\ 
			hWnd,1002,hInstance,NULL  

			invoke sprintf,addr tmpText,offset szText2,pointB
			invoke CreateWindowEx,NULL,offset button,addr szText4,\
			WS_CHILD or WS_VISIBLE,170,230,200,40,\ 
			hWnd,1003,hInstance,NULL

		.else;游戏界面
			invoke judge,1,2
		
			invoke sprintf,addr tmpText,offset szText1,pointA
			invoke CreateWindowEx,NULL,offset button,addr tmpText,\;不能用offset
			WS_CHILD or WS_VISIBLE,300,40,200,40,\ 
			hWnd,1000,hInstance,NULL  ;pointA button句柄是1000

			invoke sprintf,addr tmpText,offset szText2,pointB
			invoke CreateWindowEx,NULL,offset button,addr tmpText,\
			WS_CHILD or WS_VISIBLE,300,100,200,40,\ 
			hWnd,1001,hInstance,NULL  ;pointB 句柄是1001

			mov esi,0
			.while esi<sz
				mov edi,0
				.while edi<sz
					mov eax,esi
					imul eax,40
					mov ebx,edi
					imul ebx,40
					mov ecx,esi
					imul ecx,sz
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
		.endif

	.elseif eax==WM_COMMAND
		.if flagmode==0
			mov eax,wParam	
			.if eax == 1002
				mov edx,1
				mov flagmode,edx

				mov edx,1002
				mov eax,0
				mov playwith,eax
				invoke MessageBox,NULL,addr szStart,addr szStart,MB_OK
				call _WinMain 
			.elseif eax == 1003
				mov edx,2
				mov flagmode,edx

				mov edx,1003
				mov eax,1
				mov playwith,eax
				invoke MessageBox,NULL,addr szStart,addr szStart,MB_OK
				call _WinMain 
			.endif
	
		.else;游戏界面

		mov eax,wParam	
		.if eax < 1000
			mov dl,map[eax]
		.endif
		
		;mov temp,edx
		;invoke printf, offset bug,temp

		.if dl==0 && next_player==0 
			;调试
			;invoke SetDlgItemText,hWnd,0,addr bu0

			.if flag==1
				;如果是负数会溢出

				;mov temp,eax
				;invoke printf, offset bug,temp

				mov edx,pre;减法操作
				.if eax>=edx
					sub eax,edx
				.else
					sub edx,eax
					mov eax,edx
				.endif

				;.if eax==1||eax==5||eax==4||eax==6;规则：斜正方形
				.if eax==1||eax==sz||eax==sz-1||eax==sz+1
					mov eax,wParam
					mov next,eax
					xor eax,eax
					mov flag,eax


					invoke SetDlgItemText,hWnd,next,addr bu1 ;返回值为bool，存入eax
					mov ebx,offset map
					mov edx,1
					add ebx,next
					mov [ebx],dl

				;.elseif eax==2||eax==10
				.elseif eax==2||eax==sz+sz
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
				.endif


				.if flag==0
					mov ebx,offset map
					mov edx,1
					mov cl,sz
					mov eax,next
					div cl
					mov ch,ah;ah余数
					mov cl,al
					.if ch<sz-1 
						mov eax,next
						add eax,1
						;.if eax>=0 && eax<25 && map[eax]==2;必须要有空格
						.if map[eax]==2
							push eax
							invoke SetDlgItemText,hWnd,eax,addr bu1
							pop eax
							mov [ebx+eax],dl
						.endif
					.endif

				
				
					.if ch>0
						mov eax,next
						sub eax,1
						.if map[eax]==2
							push eax
							invoke SetDlgItemText,hWnd,eax,addr bu1
							pop eax
							mov [ebx+eax],dl
						.endif
					.endif
					
					mov eax,next
					add eax,sz
					.if eax<sz*sz && map[eax]==2
						push eax
						invoke SetDlgItemText,hWnd,eax,addr bu1
						pop eax
						mov [ebx+eax],dl
					.endif

					mov eax,next
					.if eax>sz
						sub eax,sz
						.if eax>=0 && map[eax]==2
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
					mov eax,1
					mov next_player,eax
					
					;call 是否能走
					invoke judge,1,2
					.if playwith == 0
					invoke _sleep
					invoke _sleep
					invoke _sleep
					invoke call_B
					invoke judge,2,1
					.endif
				.endif				
			.endif
			
			
			
		
		.elseif dl==1 && next_player == 0
			mov pre,eax
			mov eax,1
			mov flag,eax
		.elseif dl==2 && next_player == 1 && playwith == 1
			mov pre,eax
			mov eax,1
			mov flag,eax
		.elseif dl==0 && next_player == 1 && playwith == 1
			.if flag==1
				;如果是负数会溢出

				;mov temp,eax
				;invoke printf, offset bug,temp

				mov edx,pre
				.if eax>=edx
					sub eax,edx
				.else
					sub edx,eax
					mov eax,edx
				.endif

				;.if eax==1||eax==5||eax==4||eax==6;规则：斜正方形
				.if eax==1||eax==sz||eax==sz-1||eax==sz+1
					mov eax,wParam
					mov next,eax
					xor eax,eax
					mov flag,eax


					invoke SetDlgItemText,hWnd,next,addr bu2 ;返回值为bool，存入eax
					mov ebx,offset map
					mov edx,2
					add ebx,next
					mov [ebx],dl

				;.elseif eax==2||eax==10
				.elseif eax==2||eax==sz+sz
					mov eax,wParam
					mov next,eax
					xor eax,eax
					mov flag,eax


					invoke SetDlgItemText,hWnd,pre,addr bu2
					invoke SetDlgItemText,hWnd,next,addr bu0
					
					mov ebx,offset map
					mov edx,0
					add ebx,pre
					mov [ebx],dl 	;mov map[pre],edx不可行
					mov ebx,offset map
					mov edx,2
					add ebx,next
					mov [ebx],dl
				.endif


				.if flag==0
					mov ebx,offset map
					mov edx,2
					mov cl,sz
					mov eax,next
					div cl
					mov cl,ah;ah余数
		
					.if cl<sz-1
						mov eax,next
						add eax,1
						;.if eax>=0 && eax<25 && map[eax]==1;必须要有空格
						.if map[eax]==1
							push eax
							push edx
							invoke SetDlgItemText,hWnd,eax,addr bu2
							pop edx
							pop eax
							mov [ebx+eax],dl
						.endif
					.endif

				
				
					.if cl>0
						mov eax,next
						sub eax,1
						.if map[eax]==1
							push eax
							push edx
							invoke SetDlgItemText,hWnd,eax,addr bu2
							pop edx
							pop eax
							mov [ebx+eax],dl
						.endif
					.endif

					mov eax,next
					add eax,sz
					.if eax<sz*sz && map[eax]==1
						push eax
						push edx
						invoke SetDlgItemText,hWnd,eax,addr bu2
						pop edx
						pop eax
						mov [ebx+eax],dl
					.endif

					mov eax,next
					.if eax>sz
						sub eax,sz
						.if eax>=0 && map[eax]==1
							push eax
							push edx
							invoke SetDlgItemText,hWnd,eax,addr bu2
							pop edx
							pop eax
							mov [ebx+eax],dl
							mov al,map[eax]
							mov temp0, al
						.endif
					.endif


					xor eax,eax
					mov pre,eax
					mov next,eax
					mov eax,0
					mov next_player,eax
					
					;call 是否能走
					invoke judge,1,2
				.endif				
			.endif
		.endif
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

	.if flagmode==0
		invoke CreateWindowEx,WS_EX_CLIENTEDGE,offset szClassName,offset szCaptionMain,WS_OVERLAPPEDWINDOW,100,100,570,350,NULL,NULL,hInstance,NULL		;如果改成'button'那么建立的将是一个按钮，szCaptionMain代表的则是窗口的名称，该名称会显示在标题栏中
	.else
		invoke CreateWindowEx,WS_EX_CLIENTEDGE,offset szClassName,offset szCaptionMain,WS_OVERLAPPEDWINDOW,100,100,570,350,NULL,NULL,hInstance,NULL		;如果改成'button'那么建立的将是一个按钮，szCaptionMain代表的则是窗口的名称，该名称会显示在标题栏中
	.endif
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
	xor edx,edx
	mov flagmode,edx
	call _WinMain  ;主程序就调用了窗口程序和结束程序两个函数
	invoke ExitProcess,NULL
	ret
main endp
end main