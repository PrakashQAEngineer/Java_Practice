
public class Max_val_1 
{
	public static void main(String args[])
	{
		int[]  arr = {1,2,3,4,97,6,7,8,9,67,76,98};
		int max= arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("The max number of value is: "+max);
		
		// findig the minimum value
		
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println("The minimum of the number is: "+min);
	}
	  

}
