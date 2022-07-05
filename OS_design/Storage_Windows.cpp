#include <windows.h>
#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <shlwapi.h>
#include <iomanip>
#include <winbase.h>
#include <psapi.h>
#include <TlHelp32.h>
#pragma comment(lib,"Shlwapi.lib")
using namespace std;
int use_hour,use_min,use_sec,use_ms;
SYSTEMTIME t_start, t_end;
//显示保护标记，该标记表示允许应用程序对内存进行访问的类型
inline bool TestSet(DWORD dwTarget, DWORD dwMask)
{
    return ((dwTarget & dwMask) == dwMask);
}
#define SHOWMASK(dwTarget,type) if(TestSet(dwTarget,PAGE_##type)) {cout<<","<<#type;}
void ShowProtection(DWORD dwTarget)
{
    //定义页面保护方式
    SHOWMASK(dwTarget, READONLY);
    SHOWMASK(dwTarget, GUARD);
    SHOWMASK(dwTarget, NOCACHE);
    SHOWMASK(dwTarget, READWRITE);
    SHOWMASK(dwTarget, WRITECOPY);
    SHOWMASK(dwTarget, EXECUTE);
    SHOWMASK(dwTarget, EXECUTE_READ);
    SHOWMASK(dwTarget, EXECUTE_READWRITE);
    SHOWMASK(dwTarget, EXECUTE_WRITECOPY);
    SHOWMASK(dwTarget, NOACCESS);
}

//遍历整个虚拟内存，并显示各内存区属性的工作程序的方法
void WalkVM(HANDLE hProcess)
{
    SYSTEM_INFO si;//系统信息结构
    ZeroMemory(&si, sizeof(si));
    GetSystemInfo(&si);//获得系统信息

    MEMORY_BASIC_INFORMATION mbi;//进程虚拟内存空间的基本信息结构
    ZeroMemory(&mbi, sizeof(mbi));//分配缓冲区，用于保存信息

    //循环整个应用程序地址空间
    LPCVOID pBlock = (LPVOID)si.lpMinimumApplicationAddress;
    while (pBlock < si.lpMaximumApplicationAddress)
    {
        //获得下一个虚拟内存块的信息
        if (VirtualQueryEx(
            hProcess,//相关的进程
            pBlock,//开始位置
            &mbi,//缓冲区
            sizeof(mbi)) == sizeof(mbi))//长度的确认
        {
            //计算块的结尾及其长度
            LPCVOID pEnd = (PBYTE)pBlock + mbi.RegionSize;
            TCHAR szSize[MAX_PATH];
            //显示块地址和长度
            cout.fill('0');
            cout<<dec<<"<"<<mbi.RegionSize/1024<<"KB"<<"> ";

            //显示块的状态
            switch (mbi.State)
            {
            case MEM_COMMIT:
                cout << "Committed";
                break;
            case MEM_FREE:
                cout << "Free";
                break;
            case MEM_RESERVE:
                cout << "Reserved";
                break;
            }

            //显示保护
            if (mbi.Protect == 0 && mbi.State != MEM_FREE)
            {
                mbi.Protect = PAGE_READONLY;
            }
            ShowProtection(mbi.Protect);

            //显示类型
            switch (mbi.Type) {
            case MEM_IMAGE:
                cout << ",IMAGE";
                break;
            case MEM_MAPPED:
                cout << ",MAPPED";
                break;
            case MEM_PRIVATE:
                cout << ",Private";
                break;
            }

            //检验可执行的映像
            TCHAR szFilename[MAX_PATH];
            if (GetModuleFileName(
                (HMODULE)pBlock,
                szFilename,
                MAX_PATH) > 0)
            {
                //除去路径并显示
                //PathStripPath(szFilename);
                cout << ",Module:" << szFilename;
            }
            cout << endl;
            //移动块指针以获得下一个块
            pBlock = pEnd;
        }
    }
}

