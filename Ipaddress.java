package pyramid;

import java.util.Scanner;

public class Ipaddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc1=new Scanner(System.in);
		String s1=sc1.nextLine();
		
		String ch[]=s1.split("\\.",0);
		int x1;
		if(ch.length>=5||ch.length<=3) {
			System.out.println("False");
		System.exit(0);}
		for(int i=0;i<ch.length;i++)
		{
			String s=ch[i].toString();
			if(s.length()>=4||s.length()==0)
				{System.out.println("False");
			System.exit(0);}
			try {
			int result=Integer.parseInt(s);
			
			if(result>255||result<0)
			{
				System.out.println("false");
				System.exit(0);
			}
			}catch(Exception e) {System.out.println("false");
			System.exit(0);}
		}
		System.out.println("true");

	}

}
