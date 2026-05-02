package TryCatch;

public class TryCatchMethood2 
{
	
	     
	public int divide()
	{
		int c=0;
	  try
	  {
		  int a=100,b=0;
			c=a/b;
			
		  
	  }	
	  
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  return c;
		
	}
	public static void main(String args[])
	{
		int res;
		TryCatchMethood2 tb = new TryCatchMethood2();
		res = tb.divide();
		System.out.println("****************");
		System.out.println(res);
	}

}
