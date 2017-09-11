package pyramid;

import java.util.Scanner;

public class GFGArrayprice {
	public static void main(String args[])
	{
		Scanner sc1=new Scanner(System.in);
		int t=sc1.nextInt();
		int sum=0;
		
		for(int i=0;i<t;i++)
		{
			int size=sc1.nextInt();
			int arr[]=new int[size];
			
			for(int j=0;j<size;j++)
			{
				arr[i]=sc1.nextInt();
			}
			for(int k=0;k<size;k++)
			{
				sum=sum+arr[i];
			}
			System.out.println(sum);
			float avg=sum/size;
			System.out.println(avg);
		}
	}
}