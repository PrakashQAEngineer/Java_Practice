package Oops;

public class Method1 
{
	public static void main(String args[])
	{
		method m1 = new method();
		m1.getdata("Prakash", 1, "JSG");
		m1.display();
	}

}

class method
{
	String name;
	int id;
	String address;
	
	public void getdata(String name, int i, String add)
	{
		this.name = name;
		id = i;
		address = add;
	}
	
	public void display()
	{
		System.out.println("The name of the student is: "+name);
		System.out.println("The id of the student is: "+id);
		System.out.println("The address of the student is: "+address);
	}
}
