package Programs;

public class ArrayEvenOdd 
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int even=0 , odd = 0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]%2==0)
				even++;
			
			else
				odd++;
		}
		
		System.out.println("The no of even number is: "+even);
		System.out.println("The no of odd no is: "+odd);
	}

}
