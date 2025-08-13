import java.util.ArrayList;

public class SumCountEvenOdd 
{
	public static void main(String args[])
	{
		System.out.println("This is the program to count all the even and odd numbers with their sum....");
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			   if(arr[i]%2==0)
			   	   even.add(arr[i]);
			   
			   else
				   odd.add(arr[i]);
			   
			   
			   
		}	
		int ecount =0;
		int ocount = 0;
		for(int i:even)
		{
			ecount = ecount+i;
			System.out.println("Even numbers are: "+i);
		
		}
		
		System.out.println("\n");
		for(int j:odd)
		{
			ocount = ocount+j;
			System.out.println("Odd numbers are: "+j);
		}
		
		System.out.println("The total count sum of even numbers are: "+ecount);
		System.out.println("The Total Count sum of odd numbers are: "+ocount);
	}

}
