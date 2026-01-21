package Basic;

// we can user and extend the final method we we cant override it
class a
{
	final public void show()
	{
		System.out.println("this is the show of A class");
	}
}

public class FinalMethod extends a
{
	
	/*public void show()
	{
		System.out.println("this is the show of FM class");
	}*/
	public static void main(String args[])
	{
		/*FinalMethod fm = new FinalMethod();
		fm.show();*/
		
		a ab = new a();
		ab.show();
		
	}

}
