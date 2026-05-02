package TryCatch;

public class Finally 
{
	public static void main(String args[])
	{
		int a=100, b=0, c=0;
		
		try
		{
			c = a/b;
			System.out.println(c);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println(e);
		}
		
		finally
		{
			System.out.println("I'm in the finally block");
		}
	}

}
