package pyramid;

public class SerachString {
public static void main(String args[])
{
	String s="jason bourne is a 3.2 star rating fiction novel";
	System.out.println(s);
	
	System.out.println("location of t"+s.indexOf('t'));
	
	System.out.println("last index"+s.lastIndexOf("star"));
}
}
