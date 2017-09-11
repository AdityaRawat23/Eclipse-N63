package pyramid;
import java.util.*;
import java.lang.*;
import java.io.*;

class concatrev{
    void sds(String s1,String s2)
    {
        String s3=s1.concat(s2);
        
        char aa[]=s3.toCharArray();
        for(int j=s3.length()-1;j>0;j--)
        {
            System.out.print(aa[j]);
        }
        System.out.println("");
    }
}
class Gfgstring1{
	public static void main (String[] args) {
		Scanner sc1=new Scanner(System.in);
		//int x=sc1.nextInt();
		
		String s1=sc1.next();
		String s2=sc1.next();
		String s3=sc1.next();
		String s4=sc1.next();
		concatrev ob1=new concatrev();
		
		ob1.sds(s1,s2);
		ob1.sds(s3,s4);
		
	
	}
}