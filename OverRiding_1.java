

class Override
{
	public void display()
	{
		System.out.println("This is the Override display method");
	}
	
	public void para(String str)
	{
		System.out.println("This will be with the Parent String method");
	}
}
public class OverRiding_1 extends Override
{
	public void display()
	{
	  System.out.println("This is the main method class");	
	}
	
	public void para(String str)
	{
		System.out.println("This will be with the child string method");
	}
	
	public static void main(String args[])
	{
		Override ov1 = new Override();
		ov1.display(); // this will call the parent class display method
		ov1.para("Prakash");
			
		OverRiding_1 ov2 = new OverRiding_1();
		ov2.display(); // this will call the child class display method
		ov2.para("Prakash");
		
	}

}
