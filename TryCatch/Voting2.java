	package TryCatch;

import java.util.Scanner;

class expClass extends RuntimeException
	{
		expClass(String msg)
		{
			super(msg);
		}
	}
	
	class Votee 
	{
		
		public int age()
		{
			System.out.println("Please enter the Age: ");
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			return age;
		}
		
		public void validatedage(int age)
		{
			try
			{
				if(age<=18)
				{
				  	throw new expClass("You are not a valid user for voting");
				  	
				}
				
				else
				{
					System.out.println("You are a valid voter");
				}	
			}
			
			catch(expClass mssg)
			{
				System.out.println(mssg);
			}
			
			System.out.println("Done");
			
		}
	}
public class Voting2  extends Votee
{
	
	public static void main(String args[])
	{
		Voting2 v2 = new Voting2();
		int age = v2.age();
		v2.validatedage(age);
		
		
		
	}

}
