import java.util.Scanner;
import java.util.Random;
public class experient1 {

	public static void main(String[] args) {
		int N1,M1,N2,M2;
		Scanner sc = new Scanner(System.in);
		N1 = sc.nextInt();
		M1 = sc.nextInt();
		N2 = sc.nextInt();
		M2 = sc.nextInt();
		while(M1!=N2)
		{
			System.out.println("Invalid Input!");
			N1 = sc.nextInt();
			M1 = sc.nextInt();
			N2 = sc.nextInt();
			M2 = sc.nextInt();
		}
		Random rand = new Random();
		long startTime=System.currentTimeMillis();
		int a[][]=new int[N1][M1];
		int b[][]=new int[N2][M2];
		int[][] c=new int[a.length][b[0].length];
		for(int i=0;i<N1;i++)
		for(int j=0;j<M1;j++)
		a[i][j]=rand.nextInt(100);

		for(int i=0;i<N2;i++)
		for(int j=0;j<M2;j++)
		b[i][j]=rand.nextInt(100);
    	for(int i = 0;i<a.length;i++)
    	{
    		for(int j = 0;j<b[0].length;j++)
    		{
    			for(int k = 0;k<a[0].length;k++)
    			{
    			   c[i][j] += a[i][k]*b[k][j];
    			}
    		}
    	}
    	// System.out.println("Matrix a: ");
    	// for(int i = 0;i<a.length;i++)
    	// {
    	// 	for(int j = 0;j<a[0].length;j++)
    	// 	{
    	// 		System.out.printf("%d",a[i][j]);
    	// 		if(j == M1-1)
    	// 		System.out.println();
    	// 		else
    	// 		System.out.print(",");
    	// 	}
    	// }
    	// System.out.println("Matrix b: ");
    	// for(int i = 0;i<b.length;i++)
    	// {
    	// 	for(int j = 0;j<b[0].length;j++)
    	// 	{
    	// 		System.out.printf("%d",b[i][j]);
    	// 		if(j == M2-1)
    	// 		System.out.println();
    	// 		else
		// 		System.out.print(",");
    	//    	}
       	// }
		long endTime=System.currentTimeMillis();
       	System.out.println("Matrix c: ");
       	for(int i = 0;i<c.length;i++)
       	{
    	   	for(int j = 0;j<c[0].length;j++)
    	   	{
    		   	System.out.printf("%d",c[i][j]);
    		   	if(j == M2-1)
    		   	System.out.println();
    		   	else
    			System.out.print(",");
    	   	}
       	}
		
		System.out.println("Running Time:  "+(endTime-startTime)+"ms");
	}
}