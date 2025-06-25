import java.util.Scanner;

public class Bubble_Sort_Input 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please neter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the value for: "+i);
			arr[i] = sc.nextInt();
			
		}
		
		// now we will be trying to sort the array according to the bubble sort
		int temp;
		for(int j=0;j<size;j++)
		{
			for(int k=0;k<size-1-j;k++)
			{
				if(arr[k]>arr[k+1])
				{
					temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	
	}

}
