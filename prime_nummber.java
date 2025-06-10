import java.util.Scanner;

public class prime_nummber 
{
	public static void main(String args[])
	{
		System.out.println("Please enter the number for checking of Prime number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 0;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
			System.out.println("The number is not prime");
		
		else
			System.out.println("The number is Prime");
	}

}
