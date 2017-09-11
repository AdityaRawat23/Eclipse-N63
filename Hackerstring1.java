package pyramid;

public class Hackerstring1 
{
	static void hckr(char ch2[])
	{
		for(int i=0;i<ch2.length;i++)
		{
			if(i==0)
			{
				ch2[i]=Character.toUpperCase(ch2[i]);
			}
			System.out.print(ch2[i]);
		}		
	}			
	public static void main(String args[])
	{
	String s1="heelo";
	String s2="beelo";
	
	int sum=s1.length()+s2.length();
	System.out.println("length of the strings is = "+sum);
	
	int lex=s1.compareTo(s2);
	
	System.out.println(lex);
	char[] ch2=s1.toCharArray();
	char[] ch=s2.toCharArray();
	
	hckr(ch);
	System.out.println("");
	hckr(ch2);
	}
	
}