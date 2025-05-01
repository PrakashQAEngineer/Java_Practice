

 class Test1
{
  public  void displaydata()
  {
	  System.out.println("This is Inheritaed");
  }
}
public class Inheritance_1 extends Test1
{
	public void displayScore()
	{
		System.out.println("This is Score card");
	}
	
	public static void main(String args[])
	{
		Inheritance_1 in1 = new Inheritance_1();
		in1.displayScore();
		in1.displaydata();
		
	}

}
