package Programs;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String args[])
	{
		int fact = 1;
		System.out.println("Please enter the number for factorial: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=num; num>0; num--)
		{
			fact = fact*num;
		}
		
		System.out.println(fact);
	}

}
