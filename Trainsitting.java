package pyramid;

import java.util.Scanner;

public class Trainsitting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int x=sc1.nextInt();
		int n = 0;
		if(x<=12&&x>=1)
		{
			n=13-x;
		}
		if(x<=24&&x>=13)
		{
			n=37-x;
		}
		if(x<=36&&x>=25)
		{
			n=61-x;
		}
		if(x<=48&&x>=37)
		{
			n=85-x;
		}
		if(x<=60&&x>=49)
		{
			n=109-x;
		}
		if(x<=72&&x>=61)
		{
			n=133-x;
		}
		if(x<=84&&x>=73)
		{
			n=157-x;
		}
		if(x<=96&&x>=85)
		{
			n=181-x;
		}if(x<=108&&x>=97)
		{
			n=205-x;
		}
		String pos = null;
		if(n%6==1||n%6==0)
		{
			pos="WS";
		}
		if(n%6==2||n%6==5)
		{
			pos="MS";
		}
		if(n%6==3||n%6==4)
		{
			pos="AS";
		}

		System.out.println(n+" "+pos);
		sc1.close();
	}

}
