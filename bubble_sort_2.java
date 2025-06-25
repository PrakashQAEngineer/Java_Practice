
public class bubble_sort_2 
{
	public static void main(String args[])
	{
		int[] arr = {27,1,89,100,4,16,67};
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The sorted elements is: "+arr[i]);
		}
	}

}
