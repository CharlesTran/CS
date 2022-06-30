.386

.model flat,stdcall             ;

option casemap:none             

include	windows.inc
include	kernel32.inc
includelib	kernel32.lib
include	user32.inc
includelib	user32.lib
include	msvcrt.inc
includelib	msvcrt.lib

printf PROTO C :ptr sbyte, :VARARG
scanf PROTO C :ptr sbyte, :VARARG
strlen PROTO C :ptr sbyte, :VARARG
sprintf PROTO C :ptr sbyte, :VARARG
strcmp PROTO C :ptr sbyte, :VARARG
strcat PROTO C :ptr sbyte, :VARARG

.data
hInstance dd ?
hWinMain dd ?
H_edit1 HWND ?
H_edit2 HWND ?
file1_path byte 256 dup(?)
file2_path byte 256 dup(?)
differs byte 2048 dup(0)
differ_num dd ?
buffer1 byte 2048 dup(0)
buffer2 byte 2048 dup(0)

winClassName db '文件比较',0
winCaptionName db '文件比较',0
edit byte 'edit', 0
button byte 'button', 0
showbutton byte '确认', 0
SameContent	 db '文件内容相同', 0
DiffContent db '行数: %d', 0AH,0
WarningError db '文件路径不能为空', 0
szBoxTitle db '比较结果', 0
szBoxTitle1 db '警告', 0
.code

ReadLine proc fp: HANDLE, buffer:ptr byte
	local len: dword
	local chr: byte

	mov esi, buffer
	mov edi, 0

L1: 
	invoke ReadFile, fp, addr chr, 1, addr len, NULL
	.if len == 0
		mov byte ptr [esi], 0
		mov eax,edi
		ret
	.endif
	.if chr == 10
		mov byte ptr [esi], 0
		mov eax,edi
		ret
	.endif
	mov al, chr
	mov byte ptr [esi], al
	inc esi
	inc edi
	jmp L1

ReadLine endp

MyCompareFile proc fpath1:ptr byte, fpath2:ptr byte
	local fp1 :HANDLE
	local fp2 :HANDLE
	local lp1 :dword
	local lp2 :dword
	local index_line :dword
	local buffer_differ[1024] :byte

	invoke CreateFile, fpath1, GENERIC_READ, FILE_SHARE_READ, NULL,OPEN_EXISTING, FILE_ATTRIBUTE_NORMAL, NULL
	mov fp1, eax
	invoke CreateFile, fpath2, GENERIC_READ, FILE_SHARE_READ, NULL,OPEN_EXISTING, FILE_ATTRIBUTE_NORMAL, NULL
	mov fp2, eax
	mov differ_num, 0
	mov index_line, 0
	mov esi, offset differs
	mov byte ptr[esi], 0
L0:
	inc index_line
	invoke ReadLine, fp1, offset buffer1
	mov lp1, eax
	invoke ReadLine, fp2, offset buffer2
	mov lp2, eax

L1:
	cmp lp1, 0
	jne L3
	cmp lp2, 0
	jne L2
	;都等于0
	ret
L2:
	invoke sprintf, addr buffer_differ, offset DiffContent, index_line
	invoke strcat, offset differs, addr buffer_differ
	inc differ_num
	jmp L0

L3:
	cmp lp2,0
	jne L4

	invoke sprintf, addr buffer_differ, offset DiffContent, index_line
	invoke strcat, offset differs, addr buffer_differ
	inc differ_num
	jmp L0

L4:
;都不等于0
	invoke strcmp, offset buffer1, offset buffer2
	cmp eax, 0
	je L0
	invoke sprintf, addr buffer_differ, offset DiffContent, index_line
	invoke strcat, offset differs, addr buffer_differ
	inc differ_num
	jmp L0

MyCompareFile endp

_WinMain proc uses ebx edi esi, hWnd, uMsg, wParam, lParam
		local structps: PAINTSTRUCT
		local structrect: RECT
		local hDc
		mov eax, uMsg
		.IF eax==WM_PAINT
			invoke BeginPaint, hWnd, addr structps
			mov hDc, eax
			invoke EndPaint, hWnd, addr structps
		.ELSEIF eax==WM_CLOSE
			invoke DestroyWindow, hWinMain
			invoke PostQuitMessage, NULL
		.ELSEIF eax==WM_CREATE
L0:
			invoke CreateWindowEx, WS_EX_CLIENTEDGE, OFFSET edit, NULL, WS_CHILD OR  WS_VISIBLE OR WS_BORDER OR	ES_LEFT	OR ES_AUTOHSCROLL, 10, 10, 350, 35, hWnd, 1, hInstance, NULL
			mov H_edit1, eax
			invoke CreateWindowEx, WS_EX_CLIENTEDGE, OFFSET edit, NULL, WS_CHILD OR  WS_VISIBLE	OR WS_BORDER OR	ES_LEFT	OR ES_AUTOHSCROLL, 10, 50, 350, 35, hWnd, 2, hInstance,	NULL 
			mov H_edit2, eax
			invoke CreateWindowEx, NULL, OFFSET button, OFFSET showbutton, WS_CHILD OR  WS_VISIBLE,	120, 100, 150, 25, hWnd, 15,	hInstance, NULL
		.ELSEIF	eax==WM_COMMAND
			mov eax,wParam
			.IF eax==15
				invoke GetWindowText,H_edit1,offset file1_path,512
				invoke GetWindowText,H_edit2,offset file2_path,512
				.if file1_path == 0 || file2_path == 0
					invoke MessageBox, hWnd, offset WarningError, offset szBoxTitle1,	MB_OK + MB_ICONQUESTION
					jmp L0
				.endif
				invoke MyCompareFile, offset file1_path, offset file2_path
				.IF	differ_num == 0
					invoke MessageBox, hWnd, offset SameContent, offset szBoxTitle,	MB_OK + MB_ICONQUESTION
				.ELSE
					invoke MessageBox, hWnd, offset differs, offset szBoxTitle,	MB_OK + MB_ICONQUESTION
				.ENDIF
			.ENDIF
		.ELSE
			invoke DefWindowProc, hWnd, uMsg, wParam, lParam
			ret
		.ENDIF

		ret
_WinMain endp
main proc                          
        local structWndClass: WNDCLASSEX
		local structMsg: MSG
		invoke GetModuleHandle, NULL
		mov hInstance,eax
		invoke RtlZeroMemory, addr structWndClass, sizeof structWndClass
		invoke LoadCursor, 0, IDC_ARROW
		mov structWndClass.hCursor, eax
		push hInstance
		pop structWndClass.hInstance
		mov structWndClass.cbSize, sizeof WNDCLASSEX
		mov structWndClass.style, CS_HREDRAW or CS_VREDRAW
		mov structWndClass.lpfnWndProc, offset _WinMain
		mov structWndClass.hbrBackground, COLOR_WINDOW + 1
		mov structWndClass.lpszClassName, offset winClassName
		invoke RegisterClassEx, addr structWndClass
		invoke CreateWindowEx, WS_EX_CLIENTEDGE, offset winClassName, offset winCaptionName, WS_OVERLAPPEDWINDOW, 200, 200, 400, 200, NULL, NULL, hInstance, NULL
		mov hWinMain, eax
		invoke ShowWindow, hWinMain, SW_SHOWNORMAL
		invoke UpdateWindow, hWinMain
		
		.WHILE TRUE
			invoke GetMessage, addr	structMsg, NULL, 0, 0
			.break .if eax==0
			invoke TranslateMessage, addr structMsg		
			invoke DispatchMessage,	addr structMsg		
		.ENDW
		invoke ExitProcess, NULL
        ret
main endp
end main