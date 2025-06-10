import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram 
{
	public static boolean isAnagram(String s1, String s2)
	{
	   String str1 = s1.replaceAll(" ", ""); // here we are replacing white space with nothing
	   String str2 = s2.replaceAll(" ", ""); // here we are replacing white space with nothing
	   
	   //System.out.println(str2);
	   if(str1.length() != str2.length())
	   {
		   return false;
	   }
	   
	   else
	   {
		    char c1[] = str1.toLowerCase().toCharArray(); // converting lower case and then converting to array in char format
		    char c2[] = str2.toLowerCase().toCharArray();  // converting lower case and then converting to array in char format
		    
		    Arrays.sort(c1);
		    Arrays.sort(c2);
		    
		    return Arrays.equals(c1, c2);
		    	
	   }
	
		   
	}
	
	public static void main(String args[])
	{
		System.out.println("Please enter the first String for Anagram: ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		System.out.println("Please enter the 2nd String for Anagram: ");
		String s2 = sc.nextLine();
		
		boolean fin = isAnagram(s1,s2);
		System.out.println(fin);
	}

}
