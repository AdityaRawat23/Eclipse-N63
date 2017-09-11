class superr1
{
	superr1(int n)
	{
		System.out.println("this is the constructor which is getting called"+n);
	}
}

class sup extends superr1
{

	sup(int n) {
		super(5);
	}
		
	
}

class super1
{
	public static void main(String args[])
	{
		sup a=new sup(8);
	}

}