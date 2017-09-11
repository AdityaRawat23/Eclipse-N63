package pyramid;
import java.util.*;

public class Hackerstring2 {
	
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		String s=sc1.nextLine();
		
		StringBuffer sb=new StringBuffer(s);
		
		StringBuffer sb1=sb.reverse();
		System.out.println(sb1);
		
		if(s.equals(sb.toString()))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
