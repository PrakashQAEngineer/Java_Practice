package Java_Practice;

import java.util.Scanner;

public class Even_odd 
{
	public static void main(String args[])
	{
		System.out.println("Please enter the number for even and odd: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2==0)
		   System.out.println("The number is the even number");
		
		else
			System.out.println("The number is the odd number");
		
	}

}
