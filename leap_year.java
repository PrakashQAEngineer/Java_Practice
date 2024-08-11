package Java_Practice;

import java.util.Scanner;

public class leap_year 
{
	public static void main(String args[])
	{
		System.out.println("please enter the number for checking the Leap year: ");
		Scanner sc = new Scanner(System.in);
		int leap = sc.nextInt();
		
		if(leap%4==0)
		{
			if(leap%100==0)
			{
				if(leap%400==0)
				{
					System.out.println("the entered number is a leap year");
				}
				else
					System.out.println("the entered number is not a leap year");
			}
			else
				System.out.println("the entered number is a leap year");
		}
		
		else
			System.out.println("The enter year is not a leap year");
		
	}

}
