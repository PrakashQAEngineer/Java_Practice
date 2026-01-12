package Basic;

interface TestInt
{
	public abstract void display();
	 void getData();  // by default compiler adds public abstract
	 
	 int a=10; 
	 public static final int b=20;
	 
	 default void testDisplay()
	 {
		 System.out.println("This is the test data displaa with default");	 
	 }
 }
public class Interface1 implements TestInt
{

	@Override
	public void display() {
		System.out.println("This is to display the data");
		
	}

	@Override
	public void getData() {
		System.out.println("this is to get the data");
		
	}
	public static void main(String args[])
	{
		Interface1 t1 = new Interface1();
		t1.display();
		t1.getData();
		System.out.println(t1.b);
		System.out.println(t1.a);
	}
	
	

}
