import java.util.Scanner;

public class Input2ndLargest 
{
	public static void main(String args[])
	{
		System.out.println("Please enter the size of the Array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++)
		{
			
			System.out.println("Please enter the value for array : "+i);
			arr[i]  = sc.nextInt();
		}
		
		for(int j=0;j<size;j++)
		{
			System.out.println(arr[j]);
		}
		
		// now sorting the array in descending order
		
		int temp;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}	
		}
		
		System.out.println("The second larget number is: "+arr[1]);
	
	}

}
