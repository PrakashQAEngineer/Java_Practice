abstract class Vechilee
{
	abstract public void start();
	abstract public void stop();
}


class carr extends Vechilee
{
	 public void start()
	{
		System.out.println("Car start with bike");
	}
	
	 public void stop()
	{
		System.out.println("Car stops with the braking system");
	}
	 
	 
}

class bik extends Vechilee

{
	public void start()
	{
		System.out.println("The bike start with the key and kick too");
	}
	
	public void stop()
	{
		System.out.println("The bike stop with the hand brake and leg brake too");
	}
}
public class AbsClass extends carr
{
	public static void main(String  args[])
	{
		AbsClass ab1 = new AbsClass();
		ab1.start();
		ab1.stop();
		
		bik b1 = new bik();
		b1.start();
		b1.stop();
				
	}

}
