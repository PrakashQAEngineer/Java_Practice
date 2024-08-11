package Java_Practice;

import java.util.Scanner;

public class Multiplication_Table 
{
	public static void main(String args[])
	{
		System.out.println("Please enter the number for finding the multiplication: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num1+"*"+i+"="+num1*i);
		}
	}

}
