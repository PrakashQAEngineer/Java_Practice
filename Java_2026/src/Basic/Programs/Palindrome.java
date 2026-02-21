package Programs;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String args[])
	{
		System.out.println("PLease enter the number for the Palindrome: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int res=0,pal=0;
		int num2=num1;
		
		for(int i=1;num1>0;i++)
		{
			res = num1%10;
			pal = pal*10+res;
			num1=num1/10;
		}
		
		
		if(pal==num2)
			System.out.println("The entered number  is palindrom...");
		
		else
			System.out.println("The Entered number is not palindrome...");
			
	}

}
