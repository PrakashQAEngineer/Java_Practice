import java.util.Scanner;

public class one_to_100_prime 
{
	public static void main(String args[])
	{
		System.out.println("Please enter the number to check till the number is prime or not: ");
		Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 int temp=0;
		 
		 for(int i=1;i<=num;i++)
		 {
			 for(int j=2; j<=i-1;j++)
			 {
				 if(i%j==0)
				 {
					 temp=temp+1;
				 }
			 }
			 if(temp==0)
				 System.out.println(i);
			 
			 else
				 temp=0;

		 }
		  
	}

}
