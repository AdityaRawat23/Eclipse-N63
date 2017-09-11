package pyramid;
import java.io.*;
import java.util.*;

public class Hackerstrign3 {
	 static boolean isAnagram(String a, String b) {
	        char[] ch1=a.toCharArray();
	        char[] ch2=b.toCharArray();
			int flag=0;
			StringBuffer s1=new StringBuffer(a);
			StringBuffer s2=new StringBuffer(b);
	        for(int i=0;i<ch1.length;)
	        {
	        	for(int j=0;j<ch2.length;)
	        	{
	        		if(ch1[i]==ch2[j])
	        		{
	        			s1.deleteCharAt(i);
	        			s2.deleteCharAt(j);
	        			if(i<ch1.length)
	        			{
	        				i++;
	        			}
	        		}
	        		
	        		else if(j<ch2.length)
	        		{
	        		j++;
	        		}
	        		else
	        			return false;
	        			
	        		
	        	}
	        }
	        
	        if(s1.length()==0 &&s2.length()==0)
	        {
	        	return true;
	        }
	        else
	        	return false;
	    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

