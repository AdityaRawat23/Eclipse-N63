package pyramid;

public class Try1 {

	public static void main(String args[])
	{
		int d,a;
		try {
			a=0;
			d=10/a;
			System.out.println("this will never be printed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("inside catch");
		}
		System.out.println("after catch");
	}
}
