
public class Desc_sort 
{
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4,9,8,7,6,5};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			
			
		}
		System.out.println();
		System.out.println("The 2nd largets number is: "+arr[1]);
	}

}
