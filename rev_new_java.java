import java.util.Scanner;

public class rev_new_java 
{
	public static void main(String args[])
	{
		System.out.println("Please enter the number for the reverese: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int res = 0;
		int rev=0;
		while(num!=0)
		{
			res=num%10;
			rev = rev*10+res;
			num=num/10;
			
		}
		System.out.println(rev);
		     
	}

}
