.386
.model flat, stdcall
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

;����һЩ����
printf					PROTO C:dword,:vararg 
strlen					PROTO C:dword,:vararg
strcat					PROTO C:dword,:dword
strcpy					PROTO C:dword,:dword

.data
hInstance				dd				?
hWinMain				dd				?
BufferA					byte			50	dup(?);���ڱ����һ��������
BufferB					byte			50  dup(?);�ڶ���������
BufferUnion				byte			100	dup(?);�ϳ�֮��Ĳ�����
BufferAns				byte			100	dup(?);���
BufferSymbol			byte			50	dup(?);����
BufferALen				dd				0
BufferBLen				dd				0
BufferSymbolLen			dd				0
tempA					dq				0.0;��ʱ����
tempB					dq				0.0;��ʱ����
tempAns					dq				0.0;��ʱ����
temp					dq				180.0;��ʱ����

;���
hEdit					dd				?	
hEditAns				dd				?

;�������
OutputNum				db				'%d', 0
OutputChar				db				'%c', 0
OutputStr				db				'%s', 0
OutputFloat				db				'%lf', 0
OutputNewLine			db				0ah, 0

.const
szClassName				db				'MyClass', 0
szCaptionMain			db				'������', 0
szButton				db				'button', 0
szEdit					db				'static', 0

;��ť���ı�����ʾ����
szButtonText_ZERO		db				'0', 0				
szButtonText_ONE		db				'1', 0	
szButtonText_TWO		db				'2', 0	
szButtonText_THREE		db				'3', 0	
szButtonText_FOUR		db				'4', 0	
szButtonText_FIVE		db				'5', 0	
szButtonText_SIX		db				'6', 0	
szButtonText_SEVEN		db				'7', 0	
szButtonText_EIGHT		db				'8', 0	
szButtonText_NINE		db				'9', 0	
szButtonText_ADD		db				'+', 0	
szButtonText_SUB		db				'-', 0	
szButtonText_MUL		db				'*', 0
szButtonText_DIV		db				'/', 0
szButtonText_MOD		db				'mod', 0
szButtonText_LOG		db				'log', 0
szButtonText_SIN		db				'sin', 0	
szButtonText_COS		db				'cos', 0	
szButtonText_TAN		db				'tan', 0
szButtonText_POW		db				'x^y', 0		;x^y
szButtonText_POWtemp	db				'^', 0			;x^yȥ������
szButtonText_EQU		db				'=', 0
szButtonText_DOT		db				'.', 0	
szButtonText_CLEAR		db				'C', 0	
szEditText				db				'0', 0	
szEditAnsText			db				'0', 0

;��ť���ı���ID
szButtonId_ZERO			equ				0				
szButtonId_ONE			equ				1	
szButtonId_TWO			equ				2	
szButtonId_THREE		equ				3	
szButtonId_FOUR			equ				4	
szButtonId_FIVE			equ				5	
szButtonId_SIX			equ				6	
szButtonId_SEVEN		equ				7	
szButtonId_EIGHT		equ				8	
szButtonId_NINE			equ				9	
szButtonId_ADD			equ				10				;'+'	
szButtonId_SUB			equ				11				;'-'
szButtonId_MUL			equ				12				;'*'
szButtonId_DIV			equ				13				;'/'
szButtonId_MOD			equ				14				;mod
szButtonId_LOG			equ				15				;log
szButtonId_SIN			equ				16				;sin
szButtonId_COS			equ				17				;cos
szButtonId_TAN			equ				18				;tan
szButtonId_POW			equ				19				;x^y
szButtonId_EQU			equ				23				;'='
szButtonId_DOT			equ				24				;'.'
szButtonId_CLEAR		equ				26				;���
szEditId				equ				27				;�ı���
szEditAnsId				equ				27				;�ı���

.code

