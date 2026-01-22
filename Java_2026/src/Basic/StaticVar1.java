package Basic;

public class StaticVar1 
{
	int roll;
	String name;
	static String company = "MOresand";
	
	StaticVar1(int roll, String name)
	{
		this.roll = roll;
		this.name = name;
		
	}
	
	void display()
	{
		System.out.println(roll+", "+name+"' "+company);
	}
	
	public static void main(String args[])
	{
		StaticVar1 v1 = new StaticVar1(1,"prakash");
		v1.display();
		
		StaticVar1 v2 = new StaticVar1(2,"jyoti");
		v2.display();
	}

}
