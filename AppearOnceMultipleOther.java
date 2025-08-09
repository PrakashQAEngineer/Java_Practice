
public class AppearOnceMultipleOther 
{
	public static void main(String args[])
	{
		System.out.println("Find The Element That Appears Once In An Array Where Every Other Element Appears Twice in Java");
		
		// the logic is using with the XOR operator ^, 
		//and in this the multiple repeated number will be 
		//grouped and the single lement will be printed 
		//because of non repeatuing and it will give value as the same number with nonn repeated
		
		int[] arr = {1,2,3,4,5,1,2,3,4};
		
		int res = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			res = res^arr[i];
		}
		
		System.out.println("The non-repeating value is: "+res);
	}	

}
