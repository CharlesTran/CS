#include <iostream>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <string.h>
#include <dirent.h>
#include <utime.h>
using namespace std;
#define buf_size 4096
 
//文件复制函数
void CopyFile(char *fsource, char *ftarget)
{
    //打开原文件，返回文件描述符
    int fd1 = open(fsource, O_RDONLY);
    if (fd1 == -1)
    {
        cout<<"打开文件失败!"<<endl;
    }
    //fd2用于存放目标文件的文件描述符
    int fd2;
    struct stat statbuf;
    struct utimbuf timeby;
    char BUFFER[buf_size];
    int wordbit;
    //将原文件的信息放入statbuf中
    stat(fsource,&statbuf);
    //创建新文件，返回文件描述符
    fd2 = creat(ftarget,statbuf.st_mode);
    if (fd2 == -1)
    {
        cout<<"创建文件失败!"<<endl;
    }
    //读取源文件字节数
    /*
    read(write)(文件的描述符，读出(写入)文件数据的字节数组，要传送的字节个数);
    返回值：读出(写入)的字节数
    */
    while((wordbit = read(fd1,BUFFER,buf_size)) > 0)
    {
        if (write(fd2,BUFFER,wordbit) != wordbit)//写入目标文件
            cout<<"写入失败!"<<endl;
    }
    timeby.actime = statbuf.st_atime;//修改时间属性
    timeby.modtime = statbuf.st_mtime;
    utime(ftarget,&timeby);
    close(fd1);
    close(fd2);
}
 
//将源目录文件复制到目标目录下
void mycp(char *fsource,char *ftarget)
{
    char source[buf_size];
    char target[buf_size];
    struct stat statbuf;
    struct utimbuf timeby;
    struct dirent *entry;
    DIR *dir;
    strcpy(source,fsource);
    strcpy(target,ftarget);
    //打开目录，返回指向DIR结构的指针
    dir = opendir(source);
    while((entry = readdir(dir)) != NULL)//读目录
    {
        if (strcmp(entry->d_name,".") == 0 || strcmp(entry->d_name,"..") == 0)
        {
            continue;
        }
        if (entry->d_type == 4)//读到的是目录
        {
            strcat(source,"/");
            strcat(source,entry->d_name);
            strcat(target,"/");
            strcat(target,entry->d_name);
            //统计source文件属性信息并放入statbuf中
            stat(source,&statbuf);
            //创建目标目录
            mkdir(target,statbuf.st_mode);
            //修改文件存取和修改时间
            timeby.actime = statbuf.st_atime;
            timeby.modtime = statbuf.st_mtime;
            //修改文件的访问时间和修改时间
			utime(target,&timeby);
            mycp(source,target);
            strcpy(source,fsource);
            strcpy(target,ftarget);
        }
        else//没有子目录，直接复制
        {
            strcat(source,"/");
            strcat(source,entry->d_name);
            strcat(target,"/");
            strcat(target,entry->d_name);
            CopyFile(source,target);//调用文件复制函数
            strcpy(source,fsource);
            strcpy(target,ftarget);
        }
    }
}
 
int main(int argc,char *argv[])
{
	struct stat statbuf;     //stat结构
	struct utimbuf timeby;	//文件时间结构
	
	DIR *dir;   //DIR结构的指针，指向目录的第一个文件
	if (argc != 3)
	{
        cout<<"参数错误!"<<endl;
	}
	else
	{
        /*打开目录，关闭目录*/
        if ((dir = opendir(argv[1])) == NULL)
        {
                cout<<"源文件打开错误!"<<endl;
        }
        if ((dir = opendir(argv[2])) == NULL)
        {
            stat(argv[1],&statbuf);//将源文件中的文件属性信息填入statbuf中
            mkdir(argv[2],statbuf.st_mode);//创建目录
			
            timeby.actime = statbuf.st_atime;//文件数据的最后存取时间
            timeby.modtime = statbuf.st_mtime;//文件数据的最后修改时间
            utime(argv[2],&timeby);//用utime()函数修改目标文件的访问时间和修改时间
        }
        mycp(argv[1],argv[2]);//开始复制
	}
	cout<<"复制完成!"<<endl;
	return 0;
}