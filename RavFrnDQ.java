package pyramid;

import java.util.Scanner;

public class RavFrnDQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		String s1=sc1.nextLine();
		char arr[]=s1.toCharArray();
		int flag=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			if((int)arr[i]>=65||(int)arr[i]<=90||(int)arr[i]>=97||(int)arr[i]<=122)
			{
				System.out.print(flag+"   ");
				while((int)arr[i]>=65||(int)arr[i]<=90||(int)arr[i]>=97||(int)arr[i]<=122)
				{
					System.out.print(arr[i]);
					i++;
				}
				flag++;
				continue;
			}
			else if((int)arr[i]>=48||(int)arr[i]<=57)
			{
				System.out.print(flag+"   ");
				while((int)arr[i]>=48||(int)arr[i]<=57)
				{
					System.out.print(arr[i]);
					i++;
				}
				flag++;
				continue;
			}
			else
				System.out.println("invalid");
			

		}
		sc1.close();
	}

}
