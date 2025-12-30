package Basic;

import java.util.Scanner;

public class GettingInpur2 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the name: ");
		String name = sc.nextLine();
		
		System.out.println("Please enter the age: ");
		int age = sc.nextInt();
		
		System.out.println("Please enter the gender: ");
		char gen = sc.next().charAt(0);
		
		System.out.println("Please enter the Phone No: ");
	    long phn = sc.nextLong();
	    
	    
	    System.out.println("**********************************************");
	    
	    System.out.println("The entered name is: "+name);
	    System.out.println("the entered age is: "+age);
	    System.out.println("the entered gender is: "+gen);
	    System.out.println("The entered phn no is: "+phn);
		
		
		
	}

}
