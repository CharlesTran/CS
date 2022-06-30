int main()
{
	int t,i;
	long long int j=0,widthc,widtha,widthb,widthm,widthn;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		char c[100005],m[100005],n[100005],a[100005],b[100005];
		if(i==0)
		getchar(); 
		scanf("%s",m);
		scanf("%s",n);
		widthm=strlen(m);
		widthn=strlen(n);
		for(j=0;j<widthm;j++)
		a[j]=m[widthm-1-j];
		a[widthm]='\0';
		for(j=0;j<widthn;j++)
		b[j]=n[widthn-1-j];
		b[widthn]='\0';
		widtha=strlen(a);
		widthb=strlen(b);
		if(widtha<widthb)
		{
			for(j=0;j<widtha;j++)
			c[j]=a[j]+b[j]-48;
			for(j=widtha;j<widthb;j++)
			c[j]=b[j];
		}
		else
		{
			for(j=0;j<widthb;j++)
			c[j]=a[j]+b[j]-48;
			for(j=widthb;j<widtha;j++)
			c[j]=a[j];
		}
		widthc=strlen(c);
		c[widthc]='\0';
		for(j=0;j<widthc;j++)
		if(c[j]=='2')
		{
			c[j]='0';
			if(c[j+1]==0)
			{
				c[j+1]=c[j+1]+49;
				c[j+2]='\0';
				widthc=strlen(c);
			}
			else
			c[j+1]=c[j+1]+1;
		}
		else if(c[j]=='3')
		{
			c[j]='1';
			if(c[j+1]==0)
			{
				c[j+1]=c[j+1]+49;
				c[j+2]='\0';
				widthc=strlen(c);
			}
			else
			c[j+1]=c[j+1]+1;
		}
		for(j=0;j<widthc+2-widtha;j++) 
        printf(" "); 
        printf("%s\n+",m); 
    	for(j=1;j<widthc+2-widthb;j++) 
        printf(" "); 
    	printf("%s\n",n); 
    	for(j=1;j<=widthc+2;j++) 
    	printf("-"); 
    	printf("\n  "); 
        for(j=0;j<widthc;j++) 
        printf("%c",c[widthc-1-j]); 
    	printf("\n"); 
      	memset(a,0,sizeof(a));   
        memset(b,0,sizeof(b));   
        memset(c,0,sizeof(c));     
        memset(m,0,sizeof(m));   
        memset(n,0,sizeof(n));
	}
	return 0;
 } 