int main(int argc, char **argv){    
    //获取内存信息
    MEMORYSTATUSEX statex;
    statex.dwLength = sizeof(statex);
    GlobalMemoryStatusEx(&statex);
    cout << "----------MemoryInfo----------" << endl;
    cout << "Physical memory usage: " << statex.dwMemoryLoad << "%" << endl;
    cout << "Physical memory capacity: " << statex.ullTotalPhys / 1024 / 1024 / 1024 << "GB" << endl;
    cout << "Available physical memory: " << statex.ullAvailPhys / 1024 / 1024 / 1024 << "GB" << endl;
    cout << "------------------------------" << endl << endl;

    //获得系统信息
    SYSTEM_INFO si;
    ZeroMemory(&si, sizeof(si));
    GetSystemInfo(&si);
    cout << "----------SystemInfo----------" << endl;
    cout << "Vitrual memory page size: " << si.dwPageSize / 1024 << "KB" << endl;
    cout.fill('0');
    cout << "Minimum application address: 0x"
        << si.lpMinimumApplicationAddress
        << endl;
    cout << "Maximum application address: 0x"
        << si.lpMaximumApplicationAddress
        << endl;
    cout << "Total available virtual memory: "
        << si.dwAllocationGranularity / 1024 << "KB" << endl;
    cout << "------------------------------" << endl << endl;

	//获取系统的存储器使用情况
	PERFORMANCE_INFORMATION pi;
	pi.cb = sizeof(pi);
	GetPerformanceInfo(&pi, sizeof(pi));
	cout << "----------系统存储器使用情况----------" << endl;
	cout << "结构体的大小为: " << pi.cb << "B" << endl;
	cout << "系统当前提交的页面总数: " << pi.CommitTotal << endl;
	cout << "系统当前可提交的最大页面总数: " << pi.CommitLimit << endl;
	cout << "系统历史提交页面峰值: " << pi.CommitPeak << endl;
	cout << "按页分配的总物理内存: " << pi.PhysicalTotal << endl;
	cout << "当前可用的物理内存为: " << pi.PhysicalAvailable << endl;
	cout << "系统Cache的容量为: " << pi.SystemCache << endl;
	cout << "内存总量(按页)为: " << pi.KernelTotal << endl;
	cout << "分页池的大小为: " << pi.KernelPaged << endl;
	cout << "非分页池的大小为: " << pi.KernelNonpaged << endl;
	cout << "页的大小为: " << pi.PageSize << endl;
	cout << "打开的句柄个数为: " << pi.HandleCount << endl;
	cout << "进程个数为: " << pi.ProcessCount << endl;
	cout << "线程个数为: " << pi.ThreadCount << endl;
	cout << "------------------------------" << endl << endl;

/*	//获得每个进程的信息
	printf("------------------各个进程的信息----------------------\n");
	PROCESSENTRY32 pe;
	pe.dwSize = sizeof(pe);
	HANDLE hProcessSnap = ::CreateToolhelp32Snapshot(TH32CS_SNAPPROCESS, 0);
	BOOL bMore = ::Process32First(hProcessSnap, &pe);
	while (bMore)
	{
		HANDLE hP = OpenProcess(PROCESS_ALL_ACCESS, FALSE, pe.th32ProcessID);
		PROCESS_MEMORY_COUNTERS pmc;
		ZeroMemory(&pmc, sizeof(pmc));

		if (GetProcessMemoryInfo(hP, &pmc, sizeof(pmc)) == TRUE)
		{
			cout << " 进程ID:";
			cout << pe.th32ProcessID << endl;
			cout << " 进程名称:";
			cout << pe.szExeFile << endl;
			cout << " 虚拟内存的大小为:" << (float)pmc.WorkingSetSize / 1024 << "KB" << endl;
		}
		bMore = ::Process32Next(hProcessSnap, &pe);
	}
	printf("----------------------------------------------------\n");*/

	printf("-------进程虚拟地址空间布局和工作集信息查询---------\n");
	STARTUPINFO mi;       
    memset(&mi,0,sizeof(STARTUPINFO));    
    mi.cb=sizeof(STARTUPINFO);
	PROCESS_INFORMATION ui;
	CreateProcess(
	NULL,//新进程的可执行文件
	argv[1],//传递给新进程的命令行字符串
	NULL,//进程默认安全性
	NULL,//线程默认安全性
	FALSE,//不继承调用进程的打开句柄的副本
	CREATE_NEW_CONSOLE,//创建新窗口
	NULL,//父进程的环境块
	NULL,//使用父进程的工作目录
	&mi,
	&ui );
    GetSystemTime(&t_start);        
    printf("Begin Time：%d:%d:%d:%d\n",(t_start.wHour+8)%24,t_start.wMinute,t_start.wSecond,t_start.wMilliseconds);
    //使用等待函数来等待所创建进程的死亡    
    WaitForSingleObject(ui.hProcess, INFINITE);    
    GetSystemTime(&t_end);
    printf("End Time: %d:%d:%d:%d\n",(t_end.wHour+8)%24,t_end.wMinute,t_end.wSecond,t_end.wMilliseconds);      
    use_ms=t_end.wMilliseconds-t_start.wMilliseconds;
    use_sec=t_end.wSecond-t_start.wSecond;    
    use_min=t_end.wMinute-t_start.wMinute;    
    use_hour=t_end.wHour-t_start.wHour;        
    if(use_ms<0){
    	use_sec--;
		use_ms+=1000;
	}   
    if(use_sec<0){
		use_min--;
		use_sec+=60;
	}    
    if(use_min<0){
    	use_hour--;
		use_min+=60;
	}  
    if(use_hour<0){
    	use_hour+=24;
	}
    printf("应用程序%s耗时%d小时%02d分%02d秒%d毫秒\n",argv[1],use_hour,use_min,use_sec,use_ms);
	Sleep(300);
	HANDLE hP = OpenProcess(PROCESS_ALL_ACCESS, FALSE,GetCurrentProcessId());
	WalkVM(hP);
	return 0;
}