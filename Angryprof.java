package pyramid;

import java.util.Scanner;

public class Angryprof {
	public static void main(String args[])
	{
		Scanner sc1=new Scanner(System.in);
		int t=sc1.nextInt();
		int flag = 0;
		for(int i=0;i<t;i++)
		{
			int n=sc1.nextInt();
			int k=sc1.nextInt();
			if(k>n)
				System.exit(0);
			int arr[]=new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=sc1.nextInt();
			}
			
			for(int j=0;j<n;j++)
			{
				if(arr[j]<=0)
				 flag=flag+1;
			}
			if(flag>k)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
