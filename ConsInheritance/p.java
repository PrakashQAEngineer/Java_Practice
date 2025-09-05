package ConsInheritance;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class p 
{
	
	

	@BeforeTest
	public void display()
	{
		System.out.println("This is the first method to display");
	}
	
	@AfterTest
	public void last()
	{
		System.out.println("This will be the last method.");
	}
	
	Multiple m1 = new Multiple(3);
	

}
