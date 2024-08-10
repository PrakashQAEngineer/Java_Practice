package Java_Practice;

import java.util.Scanner;

class four_greater 
{
	public static void main(String args[])
	{
		System.out.println("Enter the first number for cheking the greatest number: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number for checking the greatest number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Please enter the third number for checking the greatest number: ");
		int num3 = sc.nextInt();
		
		System.out.println("Please enter the fourth number for checking the greates number: ");
		int num4 = sc.nextInt();
		
		System.out.println("First number: "+num1);
		System.out.println("Second number: "+num2);
		System.out.println("Third number: "+num3);
		System.out.println("Fourth number: "+num4);
		System.out.println("*******************************************************");
		
	
		if(num1>num2)
		{
			if(num1>num3)
			{
				if(num1>num4)
					System.out.println("num1 is greater then all the number");
				
				else
					System.out.println("num4 is greater than all the number");
			}
			
			else
			{
				if(num3>num4)
				{
					System.out.println("num3 is greater than all the number");
				}
				else
					System.out.println("num4 is greater than all the number");
			}
		}
		
		else
		{
			if(num2>num3)
			{
				if(num2>num4)
				{
					System.out.println("Num2 is greater than all the number");
				}
				else
				{
					System.out.println("Num4 is greater than all the number");
				}
			}
			
			else
			{
				if(num3>num4)
				{
					System.out.println("Num3 is greater than all the number");
				}
				
				else
				{
					System.out.println("Num4 is greater than all the number");
				}
			}
		}
	}

}
