#include<iostream>
#include<stdlib.h>
#include<Windows.h>
#include<Windowsx.h>
#include<string.h>
#define buf_size 4096
using namespace std;
 
//ֱ���ļ�����
void CopyFile(char * fsource, char * ftarget)
{
	WIN32_FIND_DATA lpfindfiledata;
	//����ָ���ļ�·��
	HANDLE hfind = FindFirstFile(fsource,//�ļ���
		&lpfindfiledata);//���ݻ�����
	HANDLE hsource = CreateFile(fsource,//ָ����ļ�����ָ��
		GENERIC_READ | GENERIC_WRITE,//ָ������ķ�������(ͨ������д���Ϸ��ʿ���ʵ���ļ��Ķ�д)
		FILE_SHARE_READ,//���������̹����ļ��ķ�ʽ
		NULL,//ָ��ȫ���Ե�ָ��(NULL��ʾĬ�ϰ�ȫ����)
		OPEN_ALWAYS,//ָ����δ����ļ�(OPEN_ALWAYSΪ����ļ���������ļ������򴴽��µ��ļ�)
		FILE_ATTRIBUTE_NORMAL,//ָ���ļ������Ժͱ�־(FILE_ATTRIBUTE_NORMAL����ΪĬ������)
		NULL);//���ڸ����ļ����
	HANDLE htarget = CreateFile(ftarget,//ָ�򴴽��ļ�����ָ��
		GENERIC_READ | GENERIC_WRITE,//ָ������ķ�������(ͨ������д���Ϸ��ʿ���ʵ���ļ��Ķ�д)
		FILE_SHARE_READ,//���������̹����ļ��ķ�ʽ
		NULL,//ָ��ȫ���Ե�ָ��(NULL��ʾĬ�ϰ�ȫ����)
		CREATE_ALWAYS,//ָ����δ����ļ�(CREATE_ALWAYSΪ����һ���Ѿ����ڵ����ļ���������ڻὫ���е��ļ��������д�ļ�)
		FILE_ATTRIBUTE_NORMAL,//ָ���ļ������Ժͱ�־(FILE_ATTRIBUTE_NORMAL����ΪĬ������)
		NULL);//���ڸ����ļ����
	//Դ�ļ��Ĵ�С
	LONG size = lpfindfiledata.nFileSizeLow - lpfindfiledata.nFileSizeHigh;
 
	DWORD wordbit;
 
	//�¿�����������������
	int *BUFFER = new int[size];
 
	//Դ�ļ�������
	ReadFile(hsource,//ָ��Ҫ�����ļ����
		BUFFER,//ָ���Ŵ��ļ��������ݵĻ������ĵ�ַָ��
		size,//Ҫ���ļ������ֽ���
		&wordbit,//���ʵ�ʴ��ļ��ж����ֽ����ı�����ַ
		NULL);//ͬ����ʽ������ΪNULL
	//Ŀ���ļ�д����
	WriteFile(htarget,//ָ��Ҫд���ļ�����ľ��
		BUFFER,//ָ��Ҫд���ļ������ݻ�����ָ��
		size,//Ҫд���ļ����ֽ���
		&wordbit,//ʵ��д����ֽ���
		NULL);//ͬ����ʽ������ΪNULL
	//�޸��ļ�ʱ������
    SetFileTime(htarget,&lpfindfiledata.ftCreationTime,&lpfindfiledata.ftLastAccessTime,&lpfindfiledata.ftLastWriteTime);
    //�޸��ļ�Ȩ��
    SetFileAttributes(ftarget,GetFileAttributes(fsource));
	CloseHandle(hfind);
	CloseHandle(hsource);
	CloseHandle(htarget);
}
 
//��ԴĿ¼��Ϣ���Ƶ�Ŀ��Ŀ¼��
void mycp(char * fsource, char * ftarget)
{
	WIN32_FIND_DATA lpfindfiledata;
	char source[buf_size];
	char target[buf_size];
	lstrcpy(source, fsource);
	lstrcpy(target, ftarget);
	lstrcat(source, "\\*.*");
	lstrcat(target, "\\");
	HANDLE hfind = FindFirstFile(source,//�ļ���
		&lpfindfiledata);//���ݻ�����
	if (hfind != INVALID_HANDLE_VALUE)
	{
		while (FindNextFile(hfind, &lpfindfiledata) != 0)//ѭ������FindFirstFile()�������������һ���ļ�
		{
			//������һ���ļ��ɹ�
			if ((lpfindfiledata.dwFileAttributes) == 16)//�ж��Ƿ���Ŀ¼(��ΪĿ¼FILE_ATTRIBUTE_DIRECTORY��16)
			{
				if ((strcmp(lpfindfiledata.cFileName, ".") != 0) && (strcmp(lpfindfiledata.cFileName, "..") != 0))
				{
					memset(source, '0', sizeof(source));
					lstrcpy(source, fsource);
					lstrcat(source, "\\");
					lstrcat(source, lpfindfiledata.cFileName);//׷���ļ�
					lstrcat(target, lpfindfiledata.cFileName);
					CreateDirectory(target,NULL);//ΪĿ���ļ�����Ŀ¼
					mycp(source, target);//������Ŀ¼����
					lstrcpy(source, fsource);
					lstrcat(source, "\\");
					lstrcpy(target, ftarget);
					lstrcat(target, "\\");
				}
			}
			else//��Ŀ¼
			{
				memset(source, '0', sizeof(source));
				lstrcpy(source, fsource);
				lstrcat(source, "\\");
				lstrcat(source, lpfindfiledata.cFileName);
				lstrcat(target, lpfindfiledata.cFileName);
				CopyFile(source, target);//ֱ�ӵ����ļ����ƺ���
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
		cout<<"����ָ���ļ�·�����ļ�ʧ��!"<<endl;
		exit(0); 
		return;
	} 
}
 
int main(int argc, char *argv[])
{
	WIN32_FIND_DATA lpfindfiledata;//���ڴ���ļ���Ϣ
	if (argc != 3)
	cout<<"��������"<<endl;
	else
	{
		if (FindFirstFile(argv[1], &lpfindfiledata) == INVALID_HANDLE_VALUE)
		{
            cout<<"����Դ�ļ�·��ʧ�ܣ�"<<endl;
            return 0;
        }    
		if (FindFirstFile(argv[2], &lpfindfiledata) == INVALID_HANDLE_VALUE)
		CreateDirectory(argv[2],NULL);//ΪĿ���ļ�����Ŀ¼
        else
        {
            cout<<"��ǰ�ļ����Ѵ��ڣ�"<<endl;
            return 0;
        }
		mycp(argv[1], argv[2]);
	}
    cout<<"������ɣ�"<<endl;
	return 0;
}