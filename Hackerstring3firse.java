package pyramid;

import java.util.Arrays;
import java.util.Scanner;

public class Hackerstring3firse {

	static boolean isAnagram(String a,String b)
	{
		String copya=a.replaceAll("\\s"," ");
		String copyb=b.replaceAll("\\s"," ");
			boolean status=true;
		if(copya.length()!=copyb.length())
		{
			status = false;
		}
		else
		{
			char[] arr1=copya.toLowerCase().toCharArray();
			char[] arr2=copyb.toLowerCase().toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			status=Arrays.equals(arr1, arr2);
		}
		return status;
		
	}
	public static void main(String args[])
	{
		Scanner sc1=new Scanner(System.in);
		String a=sc1.nextLine();
		String b=sc1.nextLine();
		
		boolean ret=isAnagram(a,b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}
