package Basic;

// if we user final as variuable we cant change the value of that variable
//if we use final method we can override that method.
//if we use class as final then we are not able to inherit that class.
public class FinalVariable 
{  
	
	public static void main(String args[])
	{
		final int i=10;  //now it shows error/
		   i= i+20;
		   
		   System.out.println(i);
	}

}
