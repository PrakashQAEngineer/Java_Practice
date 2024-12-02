package Oops;

class Anumal
{
	void eat()
	{
		System.out.println("This is the eat method from Animal");
	}
}
public class Inheritance_Animal extends Anumal
{
	public static void main(String args[])
	{
		Inheritance_Animal an1 = new Inheritance_Animal();
		an1.eat();
	}

}
