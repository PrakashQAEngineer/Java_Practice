
 class parent
{
	 
	int a=100;
}

public class ThisSuper extends parent 
{
	int a=50;
	public void show(int a)
	{
		System.out.println(a +"This is the direct class variable" );
		System.out.println(this.a+"this is the this method variable");
		System.out.println(super.a+"this is the super class");
	}
	public static void main(String args[])
	{
		ThisSuper tb = new ThisSuper();
		tb.show(20);
				
	}

}
