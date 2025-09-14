package DataAbstraction;


abstract class animal2
{
	abstract public void sound();
	abstract public void walk();
}


class dogy 
{
	public void eat()
	{
		System.out.println("the dog can eat anything");
		
	}
	
	public void loyal()
	{
		System.out.println("The dog is very loyal");
	}
	
	
}

class cat extends animal2
{
	public void eat()
	{
		System.out.println("the cat can eat rice and milk");
	}
	
	public void loyal()
	{
		System.out.println("The cat is not so loyal");
	}
	
	
	public void sound()
	{
		System.out.println("Mewo Mewo");
	}
	
	public void walk()
	{
		System.out.println("The cat walks slow");
	}
}
public class Abs2 extends dogy
{
	public static void main(String args[])
	{
		Abs2 ab2 = new Abs2();
		ab2.eat();
		ab2.loyal();
		cat ct2 = new cat();
		ct2.eat();
		ct2.loyal();
		ct2.sound();
	}

}
