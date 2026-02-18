package Programs;

import java.util.Scanner;

public class Swap_Two_Numbers 
{
	public static void main(String args[])
	{
		int num1, num2;
		
		System.out.println("Please enter the number 1: ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		
		System.out.println("Please enter the 2nd number: ");
		num2 = sc.nextInt();
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("After Swapping num1: "+num1+ " After swapping num2: "+num2);
	}

}
