package Java_Practice;

import java.util.Scanner;

public class swap_2 
{
	//swaping two numbers using 2 variables only
	
	public static void main(String args[])
	{
		System.out.println("please enter the first number for swapping: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.println("Please enter the 2nd number for swapping: ");
		int num2 = sc.nextInt();
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1=num1-num2;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
	}

}
