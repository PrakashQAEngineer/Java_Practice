package Oops;

public class Animal 
{
	public void buzo()
	{
		System.out.println("My Dog name is buzo");
	}
	
	public void tom()
	{
		System.out.println("My Cat NAme is Tom");
	}
	
	public static void main(String args[])
	{
		System.out.println("For printing the name of animals we need to call methods: ");
		
		Animal dog = new Animal();
		dog.buzo();
		
		Animal cat = new Animal();
		cat.tom();
		
		Birds br = new Birds();
		br.fly();
		
	}
	

}

class Birds
{
   public void fly()
   {
	   System.out.println("Birds can fly too");
   }
}
