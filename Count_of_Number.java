package Java_Practice;

import java.util.Scanner;

public class Count_of_Number 
{
	public static void main(String args[])
	{
		int count =0;
		 System.out.println("Please enter the number: ");
		 Scanner sc = new Scanner(System.in);
		 long num = sc.nextInt();
		 
		 while(num>0)
		 {
			 num=num/10;
			 count++;
		 }
		 System.out.println("The number of Count of numbers are: "+count);
		 
	}

}
