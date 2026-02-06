package Basic;

public class UsingCommonVar 
{
	
	public void met1()
	{
		int x=30;
		System.out.println("The value of x in met 1 is: "+x);
		met2(x);
	}
	
	public void met2(int x)
	{
		System.out.println("value of x in met2 is: "+x);
		
	}
	public static void main(String args[])
	{
		UsingCommonVar a1 = new UsingCommonVar();
		a1.met1();
	}

}
