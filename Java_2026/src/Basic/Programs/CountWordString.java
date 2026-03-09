package Programs;

import java.util.Scanner;

public class CountWordString 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String: ");
		String str = sc.nextLine();
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(ch==' ')
			  continue;
			 
			  else
				  count++;
				
			
		}
		
		System.out.println("The no of char are: "+count);
	}

}
