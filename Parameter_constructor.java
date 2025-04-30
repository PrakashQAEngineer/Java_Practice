
public class Parameter_constructor 
{
	int num1;
	String name;
	
	 public Parameter_constructor(int num1, String name)
	 {
		 this.num1=num1;
		 this.name = name;
	 }
	 
	 public void display()
	 {
		 System.out.println("the num value is: "+num1);
		 System.out.println("the name value is: "+name);
	 }
	 
	public static void main(String args[])
	{
		Parameter_constructor c1 = new Parameter_constructor(1,"Prakash SIngh Rajput");
		Parameter_constructor c2 = new Parameter_constructor(2,"Jyoti Singh");
		c1.display();
		c2.display();
	}

}
