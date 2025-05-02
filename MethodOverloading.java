
public class MethodOverloading  
{
	public void display(int a)
	{
		System.out.println("1");
	}
	
	public void display()
	{
		System.out.println("2");
	}
	public static void main(String args[])
	{
		MethodOverloading mv1 = new MethodOverloading();
		mv1.display(10);
	}

}
