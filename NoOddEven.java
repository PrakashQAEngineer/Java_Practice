
public class NoOddEven 
{
	public static void main(String args[])
	{
		System.out.println("This is the program for printing the number of odd and even counts ");
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int evenCount = 0;
		int oddCount = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			  evenCount++;
			
			
			else
			oddCount++;
		
				
		}
		
		System.out.println("The even numbers are: "+evenCount+" and the odd counts are: "+oddCount);
	}

}
