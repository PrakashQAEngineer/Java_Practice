package Basic;

public class StaticVar2 
{
	int count = 0;
	static int newcount = 0;  //static initialize the variable only one time
	StaticVar2()
	{
		count++;
		newcount++;
		System.out.println(count+" count value");
		System.out.println(newcount+ "new Count value");
	}
	public static void main(String args[])
	{
		StaticVar2 c1 = new StaticVar2();
		StaticVar2 c2 = new StaticVar2();
		StaticVar2 c3 = new StaticVar2();
	}

}
