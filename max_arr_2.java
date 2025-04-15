
public class max_arr_2 
{
	public static void main(String args[])
	{
		int[] arr = {1,2,3,9,4,5,6,7,8,12,0};
		int max = arr[0]; 
		int min = arr[0];
		for(int i =0; i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("The maximum number is: "+max);
		
		for(int j=0;j<arr.length;j++)
		{
			if(min>arr[j])
			{
				min = arr[j];
			}
		}
		System.out.println("The minimum value of the number is: "+min);
	}
}
