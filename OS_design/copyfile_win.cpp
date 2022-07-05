#include<iostream>
#include<stdlib.h>
#include<Windows.h>
#include<Windowsx.h>
#include<string.h>
#define buf_size 4096
using namespace std;
 
//直接文件复制
void CopyFile(char * fsource, char * ftarget)
{
	WIN32_FIND_DATA lpfindfiledata;
	//查找指定文件路径
	HANDLE hfind = FindFirstFile(fsource,//文件名
		&lpfindfiledata);//数据缓冲区
	HANDLE hsource = CreateFile(fsource,//指向打开文件名的指针
		GENERIC_READ | GENERIC_WRITE,//指定对象的访问类型(通过读和写联合访问可以实现文件的读写)
		FILE_SHARE_READ,//与其他进程共享文件的方式
		NULL,//指向安全属性的指针(NULL表示默认安全对象)
		OPEN_ALWAYS,//指定如何创建文件(OPEN_ALWAYS为如果文件存在则打开文件，否则创建新的文件)
		FILE_ATTRIBUTE_NORMAL,//指定文件的属性和标志(FILE_ATTRIBUTE_NORMAL设置为默认属性)
		NULL);//用于复制文件句柄
	HANDLE htarget = CreateFile(ftarget,//指向创建文件名的指针
		GENERIC_READ | GENERIC_WRITE,//指定对象的访问类型(通过读和写联合访问可以实现文件的读写)
		FILE_SHARE_READ,//与其他进程共享文件的方式
		NULL,//指向安全属性的指针(NULL表示默认安全对象)
		CREATE_ALWAYS,//指定如何创建文件(CREATE_ALWAYS为创建一个已经存在的新文件，如果存在会将现有的文件清空且重写文件)
		FILE_ATTRIBUTE_NORMAL,//指定文件的属性和标志(FILE_ATTRIBUTE_NORMAL设置为默认属性)
		NULL);//用于复制文件句柄
	//源文件的大小
	LONG size = lpfindfiledata.nFileSizeLow - lpfindfiledata.nFileSizeHigh;
 
	DWORD wordbit;
 
	//新开缓冲区，保存数据
	int *BUFFER = new int[size];
 
	//源文件读数据
	ReadFile(hsource,//指定要读的文件句柄
		BUFFER,//指向存放从文件读的数据的缓冲区的地址指针
		size,//要从文件读的字节数
		&wordbit,//存放实际从文件中读的字节数的变量地址
		NULL);//同步方式打开设置为NULL
	//目标文件写数据
	WriteFile(htarget,//指定要写的文件对象的句柄
		BUFFER,//指向要写入文件的数据缓冲区指针
		size,//要写入文件的字节数
		&wordbit,//实际写入的字节数
		NULL);//同步方式打开设置为NULL
	//修改文件时间属性
    SetFileTime(htarget,&lpfindfiledata.ftCreationTime,&lpfindfiledata.ftLastAccessTime,&lpfindfiledata.ftLastWriteTime);
    //修改文件权限
    SetFileAttributes(ftarget,GetFileAttributes(fsource));
	CloseHandle(hfind);
	CloseHandle(hsource);
	CloseHandle(htarget);
}
 
//将源目录信息复制到目标目录下
void mycp(char * fsource, char * ftarget)
{
	WIN32_FIND_DATA lpfindfiledata;
	char source[buf_size];
	char target[buf_size];
	lstrcpy(source, fsource);
	lstrcpy(target, ftarget);
	lstrcat(source, "\\*.*");
	lstrcat(target, "\\");
	HANDLE hfind = FindFirstFile(source,//文件名
		&lpfindfiledata);//数据缓冲区
	if (hfind != INVALID_HANDLE_VALUE)
	{
		while (FindNextFile(hfind, &lpfindfiledata) != 0)//循环查找FindFirstFile()函数搜索后的下一个文件
		{
			//查找下一个文件成功
			if ((lpfindfiledata.dwFileAttributes) == 16)//判断是否是目录(若为目录FILE_ATTRIBUTE_DIRECTORY是16)
			{
				if ((strcmp(lpfindfiledata.cFileName, ".") != 0) && (strcmp(lpfindfiledata.cFileName, "..") != 0))
				{
					memset(source, '0', sizeof(source));
					lstrcpy(source, fsource);
					lstrcat(source, "\\");
					lstrcat(source, lpfindfiledata.cFileName);//追加文件
					lstrcat(target, lpfindfiledata.cFileName);
					CreateDirectory(target,NULL);//为目标文件创建目录
					mycp(source, target);//进入子目录复制
					lstrcpy(source, fsource);
					lstrcat(source, "\\");
					lstrcpy(target, ftarget);
					lstrcat(target, "\\");
				}
			}
			else//无目录
			{
				memset(source, '0', sizeof(source));
				lstrcpy(source, fsource);
				lstrcat(source, "\\");
				lstrcat(source, lpfindfiledata.cFileName);
				lstrcat(target, lpfindfiledata.cFileName);
				CopyFile(source, target);//直接调用文件复制函数
				lstrcpy(source, fsource);
				lstrcat(source, "\\");
				lstrcpy(target, ftarget);
				lstrcat(target, "\\");
			}
			HANDLE hDirFile = CreateFile(
					target,
					GENERIC_WRITE | GENERIC_READ,
					FILE_SHARE_READ,
					NULL,
					OPEN_EXISTING,
					FILE_FLAG_BACKUP_SEMANTICS,
					NULL);
			SetFileTime(hDirFile,&lpfindfiledata.ftCreationTime,&lpfindfiledata.ftLastAccessTime,&lpfindfiledata.ftLastWriteTime);
			SetFileAttributes(target, lpfindfiledata.dwFileAttributes);
		}
	}
	else
	{
		cout<<"查找指定文件路径的文件失败!"<<endl;
		exit(0); 
		return;
	} 
}
 
int main(int argc, char *argv[])
{
	WIN32_FIND_DATA lpfindfiledata;//用于存放文件信息
	if (argc != 3)
	cout<<"参数错误！"<<endl;
	else
	{
		if (FindFirstFile(argv[1], &lpfindfiledata) == INVALID_HANDLE_VALUE)
		{
            cout<<"查找源文件路径失败！"<<endl;
            return 0;
        }    
		if (FindFirstFile(argv[2], &lpfindfiledata) == INVALID_HANDLE_VALUE)
		CreateDirectory(argv[2],NULL);//为目标文件创建目录
        else
        {
            cout<<"当前文件名已存在！"<<endl;
            return 0;
        }
		mycp(argv[1], argv[2]);
	}
    cout<<"复制完成！"<<endl;
	return 0;
}