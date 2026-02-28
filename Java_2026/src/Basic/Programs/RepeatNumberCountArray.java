package Programs;

import java.util.Scanner;

public class RepeatNumberCountArray 
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7,4,5,6,7,8,1,1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number for repetation check: ");
		int num = sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			  count++;
				
		}
		
		System.out.println("The repetative of number: "+num+ " and the count is: "+count);
	}

}
