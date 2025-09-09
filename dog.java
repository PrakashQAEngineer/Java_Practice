package DataAbstraction;

abstract class animal

{
	abstract  public void animalSound();
	
	public void sleep()
	{
		System.out.println("The animal is sleeping");
	}
}
  class sparrow extends animal
  {
	  public void birds()
	  {
		  System.out.println("This is the bird");
	  }
	  
	  public void animalSound()
	  {
		  System.out.println("Bird sound is chip chip");
	  }
  }


public class dog extends  sparrow
{
	
	public static void main(String args[])
	{
		dog d1 = new dog();
		d1.animalSound();
		d1.birds();
		d1.sleep();
	}


}