;����ֵ,���ݷ��ŵ�һ���ַ���ascall�����ж�
_Calculator				proc
						finit			;�Ĵ����ĳ�ʼ��
						mov				esi, 0
						.if				BufferSymbol[esi] == 43								;+
										invoke StrToFloat,addr BufferA,addr tempA
										invoke StrToFloat,addr BufferB,addr tempB
										fld tempA
										fld tempB
										fadd st(0), st(1)
										fst tempAns
										invoke FloatToStr,tempAns,addr BufferAns
						.elseif			BufferSymbol[esi] == 45								;-
										invoke StrToFloat,addr BufferA,addr tempA
										invoke StrToFloat,addr BufferB,addr tempB
										fld tempB
										fld tempA
										fsub st(0), st(1)
										fst tempAns
										invoke FloatToStr,tempAns,addr BufferAns
						.elseif			BufferSymbol[esi] == 42								;*
										invoke StrToFloat,addr BufferA,addr tempA
										invoke StrToFloat,addr BufferB,addr tempB
										fld tempA
										fld tempB
										fmul st(0), st(1)
										fst tempAns
										invoke FloatToStr,tempAns,addr BufferAns
						.elseif			BufferSymbol[esi] == 47								;/
										invoke StrToFloat,addr BufferA,addr tempA
										invoke StrToFloat,addr BufferB,addr tempB
										fld tempB
										fld tempA
										fdiv st(0), st(1)
										fst tempAns
										invoke FloatToStr,tempAns,addr BufferAns
						.elseif			BufferSymbol[esi] == 99								;cos,����Ϊ����
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
						.elseif			BufferSymbol[esi] == 115							;sin,����Ϊ����
										invoke StrToFloat,addr BufferA,addr tempA
										fld tempA
										fldpi
										fmul st(0), st(1)
										fld temp
										fdiv st(1), st(0)
										fstp temp
										fsin
										fst tempAns
										invoke FloatToStr,tempAns,addr BufferAns
						.elseif			BufferSymbol[esi] == 116							;tan,����Ϊ����
										invoke StrToFloat,addr BufferA,addr tempA
										fld tempA
										fldpi
										fmul st(0), st(1)
										fld temp
										fdiv st(1), st(0)
										fstp temp
										fsin
										fst tempB

										fld tempA
										fldpi
										fmul st(0), st(1)
										fld temp
										fdiv st(1), st(0)
										fstp temp
										fcos

										fld tempB
										fdiv st(0), st(1)

										fst tempAns
										invoke FloatToStr,tempAns,addr BufferAns
						.elseif			BufferSymbol[esi] == 109							;mod
										invoke StrToFloat,addr BufferA,addr tempA
										invoke StrToFloat,addr BufferB,addr tempB
										fld tempB
										fld tempA
										fprem
										fst tempAns
										invoke FloatToStr,tempAns,addr BufferAns
						.elseif			BufferSymbol[esi] == 108							;log
										invoke StrToFloat,addr BufferA,addr tempA
										fld1												;��1.0���ص�st(0)��
										fld	tempA											;��x���ؽ���
										fyl2x												;����st(1)*log2(st(0)),��������st(0)��
										fldl2t												;��log2(10)���ؽ�ȥ
										fdiv st(1), st(0)
										fstp tempAns
										fst tempAns
										invoke FloatToStr,tempAns,addr BufferAns
						.elseif			BufferSymbol[esi] == 94								;^ ,x^y=2^(y*log2(x))
										invoke StrToFloat,addr BufferA,addr tempA
										invoke StrToFloat,addr BufferB,addr tempB
										fld tempB
										fld tempA
										fyl2x
										fld1
										fld st(1)
										fprem
										f2xm1
										fadd
										fscale
										fxch st(1)
										fstp st
										fst tempAns
										invoke FloatToStr,tempAns,addr BufferAns
						.else			
										invoke StrToFloat,addr BufferA,addr tempA
										invoke FloatToStr,tempA,addr BufferAns
						.endif
						ret
_Calculator				endp

