import java.util.ArrayList;

public class NoOddEvenARRAYList 
{
	public static void main(String args[])
	{
		System.out.println("This is the program for printing the number of odd and even counts using ArrayList");
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			    even.add(arr[i]);
						
			else
				odd.add(arr[i]);
		}	
		
		for(int i:even)
			 System.out.println("The even numbers are: "+i);
		
		System.out.println("The total size of the even numbers are: "+even.size());
		
		System.out.print("******************************************");
		System.out.println("\n");
		for(int i:odd)
			System.out.println("The Odd numbers are: "+i);
		
		System.out.println("The total size of even numbers are: "+odd.size());
	}

}
