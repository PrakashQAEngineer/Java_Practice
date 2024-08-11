package Java_Practice;

import java.util.Scanner;

public class Claculatiorr 
{
	public static void main(String args[])
	{

		int num1, num2, res=0;
		char in;
		String ch;
		do
		{
			
			System.out.println("Please enter the first number: ");
			Scanner sc = new Scanner(System.in);
			num1 = sc.nextInt();
			
			System.out.println("Please enter the second number: ");
			num2 = sc.nextInt();	
			
			System.out.println("******************************************");
			System.out.println("Press 1 for ADD");
			System.out.println("Press 2 for SUB");
			System.out.println("Press 3 for DIV");
			System.out.println("Press 4 for MUL");
			System.out.println("******************************************");
			

			Scanner sttr = new Scanner(System.in);
			in = sttr.next().charAt(0);
			
			switch(in)
			{
				case '1': res = num1+num2;
				  		System.out.println("The sum of the two number is: "+res);
				  		break;
				  		
				case '2': res = num1-num2;
						System.out.println("The div of two number is: "+res);
						break;
						
				case '3': res = num1/num2;
						System.out.println("The div of two number is: "+res);
						break;
						
				case '4': res = num1*num2;
						System.out.println("The Mul of two number is: "+res);
						break;
						
				default: System.out.println("You have entered an incorrect Input!! Please enter the correct input....");
						 break;	
			}		
			
			System.out.println("Do you want to have more Calculation: ");
			Scanner st = new Scanner(System.in);
			ch = st.next();
		}while(ch.equalsIgnoreCase("Y"));
		
		
		
		
		
	}

}
