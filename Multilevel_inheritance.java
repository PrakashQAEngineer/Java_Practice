package Oops;

class first_in
{
	void firstMethod()
	{
		System.out.println("This is the first method");
	}
}
class second_in extends first_in
{
   void secondMethod()
   {
	   System.out.println("This is the second Method");
   }
}

public class Multilevel_inheritance extends second_in
{
	public static void main(String args[])
	{
		Multilevel_inheritance ob1 = new Multilevel_inheritance();
		ob1.secondMethod();
		ob1.firstMethod();
	}

}
