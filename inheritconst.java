class Abc
{
	Abc(){
	
		System.out.println("first");
	}
}
class Bcd extends Abc
{
	Bcd()
	{
		System.out.println("second");
	}
}
class Cde extends Bcd
{
	Cde()
	{
		System.out.println("Third");
	}
	
}
public class inheritconst {

	public static void main(String args[])
	{
	Cde ob=new Cde();
	}
}
