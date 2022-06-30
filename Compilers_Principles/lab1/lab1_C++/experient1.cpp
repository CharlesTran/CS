#include<iostream>
#include<vector>
#include<Windows.h>

using namespace std;

int main()
{
    int N1,M1,N2,M2,a;
    cin>>N1;
    cin>>M1;
    cin>>N2;
    cin>>M2;
    while(M1!=N2)
    {
        cout<<"Invalid Input! Please input again: ";
        cin>>N1;
        cin>>M1;
        cin>>N2;
        cin>>M2;
    }
    vector <vector<int>> matrix1,matrix2,ans;
    vector<int>temp;
    for(int i=0;i<N1;i++)
    {
        for(int j=0;j<M1;j++)
        {
            a=rand()%100;
            temp.push_back(a);
        }
        matrix1.push_back(temp);
        temp.clear();
    }
    DWORD Start = GetTickCount();
    for(int i=0;i<N2;i++)
    {
        for(int j=0;j<M2;j++)
        {
            a=rand()%100;
            temp.push_back(a);
        }
        matrix2.push_back(temp);
        temp.clear();
    }
    for(int i=0;i<N1;i++)
    {
        for(int j=0;j<M2;j++)
        {
            int sum=0;
            for(int k=0;k<M1;k++)
            sum+=matrix1[i][k]*matrix2[k][j];
            temp.push_back(sum);
        }
        ans.push_back(temp);
    }
    DWORD End = GetTickCount();
    for(int i=0;i<N1;i++)
    {
        for(int j=0;j<M2;j++)
        cout<<ans[i][j]<<" ";
        cout<<endl;
    }
    
    cout << "The run time is: " <<End - Start << "ms" << endl;
}