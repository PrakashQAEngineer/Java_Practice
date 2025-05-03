

class Override
{
	public void display()
	{
		System.out.println("This is the Override display method");
	}
}
public class OverRiding_1 extends Override
{
	public void display()
	{
	  System.out.println("This is the main method class");	
	}
	public static void main(String args[])
	{
		Override ov1 = new Override();
		ov1.display(); // this will call the parent class display method
			
		OverRiding_1 ov2 = new OverRiding_1();
		ov2.display(); // this will call the child class display method
		
	}

}
