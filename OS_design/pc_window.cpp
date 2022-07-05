#include<windows.h>
#include<iostream>
static LPCTSTR mutex_read_name="read";//生产者互斥访问缓冲区
static LPCTSTR mutex_write_name="write";//消费者互斥访问缓冲区
static LPCTSTR mutex_print_name="print";//生产者消费者互斥打印避免混合输出 如果缓冲区只有一个mutex则可以不用此变量
static LPCTSTR event_continue_name="continue";//为了避免创建子进程顺序造成的影响 子进程等待同一信号一起开始
static LPCTSTR sem_full="full";
static LPCTSTR sem_empty="empty";
static LPCTSTR filemapping_name="filemapping";
char a[3]={'C','Z','X'};
void SignalStart()
{
	HANDLE hEventContinue=OpenEvent(EVENT_MODIFY_STATE,FALSE,event_continue_name);
	if(hEventContinue!=NULL)
	{
		SetEvent(hEventContinue);
	}
	CloseHandle(hEventContinue);
} 
BOOL CreateChild(char* process)
{
	TCHAR szFilename[MAX_PATH];
	GetModuleFileName(NULL,szFilename,MAX_PATH);//第一个参数为NULL获取当前程序路径
	TCHAR szCmdLine[MAX_PATH];
	sprintf(szCmdLine,"\"%s\" %s",szFilename,process);
	STARTUPINFO si;
	ZeroMemory(reinterpret_cast<void*> (&si),sizeof(si));
	si.cb=sizeof(si);
	PROCESS_INFORMATION pi;
	BOOL bCreateOK=CreateProcess(szFilename,szCmdLine,NULL,NULL,FALSE,0,NULL,NULL,&si,&pi);
	if(bCreateOK)
	{
		CloseHandle(pi.hProcess);
		CloseHandle(pi.hThread); 
	}
	return(bCreateOK);
}
void Produce()
{
	HANDLE hMapping=OpenFileMapping(FILE_MAP_ALL_ACCESS,FALSE,filemapping_name);
	HANDLE hMutex_write=OpenMutex(MUTEX_ALL_ACCESS,FALSE,mutex_write_name);
	HANDLE hMutex_print=OpenMutex(MUTEX_ALL_ACCESS,FALSE,mutex_print_name);
	HANDLE hSem_full=OpenSemaphore(SEMAPHORE_ALL_ACCESS,FALSE,sem_full);
	HANDLE hSem_empty=OpenSemaphore(SEMAPHORE_ALL_ACCESS,FALSE,sem_empty);
	HANDLE hEventContinue=OpenEvent(EVENT_MODIFY_STATE,FALSE,event_continue_name);
	LPVOID pFile=MapViewOfFile(hMapping,FILE_MAP_ALL_ACCESS,0,0,0);
	
	CHAR** ppData=reinterpret_cast<CHAR**> (pFile+4);  
	struct timeval t;
	int count=4;
	WaitForSingleObject(hEventContinue,INFINITE);
	while(count--)
	{
		int time=rand()%2000;
		Sleep(time);
		WaitForSingleObject(hSem_empty,INFINITE);//是否还有空位 
		WaitForSingleObject(hMutex_write,INFINITE);//互斥访问共享内存
		WaitForSingleObject(hMutex_print,INFINITE);
		printf("Producer %ld produce:%c\n",GetCurrentProcessId(),a[time%3]);
		**ppData=a[time%3];
		printf("buffer: %c %c %c %c \n",*(char*)(pFile),*(char*)(pFile+1),*(char*)(pFile+2),*(char*)(pFile+3));
		ReleaseMutex(hMutex_print);
		
		if(*ppData==pFile+3) //一个环形缓冲区
		{
			*ppData=(CHAR*)pFile;
		}	
		else
			++(*ppData); 
		ReleaseMutex(hMutex_write);
		ReleaseSemaphore(hSem_full,1,NULL);//full信号量+1
	} 
	UnmapViewOfFile(pFile);
	CloseHandle(hMapping);
	CloseHandle(hMutex_write);
	CloseHandle(hMutex_print);
	CloseHandle(hSem_full);
	CloseHandle(hSem_empty);
	CloseHandle(hEventContinue);
}
 
