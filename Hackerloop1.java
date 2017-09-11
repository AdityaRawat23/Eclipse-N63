package pyramid;

import java.util.Scanner;

public class Hackerloop1 {

	public static void main(String args[])
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the number of sequences");
		int seq=sc1.nextInt();
		
		for(int i=0;i<seq;i++)
		{
			System.out.println("enter the value of a");
			int a=sc1.nextInt();
			System.out.println("enter the value of b");
			int b=sc1.nextInt();
			System.out.println("enter the value of n");
			int n=sc1.nextInt();
			int k=a;
			for(int j=0;j<n;j++)
			{
				k=(int) (k+Math.pow(2,j)*b);
				System.out.print(k);
				System.out.print(" ");
			}
		System.out.println("");	
		}
	}
}