;��ռĴ����ͱ���ֵ
_RegClearAll			proc
						;��ռĴ���
						invoke			RtlZeroMemory, addr BufferA, sizeof BufferA
						invoke			RtlZeroMemory, addr BufferB, sizeof BufferB
						invoke			RtlZeroMemory, addr BufferUnion, sizeof BufferUnion
						invoke			RtlZeroMemory, addr BufferSymbol, sizeof BufferSymbol
						invoke			RtlZeroMemory, addr BufferAns, sizeof BufferAns
						;��ճ���
						mov				BufferALen, 0
						mov				BufferBLen, 0
						mov				BufferSymbolLen, 0
						mov esi, 0
						mov BufferAns[esi], 48
_RegClearAll			endp

;�ϳ������ַ���
_UnionBuffer			proc			stdcall			a:dword, b:dword
						mov				esi, a
						mov				ebx, b
						.if				ebx ==			0												;��ʾ����������
										mov				edx, 0
										.if				BufferSymbolLen == 0
														add	BufferALen, 1
														invoke			strcat, offset BufferA, esi		;�����������ƴ�ӵ�BufferA����
														invoke			strcat, offset BufferUnion, esi
										.else															;���Ų�Ϊ�գ���ʾ�����˵ڶ���������
														add	BufferBLen, 1
														invoke			strcat, offset BufferB, esi		;��ʾ���Ų�Ϊ0����ƴ�ӵ�B����
														invoke			strcat, offset BufferUnion, esi
										.endif
						.elseif			ebx ==			1												;��ʾ�����˷���
										invoke			strcpy, offset BufferSymbol, esi				;ֱ�Ӹ���ԭ���ķ���
										.if				esi == offset szButtonText_TAN || esi == offset szButtonText_SIN || esi == offset szButtonText_COS || esi == offset szButtonText_LOG 
														mov BufferSymbolLen, 3
														.if				BufferALen > 0					;��ʾ�û����Ȱ���������,��Ӧ�õ������ź����ֵ�λ��
																		invoke			strcpy, offset BufferUnion, offset BufferSymbol	;�����Ÿ��ǵ�BufferUnion��
																		invoke			strcat, offset BufferA, offset BufferB
																		invoke			RtlZeroMemory, addr BufferB, sizeof BufferB
																		invoke			strcat, offset BufferUnion, offset BufferA				
														.elseif	
																		mov eax, 0
																		.if	BufferUnion[eax] == 48
																			mov BufferUnion[eax], 0
																		.endif
																		invoke			strcat, offset BufferUnion, offset BufferSymbol
														.endif
										
										.else
														.if				BufferALen > 0					;��ʾ�û����Ȱ���������,��Ӧ�õ������ź����ֵ�λ��
																		.if				BufferSymbolLen > 0
																						invoke			strcpy, offset BufferUnion, offset BufferA	;�Ѳ��������ƽ�ȥ
																						invoke			strcat, offset BufferUnion, offset BufferSymbol	;�����Ÿ��ǵ�BufferUnion��
																						invoke			strcat, offset BufferUnion, offset BufferB	;�Ѳ��������ƽ�ȥ
																		.elseif			
																						invoke			strcat, offset BufferUnion, offset BufferSymbol
																		.endif
														.elseif			BufferBLen > 0
																		invoke			strcat, offset BufferA, offset BufferB
																		invoke			RtlZeroMemory, addr BufferB, sizeof BufferB
																		mov				edx, BufferBLen
																		add				BufferALen, edx
																		mov				BufferBLen, 0
																		invoke			strcpy, offset BufferUnion, offset BufferA	;�Ѳ��������ƽ�ȥ
																		invoke			strcat, offset BufferUnion, offset BufferSymbol	;�����Ÿ��ǵ�BufferUnion��
														.else
																		invoke			_RegClearAll
														.endif
														.if	esi == offset szButtonText_MOD
															mov BufferSymbolLen, 3
														.else
															mov BufferSymbolLen, 1
														.endif
										.endif	
						.endif

						;���û�������ǵ�������
						mov ebx, 0
						.if  BufferSymbol[ebx] == 99 || BufferSymbol[ebx] == 108 || BufferSymbol[ebx] == 115 || BufferSymbol[ebx] == 116
							invoke			strcat, offset BufferA, offset BufferB
							invoke			RtlZeroMemory, addr BufferB, sizeof BufferB
							mov				edx, BufferBLen
							add				BufferALen, edx
							mov				BufferBLen, 0
							invoke			strcpy, offset BufferUnion, offset BufferSymbol	;�����Ÿ��ǵ�BufferUnion��
							invoke			strcat, offset BufferUnion, offset BufferA	;�Ѳ��������ƽ�ȥ
						.endif
						ret
