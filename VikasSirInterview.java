package pyramid;

import java.util.Scanner;

public class VikasSirInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		String s1=sc1.nextLine();
		
		if(s1.length()>9||s1.length()<3)
		{System.out.println("invalid");
		System.exit(0);}
		
		char arr[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			if((int)arr[i]>48&&(int)arr[i]<57)
			{
				System.out.print(arr[i]);
			}
		}
	}

}
