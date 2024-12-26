package Oops;

public class method_overloading_2 
{
	void show(int a)
	{
		System.out.println(1);
	}
	
	void show(String a)
	{
		System.out.println(2);
	}

	
	public static void main(String args[])
	{
		method_overloading_2 ob1 = new method_overloading_2();
		ob1.show("t");
	}
}
