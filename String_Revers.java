import java.util.Scanner;

public class String_Revers 
{
	public static void main(String  args[])
	{
		System.out.println("Please enter the String for reverse: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String strr = "";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			strr = ch + strr;
		}	
		
		System.out.println(strr);
	}

}
