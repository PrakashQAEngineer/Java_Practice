package Programs;

import java.util.Scanner;

public class Primeno 
{
	public static void main(String args[])
	{
		System.out.println("Please enter the no for checking the prime: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp=0;
		
		if(num==1)
		{
			System.out.println("Yes ! "+num+" is not prime no");
		}
		
		else
		{
			for(int i=2; i<=num-1;i++ )
			{
				if(num%i==0)
				{
					temp = temp+1;
					break;
				}
			}	
			
			if(temp>0)
				System.out.println("The entered number is not a prime number");
			
			else
				System.out.println("The entered number is a prime number");
		}
		
	}

}
