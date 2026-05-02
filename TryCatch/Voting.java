package TryCatch;

import java.util.Scanner;

 class ageException extends RuntimeException
	{
	ageException(String msg)
		{
			super(msg);
		}
	}
	
	public class Voting
	{
		public static void main(String args[])
		{
			System.out.println("Please enter your age: ");
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			
			try
			{
				if(age<18)
				{
					throw new ageException("You are not elegible for voting");
				}
				
				else
					System.out.println("You Can Vote Successfully");	
			}
			
			catch(ageException msg)
			{
				//msg.printStackTrace();
				// or we can use to get only the exception mssg
				System.out.println(msg);
			}
			
			finally
			{
				sc.close();
			}
			System.out.println("Hello");
			
		}
	}
	


