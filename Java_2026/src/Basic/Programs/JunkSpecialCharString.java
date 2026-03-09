package Programs;

import java.util.Scanner;

public class JunkSpecialCharString 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("PLease enter the string with Junk and Special Char: ");
		String str = sc.next();
		char ch;
		String cleanstr = ""; 
		for(int i=str.length()-1; i>=0; i--)
		{
			ch = str.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				cleanstr = ch+cleanstr;
			}
		}
		
		System.out.println(cleanstr);
	}

}
