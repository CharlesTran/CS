.386
.model flat, stdcall
option casemap:none

include				windows.inc
include				user32.inc
includelib			user32.lib
include				kernel32.inc
includelib			kernel32.lib
include				Gdi32.inc
includelib			Gdi32.lib
includelib			msvcrt.lib
include				shell32.inc
includelib			shell32.lib
include				comctl32.inc
includelib			comctl32.lib
include				masm32.inc
includelib			masm32.lib

;������������
printf				PROTO C:dword, :vararg
srand				PROTO C:dword, :vararg
rand				PROTO C:vararg
memset				PROTO C:dword, :dword, :dword, :vararg
sprintf				PROTO C:dword, :dword, :dword, :vararg

;������Ҫ�õ���id
IDI_ICON			equ				201
IDB_BACK			equ				202
ID_TIMER			equ				1
ID_UP				equ				101
ID_DOWN				equ				102
ID_LEFT				equ				103
ID_RIGHT			equ				104
ID_STOP				equ				100
ID_SCORE			equ				105
ID_SCORETEXT		equ				106
ID_SPEED			equ				106
ID_SPEEDSLOW		equ				107
ID_SPEEDMIDDLE		equ				108
ID_SPEEDFAST		equ				109
ID_SPEEDUP			equ				110
ID_NORMAL			equ				111

.data
hInstance			dd				?
hWinMain			dd				?
dwX					dd				500		dup(0);�洢�ߵ�����
dwY					dd				500		dup(0)
dwXT				dd				500		dup(0);���ڴ洢��ӡ�����յ�
dwYT				dd				500		dup(0)
dwNextX				dd				?
dwNextY				dd				?
dwXTemp				dd				?			;��ʱ
dwYTemp				dd				?			;��ʱ		
dwSnakeLen			dd				?			;�ߵĳ���
dwSnakeSize			dd				10			;�ߴ�С,��Ҫ�����ߴ�Сλ������һ�����ʵ��ͷ�������������ɳ���
dwStep				dd				20			;��������ÿ���ƶ��ľ���
dwTime				dd				300			;ˢ��ʱ����
dwDirection			dd				?			;1��ʾ�ϣ�2��ʾ�£�3��ʾ��4��ʾ�ң�0��ʾֹͣ
dwDirectionTemp		dd				0			;������ʱ�����ƶ�����
dwRandX				dd				?			;�����������������
dwRandY				dd				?				
Num					byte			"%d", 0		;�������
Blank				byte			" ", 0		;����ո�
Line				byte			0ah, 0		;�����������
OutputStr			byte			"%s", 0
OutputChar			byte			"%c", 0
szButton			byte			"button", 0
szButton_Start		byte			"��ʼ", 0
szButton_Stop		byte			"��ͣ", 0
szButton_Restart	byte			"����", 0
hButton				dd				?
ButtonFlag			dd				0			;0��ʾֹͣ��1��ʾ�˶���2��ʾ����
szButton_UP			byte			"��", 0
szButton_DOWN		byte			"��", 0
szButton_LEFT		byte			"��", 0
szButton_RIGHT		byte			"��", 0
szStatic			byte			"static", 0
szEdit				byte			"edit", 0
dwSCORE				db				"������", 0
dwSCORETEXT			byte			?			;�������
dwScoreTemp			byte			"0"			;���ڳ�ʼ������
dwSPEED				byte			"�ٶȣ�", 0
dwSPEEDSLOW			byte			"��", 0
dwSPEEDMIDDLE		byte			"��", 0
dwSPEEDFAST			byte			"��", 0
hScore				dd				?
szBoxTitle			db				"��Ϸ��ʾ", 0
szBoxText			db				"��Ϸ������", 0
szSpeedUp			db				"����ģʽ", 0
szNormal			db				"����ģʽ", 0
SpeedFlag			dd				0;	���ɼ��ٱ�־ 
dwMODULE			db				"ģʽ��", 0

.const
szClassName			db				'̰����', 0

