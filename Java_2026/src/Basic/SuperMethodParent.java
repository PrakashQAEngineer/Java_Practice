package Basic;

//Super keyword is also used to invoke immediate parent method
class B
{
	public void display()
	{
		System.out.println("Hello am in the display Method of Class A with the help of super");
	}
}
public class SuperMethodParent  extends B
{
   void show()
   {
	   System.out.println("Am in the show method of child class");
	   super.display();
	   
   }
   
   public static void main(String args[])
   {
	   SuperMethodParent sp1 = new SuperMethodParent();
	   sp1.show();
   }
}
