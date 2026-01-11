package Basic;


class Overriding
{
	public void display()
	{
		System.out.println("This is to display the data.");
	}
}
public class MethodOverriding extends Overriding
{
	@Override
	public void display()
	{
		System.out.println("This is the child to display the data");
	}
	
	public static void main(String args[])
	{
		MethodOverriding m1 = new MethodOverriding();
		m1.display();
		
		Overriding o1 = new Overriding();
		o1.display();
	}

}
