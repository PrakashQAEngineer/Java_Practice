package Basic;

 class AbstractClass 
{
    void showNothing()
    {
    	System.out.println("this will do nothing");
    }
    
    public static void main(String args[])
    {
    	Car c1 = new Car();
    	c1.no_of_tyres = 4;
    	c1.start();
    	
    	Bike b1 = new Bike();
    	b1.no_of_tyres=2;
    	b1.start();
    }
}
 
  abstract class Vechile
  {
	  int no_of_tyres = 4;
	  
	  abstract public void start();
  }
  
  class Car extends Vechile
  {
	    public void start()
	    {
	    	System.out.println("The car start with key");
	    }
  }
  
  class Bike extends Vechile
  {
	  public void start()
	  {
		  System.out.println("The bike start with kick");    
	  }
  }
