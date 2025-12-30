package Basic;

import java.util.Scanner;

public class GettingInput 
{
	public static void main(String args[])
	{
		System.out.println("Please enter your name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("The entered name is: "+name);
		
		System.out.println("\n Please enter the gender: ");
		String gen = sc.next();
		  char gender = gen.charAt(0);
		  System.out.println("The Gender is: "+gender);
		  
		  
		  System.out.println("\n Please enter the age: ");
		  int age  = sc.nextInt();
		  
		  System.out.println("The entered age is: "+age);
		  
	}

}
