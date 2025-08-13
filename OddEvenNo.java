import java.util.ArrayList;

public class OddEvenNo 
{
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				even.add(arr[i]);
			
			else
				odd.add(arr[i]);
			
		}	
		int count=0;
		for(int i:even)
		{
			
			count++;
			System.out.println("The even numbers are: "+i);
		}
		System.out.println("The total number of Even numbers are: "+count);
			
	}

}
