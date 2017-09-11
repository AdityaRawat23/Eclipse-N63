package pyramid;

import java.util.Scanner;

class div
{
   public int asd(int x)
   {
	   int count=0;
		for(int i=1;i<Math.sqrt(x);i++)
		{
			if(x%i==0)
			{
				count=count+1;
			}
		}
		return count;
   }
}
public class Samenoofdivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int flag=0;
		System.out.println("enter the number");
		int k=sc1.nextInt();
		for(int x=2;x<k-1;x++)
			{
				
				div ob1=new div();
				div ob3=new div();
				
				int a=ob1.asd(x);			
				int c=ob3.asd(x+1);
			
			if(a==c)
				{
					flag=flag+1;
				}
		
		}System.out.println(flag);
	}
}
