package Oops;

public class method_overloading_3 
{
	void show(int a)
	{
		System.out.println("1");
	}
	
	void show(int a, String b)
	{
		System.out.println(2);
	}

	public static void main(String args[])
	{
		method_overloading_3 ob1 = new method_overloading_3();
		ob1.show(10,"Prakash");
	}
}
