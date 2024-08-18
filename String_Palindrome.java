package Java_Practice;

import java.util.Scanner;

public class String_Palindrome 
{
	public static void main(String args[])
	{
		char ch;
		String rev = "";
		System.out.println("Please enter the string for reverse: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String or_str = str;
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			rev  = ch+rev;
		}
		//System.out.println(rev);
		
		if(or_str.equalsIgnoreCase(rev))
		{
			System.out.println("The string is Palindrome");
		}
		else
			System.out.println("The string is not Palindrome");
	}


}
