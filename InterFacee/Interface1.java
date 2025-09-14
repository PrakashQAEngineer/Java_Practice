package DataAbstraction;

interface i1
{
	void show();  // complier will auto add the public abstract
	public abstract void data();
	
	public static   void meth()
	{
		System.out.println("here we can define with the use of static");
	}
}

interface i2
{
	default void anima()
	{
		System.out.println("This is the animal");
	}
	
	public static  void running()
	{
		System.out.println("This is the animal is rujuning");
	}
	
	public abstract void calling();
}

public class Interface1 implements i1 ,i2
{
	
	public void show()
	{
		System.out.println("This will display the data");
	}
	
	public void calling()
	{
		System.out.println("This is the calling odf the 2nd interface and this is also the example of the multiple inheritance");
	}
	
	public void data()
	{
		System.out.println("This is the data");
	}
	
	public static void main(String args[])
	{
		Interface1 i = new Interface1();
		i.data();
		i.show();
		i1.meth();  // we can call directly because the method is static
		i.calling();  //this is the multiple inheritance
		i2.running();
	}

}
