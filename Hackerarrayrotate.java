package pyramid;

import java.util.Scanner;

public class Hackerarrayrotate {

	public static void main(String args[])
	{
		Scanner sc1=new Scanner(System.in);
		int arr_size=sc1.nextInt();// size is 5
		sc1.nextLine();
		int rot=sc1.nextInt();// take it as 2
		int arr[]=new int[20];
		int i;
		//input array
		for(i=0;i<arr_size;i++)
		{
			arr[i]=sc1.nextInt();
		}
		
		//shifting bitwise
			for(int j=0;j<rot;j++)
			{
				int temp=arr[0];
				for(i=0;i<arr_size-1;i++)
				{
			
				arr[i]=arr[i+1];
		
				}
				 arr[i]=temp;
			}
			
			//printing the array
		for(i=0;i<arr_size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
