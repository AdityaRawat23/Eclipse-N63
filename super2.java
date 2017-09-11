class a
{
	int i=40;
}
class b extends a
{
	b()
	{
	int i=20;
	System.out.println(super.i);
	System.out.println(i);
	}
}
public class super2 
{
	
	public static void main(String args[])
	{
		b ob=new b();
	}
}
