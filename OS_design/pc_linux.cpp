#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <unistd.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <sys/sem.h>
#include <sys/wait.h>
#include<iostream>
#include<cstring>
using namespace std; 
#define BUF_LENGTH (sizeof(struct my_buffer))
#define LETTER_NUM 4
#define SHM_MODE 0600
#define SEM_ALL_KEY 1234
#define SEM_EMPTY  0
#define SEM_FULL   1            
#define MUTEX      2
//缓冲区结构（循环队列）
struct my_buffer{     
   char letter[LETTER_NUM];     //存放字符数组    
   int in;                      //写指针    
   int out;                     //读指针
   int is_empty;
};
struct my_buffer * shmptr;              //指向所创建的结构体的指针
int shm_id, sem_id;                     //信号量标识符
//得到3以内的一个随机数
int get_random(){    
    int t;    
    srand((unsigned)(getpid() + time(NULL)));    
    t = rand() % 3;    
    return t;
}
 
//得到A~Z的一个随机字母
char get_letter()
{    
    char a;    
    srand((unsigned)(getpid() + time(NULL)));    
    a = (char)((char)(rand() % 26) + 'A');    
    return a;
}
 
//P操作
void p(int sem_id, int sem_num)
{    
    struct sembuf xx;    
    xx.sem_num = sem_num;                    //操作信号在信号集中的编号，第一个信号的编号是0         
    xx.sem_op = -1;                          //获取资源的使用权    xx.sem_flg = 0;    
    semop(sem_id, &xx, 1);
	}
 
//V操作
void v(int sem_id, int sem_num)
{    
    struct sembuf xx;    
    xx.sem_num = sem_num;                       //操作信号在信号集中的编号，第一个信号的编号是0    
    xx.sem_op = 1;                              //获取资源的使用权    
    xx.sem_flg = 0;    
    semop(sem_id, &xx, 1);
}
void Creat_Share_MM(){    //创建共享文件区    
    shm_id = shmget(IPC_PRIVATE, BUF_LENGTH, SHM_MODE);    
    if ( shm_id < 0)
    {        
    	printf("Error on shmget.\n");              
    	exit(1);    
    	}    
    	shmptr = (my_buffer *)shmat(shm_id, 0, 0);    
    	shmptr->in = 0;
    	shmptr->out = 0;
    	shmptr->is_empty = 1;
    	memset(shmptr->letter,'-',4*sizeof(char));    
    	printf("Creat share memory.\n");
}
void Creat_Semaphore(){
    sem_id = semget(SEM_ALL_KEY,3,IPC_CREAT | 0660); 
    if (sem_id >= 0)    
    printf("Semaphore created.\n");
    semctl(sem_id, SEM_EMPTY, SETVAL, LETTER_NUM);    
    semctl(sem_id, SEM_FULL, SETVAL, 0);    
    semctl(sem_id,MUTEX,SETVAL,1); 
    }
//主函数
int main(int argc, char * argv[])
{   
    Creat_Share_MM();
    Creat_Semaphore();
    int num_p = 0, num_c = 0;
    pid_t pid_p, pid_c;
    int i, j;        
    char ch;                          //随机生成的字母
    while ((num_p++) < 3)    
    {       
        if ((pid_p = fork()) < 0)       
         {            
             printf("Error on fork.\n");            
             exit(1);        
         }        
        //如果是子进程，开始创建生产者        
        if (pid_p == 0)        
        {            //将共享内存区对象映射到调用进程的地址空间            
            shmptr = (my_buffer *)shmat(shm_id, 0, 0);            
            for (i = 0; i < 4; i++)            
            {                                
                p(sem_id, SEM_EMPTY);                                       //对资源进行p操作                
                p(sem_id,MUTEX);
                shmptr->letter[shmptr->out] = ch = get_letter();           //随机生成一个字母放入缓冲区
                shmptr->out = (shmptr->out + 1) % LETTER_NUM;             //尾指针后移                
                shmptr->is_empty = 0;                                     //空标志置0                
                //输出缓冲区字符                
                printf("--------------------------------\n");                
                printf("Producer %d Produce '%c'.  %d\n", num_p, ch, i );                
                printf("缓存区字符：%c %c %c %c\n",shmptr->letter[0],shmptr->letter[1],shmptr->letter[2],shmptr->letter[3]);                
                fflush(stdout);                
                v(sem_id,MUTEX);                
                v(sem_id, SEM_FULL);                                        //对资源进行v操作                           
                sleep(get_random());                                        //等待随机时间            
                }            
                shmdt(shmptr);//断开共享内存连接            
                exit(0);        
            }
    }
    while (num_c++ < 4)
    {
        if ((pid_c = fork()) < 0)
        {
            printf("Error on fork.\n");
            exit(1);
        }        
        //如果是子进程，开始创建消费者       
         if (pid_c == 0)        
         {
             shmptr = (my_buffer *)shmat(shm_id, 0, 0);            
             for (i = 0; i < 3; i++)            
             {
                 p(sem_id, SEM_FULL);//对资源进行p操作
                 p(sem_id,MUTEX);
                 ch = shmptr->letter[shmptr->in];                     //取出缓冲区第一个字符
                 shmptr->letter[shmptr->in]='-';
                 shmptr->in = (shmptr->in + 1) % LETTER_NUM;        //头指针后移
                 shmptr->is_empty = (shmptr->in == shmptr->out);                //输出缓冲区字符
                  printf("--------------------------------\n");                
                  printf("Consumer %d gets '%c'.  %d\n", num_c, ch, i);                
                  printf("缓存区字符：%c %c %c %c\n",shmptr->letter[0],shmptr->letter[1],shmptr->letter[2],shmptr->letter[3]);
                  fflush(stdout);                    //清除输出缓冲区，并输出缓存区内容
                  v(sem_id,MUTEX);
                  v(sem_id, SEM_EMPTY);              //对资源进行v操作
                  sleep(get_random());                  //等待随机时间
              }            
              shmdt(shmptr);                                //断开共享内存连接            
              exit(0);       
          }
    }
    
    //主控程序最后退出   
    while(wait(0) != -1);        //等待所有子进程结束    
    shmdt(shmptr);    
    shmctl(shm_id, IPC_RMID, 0);    
    semctl(sem_id, IPC_RMID, 0);           
    fflush(stdout);          //清除输出缓冲区，并输出缓存区内容    
    printf("--------------end---------------\n");    
    exit(0);
}