.code
;***************************************************************************************
;
;��������ɺ���
;
;***************************************************************************************
_Rand				proc	
					
					local @stTime:SYSTEMTIME
					invoke GetLocalTime, addr @stTime
					movzx eax, @stTime.wMilliseconds
					invoke srand, eax					;��������
					invoke rand
					mov ebx, 19
					div ebx
					imul edx, dwStep
					add edx, 35
					mov dwRandX, edx

					movzx eax, @stTime.wMilliseconds
					invoke rand
					mov ebx, 19
					div ebx
					imul edx, dwStep
					add edx, 35
					mov dwRandY, edx
					
					ret
_Rand				endp


;***************************************************************************************
;
;��ʼ�����������ڳ�ʼ���Ĵ�����ֵ
;
;***************************************************************************************
_Init				proc
					;�������������������ȫ����ʼ��Ϊ0
					invoke			memset, addr dwX, 0, sizeof dwX
					invoke			memset, addr dwY, 0, sizeof dwY
					invoke			memset, addr dwXT, 0, sizeof dwXT
					invoke			memset, addr dwYT, 0, sizeof dwYT

					;��ʼ��һ����
					mov eax, 215
					mov ebx, 0
					mov dwX[ebx], eax
					add eax, dwSnakeSize
					mov dwXT[ebx], eax
					mov eax, 35
					mov ebx, 0
					mov dwY[ebx], eax
					add eax, dwSnakeSize
					mov dwYT[ebx], eax

					;��ʼ����һ�������λ��
					invoke _Rand
					mov eax, dwRandX
					mov dwNextX, eax
					mov eax, dwRandY
					mov dwNextY, eax

					;��ʼ���߳���
					mov dwSnakeLen, 1

					;��ʼ������
					mov dwDirection, 2

					;��ʼ������
					mov al, dwScoreTemp
					mov dwSCORETEXT, al

					ret
_Init				endp


;***************************************************************************************
;
;���ߺ�������(x1, y1)���ߵ�(x2, y2)
;
;***************************************************************************************
_DrawLine			proc			_hDC, X1, Y1, X2, Y2
					invoke			MoveToEx, _hDC, X1, Y1, NULL
					invoke			LineTo, _hDC, X2, Y2
					ret
_DrawLine			endp


