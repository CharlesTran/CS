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
//��ʾ������ǣ��ñ�Ǳ�ʾ����Ӧ�ó�����ڴ���з��ʵ�����
inline bool TestSet(DWORD dwTarget, DWORD dwMask)
{
    return ((dwTarget & dwMask) == dwMask);
}
#define SHOWMASK(dwTarget,type) if(TestSet(dwTarget,PAGE_##type)) {cout<<","<<#type;}
void ShowProtection(DWORD dwTarget)
{
    //����ҳ�汣����ʽ
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

//�������������ڴ棬����ʾ���ڴ������ԵĹ�������ķ���
void WalkVM(HANDLE hProcess)
{
    SYSTEM_INFO si;//ϵͳ��Ϣ�ṹ
    ZeroMemory(&si, sizeof(si));
    GetSystemInfo(&si);//���ϵͳ��Ϣ

    MEMORY_BASIC_INFORMATION mbi;//���������ڴ�ռ�Ļ�����Ϣ�ṹ
    ZeroMemory(&mbi, sizeof(mbi));//���仺���������ڱ�����Ϣ

    //ѭ������Ӧ�ó����ַ�ռ�
    LPCVOID pBlock = (LPVOID)si.lpMinimumApplicationAddress;
    while (pBlock < si.lpMaximumApplicationAddress)
    {
        //�����һ�������ڴ�����Ϣ
        if (VirtualQueryEx(
            hProcess,//��صĽ���
            pBlock,//��ʼλ��
            &mbi,//������
            sizeof(mbi)) == sizeof(mbi))//���ȵ�ȷ��
        {
            //�����Ľ�β���䳤��
            LPCVOID pEnd = (PBYTE)pBlock + mbi.RegionSize;
            TCHAR szSize[MAX_PATH];
            //��ʾ���ַ�ͳ���
            cout.fill('0');
            cout<<dec<<"<"<<mbi.RegionSize/1024<<"KB"<<"> ";

            //��ʾ���״̬
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

            //��ʾ����
            if (mbi.Protect == 0 && mbi.State != MEM_FREE)
            {
                mbi.Protect = PAGE_READONLY;
            }
            ShowProtection(mbi.Protect);

            //��ʾ����
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

            //�����ִ�е�ӳ��
            TCHAR szFilename[MAX_PATH];
            if (GetModuleFileName(
                (HMODULE)pBlock,
                szFilename,
                MAX_PATH) > 0)
            {
                //��ȥ·������ʾ
                //PathStripPath(szFilename);
                cout << ",Module:" << szFilename;
            }
            cout << endl;
            //�ƶ���ָ���Ի����һ����
            pBlock = pEnd;
        }
    }
}

int main(int argc, char **argv){    
    //��ȡ�ڴ���Ϣ
    MEMORYSTATUSEX statex;
    statex.dwLength = sizeof(statex);
    GlobalMemoryStatusEx(&statex);
    cout << "----------MemoryInfo----------" << endl;
    cout << "Physical memory usage: " << statex.dwMemoryLoad << "%" << endl;
    cout << "Physical memory capacity: " << statex.ullTotalPhys / 1024 / 1024 / 1024 << "GB" << endl;
    cout << "Available physical memory: " << statex.ullAvailPhys / 1024 / 1024 / 1024 << "GB" << endl;
    cout << "------------------------------" << endl << endl;

    //���ϵͳ��Ϣ
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

	//��ȡϵͳ�Ĵ洢��ʹ�����
	PERFORMANCE_INFORMATION pi;
	pi.cb = sizeof(pi);
	GetPerformanceInfo(&pi, sizeof(pi));
	cout << "----------ϵͳ�洢��ʹ�����----------" << endl;
	cout << "�ṹ��Ĵ�СΪ: " << pi.cb << "B" << endl;
	cout << "ϵͳ��ǰ�ύ��ҳ������: " << pi.CommitTotal << endl;
	cout << "ϵͳ��ǰ���ύ�����ҳ������: " << pi.CommitLimit << endl;
	cout << "ϵͳ��ʷ�ύҳ���ֵ: " << pi.CommitPeak << endl;
	cout << "��ҳ������������ڴ�: " << pi.PhysicalTotal << endl;
	cout << "��ǰ���õ������ڴ�Ϊ: " << pi.PhysicalAvailable << endl;
	cout << "ϵͳCache������Ϊ: " << pi.SystemCache << endl;
	cout << "�ڴ�����(��ҳ)Ϊ: " << pi.KernelTotal << endl;
	cout << "��ҳ�صĴ�СΪ: " << pi.KernelPaged << endl;
	cout << "�Ƿ�ҳ�صĴ�СΪ: " << pi.KernelNonpaged << endl;
	cout << "ҳ�Ĵ�СΪ: " << pi.PageSize << endl;
	cout << "�򿪵ľ������Ϊ: " << pi.HandleCount << endl;
	cout << "���̸���Ϊ: " << pi.ProcessCount << endl;
	cout << "�̸߳���Ϊ: " << pi.ThreadCount << endl;
	cout << "------------------------------" << endl << endl;

/*	//���ÿ�����̵���Ϣ
	printf("------------------�������̵���Ϣ----------------------\n");
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
			cout << " ����ID:";
			cout << pe.th32ProcessID << endl;
			cout << " ��������:";
			cout << pe.szExeFile << endl;
			cout << " �����ڴ�Ĵ�СΪ:" << (float)pmc.WorkingSetSize / 1024 << "KB" << endl;
		}
		bMore = ::Process32Next(hProcessSnap, &pe);
	}
	printf("----------------------------------------------------\n");*/

	printf("-------���������ַ�ռ䲼�ֺ͹�������Ϣ��ѯ---------\n");
	STARTUPINFO mi;       
    memset(&mi,0,sizeof(STARTUPINFO));    
    mi.cb=sizeof(STARTUPINFO);
	PROCESS_INFORMATION ui;
	CreateProcess(
	NULL,//�½��̵Ŀ�ִ���ļ�
	argv[1],//���ݸ��½��̵��������ַ���
	NULL,//����Ĭ�ϰ�ȫ��
	NULL,//�߳�Ĭ�ϰ�ȫ��
	FALSE,//���̳е��ý��̵Ĵ򿪾���ĸ���
	CREATE_NEW_CONSOLE,//�����´���
	NULL,//�����̵Ļ�����
	NULL,//ʹ�ø����̵Ĺ���Ŀ¼
	&mi,
	&ui );
    GetSystemTime(&t_start);        
    printf("Begin Time��%d:%d:%d:%d\n",(t_start.wHour+8)%24,t_start.wMinute,t_start.wSecond,t_start.wMilliseconds);
    //ʹ�õȴ��������ȴ����������̵�����    
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
    printf("Ӧ�ó���%s��ʱ%dСʱ%02d��%02d��%d����\n",argv[1],use_hour,use_min,use_sec,use_ms);
	Sleep(300);
	HANDLE hP = OpenProcess(PROCESS_ALL_ACCESS, FALSE,GetCurrentProcessId());
	WalkVM(hP);
	return 0;
}