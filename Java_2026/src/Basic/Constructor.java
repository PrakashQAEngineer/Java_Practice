package Basic;

public class Constructor 
{
	int roll;
	String name;
	public Constructor(int roll, String name)
	{
		this.roll = roll;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("The roll of the student is: "+roll+" And the name of the Student is: "+name);
	}
	public static void main(String args[])
	{
		Constructor c1 = new Constructor(7,"Prakash Singh Rajput");
		c1.display();
		
		Constructor c2 = new Constructor(8,"Jyoti SIngh");
		c2.display();
	}

}
