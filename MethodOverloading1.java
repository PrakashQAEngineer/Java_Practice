
public class MethodOverloading1 
{
	
	public void display(int a)
	{
		System.out.println("this is the int method");	
	}
	
	public void display(int a, int b)
	{
		System.out.println("this is the multi int method");
	}
	
	public void display(String a)
	{
		System.out.println("This is the String mehtod");
	}
	public static void main(String args[])
	{
		MethodOverloading1 mo1 = new MethodOverloading1();
		mo1.display(5);
		mo1.display("Prakash");
	}

}
