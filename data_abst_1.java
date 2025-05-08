abstract  class vechile
{
	abstract public void start();
}

class car extends vechile
{
	public void start()
	{
		System.out.println("Start with key");
	}
}

public class data_abst_1 extends vechile
{
	public void start()
	{
		System.out.println("It starts with the vechile");
	}
	
	public static void main(String args[])
	{
		data_abst_1 da1 = new data_abst_1();
		da1.start();
	    
		car c1 = new car();
		c1.start();
	}
}