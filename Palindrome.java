package Java_Practice;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String args[])
	{
		int pal=0, res=0,rev=0;
		System.out.println("Please enter the number for Palindrom: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pal = num;
		while(num>0)
		{
			res=num%10;
			rev = rev*10+res;
			num=num/10;
			
		}
		System.out.println("This is the Value of rev: "+rev);
		System.out.println("This is the value of pal: "+pal);
		if(pal==rev)
			System.out.println("This is the Palindrom number ");
		
		else
			System.out.println("This is not the Palindrom number");
	}

}
