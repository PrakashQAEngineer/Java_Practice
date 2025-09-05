package ConsInheritance;

public class cl1 extends Multiple
{
	
	int a;	
	public cl1(int a)
	
	{
		super(a);
	   this.a = a;	
	}

	
	public int add()
	{
		a = a+1;
		return a;
	}
	
	public int sub()
	{
		a=a-1;
		return a;
	}
}
