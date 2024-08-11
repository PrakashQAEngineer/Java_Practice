package Java_Practice;

import java.util.Scanner;

public class fact_number 
{
	public static void main(String args[])
	{
		long fact=1;
		System.out.println("Please enter the number for factorial: ");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		for(int i=num; i>0; i--)
		{
			fact = fact*i;
		}
		System.out.println("The factorial of: "+num+" is: "+fact);
	}

}
