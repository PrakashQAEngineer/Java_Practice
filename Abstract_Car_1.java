abstract class Vechile
{
	abstract public void start();
	abstract public void stop();
}

class Abs_bike_1 extends Vechile
{
	public void start()
	{
		System.out.println("Bike start with the kick");
	}

	public void stop()
	{
		System.out.println("Bike stop with the hand brake");
	}
}

public class Abstract_Car_1 extends Vechile
{

	public void start()
	{
		System.out.println("Starts with the key");
	}
	public void stop()
	{
		System.out.println("Stop with the leg brake");
	}
	
	public static void main(String args[])
	{
		Abs_bike_1 b1 =new Abs_bike_1();
		b1.start();
		b1.stop();
		
		Abstract_Car_1 c1 = new Abstract_Car_1();
		c1.start();
		c1.stop();
	}

}
  
