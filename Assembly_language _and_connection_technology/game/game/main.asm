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
;include masm32rt.inc������ᱨ��fopen���ظ�����
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
	.if eax==1||eax==5||eax==4||eax==6;����б������	
		mov eax,wParam
		mov next,eax
		xor eax,eax
		mov flag,eax
		invoke SetDlgItemText,hWnd,next,addr bu1 ;����ֵΪbool������eax
		mov ebx,offset map
		mov edx,1
		add ebx,next
		mov [ebx],dl
		mov ebx,offset map
		mov edx,1
		mov eax,next
		add eax,1
		.if eax>=0 && eax<25 && map[eax]==2;����Ҫ�пո�
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

	.elseif eax==2||eax==10;����б������
					
		mov eax,wParam
		mov next,eax
		xor eax,eax
		mov flag,eax
		invoke SetDlgItemText,hWnd,pre,addr bu0
		invoke SetDlgItemText,hWnd,next,addr bu1
		mov ebx,offset map
		mov edx,0
		add ebx,pre
		mov [ebx],dl 	;mov map[pre],edx������
		mov ebx,offset map
		mov edx,1
		add ebx,next
		mov [ebx],dl
		mov ebx,offset map
		mov edx,1
		mov eax,next
		add eax,1
		.if eax>=0 && eax<25 && map[eax]==2;����Ҫ�пո�
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
			;����
			;invoke SetDlgItemText,hWnd,0,addr bu0

			.if flag==1
				;����Ǹ��������

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
			;����
			;invoke SetDlgItemText,hWnd,0,addr bu1

			mov pre,eax
			;invoke printf, offset bug,pre
			mov eax,1
			mov flag,eax
			;push eax����û����  push pop�����һ�γ�����������׳�������δֵ֪������

			;invoke SetDlgItemText,hWnd,eax,addr bu1
		.elseif dl==2
			;����
			;invoke SetDlgItemText,hWnd,0,addr bu2

			
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
			WS_OVERLAPPEDWINDOW,100,100,570,350,\	;szClassName�ǽ�������ʹ�õ������ַ���ָ�룬������'MyClass'����ʾ��'MyClass'��������������ڣ��������ӵ��'MyClass'����������
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