import java.util.Arrays;
import java.util.Scanner;

public class anagram 
{
	public static void main(String args[])
	{
		System.out.println("Please enter the first String for ANagram: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		
		System.out.println("Please enter the 2nd String for anagram: ");
		String str2 = sc.next();
		
		char a[] = str1.toCharArray();
		char b[] = str2.toCharArray();
		
		
		if(a.length == b.length)
		{
			Arrays.sort(a);
			Arrays.sort(b);	
			
			for(int i=0;i<a.length;i++)
			{
				//System.out.println(a.length+"test");
				if(a[i]==b[i])
				{
					System.out.println("The entered string is an Anagram");
					//break;
				}
				
				else
					System.out.println("The enterfd string is not an Anagram");
				break;
			}	
		}
		
		else
			System.out.println("The entered string is not an Anagram");
		
		
		
		//System.out.println(a);
		//System.out.println(b);
		
		
	}		

}
