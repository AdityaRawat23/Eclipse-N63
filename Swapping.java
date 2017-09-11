package pyramid;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int x=sc1.nextInt();
		int y=sc1.nextInt();
		
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println(x);
		System.out.println(y);
		
	}

}
