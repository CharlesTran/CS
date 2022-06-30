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

;申明几个函数
printf				PROTO C:dword, :vararg
srand				PROTO C:dword, :vararg
rand				PROTO C:vararg
memset				PROTO C:dword, :dword, :dword, :vararg
sprintf				PROTO C:dword, :dword, :dword, :vararg

;定义需要用到的id
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
dwX					dd				500		dup(0);存储蛇的坐标
dwY					dd				500		dup(0)
dwXT				dd				500		dup(0);用于存储打印坐标终点
dwYT				dd				500		dup(0)
dwNextX				dd				?
dwNextY				dd				?
dwXTemp				dd				?			;临时
dwYTemp				dd				?			;临时		
dwSnakeLen			dd				?			;蛇的长度
dwSnakeSize			dd				10			;蛇大小,需要设置蛇大小位步长的一半才能实现头部碰到东西即可吃下
dwStep				dd				20			;步长，即每次移动的距离
dwTime				dd				300			;刷新时间间隔
dwDirection			dd				?			;1表示上，2表示下，3表示左，4表示右，0表示停止
dwDirectionTemp		dd				0			;用于临时保存移动方向
dwRandX				dd				?			;保存随机产生的坐标
dwRandY				dd				?				
Num					byte			"%d", 0		;输出数字
Blank				byte			" ", 0		;输出空格
Line				byte			0ah, 0		;用于输出空行
OutputStr			byte			"%s", 0
OutputChar			byte			"%c", 0
szButton			byte			"button", 0
szButton_Start		byte			"开始", 0
szButton_Stop		byte			"暂停", 0
szButton_Restart	byte			"重玩", 0
hButton				dd				?
ButtonFlag			dd				0			;0表示停止，1表示运动，2表示重玩
szButton_UP			byte			"↑", 0
szButton_DOWN		byte			"↓", 0
szButton_LEFT		byte			"←", 0
szButton_RIGHT		byte			"→", 0
szStatic			byte			"static", 0
szEdit				byte			"edit", 0
dwSCORE				db				"分数：", 0
dwSCORETEXT			byte			?			;保存分数
dwScoreTemp			byte			"0"			;用于初始化分数
dwSPEED				byte			"速度：", 0
dwSPEEDSLOW			byte			"慢", 0
dwSPEEDMIDDLE		byte			"中", 0
dwSPEEDFAST			byte			"快", 0
hScore				dd				?
szBoxTitle			db				"游戏提示", 0
szBoxText			db				"游戏结束！", 0
szSpeedUp			db				"自由模式", 0
szNormal			db				"正常模式", 0
SpeedFlag			dd				0;	自由加速标志 
dwMODULE			db				"模式：", 0

.const
szClassName			db				'贪吃蛇', 0

.code
;***************************************************************************************
;
;随机数生成函数
;
;***************************************************************************************
_Rand				proc	
					
					local @stTime:SYSTEMTIME
					invoke GetLocalTime, addr @stTime
					movzx eax, @stTime.wMilliseconds
					invoke srand, eax					;更新种子
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
;初始化函数，用于初始化寄存器的值
;
;***************************************************************************************
_Init				proc
					;将保存坐标的两个数组全部初始化为0
					invoke			memset, addr dwX, 0, sizeof dwX
					invoke			memset, addr dwY, 0, sizeof dwY
					invoke			memset, addr dwXT, 0, sizeof dwXT
					invoke			memset, addr dwYT, 0, sizeof dwYT

					;初始第一个点
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

					;初始化第一个猎物的位置
					invoke _Rand
					mov eax, dwRandX
					mov dwNextX, eax
					mov eax, dwRandY
					mov dwNextY, eax

					;初始化蛇长度
					mov dwSnakeLen, 1

					;初始化方向
					mov dwDirection, 2

					;初始化分数
					mov al, dwScoreTemp
					mov dwSCORETEXT, al

					ret
_Init				endp


;***************************************************************************************
;
;画线函数，从(x1, y1)画线到(x2, y2)
;
;***************************************************************************************
_DrawLine			proc			_hDC, X1, Y1, X2, Y2
					invoke			MoveToEx, _hDC, X1, Y1, NULL
					invoke			LineTo, _hDC, X2, Y2
					ret
_DrawLine			endp


