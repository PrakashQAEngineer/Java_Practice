package Java_Practice;

import java.util.Scanner;

public class Mul_table 
{
	public static void main(String args[])
	{
		System.out.println("Please enter the number for the tabel upto 10: ");
		Scanner sc = new Scanner(System.in);
		int tab = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
		  System.out.println(tab+"*"+i+"="+tab*i);
		}
	}

}
