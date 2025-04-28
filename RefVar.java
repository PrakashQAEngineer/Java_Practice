
public class RefVar 
{
	int runs;
	String name;
	
	public void getData(int r, String n)
	{
		runs=r;
		name = n;
	}
	
	public void display()
	{
		System.out.println("We need to display this data with runs:  "+runs+" and this is the name: "+name);
	}
	
	public static void main(String args[])
	{
		RefVar r1 = new RefVar();
		r1.getData(100, "Prakash Singh Rajput");
		r1.display();
		
		r1.getData(101, "Rajesh Khuntia");
		r1.display();
		
	}

}
