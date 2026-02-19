package Programs;

import java.util.Scanner;

public class StringReverse 
{
	public static void main(String args[])
	{
		
		String finalstr = "";
		System.out.println("Please enter the String for Reverse: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0;i<str.length();i++)
		{
		    finalstr = str.charAt(i) + finalstr;
		  
		}
		
		System.out.println(finalstr);
	}

}
