package Java_Practice;

import java.util.Scanner;

public class Rev_String 
{
	public static void main(String args[])
	{
		char ch;
		String rev = "";
		System.out.println("Please enter the String for reversing: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			rev = ch+rev;
		}
		System.out.println(rev);
		
	}

}