;***************************************************************************************
;
;����º������ú���ÿ����һ�Σ�����һ��λ��
;
;***************************************************************************************
_UpdatePosition		proc	_hWnd
					mov eax, 0
					invoke _Rand
					mov esi, dwSnakeLen
					sub esi, 1
					imul esi, 4
					mov eax, dwX[esi]
					mov dwXTemp, eax
					mov eax, dwY[esi]
					mov dwYTemp, eax

					;�����һ�����λ��
					mov esi, dwStep
					mov edx, dwDirection
					.if				edx == 1								;��ʾ������
									mov eax, dwYTemp
									sub eax, esi
									mov dwYTemp, eax
					.elseif			edx == 2								;��ʾ������
									mov eax, dwYTemp
									add eax, esi
									mov dwYTemp, eax
					.elseif			edx == 3								;��ʾ����
									mov eax, dwXTemp
									sub eax, esi
									mov dwXTemp, eax
					.elseif			edx == 4								;��ʾ����
									mov eax, dwXTemp
									add eax, esi
									mov dwXTemp, eax
					.endif

					;�ж���һ�����Ƿ������У��ж��Ƿ������߽�
					.if dwDirection != 0															;����δֹͣ������²Ž����ж�
						mov esi, dwSnakeLen
						imul esi, 4
						.repeat
							sub esi, 4
							mov eax, dwX[esi]
							mov ebx, dwY[esi]
							.if (dwXTemp > 410 || dwXTemp < 30 || dwYTemp > 410 || dwYTemp < 30) || (eax == dwXTemp && ebx == dwYTemp)
									invoke KillTimer, _hWnd, ID_TIMER								;�رռ�ʱ��
									mov	dwXTemp, 0
									mov dwYTemp, 0
									mov dwDirection, 0
									mov ButtonFlag, 2												;�޸������־
									invoke SendMessage,hButton,WM_SETTEXT,0,addr szButton_Restart ;��ť��ʾ����
									;����������ʾ��
									invoke	MessageBox, NULL, offset szBoxText, offset szBoxTitle, MB_OK
									.break															;����ѭ��
							.endif
						.until esi == 0
					.endif

					;�жϵ�ǰ�Ƿ�ֹͣ��ֹ֮ͣ����һ�����������Ϊ0
					.if			dwDirection == 0								
									mov	dwXTemp, 0
									mov dwYTemp, 0
					.endif

					;���Ʒ���
					mov eax, dwSnakeLen
					sub eax, 1
					invoke sprintf, offset dwSCORETEXT, offset Num, eax ;������ת��Ϊ�ַ���
					invoke SendMessage,hScore,WM_SETTEXT,0,offset dwSCORETEXT

					;�жϸõ�ͺڵ��Ƿ����
					mov eax, dwXTemp
					mov ebx, dwYTemp
					.if eax == dwNextX && ebx == dwNextY && dwXTemp != 0;����򽫸õ���뵽������
									mov esi, dwSnakeLen
									imul esi, 4 
									mov eax, dwNextX
									mov ebx, dwNextY
									mov dwX[esi], eax
									add eax, dwSnakeSize
									mov dwXT[esi], eax					;���´�ӡ�յ�����
									mov dwY[esi], ebx
									add ebx, dwSnakeSize
									mov dwYT[esi], ebx
									add dwSnakeLen, 1

									;���ºڵ��λ��
									invoke _Rand
									mov eax, dwRandX
									mov dwNextX, eax
									mov eax, dwRandY
									mov dwNextY, eax

									;�жϲ����ĵ��Ƿ�������
									mov esi, dwSnakeLen
									imul esi, 4
									.repeat
										sub esi, 4
										mov eax, dwX[esi]
										mov ebx, dwY[esi]
										.if eax == dwNextX
											.if ebx == dwNextY
												;��������������������λ��
												invoke _Rand
												mov eax, dwRandX
												mov dwNextX, eax
												mov eax, dwRandY
												mov dwNextY, eax
												;ѭ�������ж��ж�
												mov esi, dwSnakeLen
												imul esi, 4
											.endif
										.endif
									.until esi == 0
					.elseif dwXTemp != 0;����ȣ���ԭ�е������0��esi���ε��Ƹ�ֵ
									mov esi, dwSnakeLen
									imul esi, 4
									mov eax, dwXTemp			;�����������ֵ����ĩβ
									mov dwX[esi], eax
									add eax, dwSnakeSize
									mov dwXT[esi], eax
									mov ebx, dwYTemp
									mov dwY[esi], ebx
									add eax, dwSnakeSize
									mov dwYT[esi], eax
									mov ebx, 0
									mov edi, 4
									.repeat
										mov eax, dwX[edi]
										mov dwX[ebx], eax
										add eax, dwSnakeSize	;���´�ӡ�յ�����
										mov dwXT[ebx], eax
										mov eax, dwY[edi]
										mov dwY[ebx], eax
										add eax, dwSnakeSize
										mov dwYT[ebx], eax
										add ebx, 4
										add edi, 4
									.until ebx == esi
					.endif
					ret
_UpdatePosition		endp


