package Programs;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String args[])
	{
		int year;
		System.out.println("Please enter the year to check the Leap year: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if((year%400==0) || (year%4==0 && year%100!=0))
		
			System.out.println("The yea is a leap year");
		
		else
			System.out.println("The year is not a leap year");
	}

}
