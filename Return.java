
public class Return 
{
	public int add(int a, int b)
	{ 
		int c;
		c= a+b;
		return c;
	}
	public static void main(String args[])
	{
		int sum=0;
		Return r1 = new Return();
		sum = r1.add(1, 1);
		System.out.println(sum);
	}
	

}
