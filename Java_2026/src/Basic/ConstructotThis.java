package Basic;

class cl1
{
	cl1()
	{
		System.out.println("this is the 1st cons");
	}
	
	cl1(int a)
	{
		this();
       System.out.println("this is the 2nd cons");
	}
}

public class ConstructotThis 
{
	public static void main(String args[])
	{
		cl1 c12 = new cl1(10);
	}

}
