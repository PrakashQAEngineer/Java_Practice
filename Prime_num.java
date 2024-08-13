package Java_Practice;

import java.util.Scanner;

public class Prime_num 
{
	public static void main(String args[])
	{
		int temp=0;
		System.out.println("Please enter the number for cheking the prime: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num==1)
			System.out.println("The entered number is prime number");
		
		else
		{
			for(int i=2; i<=num-1;i++)
			{
				if(num%i==0)
				   temp++;
				   
				
			}
			
			if(temp>0)
				System.out.println("The number is not a prime number");
			
			else
				System.out.println("The number is prime number");
		}

	}

}
