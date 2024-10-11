package Java_Practice;

import java.util.Scanner;

public class Calll 
{
	public static void main(String args[])
	{
		int num1, num2, res;
		char ch;
		String in;
		do
		{
		System.out.println("Please enter the first number for num1: ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		
		System.out.println("Please eneter the second number for num2");
		num2 = sc.nextInt();
		
		
		
		System.out.println("**********************************************");
		System.out.println("Please Press 1 for Add");
		System.out.println("Please Press 2 for Sub");
		System.out.println("Please Press 3 for Divide");
		System.out.println("Please Press 4 for Multiplication");
		System.out.println("**********************************************");
		//while();
		
		System.out.println("Please press the numbers from above for the calC: ");
		ch = sc.next().charAt(0);
		
		switch(ch)
		{
			case '1': res = num1+num2;
						System.out.println("The sum is: "+res);
						break;
						
			case '2': res = num1-num2;
					  System.out.println("The sub is: "+res);
					  break;
					  
			case '3': res = num1/num2;
					  System.out.println("the divide is: "+res);
					  break;
					 
			case '4': res = num1*num2;
					  System.out.println("The multiplication is: "+res);
					  break;
					  
			default: 
						System.out.println("Please enter the valid number for calculation");
					  
					  
						
		}
		System.out.println("Do you want to have more Calculation: ");
		Scanner st = new Scanner(System.in);
		in = st.next();
	}while(in.equalsIgnoreCase("y"));
	}

}
