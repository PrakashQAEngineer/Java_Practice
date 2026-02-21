package Programs;

import java.util.Scanner;

public class Fibnocci_Series 
{
	public static void main(String args[])
	{
		System.out.println("PLeae enter the number till fibnocii series:  ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1=0, num2=1;
		int sum=0;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=0;i<=num;i++)
		{
		   sum=num1+num2;
		   num1=num2;
		   num2=sum;
		   
		   System.out.println(sum);
		}
		
		
	}

}
