package TryCatch;

public class tryCatch2 
{
	public static void main(String args[])
	{
		int a=100, b=0, c=1;
		
		try
		{
			c=a/b;	
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println(e);
		}
		
		System.out.println(c);
		
	}

}
