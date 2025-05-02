
public class MethodOverloading2 
{
	public void display(int a, String name)
	
	{
		System.out.println("1");
		
	}
	public void display(String name,int a)
	{
		System.out.println("2");
	}
	public static void main(String args[])
	{
		MethodOverloading2 mv1 = new MethodOverloading2();
		mv1.display("Prakash",1);
		mv1.display(1,"Prakash");
	}

}
