package Java_Practice;

import java.util.Scanner;

public class Reverse_again 
{
	public static void main(String args[])
	{
		int num,res = 0, rel=0;
		System.out.println("Please enter the number for reverse: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(num>0)
		{
			res=num%10;
			rel = rel*10+res;
			num=num/10;
			
		}
		System.out.println(rel);
	}

}
