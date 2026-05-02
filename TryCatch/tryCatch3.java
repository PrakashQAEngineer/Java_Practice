package TryCatch;

public class tryCatch3 
{  
	public static void main(String args[])
	{
		int a=100, b=0, c=0;	
		
		try
		{
			System.out.println("This is 1");
			c=a/b;  
		}
		
		catch(Exception e)
		{
		  System.out.println("am in under exception");
		  System.out.println(e);
		  e.printStackTrace();  //most useful
		}
	}
	

}
