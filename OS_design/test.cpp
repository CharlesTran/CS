#include <Windows.h>
#include <tchar.h>
#include <stdio.h>
#include <Shlwapi.h>
#pragma comment(lib, "Shlwapi.lib");
 
int _tmain(int argc, _TCHAR* argv[])
{
 
	SYSTEM_INFO si;
	ZeroMemory(&si, sizeof(si));
	GetSystemInfo(&si);
 
	TCHAR szPageSize[MAX_PATH];
	StrFormatByteSize(si.dwPageSize, szPageSize, MAX_PATH);
 
	DWORD memorySize = (DWORD)si.lpMaximumApplicationAddress - (DWORD)si.lpMinimumApplicationAddress;
	TCHAR szMemorySize[MAX_PATH];
	StrFormatByteSize(memorySize, szMemorySize, MAX_PATH);
 
	printf("page memory size: %s\n", szPageSize);
	printf("lpMaximumApplicationAddress: 0x%08x\n", si.lpMaximumApplicationAddress);
	printf("lpMinimumApplicationAddress: 0x%08x\n", si.lpMinimumApplicationAddress);
	printf("memory size: %s\n", szMemorySize);
	return 0;
}