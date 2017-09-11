package pyramid;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1=new Scanner(System.in);
		int x=sc1.nextInt();
		
		if(x==0||x==1)
		{
			System.out.println("not prime");
			System.exit(0);
		}
		for(int i=2;i<Math.sqrt(x);i++)
		{
			if(x%i==0)
				{System.out.println("not prime");
					System.exit(0);
				}
		}
		
		System.out.println("prime");
	}

}
