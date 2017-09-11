package pyramid;

public class Try2 {

	public static void main(String args[])
	{
		int i,a,b;
		
		for(i=0;i<10;i=i+2)
		{
			try {
				
			a=10;
			b=a/i;
			System.out.println(b);
			
			}
			catch(ArithmeticException e)
			{
				System.out.println("arithmetic exception");
			}
			
		}
	}
}