;***************************************************************************************
;
;点更新函数，该函数每调用一次，更新一次位置
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

					;求出下一个点的位置
					mov esi, dwStep
					mov edx, dwDirection
					.if				edx == 1								;表示向上走
									mov eax, dwYTemp
									sub eax, esi
									mov dwYTemp, eax
					.elseif			edx == 2								;表示向下走
									mov eax, dwYTemp
									add eax, esi
									mov dwYTemp, eax
					.elseif			edx == 3								;表示向左
									mov eax, dwXTemp
									sub eax, esi
									mov dwXTemp, eax
					.elseif			edx == 4								;表示向右
									mov eax, dwXTemp
									add eax, esi
									mov dwXTemp, eax
					.endif

					;判断下一个点是否在蛇中，判断是否碰到边界
					.if dwDirection != 0															;在蛇未停止的情况下才进行判断
						mov esi, dwSnakeLen
						imul esi, 4
						.repeat
							sub esi, 4
							mov eax, dwX[esi]
							mov ebx, dwY[esi]
							.if (dwXTemp > 410 || dwXTemp < 30 || dwYTemp > 410 || dwYTemp < 30) || (eax == dwXTemp && ebx == dwYTemp)
									invoke KillTimer, _hWnd, ID_TIMER								;关闭计时器
									mov	dwXTemp, 0
									mov dwYTemp, 0
									mov dwDirection, 0
									mov ButtonFlag, 2												;修改重玩标志
									invoke SendMessage,hButton,WM_SETTEXT,0,addr szButton_Restart ;按钮显示重玩
									;弹出重玩提示框
									invoke	MessageBox, NULL, offset szBoxText, offset szBoxTitle, MB_OK
									.break															;跳出循环
							.endif
						.until esi == 0
					.endif

					;判断当前是否停止，停止之后将下一个点的坐标置为0
					.if			dwDirection == 0								
									mov	dwXTemp, 0
									mov dwYTemp, 0
					.endif

					;绘制分数
					mov eax, dwSnakeLen
					sub eax, 1
					invoke sprintf, offset dwSCORETEXT, offset Num, eax ;将分数转化为字符串
					invoke SendMessage,hScore,WM_SETTEXT,0,offset dwSCORETEXT

					;判断该点和黑点是否相等
					mov eax, dwXTemp
					mov ebx, dwYTemp
					.if eax == dwNextX && ebx == dwNextY && dwXTemp != 0;相等则将该点加入到数组中
									mov esi, dwSnakeLen
									imul esi, 4 
									mov eax, dwNextX
									mov ebx, dwNextY
									mov dwX[esi], eax
									add eax, dwSnakeSize
									mov dwXT[esi], eax					;更新打印终点坐标
									mov dwY[esi], ebx
									add ebx, dwSnakeSize
									mov dwYT[esi], ebx
									add dwSnakeLen, 1

									;更新黑点的位置
									invoke _Rand
									mov eax, dwRandX
									mov dwNextX, eax
									mov eax, dwRandY
									mov dwNextY, eax

									;判断产生的点是否在蛇中
									mov esi, dwSnakeLen
									imul esi, 4
									.repeat
										sub esi, 4
										mov eax, dwX[esi]
										mov ebx, dwY[esi]
										.if eax == dwNextX
											.if ebx == dwNextY
												;如果存在相等则更新猎物的位置
												invoke _Rand
												mov eax, dwRandX
												mov dwNextX, eax
												mov eax, dwRandY
												mov dwNextY, eax
												;循环进行判断判断
												mov esi, dwSnakeLen
												imul esi, 4
											.endif
										.endif
									.until esi == 0
					.elseif dwXTemp != 0;不相等，则将原有的数组从0到esi依次递推赋值
									mov esi, dwSnakeLen
									imul esi, 4
									mov eax, dwXTemp			;将计算出来的值赋给末尾
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
										add eax, dwSnakeSize	;更新打印终点坐标
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
;面板绘制函数
;
;***************************************************************************************
_DrawBorad			proc			_hDC
					local			@hdc,@hBMP,@hDCTemp

					invoke KillTimer, hWinMain, ID_TIMER

					;创建双缓冲DC
					invoke			GetDC, hWinMain											;获取界面DC
					mov				@hdc, eax
					invoke			CreateCompatibleDC, @hdc								;创建兼容DC
					mov				@hDCTemp, eax
					invoke			CreateCompatibleBitmap, @hdc, 410, 410					;创建兼容位图
					mov				@hBMP, eax
					invoke			SelectObject, @hDCTemp, @hBMP							;将位图选入DC
					invoke			ReleaseDC, hWinMain, @hdc								;释放DC
					mov				eax, 255 + 255 * 100h + 255 * 10000h					;创建白色刷子，并拷贝到DC中，使DC背景颜色为白色
					invoke			CreateSolidBrush, eax
					invoke			SelectObject, @hDCTemp, eax
					invoke			PatBlt, @hDCTemp, 0, 0, 420, 420, PATCOPY

					;绘制游戏界面边框
					mov				eax, 230 + 230 * 100h + 230 * 10000h
					invoke			CreatePen, PS_INSIDEFRAME, 10, eax
					invoke			SelectObject, _hDC, eax
					invoke			Rectangle, _hDC, 10, 10, 30, 430   ;左竖线
					invoke			Rectangle, _hDC, 10, 10, 430, 30	 ;上横线
					invoke			Rectangle, _hDC, 410, 29, 430, 430   ;右竖线
					invoke			Rectangle, _hDC, 10, 410, 430, 430   ;下横线

					;绘制格子背景
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

					;绘制蛇头部
					mov				edx, dwSnakeSize 
					mov				ebx, dwSnakeLen
					sub				ebx, 1
					imul			ebx, 4
					mov				eax, 255 + 87 * 100h + 87 * 10000h
					invoke			CreatePen, PS_SOLID, dwSnakeSize, eax
					invoke			SelectObject, @hDCTemp, eax
					invoke			Ellipse, @hDCTemp, dwX[ebx], dwY[ebx], dwXT[ebx], dwYT[ebx]

					;绘制蛇身体部分
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

					;绘制猎物
					mov				eax, 105 + 198 * 100h + 109 * 10000h
					invoke			CreatePen, PS_SOLID, dwSnakeSize, eax
					invoke			SelectObject, @hDCTemp, eax
					mov				eax, dwNextX
					add				eax, dwSnakeSize
					mov				ebx, dwNextY
					add				ebx, dwSnakeSize
					invoke			Rectangle, @hDCTemp, dwNextX, dwNextY, eax, ebx
					invoke			DeleteObject, eax

					

					;为了避免界面闪烁，将新建DC中的画面拷贝到主界面DC中
					invoke			BitBlt, _hDC, 30, 30, 410, 410, @hDCTemp, 30, 30, SRCCOPY
					;删除DC
					invoke			DeleteDC, @hDCTemp	
					invoke SetTimer, hWinMain, ID_TIMER, dwTime, NULL

					ret