_UnionBuffer			endp

;���ڹ���
_ProcWinMain			proc			uses ebx edi esi, hWnd, uMsg, wParam, lParam
						local			@stPs:PAINTSTRUCT
						local			@stRect:RECT
						local			@hDc
						.if				uMsg ==			WM_PAINT
										invoke			BeginPaint, hWnd, addr @stPs
										mov				@hDc, eax
										invoke			GetClientRect, hWnd, addr @stRect
										invoke			DrawText, @hDc, NULL, -1, addr @stRect,\
														DT_SINGLELINE or DT_CENTER or DT_VCENTER
										invoke			EndPaint, hWnd, addr @stPs
						.elseif			uMsg ==			WM_CREATE
										;��ʾ����ı���
										invoke			CreateWindowEx, NULL,\
														offset szEdit, NULL,\
														WS_CHILD or WS_VISIBLE,\
														20, 22, 350, 40,\
														hWnd, 101, hInstance, NULL
														;��ȡ���
														mov hEdit,eax
										invoke			CreateWindowEx, NULL,\
														offset szEdit, NULL,\
														WS_CHILD or WS_VISIBLE,\
														20, 60, 350, 40,\
														hWnd, 102, hInstance, NULL
														;��ȡ���
														mov hEditAns,eax
										;��ʾ�ڲ��ı���
										invoke			CreateWindowEx, NULL,\
														offset szEdit, offset szEditText,\
														WS_CHILD or WS_VISIBLE,\
														32, 36, 334, 20,\
														hWnd, szEditId, hInstance, NULL
														;��ȡ���
														mov hEdit,eax
										invoke			CreateWindowEx, NULL,\
														offset szEdit, offset szEditAnsText,\
														WS_CHILD or WS_VISIBLE,\
														32, 70, 334, 20,\
														hWnd, szEditId, hInstance, NULL
														;��ȡ���
														mov hEditAns,eax
										;��ʾ��ť
										;��һ��*********************************************************
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_LOG,\
														WS_CHILD or WS_VISIBLE,\
														20, 110, 80, 40,\
														hWnd, szButtonId_LOG, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_MOD,\
														WS_CHILD or WS_VISIBLE,\
														110, 110, 80, 40,\
														hWnd, szButtonId_MOD, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_POW,\
														WS_CHILD or WS_VISIBLE,\
														200, 110, 80, 40,\
														hWnd, szButtonId_POW, hInstance, NULL	
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_CLEAR,\
														WS_CHILD or WS_VISIBLE,\
														290, 110, 80, 40,\
														hWnd, szButtonId_CLEAR, hInstance, NULL
										;�ڶ���*********************************************************
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_SIN,\
														WS_CHILD or WS_VISIBLE,\
														20, 160, 80, 40,\
														hWnd, szButtonId_SIN, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_COS,\
														WS_CHILD or WS_VISIBLE,\
														110, 160, 80, 40,\
														hWnd, szButtonId_COS, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_TAN,\
														WS_CHILD or WS_VISIBLE,\
														200, 160, 80, 40,\
														hWnd, szButtonId_TAN, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_ADD,\
														WS_CHILD or WS_VISIBLE,\
														290, 160, 80, 40,\
														hWnd, szButtonId_ADD, hInstance, NULL
										;������*********************************************************
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_ONE,\
														WS_CHILD or WS_VISIBLE,\
														20, 210, 80, 40,\
														hWnd, szButtonId_ONE, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_TWO,\
														WS_CHILD or WS_VISIBLE,\
														110, 210, 80, 40,\
														hWnd, szButtonId_TWO, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_THREE,\
														WS_CHILD or WS_VISIBLE,\
														200, 210, 80, 40,\
														hWnd, szButtonId_THREE, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_SUB,\
														WS_CHILD or WS_VISIBLE,\
														290, 210, 80, 40,\
														hWnd, szButtonId_SUB, hInstance, NULL
										;������*********************************************************
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_FOUR,\
														WS_CHILD or WS_VISIBLE,\
														20, 260, 80, 40,\
														hWnd, szButtonId_FOUR, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_FIVE,\
														WS_CHILD or WS_VISIBLE,\
														110, 260, 80, 40,\
														hWnd, szButtonId_FIVE, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_SIX,\
														WS_CHILD or WS_VISIBLE,\
														200, 260, 80, 40,\
														hWnd, szButtonId_SIX, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_MUL,\
														WS_CHILD or WS_VISIBLE,\
														290, 260, 80, 40,\
														hWnd, szButtonId_MUL, hInstance, NULL
										;������*********************************************************
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_SEVEN,\
														WS_CHILD or WS_VISIBLE,\
														20, 310, 80, 40,\
														hWnd, szButtonId_SEVEN, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_EIGHT,\
														WS_CHILD or WS_VISIBLE,\
														110, 310, 80, 40,\
														hWnd, szButtonId_EIGHT, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_NINE,\
														WS_CHILD or WS_VISIBLE,\
														200, 310, 80, 40,\
														hWnd, szButtonId_NINE, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_DIV,\
														WS_CHILD or WS_VISIBLE,\
														290, 310, 80, 40,\
														hWnd, szButtonId_DIV, hInstance, NULL
										;������*********************************************************
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_ZERO,\
														WS_CHILD or WS_VISIBLE,\
														20, 360, 80, 40,\
														hWnd, szButtonId_ZERO, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_DOT,\
														WS_CHILD or WS_VISIBLE,\
														110, 360, 80, 40,\
														hWnd, szButtonId_DOT, hInstance, NULL
										invoke			CreateWindowEx, NULL,\
														offset szButton, offset szButtonText_EQU,\
														WS_CHILD or WS_VISIBLE,\
														200, 360, 170, 40,\
														hWnd, szButtonId_EQU, hInstance, NULL
										
						.elseif			uMsg ==			WM_COMMAND
										mov				eax, wParam
										.if				eax == szButtonId_ZERO
														invoke _UnionBuffer, offset szButtonText_ZERO, 0
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_ONE
														invoke _UnionBuffer, offset szButtonText_ONE, 0
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_TWO
														invoke _UnionBuffer, offset szButtonText_TWO, 0
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_THREE
														invoke _UnionBuffer, offset szButtonText_THREE, 0
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_FOUR
														invoke _UnionBuffer, offset szButtonText_FOUR, 0
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_FIVE
														invoke _UnionBuffer, offset szButtonText_FIVE, 0
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_SIX
														invoke _UnionBuffer, offset szButtonText_SIX, 0
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_SEVEN
														invoke _UnionBuffer, offset szButtonText_SEVEN, 0
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_EIGHT
														invoke _UnionBuffer, offset szButtonText_EIGHT, 0
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_NINE
														invoke _UnionBuffer, offset szButtonText_NINE, 0
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_ADD
														invoke _UnionBuffer, offset szButtonText_ADD, 1
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_SUB
														invoke _UnionBuffer, offset szButtonText_SUB, 1
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_MUL
														invoke _UnionBuffer, offset szButtonText_MUL, 1
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_DIV
														invoke _UnionBuffer, offset szButtonText_DIV, 1
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_MOD
														invoke _UnionBuffer, offset szButtonText_MOD, 1
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_LOG
														invoke _UnionBuffer, offset szButtonText_LOG, 1
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_SIN
														invoke _UnionBuffer, offset szButtonText_SIN, 1
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_COS
														invoke _UnionBuffer, offset szButtonText_COS, 1
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_TAN
														invoke _UnionBuffer, offset szButtonText_TAN, 1
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_POW
														invoke _UnionBuffer, offset szButtonText_POWtemp, 1
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_EQU
														invoke _Calculator
														invoke	strcat, offset BufferUnion, offset szButtonText_EQU ;���Ⱥ�ƴ�ӵ��ϳ��ַ����ĺ���
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
														invoke SendMessage,hEditAns,WM_SETTEXT,0,addr BufferAns
														invoke _RegClearAll
										.elseif			eax == szButtonId_DOT
														invoke _UnionBuffer, offset szButtonText_DOT, 0
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr BufferUnion
										.elseif			eax == szButtonId_CLEAR
														invoke _RegClearAll
														invoke SendMessage,hEdit,WM_SETTEXT,0,addr szEditText
														invoke SendMessage,hEditAns,WM_SETTEXT,0,addr szEditAnsText
										.endif
						.elseif			uMsg ==			WM_CLOSE
										invoke			DestroyWindow, hWinMain
										invoke			PostQuitMessage, NULL
						.else			
										invoke			DefWindowProc, hWnd, uMsg, wParam, lParam
										ret
						.endif
						xor				eax, eax
						ret
