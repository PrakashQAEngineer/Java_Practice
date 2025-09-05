package ConsInheritance;

import org.testng.annotations.Test;

public class cl2  extends p
{

	@Test
    public void run()
   {
		
		cl1 c = new cl1(5);
		
	   System.out.println("The add is: "+c.add());
	   System.out.println("The sub is: "+c.sub());
	   System.out.println("The Mul is: "+c.mul());
	   
	   
   }
}
