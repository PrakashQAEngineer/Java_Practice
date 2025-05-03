
public class Method_Overloading_Auto_Promotion 
{
	public void display(int a)
	{
		System.out.println("This is the int method");
	}
	
	public void display(String str)
	{
		System.out.println("This is the String method");
	}
	public static void main(String args[])
	{
		Method_Overloading_Auto_Promotion ap1 = new Method_Overloading_Auto_Promotion();
		ap1.display('b'); // now this will call the int method becaus eof the automatic promotion
 	}

}
