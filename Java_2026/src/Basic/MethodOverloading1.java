package Basic;

public class MethodOverloading1 
{
	public void show(String name, int roll)
	{
		System.out.println("this is the first show method");
	}
	
	public void show(int roll, String name)
	{
		System.out.println("This is the second show method");
	}
	public static void main(String args[])
	{
		MethodOverloading1 m1 = new MethodOverloading1();
		m1.show("Prakash",20);
		m1.show(20,"Prakash");
	}

}
