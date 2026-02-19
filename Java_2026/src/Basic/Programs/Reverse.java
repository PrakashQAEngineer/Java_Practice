package Programs;

import java.util.Scanner;

public class Reverse 
{
	public static void main(String args[])
	{
		System.out.println("Please enter the number for reversing it: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum=0, res = 0;
		for(int i=0; num>0; i++)
		{
			sum = num%10;
			res = res*10+sum;
			num=num/10;
		}
		
		System.out.println(res);
	}

}
