package pyramid;

import java.util.Scanner;

public class RemoveRepeat {
	public static void main(String args[])
	{
		System.out.println("enter a string");
		
		Scanner sc1=new Scanner(System.in);
		
		String s1=sc1.nextLine();
		s1.toLowerCase();
		String arr[]=s1.split(" ");
	//	char[] ch=s1.toCharArray();
		
		int length=arr.length;
		
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i].compareTo(arr[j])==0)
				{
					for(int k=j;k<length-1;k++)
					{
					  arr[k]=arr[k+1];	
					}
					length--;
				}
			}
			
		}
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
		

}
