import java.util.Scanner;

public class BibbleInput 
{
	public static void main(String args[])
	{
		System.out.println("Please enter the number of Inputs for an Array:  ");
		Scanner sc = new Scanner(System.in);
		
		//getting the size of the value for the array
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		//entering the values in the array
		for(int i=0;i<len;i++)
		{
			System.out.println("please enter the value for the index: "+i);
			arr[i] = sc.nextInt();
		}

		for(int m=0;m<len;m++)
		{
			System.out.println("Before sorting the array"+ arr[m]);
		}
		
		int temp=0;
		for(int j=0;j<len;j++)
		{
			for(int k=0;k<len-1-j;k++)
			{
				if(arr[k]>arr[k+1])
				{
					temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
		
		for(int l=0;l<len;l++)
		{
			System.out.println("After sorting the array"+ arr[l]);
		}
		
		
		
	}

}
