
public class Largest2nd 
{
	public static void main(String args[])
	{
		int[] arr = {6,7,8,10,0,100,1,97,55};
		int temp;
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//for(int k=0;k<arr.length;k++)
		{
			System.out.println("The second greatest number is: "+arr[1]);
		}
	}

}
