package TryCatch;

public class TryCatchMethod 
{
	public int divide()
	{
		int c=0;
		try 
		{
			int a=100, b=0;
			c=a/b;
				
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return c;
		
	}
   public static void main(String args[])
   {
	   TryCatchMethod tm = new TryCatchMethod();
	     int res = tm.divide();
	     System.out.println("This is the result: "+res);
	     System.out.println("This is the Print: ");
   }

}
