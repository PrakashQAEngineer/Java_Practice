
public class NthLargestElement 
{
	public static void main(String args[])
	{
		int n=4, temp;
		int[] arr = {7,90,33,1,45,98,55};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
			if(i==n-1)
				break;
		}
		
		for(int k=0;k<arr.length;k++)
			System.out.println(arr[k]);
		
		System.out.println("The "+n+"th largest value of the loop is: "+arr[n-1]);
	}

}
