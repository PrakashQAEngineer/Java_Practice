
public class Second_Largest 
{
	public static void main(String args[])
	{
		int[] arr = {67,89,44,55,67,88,9,44,33,12,56,50};
		
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
		
		
		for(int k=0;k<arr.length;k++)
		{
			System.out.println("Sorted Elements are: "+arr[k]);
		}
		
		
		{
			System.out.println("Second Largest Elements are: "+arr[1]);
		}
	
		
		
	}

}
