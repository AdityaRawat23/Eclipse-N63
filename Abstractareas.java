package pyramid;
abstract class figure{
	double dim1;
	double dim2;
	
	figure(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	abstract double area();
}
class rectangle extends figure
{

	rectangle(double a, double b) {
		super(a, b);}
	double area()
	{
		System.out.println("Area of rectangle");
		return dim1*dim2;		
	}
	}
 class triangle extends figure
 {

	triangle(double a, double b) {
		super(a, b);
		
	}
	double area()
	{
		System.out.println("area of triangle");
		return (dim1*dim2)/2;
	}
	 
 }

public class Abstractareas {
	public static void main(String args[])
	{
		rectangle r=new rectangle(9,5);
		triangle t=new triangle(5,7);
		
		figure f;
		f=r;
		System.out.println("area is"+f.area());
		
		f=t;
		System.out.println("area is"+f.area());
		
	}
	
}
