package TryCatch;

public class TryCatch4 
{
	public static void main(String args[])
	{
		try
		{
			int a=100, b=0, c=0;
			c=a/b;
			System.out.println(c);
				
		}	
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("This is the test method");
	}

}
