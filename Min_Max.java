
public class Min_Max 
{
	public static  void main(String args[])
	{
		int[] arr = {9,2,10,22,67,0,56};
		int max = arr[0];
		int min  = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
			   max = arr[i] ; 
			}
		}	
		
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]<min)
			{
				min = arr[j];
			}
		}
		
		System.out.println("The maximum value of the Array is: "+max);
		System.out.println("The minimumvalue of the array is : "+min);
	
	}

}