_ProcWinMain			endp

_WinMain				proc
						local			@stWndClass:WNDCLASSEX
						local			@stMsg:MSG
						invoke			GetModuleHandle, NULL
						mov				hInstance, eax
						invoke			RtlZeroMemory, addr @stWndClass, sizeof @stWndClass

						;��ռĴ���
						invoke			RtlZeroMemory, addr BufferA, sizeof BufferA
						invoke			RtlZeroMemory, addr BufferB, sizeof BufferB
						invoke			RtlZeroMemory, addr BufferUnion, sizeof BufferUnion
						invoke			RtlZeroMemory, addr BufferSymbol, sizeof BufferSymbol
						invoke			RtlZeroMemory, addr BufferAns, sizeof BufferAns
						mov esi, 0
						mov BufferAns[esi], 48

						;����ע����
						invoke			LoadCursor, 0, IDC_ARROW
						mov				@stWndClass.hCursor, eax
						push			hInstance
						pop				@stWndClass.hInstance
						mov				@stWndClass.cbSize, sizeof WNDCLASSEX
						mov				@stWndClass.style, CS_HREDRAW or CS_VREDRAW
						mov				@stWndClass.lpfnWndProc, offset _ProcWinMain
						mov				@stWndClass.hbrBackground, COLOR_WINDOW + 1
						mov				@stWndClass.lpszClassName, offset	szClassName
						invoke			RegisterClassEx, addr @stWndClass

						;��������ʾ����
						invoke CreateWindowEx, WS_EX_CLIENTEDGE,\
										offset szClassName, offset szCaptionMain,\
										WS_OVERLAPPEDWINDOW,\
										500, 100, 411, 464,\
										NULL, NULL, hInstance, NULL
						mov				hWinMain, eax
						invoke			ShowWindow, hWinMain, SW_SHOWNORMAL
						invoke			UpdateWindow, hWinMain

						;��Ϣѭ��
						.while			TRUE
										invoke			GetMessage, addr @stMsg, NULL, 0, 0
										.break			.if eax == 0
										invoke			TranslateMessage, addr @stMsg
										invoke			DispatchMessage, addr @stMsg
						.endw
						ret
_WinMain				endp

main					proc
						call			_WinMain
						invoke			ExitProcess, NULL

main					endp
end						main