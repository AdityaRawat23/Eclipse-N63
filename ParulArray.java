package pyramid;

import java.util.Scanner;

public class ParulArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);

		int arr[]=new int[100];
		int k=0;
		int arr2[]=new int[100];
		System.out.println("enter size");
		int h=sc1.nextInt();
		for(int i=0;i<h;i++)
		{
			arr[i]=sc1.nextInt();
		}
		for(int j=0;j<h;j++)
		{
			if(j==0)
			{
				k=arr[j]*arr[j+1];
				arr2[k]=arr[j];
			}
			else if(j==(h-1))
			{
				k=arr[j]*arr[j-1];
				arr2[k]=arr[j];
			}
			else
			{
				k=arr[j-1]*arr[j+1];
				arr2[k]=arr[j];
			}
		}
		for(int y:arr2)
		{
			System.out.print(y+" ");
		}
	}
}