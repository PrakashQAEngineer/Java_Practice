import java.util.Scanner;

public class Prime_numm 

{
	public static void main(String args[])
	{
		System.out.println("Please eneter ethe number for checking the number is Prime or not: ");
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
			System.out.println("The number is not Prime");
		
		else
			System.out.println("Th enumber is Prime");
	}

}