;***************************************************************************************
;
;�����ƺ���
;
;***************************************************************************************
_DrawBorad			proc			_hDC
					local			@hdc,@hBMP,@hDCTemp

					invoke KillTimer, hWinMain, ID_TIMER

					;����˫����DC
					invoke			GetDC, hWinMain											;��ȡ����DC
					mov				@hdc, eax
					invoke			CreateCompatibleDC, @hdc								;��������DC
					mov				@hDCTemp, eax
					invoke			CreateCompatibleBitmap, @hdc, 410, 410					;��������λͼ
					mov				@hBMP, eax
					invoke			SelectObject, @hDCTemp, @hBMP							;��λͼѡ��DC
					invoke			ReleaseDC, hWinMain, @hdc								;�ͷ�DC
					mov				eax, 255 + 255 * 100h + 255 * 10000h					;������ɫˢ�ӣ���������DC�У�ʹDC������ɫΪ��ɫ
					invoke			CreateSolidBrush, eax
					invoke			SelectObject, @hDCTemp, eax
					invoke			PatBlt, @hDCTemp, 0, 0, 420, 420, PATCOPY

					;������Ϸ����߿�
					mov				eax, 230 + 230 * 100h + 230 * 10000h
					invoke			CreatePen, PS_INSIDEFRAME, 10, eax
					invoke			SelectObject, _hDC, eax
					invoke			Rectangle, _hDC, 10, 10, 30, 430   ;������
					invoke			Rectangle, _hDC, 10, 10, 430, 30	 ;�Ϻ���
					invoke			Rectangle, _hDC, 410, 29, 430, 430   ;������
					invoke			Rectangle, _hDC, 10, 410, 430, 430   ;�º���

					;���Ƹ��ӱ���
					mov				eax, 230 + 230 * 100h + 230 * 10000h
					invoke			CreatePen, PS_INSIDEFRAME, 1, eax
					invoke			SelectObject, @hDCTemp, eax
					mov esi, 30
					add esi, dwStep
					.repeat
									invoke _DrawLine, @hDCTemp, 30, esi, 410, esi
									add esi, dwStep
					.until esi == 410
					mov esi, 30
					add esi, dwStep
					.repeat
									invoke _DrawLine, @hDCTemp, esi, 30, esi, 410
									add esi, dwStep
					.until esi == 410

					;������ͷ��
					mov				edx, dwSnakeSize 
					mov				ebx, dwSnakeLen
					sub				ebx, 1
					imul			ebx, 4
					mov				eax, 255 + 87 * 100h + 87 * 10000h
					invoke			CreatePen, PS_SOLID, dwSnakeSize, eax
					invoke			SelectObject, @hDCTemp, eax
					invoke			Ellipse, @hDCTemp, dwX[ebx], dwY[ebx], dwXT[ebx], dwYT[ebx]

					;���������岿��
					mov				eax, 255 + 87 * 100h + 87 * 10000h
					invoke			CreatePen, PS_SOLID, dwSnakeSize, eax
					invoke			SelectObject, @hDCTemp, eax
					mov				ebx, dwSnakeLen
					.if				ebx >= 2
									sub				ebx, 1
									imul			ebx, 4
									.repeat			
													sub				ebx, 4
													invoke			Rectangle, @hDCTemp, dwX[ebx], dwY[ebx], dwXT[ebx], dwYT[ebx]
									.until			ebx == 0
					.endif

					;��������
					mov				eax, 105 + 198 * 100h + 109 * 10000h
					invoke			CreatePen, PS_SOLID, dwSnakeSize, eax
					invoke			SelectObject, @hDCTemp, eax
					mov				eax, dwNextX
					add				eax, dwSnakeSize
					mov				ebx, dwNextY
					add				ebx, dwSnakeSize
					invoke			Rectangle, @hDCTemp, dwNextX, dwNextY, eax, ebx
					invoke			DeleteObject, eax

					

					;Ϊ�˱��������˸�����½�DC�еĻ��濽����������DC��
					invoke			BitBlt, _hDC, 30, 30, 410, 410, @hDCTemp, 30, 30, SRCCOPY
					;ɾ��DC
					invoke			DeleteDC, @hDCTemp	
					invoke SetTimer, hWinMain, ID_TIMER, dwTime, NULL

					ret
_DrawBorad			endp			


;***************************************************************************************
;
;���ڻ滭�Ҳ���Ϣ��ʾ�߿�
;
;***************************************************************************************
_DrawMsgBorder		proc			_hDC
					mov				eax, 230 + 230 * 100h + 230 * 10000h
					invoke			CreatePen, PS_INSIDEFRAME, 10, eax
					invoke			SelectObject, _hDC, eax
					invoke			Rectangle, _hDC, 430, 10, 610 , 30		;�Ϻ���
					invoke			Rectangle, _hDC, 430, 210, 610 , 230	;�к���
					invoke			Rectangle, _hDC, 430, 410, 610 , 430	;�ײ�����
					invoke			Rectangle, _hDC, 610, 10, 630 , 430		;�Ҳ�����
					ret
