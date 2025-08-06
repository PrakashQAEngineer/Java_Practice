
public class FirstDuplicate_Element 
{
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,1};
		
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j] && i!=j)
				{
					System.out.println("The First duplicate element is: "+arr[i]);
					temp = temp+1;
					break;
				}
			}
			
			if(temp>1)
				break;
		}
	}

}
