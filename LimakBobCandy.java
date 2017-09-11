package pyramid;

import java.util.Scanner;

class LimakBobCandy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limak=1;
		int bob=2;
		int totallimak=1;
		int totalbob=2;
		Scanner sc1=new Scanner(System.in);
			//System.out.println("enter the value of A and B");
			int a=sc1.nextInt();
			int b=sc1.nextInt();

			while(totallimak<=a&&totalbob<=b)
			{				
					limak=limak+2;	
					bob=bob+2;
					totallimak=totallimak+limak;
					totalbob=totalbob+bob;
			}
			if(totallimak>a)
				System.out.println("Bob");
			else if(totalbob>b)
				System.out.println("Limak");
			
			sc1.close();
			}
	}