_DrawMsgBorder		endp


;***************************************************************************************
;
;��Ϣ���������������Ϣ
;
;***************************************************************************************
_ProcWinMain		proc			uses ebx edi esi hWnd, uMsg, wParam, lParam
					local			@stPS:PAINTSTRUCT
					local			@stRect:RECT
					local			@hDC, @hBMP
					;��Ҫ�ػ�ľ�������
					mov @stRect.left, 30
					mov @stRect.right, 410
					mov @stRect.top, 30
					mov @stRect.bottom, 410
					.if				uMsg == WM_TIMER										;��ʱ����ʱ
									invoke _UpdatePosition, hWnd
									invoke InvalidateRect, hWnd, addr @stRect, FALSE		;��ʱ����ʱ,�����ػ�������ǲ�ˢ�½���
					.elseif			uMsg == WM_PAINT
									invoke BeginPaint, hWnd, addr @stPS
									mov @hDC, eax
									invoke _DrawBorad, @hDC									;���û滭���溯��
									invoke _DrawMsgBorder, @hDC								;�滭�Ҳ�߿�
									invoke EndPaint, hWnd, addr @stPS
					.elseif			uMsg == WM_CREATE
									invoke SetTimer, hWnd, ID_TIMER, dwTime, NULL			;���ö�ʱ��
									;����������ʾ����
									invoke	CreateWindowEx, ES_LEFT,\
											offset szEdit, offset dwSCORE,\
											WS_CHILD or WS_VISIBLE,\
											460, 50, 40, 50,\
											hWnd, 50, hInstance, NULL 
									invoke	CreateWindowEx, ES_LEFT,\
											offset szEdit,offset dwSCORETEXT ,\
											WS_CHILD or WS_VISIBLE,\
											510, 50, 50, 30,\
											hWnd, ID_SCORE, hInstance, NULL
									mov		hScore, eax

									;�ٶ�ѡ��ť
									invoke	CreateWindowEx, ES_LEFT,\
											offset szEdit, offset dwSPEED,\
											WS_CHILD or WS_VISIBLE,\
											460, 80, 40, 50,\
											hWnd, 51, hInstance, NULL
									invoke	CreateWindowEx, NULL,\
											offset szButton, offset dwSPEEDSLOW,\
											WS_CHILD or WS_VISIBLE or BS_AUTORADIOBUTTON or WS_GROUP,\
											510, 80, 50, 20,\
											hWnd, ID_SPEEDSLOW, hInstance, NULL
									invoke	CreateWindowEx, NULL,\
											offset szButton, offset dwSPEEDMIDDLE,\
											WS_CHILD or WS_VISIBLE or BS_AUTORADIOBUTTON,\
											510, 100, 50, 20,\
											hWnd, ID_SPEEDMIDDLE, hInstance, NULL
									invoke	CheckDlgButton, hWnd, ID_SPEEDMIDDLE, BST_CHECKED		;����Ĭ��ѡ��״̬
									invoke	CreateWindowEx, NULL,\
											offset szButton, offset dwSPEEDFAST,\
											WS_CHILD or WS_VISIBLE or BS_AUTORADIOBUTTON,\
											510, 120, 50, 20,\
											hWnd, ID_SPEEDFAST, hInstance, NULL

									;ģʽѡ��
									invoke	CreateWindowEx, ES_LEFT,\
											offset szEdit, offset dwMODULE,\
											WS_CHILD or WS_VISIBLE,\
											460, 150, 40, 50,\
											hWnd, 51, hInstance, NULL
									invoke	CreateWindowEx, NULL,\
											offset szButton, offset szNormal,\
											WS_CHILD or WS_VISIBLE or BS_AUTORADIOBUTTON or WS_GROUP,\
											510, 150, 80, 20,\
											hWnd, ID_NORMAL, hInstance, NULL
									invoke	CheckDlgButton, hWnd, ID_NORMAL, BST_CHECKED		;����Ĭ��ѡ��״̬
									invoke	CreateWindowEx, NULL,\
											offset szButton, offset szSpeedUp,\
											WS_CHILD or WS_VISIBLE or BS_AUTORADIOBUTTON,\
											510, 170, 80, 20,\
											hWnd, ID_SPEEDUP, hInstance, NULL

									;��ͣ/��ʼ/���水ť
									invoke	CreateWindowEx, NULL,\
											offset szButton, offset szButton_Stop,\
											WS_CHILD or WS_VISIBLE,\
											495, 295, 50, 50,\
											hWnd, ID_STOP, hInstance, NULL
									mov		hButton,eax
									;���ϰ�ť
									invoke	CreateWindowEx, NULL,\	
											offset szButton, offset szButton_UP,\
											WS_CHILD or WS_VISIBLE,\
											495, 245, 50, 50,\
											hWnd, ID_UP, hInstance, NULL
									;���°�ť
									invoke	CreateWindowEx, NULL,\
											offset szButton, offset szButton_DOWN,\
											WS_CHILD or WS_VISIBLE,\
											495, 345, 50, 50,\
											hWnd, ID_DOWN, hInstance, NULL
									;����ť
									invoke	CreateWindowEx, NULL,\
											offset szButton, offset szButton_LEFT,\
											WS_CHILD or WS_VISIBLE,\
											445, 295, 50, 50,\
											hWnd, ID_LEFT, hInstance, NULL
									;���Ұ�ť
									invoke	CreateWindowEx, NULL,\
											offset szButton, offset szButton_RIGHT,\
											WS_CHILD or WS_VISIBLE,\
											545, 295, 50, 50,\
											hWnd, ID_RIGHT, hInstance, NULL

					.elseif			uMsg == WM_KEYDOWN
									mov eax,wParam
									mov ebx, dwDirection
									.if	eax == VK_UP													;w����ʾ����
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_UP,0		
									.elseif eax == VK_DOWN												;s����ʾ����
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_DOWN,0
									.elseif eax == VK_LEFT												;a����ʾ����
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_LEFT,0
									.elseif eax == VK_RIGHT												;d����ʾ����
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_RIGHT,0
									.elseif	eax == 87													;w����ʾ����
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_UP,0		
									.elseif eax == 83													;s����ʾ����
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_DOWN,0
									.elseif eax == 65												;a����ʾ����
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_LEFT,0
									.elseif eax == 68												;d����ʾ����
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_RIGHT,0
									.elseif eax == 32												;�ո��ʾ��ͣ
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_STOP,0
									.endif

									;********************************�������ɼ���
									.if SpeedFlag == 1
											invoke KillTimer, hWnd, ID_TIMER
											invoke _UpdatePosition, hWnd
											invoke			GetDC, hWinMain											
											mov				@hDC, eax
											invoke _DrawBorad, @hDC
											invoke SetTimer, hWnd, ID_TIMER, dwTime, NULL
									.endif
									;********************************
									
					.elseif			uMsg == WM_COMMAND												
									mov eax,wParam
									mov ebx, dwStep		
									mov esi, dwDirection
									.if	eax == ID_UP && ButtonFlag < 2 && esi != 2					;�����߲���ת���෴����
											mov dwDirection, 1
									.elseif eax == ID_DOWN && ButtonFlag != 2 && esi != 1	
											mov dwDirection, 2
									.elseif eax == ID_LEFT && ButtonFlag != 2 && esi != 4
											mov dwDirection, 3
									.elseif	eax == ID_RIGHT && ButtonFlag != 2 && esi != 3	
											mov dwDirection, 4
									.elseif eax == ID_STOP
											.if		ButtonFlag != 2							
													.if esi > 0										;��ʾ��Ҫֹͣ
															mov dwDirectionTemp, esi
															mov dwDirection, 0
															invoke SendMessage,hButton,WM_SETTEXT,0,addr szButton_Start
															mov ButtonFlag, 1
													.else											;��ʾ��Ҫ�ƶ�
															mov edx, dwDirectionTemp
															mov dwDirection, edx
															invoke SendMessage,hButton,WM_SETTEXT,0,addr szButton_Stop
															mov ButtonFlag, 0
													.endif
											.else													;��ʾ���¿�ʼ	
													invoke SetTimer, hWnd, ID_TIMER, dwTime, NULL	;���ö�ʱ��
													invoke SendMessage,hButton,WM_SETTEXT,0,addr szButton_Stop
													mov ButtonFlag, 0
													invoke _Init
											.endif
									.elseif	eax == ID_SPEEDSLOW										;�����ٶ��л���ť
											invoke	CheckDlgButton, hWnd, ID_SPEEDSLOW, BST_CHECKED
											mov dwTime, 500
											invoke SetTimer, hWnd, ID_TIMER, dwTime, NULL			;�������ö�ʱ��
									.elseif	eax == ID_SPEEDMIDDLE
											invoke	CheckDlgButton, hWnd, ID_SPEEDMIDDLE, BST_CHECKED
											mov dwTime, 300
											invoke SetTimer, hWnd, ID_TIMER, dwTime, NULL				
									.elseif	eax == ID_SPEEDFAST
											invoke	CheckDlgButton, hWnd, ID_SPEEDFAST, BST_CHECKED
											mov dwTime, 100
											invoke SetTimer, hWnd, ID_TIMER, dwTime, NULL				
									.elseif eax == ID_SPEEDUP
											mov SpeedFlag, 1
									.elseif eax == ID_NORMAL
											mov SpeedFlag, 0
									.endif 
									.if    ButtonFlag != 2
											invoke SetFocus, hWnd										;��Ϸ�������ô��ڻ�ý���
									.endif
									
					.elseif			uMsg == WM_CLOSE
									invoke KillTimer, hWnd, ID_TIMER
									invoke DestroyWindow, hWinMain
									invoke PostQuitMessage, NULL
					.else
									invoke DefWindowProc, hWnd, uMsg, wParam, lParam
									ret
					.endif
					xor				eax, eax
					ret
