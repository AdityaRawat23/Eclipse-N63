package pyramid;

import java.util.Scanner;

public class Plaindrome {
	public static void main(String args[])
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=sc1.nextLine();
		
		char ch1[]=s1.toCharArray();
		int i,j=ch1.length;
		for(i=0,j=ch1.length-1;i<j;i++,j--)
		{
			if(ch1[i]!=ch1[j])
			{
				System.out.println("NOT PALINDROME");
				System.exit(0);
			}
						
		}	
		System.out.println("PLAINDROME");
	}

}
