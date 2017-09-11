package pyramid;

import java.util.Scanner;

public class AparnaPGquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		String s1=sc1.nextLine();
		//  UP21XY1234	
		//
		if(s1.length()==10)
		{
			System.out.println("length okay");
		}
		else {
			System.out.println("wrong input");
			System.exit(0);
		}
		char arr[]=s1.toCharArray();

		for(int i=0;i<s1.length();i++)
		{
			char z=s1.charAt(i);
			if(i==7||i==8||i==3)
			{continue;}
			if(i<2)
			{
				if((int)z>=65||(int)z<=90)
				{
					System.out.println("first two sequence are ok1");
				}
				else
				{
					System.out.println("wrong sequence");
					System.exit(0);
				}
			}
			//UP21XY1234
			if(i==2)
			{
				int p=Integer.parseInt((String) s1.subSequence(2,3));
				if(p==0)
				{
					System.out.println("wrong sequence");
					System.exit(0);
				}
				else
				{System.out.println("sequnce is okay2");}
			}
			if(i>3||i<6)
			{
				if((int)z>64||(int)z<91)
				{
					System.out.println("Sequence is OKay3");
				}
				else
				{
					System.out.println("Wrong sequence");
					System.exit(0);
				}
			}
			if(i==6)
			{
				int p=Integer.parseInt((String) s1.subSequence(6,7));
				if(p==0)
				{
					System.out.println("wrong sequence");
					System.exit(0);
				}
				else
				{System.out.println("sequence is okay4");}
			}
			if(i==9)
			{
				if((int)z==48)
				{
					System.out.println("wrong input");
					System.exit(0);
				}
				else
				{
					System.out.println("Sequence okay5");
				}
			}
			
		}

		
	}

}