_ProcWinMain		endp


;***************************************************************************************
;
;ע�Ტ�������ں���
;
;***************************************************************************************
_WinMain			proc
					local			@stWndClass:WNDCLASSEX
					local			@stMsg:MSG
					invoke			GetModuleHandle, NULL
					mov				hInstance, eax

					;ע�ᴰ����
					invoke			RtlZeroMemory, addr @stWndClass, sizeof @stWndClass
					invoke			LoadIcon, hInstance, IDI_ICON
					mov				@stWndClass.hIcon, eax
					mov				@stWndClass.hIconSm, eax
					invoke			LoadCursor, 0, IDC_ARROW
					mov				@stWndClass.hCursor, eax
					push			hInstance
					pop				@stWndClass.hInstance
					mov				@stWndClass.cbSize, sizeof WNDCLASSEX
					mov				@stWndClass.style, CS_HREDRAW or CS_VREDRAW
					mov				@stWndClass.lpfnWndProc, offset _ProcWinMain
					mov				@stWndClass.hbrBackground, COLOR_WINDOW + 1
					mov				@stWndClass.lpszClassName, offset szClassName
					invoke			RegisterClassEx, addr @stWndClass

					;��������ʾ����
					invoke			CreateWindowEx,NULL, \
									offset szClassName, offset szClassName,\
									 WS_CAPTION or WS_SYSMENU or WS_MINIMIZEBOX,\
									300, 100, 656, 479,\
									NULL, NULL, hInstance, NULL
					mov				hWinMain, eax
					invoke			ShowWindow, hWinMain, SW_SHOWNORMAL
					invoke			UpdateWindow, hWinMain

					;��Ϣѭ��
					.while			TRUE
									invoke GetMessage, addr @stMsg, NULL, 0, 0
									.break .if eax == 0
									invoke TranslateMessage, addr @stMsg
									invoke DispatchMessage, addr @stMsg
					.endw
					ret
_WinMain			endp


;***************************************************************************************
;
;���������������
;
;***************************************************************************************
main				proc

					;���ó�ʼ��������ʼ���Ĵ�����ֵ
					invoke			_Init

					;���ô���ע�ắ��
					call			_WinMain
					invoke			ExitProcess, NULL
main				endp
end					main