_DrawBorad			endp			


;***************************************************************************************
;
;用于绘画右侧信息显示边框
;
;***************************************************************************************
_DrawMsgBorder		proc			_hDC
					mov				eax, 230 + 230 * 100h + 230 * 10000h
					invoke			CreatePen, PS_INSIDEFRAME, 10, eax
					invoke			SelectObject, _hDC, eax
					invoke			Rectangle, _hDC, 430, 10, 610 , 30		;上横线
					invoke			Rectangle, _hDC, 430, 210, 610 , 230	;中横线
					invoke			Rectangle, _hDC, 430, 410, 610 , 430	;底部横线
					invoke			Rectangle, _hDC, 610, 10, 630 , 430		;右侧竖线
					ret
_DrawMsgBorder		endp


;***************************************************************************************
;
;消息函数，处理各种消息
;
;***************************************************************************************
_ProcWinMain		proc			uses ebx edi esi hWnd, uMsg, wParam, lParam
					local			@stPS:PAINTSTRUCT
					local			@stRect:RECT
					local			@hDC, @hBMP
					;需要重绘的矩形区域
					mov @stRect.left, 30
					mov @stRect.right, 410
					mov @stRect.top, 30
					mov @stRect.bottom, 410
					.if				uMsg == WM_TIMER										;计时器到时
									invoke _UpdatePosition, hWnd
									invoke InvalidateRect, hWnd, addr @stRect, FALSE		;定时器到时,发送重绘命令，但是不刷新界面
					.elseif			uMsg == WM_PAINT
									invoke BeginPaint, hWnd, addr @stPS
									mov @hDC, eax
									invoke _DrawBorad, @hDC									;调用绘画界面函数
									invoke _DrawMsgBorder, @hDC								;绘画右侧边框
									invoke EndPaint, hWnd, addr @stPS
					.elseif			uMsg == WM_CREATE
									invoke SetTimer, hWnd, ID_TIMER, dwTime, NULL			;设置定时器
									;创建分数显示区域
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

									;速度选择按钮
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
									invoke	CheckDlgButton, hWnd, ID_SPEEDMIDDLE, BST_CHECKED		;设置默认选中状态
									invoke	CreateWindowEx, NULL,\
											offset szButton, offset dwSPEEDFAST,\
											WS_CHILD or WS_VISIBLE or BS_AUTORADIOBUTTON,\
											510, 120, 50, 20,\
											hWnd, ID_SPEEDFAST, hInstance, NULL

									;模式选择
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
									invoke	CheckDlgButton, hWnd, ID_NORMAL, BST_CHECKED		;设置默认选中状态
									invoke	CreateWindowEx, NULL,\
											offset szButton, offset szSpeedUp,\
											WS_CHILD or WS_VISIBLE or BS_AUTORADIOBUTTON,\
											510, 170, 80, 20,\
											hWnd, ID_SPEEDUP, hInstance, NULL

									;暂停/开始/重玩按钮
									invoke	CreateWindowEx, NULL,\
											offset szButton, offset szButton_Stop,\
											WS_CHILD or WS_VISIBLE,\
											495, 295, 50, 50,\
											hWnd, ID_STOP, hInstance, NULL
									mov		hButton,eax
									;向上按钮
									invoke	CreateWindowEx, NULL,\	
											offset szButton, offset szButton_UP,\
											WS_CHILD or WS_VISIBLE,\
											495, 245, 50, 50,\
											hWnd, ID_UP, hInstance, NULL
									;向下按钮
									invoke	CreateWindowEx, NULL,\
											offset szButton, offset szButton_DOWN,\
											WS_CHILD or WS_VISIBLE,\
											495, 345, 50, 50,\
											hWnd, ID_DOWN, hInstance, NULL
									;向左按钮
									invoke	CreateWindowEx, NULL,\
											offset szButton, offset szButton_LEFT,\
											WS_CHILD or WS_VISIBLE,\
											445, 295, 50, 50,\
											hWnd, ID_LEFT, hInstance, NULL
									;向右按钮
									invoke	CreateWindowEx, NULL,\
											offset szButton, offset szButton_RIGHT,\
											WS_CHILD or WS_VISIBLE,\
											545, 295, 50, 50,\
											hWnd, ID_RIGHT, hInstance, NULL

					.elseif			uMsg == WM_KEYDOWN
									mov eax,wParam
									mov ebx, dwDirection
									.if	eax == VK_UP													;w键表示向上
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_UP,0		
									.elseif eax == VK_DOWN												;s键表示向下
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_DOWN,0
									.elseif eax == VK_LEFT												;a键表示向左
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_LEFT,0
									.elseif eax == VK_RIGHT												;d键表示向右
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_RIGHT,0
									.elseif	eax == 87													;w键表示向上
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_UP,0		
									.elseif eax == 83													;s键表示向下
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_DOWN,0
									.elseif eax == 65												;a键表示向左
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_LEFT,0
									.elseif eax == 68												;d键表示向右
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_RIGHT,0
									.elseif eax == 32												;空格表示暂停
											invoke _ProcWinMain,hWnd,WM_COMMAND,ID_STOP,0
									.endif

									;********************************可以自由加速
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
									.if	eax == ID_UP && ButtonFlag < 2 && esi != 2					;设置蛇不能转向相反方向
											mov dwDirection, 1
									.elseif eax == ID_DOWN && ButtonFlag != 2 && esi != 1	
											mov dwDirection, 2
									.elseif eax == ID_LEFT && ButtonFlag != 2 && esi != 4
											mov dwDirection, 3
									.elseif	eax == ID_RIGHT && ButtonFlag != 2 && esi != 3	
											mov dwDirection, 4
									.elseif eax == ID_STOP
											.if		ButtonFlag != 2							
													.if esi > 0										;表示需要停止
															mov dwDirectionTemp, esi
															mov dwDirection, 0
															invoke SendMessage,hButton,WM_SETTEXT,0,addr szButton_Start
															mov ButtonFlag, 1
													.else											;表示需要移动
															mov edx, dwDirectionTemp
															mov dwDirection, edx
															invoke SendMessage,hButton,WM_SETTEXT,0,addr szButton_Stop
															mov ButtonFlag, 0
													.endif
											.else													;表示重新开始	
													invoke SetTimer, hWnd, ID_TIMER, dwTime, NULL	;设置定时器
													invoke SendMessage,hButton,WM_SETTEXT,0,addr szButton_Stop
													mov ButtonFlag, 0
													invoke _Init
											.endif
									.elseif	eax == ID_SPEEDSLOW										;处理速度切换按钮
											invoke	CheckDlgButton, hWnd, ID_SPEEDSLOW, BST_CHECKED
											mov dwTime, 500
											invoke SetTimer, hWnd, ID_TIMER, dwTime, NULL			;重新设置定时器
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
											invoke SetFocus, hWnd										;游戏中总是让窗口获得焦点
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
;注册并创建窗口函数
;
;***************************************************************************************
_WinMain			proc
					local			@stWndClass:WNDCLASSEX
					local			@stMsg:MSG
					invoke			GetModuleHandle, NULL
					mov				hInstance, eax

					;注册窗口类
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

					;建立并显示窗口
					invoke			CreateWindowEx,NULL, \
									offset szClassName, offset szClassName,\
									 WS_CAPTION or WS_SYSMENU or WS_MINIMIZEBOX,\
									300, 100, 656, 479,\
									NULL, NULL, hInstance, NULL
					mov				hWinMain, eax
					invoke			ShowWindow, hWinMain, SW_SHOWNORMAL
					invoke			UpdateWindow, hWinMain

					;消息循环
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
;主函数，程序入口
;
;***************************************************************************************
main				proc

					;调用初始化函数初始化寄存器的值
					invoke			_Init

					;调用窗口注册函数
					call			_WinMain
					invoke			ExitProcess, NULL
main				endp
end					main
