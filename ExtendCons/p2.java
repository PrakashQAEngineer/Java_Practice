package ExtendCons;

public class p2 
{
	int a;
	
	
	public p2(int a) //parameter constructor
	{
		this.a = a;
	}
	
	
	// we are calling no parameter cons because we are inheritn the parent class
	public p2()
	{
		 System.out.println("Parent default constructor");
	}
	public int val()
	{
		a = a+a;
		return a;
	}
	
    public void display()
    {
    	System.out.println("The value of a is; "+a);
    }

}
