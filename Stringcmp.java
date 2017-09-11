package pyramid;

public class Stringcmp 
{
	static void comparestr()
	{
		String s1="Hello";
		String s2="Hello";
		
		String s3=new String("Hellbbvlo");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.compareTo(s3));
	}

	public static void main(String args[])
	{
		
		comparestr();
	}
}
