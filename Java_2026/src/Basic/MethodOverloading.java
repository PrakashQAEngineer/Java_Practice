package Basic;

public class MethodOverloading 
{
	
	public void displayData()
	{
		System.out.println("This is the 1st method to display data");
	}
	
	public void displayData(int num)
	{
		System.out.println("This is the 2nd method to display data");
	}
	public static void main(String args[])
	{
		
		MethodOverloading m1 = new MethodOverloading();
		m1.displayData(10);
	}

}
