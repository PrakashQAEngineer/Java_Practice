package Basic;

class A
{
	int num1=10;
}

public class SuperThisKeyword extends A 
{
   int num1 = 20;
   
   public void show(int num1)
   {
	   System.out.println(num1);   //prints the parameter variable
	   System.out.println(this.num1); //prints the current class instance variable
	   System.out.println(super.num1); // prints the parent class instance variable
   }
   
   public static void main(String args[])
   {
	   SuperThisKeyword s1 = new SuperThisKeyword();
	   s1.show(50);
   }
}
