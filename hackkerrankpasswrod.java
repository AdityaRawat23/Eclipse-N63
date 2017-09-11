package pyramid;

import java.util.Scanner;

public class hackkerrankpasswrod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1=new Scanner(System.in);
		String s=sc1.next();

		if(s.length()<8||s.length()>30)
		{
			System.out.println("invalid");
			System.exit(0);
		}

		char arr[]=s.toCharArray();

		if(arr[0]>=0&&arr[0]<=9)
		{
			System.out.println("invalid");
			//System.exit(0);
		}

		if(((int)arr[0]>=65&&(int)arr[0]<=90)||((int)arr[0]>=97&&(int)arr[0]<=122))
		{
			System.out.println("First letter OK");
		}
		else 
		{
			System.out.println("invalid");
			System.exit(0);

		}	
		int flag=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(((int)arr[i]>=65&&(int)arr[i]<=90)||((int)arr[i]>=97&&(int)arr[i]<=122)||((int)arr[i]==95)||((int)arr[i]>=48&&(int)arr[i]<=57))
			{				
				flag=0;
			}			
			else
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("invalid");
		}
		else
			System.out.println("valid");
	}
	}

