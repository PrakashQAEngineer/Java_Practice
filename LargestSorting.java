
public class LargestSorting 
{
	public static void main(String args[])
	{
		int[] arr = {67,55,10,1,89,100};
		int temp;
		int k=3; //it is being used for that largest number. 
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}	
		
		//using for that largest number.
		System.out.println("The Third largest number is: "+arr[k-1]);
	}

}
