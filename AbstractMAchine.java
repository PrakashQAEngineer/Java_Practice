
abstract class machine
{
	abstract public void turnOn();
	abstract public void turnOff();
}


class taken extends machine
{
	public void turnOn()
	{
		System.out.println("This is the turnon");	}
	public void turnOff()
	{
		System.out.println("This is the Turnoff");
	}
}
public class AbstractMAchine extends taken

{
	public static void main(String args[])
	{
		AbstractMAchine ab1 = new AbstractMAchine();
		ab1.turnOff();
		ab1.turnOn();
	}

}
