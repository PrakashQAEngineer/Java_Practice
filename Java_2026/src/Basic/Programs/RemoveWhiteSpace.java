package Programs;

import java.util.Scanner;

public class RemoveWhiteSpace 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String with White Space: ");
		String str = sc.nextLine();
		char ch;
		String newStr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			ch = str.charAt(i);
			if(ch!=' ')
			{
				newStr = ch+newStr;
			    
			}
				
		}
		
		System.out.println(newStr);
	}

}
