package pyramid;

import java.util.Scanner;

public class hackerstring4 {

	public static void main(String args[])
	{
		Scanner sc1=new Scanner(System.in);
		String s1=sc1.nextLine();
		
		String[] parts=s1.split(",?' ");
		for(int i=0;i<parts.length;i++)
		{
			System.out.println(parts[i]);
		}
	}
}
