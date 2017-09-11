package pyramid;

import java.math.BigInteger;
import java.util.Scanner;

public class CovertAplhabetToNearestPrimeACII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		String s=sc1.nextLine();
		char arr[]=s.toCharArray();
		int[] art=new int[s.length()];
		for(int j=0;j<s.length();j++)
		{
			int l=(int)arr[j];
			while(l<=90)
			{
				if(l==90)
				{
					art[j]=67;
				}
				if(BigInteger.valueOf(l).isProbablePrime(1))
				{
					art[j]=l;
					continue;
				}
			l++;
			}
			System.out.println((char)art[j]);
		}
		sc1.close();
	}
}