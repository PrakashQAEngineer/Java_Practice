package DataAbstraction;


interface area
{
   final static double pi =  3.14F;  /// declaring the variable under interface
    double commute(double d, double e); //declaring the float method under interface and by default the complier adds public abstract
   
}


class Rectangle implements area
{
	public double commute(double x, double y)
	{
		return (x*y);
	}
}

class circle implements area
{
	public double commute(double x, double y)
	{
		return (pi*x*y);
	}
}

public class Interface2 
{
	public static void main(String args[])
	{
		Rectangle rect = new Rectangle();
		circle c1 = new circle();
		
		area ar;  //interface object
		ar = rect;
		
		System.out.println("Area of Rectangle is: "+ar.commute(2.5, 2.6));
		
		ar = c1;
		System.out.println("Area iof cuircle is: "+ar.commute(12.3, 9.3));
	}

}
