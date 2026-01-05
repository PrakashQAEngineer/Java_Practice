package Basic;

public class ObjectIniti 
{
	
	String name;
	int roll;
	
	public void getData(String n, int r)
	{
	     name = n;
	     roll = r;
	}
	
	public void displayData()
	{
		System.out.println("The name of the Student is: "+name);
		System.out.println("The student roll is: "+roll);
	}
	public static void main(String args[])
	{
		ObjectIniti ob1 = new ObjectIniti();
		ob1.getData("Prakash", 7);
		ob1.displayData();
	}
	
	
}
