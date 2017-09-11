package pyramid;

class ascie
{
	ascie()
	{
		byte asc[]= {65,66,67,68,69};
		String s1=new String(asc);
		
		String s2=new String(asc,1,3);
		
		System.out.println(s2);
		System.out.println(s1);
	}
}
public class Stringascii {

	public static void main(String args[])
	{
		ascie ob1=new ascie();
		//String s3=ob1.s1;
		//System.out.println(ob1.s2);
		//System.out.println(ob1.s1);
	}
}
