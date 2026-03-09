package Programs;

import java.util.Scanner;

public class String_Palindrom 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("PLease enter the String for Palindrome: ");
		String str = sc.next();
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		
		if(rev.equalsIgnoreCase(str))
			System.out.println("Its a Palindrome number");
		
		else
			System.out.println("Its not a palindrom number");
	}

}
