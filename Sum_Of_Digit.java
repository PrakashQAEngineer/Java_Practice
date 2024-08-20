package Java_Practice;

import java.util.Scanner;

public class Sum_Of_Digit 
{
	public static void main(String args[])
	{
		//need to find the sum of all the digits in a number
		int sum=0,rev=0;
		System.out.println("Please enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num>0)
		{
			rev = num%10;
			sum= sum+rev;
			num=num/10;
		}
		System.out.println("The sum of the numbers are: "+sum);
		
	}

}