void Consume()
{
	HANDLE hMapping=OpenFileMapping(FILE_MAP_ALL_ACCESS,FALSE,filemapping_name);
	HANDLE hMutex_read=OpenMutex(MUTEX_ALL_ACCESS,FALSE,mutex_read_name);
	HANDLE hMutex_print=OpenMutex(MUTEX_ALL_ACCESS,FALSE,mutex_print_name);
	HANDLE hSem_full=OpenSemaphore(SEMAPHORE_ALL_ACCESS,FALSE,sem_full);
	HANDLE hSem_empty=OpenSemaphore(SEMAPHORE_ALL_ACCESS,FALSE,sem_empty);
	HANDLE hEventContinue=OpenEvent(EVENT_MODIFY_STATE,FALSE,event_continue_name);
	LPVOID pFile=MapViewOfFile(
		hMapping,
		FILE_MAP_ALL_ACCESS,
		0,
		0,
		0//映射整个文件
	); 
	CHAR** ppData=reinterpret_cast<CHAR**> (pFile+12); 
	struct timeval t;
	int count=3;
	WaitForSingleObject(hEventContinue,INFINITE);
	while(count--)
	{
		int time=rand()%3000;
		Sleep(time);
		
		WaitForSingleObject(hSem_full,INFINITE);//是否有数据 
		WaitForSingleObject(hMutex_read,INFINITE);//互斥访问共享内存
		
		WaitForSingleObject(hMutex_print,INFINITE);
		printf("\t\t\tConsumer %ld consume:%c\n",GetCurrentProcessId(),**ppData);
		**ppData='-';
		printf("\t\t\tbuffer: %c %c %c %c \n",*(char*)(pFile),*(char*)(pFile+1),*(char*)(pFile+2),*(char*)(pFile+3));
		ReleaseMutex(hMutex_print);
		if(*ppData==pFile+3) 
			*ppData=(CHAR*)pFile;
		else
			++(*ppData);
			
		ReleaseMutex(hMutex_read);
		ReleaseSemaphore(hSem_empty,1,NULL);//full信号量+1
	} 
	UnmapViewOfFile(pFile);
	CloseHandle(hMapping);
	CloseHandle(hMutex_read);
	CloseHandle(hMutex_print);
	CloseHandle(hSem_full);
	CloseHandle(hSem_empty);
	CloseHandle(hEventContinue);
}
void Init_Wait()
{
	HANDLE hMapping=CreateFileMapping(
		INVALID_HANDLE_VALUE,//使用页式临时文件
		NULL,
		PAGE_READWRITE,
		0,
		28,
		filemapping_name);
	HANDLE hSem_full=CreateSemaphore(
		NULL,//默认安全属性 
		0,//信号量初值
		4,//允许4个进程/线程同时访问 也是信号量的最大值 
		sem_full);
	HANDLE hSem_empty=CreateSemaphore(
		NULL,//默认安全属性 
		4,//信号量初值
		4,//允许一个进程/线程访问
		sem_empty);
	HANDLE mutex_read=CreateMutex(
		NULL,
		TRUE,//当前进程获得互斥锁
		mutex_read_name);
	HANDLE mutex_write=CreateMutex(
		NULL,
		TRUE,//当前进程获得互斥锁
		mutex_write_name);
	HANDLE mutex_print=CreateMutex(
		NULL,
		TRUE,//当前进程获得互斥锁
		mutex_print_name);
	HANDLE hEventContinue=CreateEvent(
		NULL,
		TRUE,//人工重置事件 
		FALSE,//初始为 无信号状态 
		event_continue_name);
	LPVOID pFile=MapViewOfFile(
		hMapping,
		FILE_MAP_ALL_ACCESS,
		0,
		0,
		0//映射整个文件
	); 
	CHAR** ppData_w=reinterpret_cast<CHAR**> (pFile+4);
	CHAR** ppData_r=reinterpret_cast<CHAR**> (pFile+12);
	CHAR* pBase= reinterpret_cast<CHAR*> (pFile);
	memset(pBase,'-',4*sizeof(char));
	*ppData_w=*ppData_r=(CHAR*) pFile;
	for(int i=0;i<3;i++)//3生产者
	{
		CreateChild("producer\0");
	} 
	for(int i=0;i<4;i++)
	{
		CreateChild("consumer\0");
	}
	ReleaseMutex(mutex_print);
	ReleaseMutex(mutex_read);
	ReleaseMutex(mutex_write);
	SignalStart();
	Sleep(10000); 
}
 
 
int main(int argc,char* argv[])
{
	if(argc>1&&strcmp(argv[1],"producer")==0){
		Produce();
	}
	else if(argc>1&&strcmp(argv[1],"consumer")==0) 
	{
		Consume();
	}
	else
	{
		Init_Wait();
	}
}