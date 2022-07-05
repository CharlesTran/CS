#include<iostream>
#include<vector>
#include<queue>
#include<algorithm>
using namespace std;
struct process{
	int id;
	int arr;
	int run;
	int prev;
};
struct exec{
	int id;
	int pid;
	int start;
	int end=0;
	int prev;
};

bool cmp1(const process & a, const process & b){
	if(a.arr!=b.arr)
	return a.arr<b.arr;
	else if(a.prev!=b.prev)
	return a.prev<b.prev;
	else
	return a.id<b.id;
}

bool cmp2(const process & a, const process & b){
	if(a.prev!=b.prev)
	return a.prev<b.prev;
	else if(a.run!=b.run)
	return a.run<b.run;
	else if(a.arr!=b.arr)
	return a.arr<b.arr;
	else
	return a.id<b.id;
}
int tq;
vector<process> proc;

void fcfs(vector<process> p)
{
	sort(p.begin(),p.end(),cmp1);
	int id=1;
	int time=0;
	exec a;
	while(id!=p.size()+1)
	{
		a.id=id;
		a.pid=p[id-1].id;
		a.start=time;
		a.end+=p[id-1].run;
		time=a.end;
		a.prev=p[id-1].prev;
		cout<<a.id<<'/'<<a.pid<<'/'<<a.start<<'/'<<a.end<<'/'<<a.prev<<endl;
		id++;
	}
	return;
}

void sjf(vector<process> p)
{
	int id=1,time=0,end=0;
	exec a;
	sort(p.begin(),p.end(),cmp1);
	while(id!=p.size()+1)
	{
		end=0;
		for(int i=id;i<p.size();i++)
		{
			if(p[i].arr<=time)
			end++;
			else
			break;
		}
		sort(p.begin()+id-1,p.begin()+id-1+end,cmp2);
		a.id=id;
		a.pid=p[id-1].id;
		a.start=time;
		a.end+=p[id-1].run;
		time=a.end;
		a.prev=p[id-1].prev;
		cout<<a.id<<'/'<<a.pid<<'/'<<a.start<<'/'<<a.end<<'/'<<a.prev<<endl;
		id++;
	}
	return;
}

void srtf(vector<process> p){
	
}

int main()
{
	process p;
	char c;
	int sol=0;
	cin>>sol;
	while(!proc.empty())
	proc.pop_back();
	while(cin>>p.id>>c>>p.arr>>c>>p.run>>c>>p.prev>>c>>tq){
		proc.push_back(p);
	}
	if(sol==1)
	fcfs(proc);
    else if(sol==2)
	sjf(proc);
//	else if(sol==3)
//	srtf(proc);
//	else if(sol==4)
//	rr(proc);
//	else
//	dp(proc);

	return 0;
}