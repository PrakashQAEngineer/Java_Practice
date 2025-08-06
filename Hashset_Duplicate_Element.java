import java.util.HashSet;

public class Hashset_Duplicate_Element 
{
	public static void main(String args[])
	{
		 //int[] arr = {6,7,8,9,1,22,1,6,7,8,99,0,5,4,77,00};
		 int[] arr = {6,7,8,9,1,22};
		 
		 HashSet<Integer>uni = new HashSet<>();
		 HashSet<Integer>dup = new HashSet<>();
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 if(uni.add(arr[i])==false)
			 {
				  dup.add(arr[i]);
			 }	 
		 }
		 
		 if(dup.isEmpty())
		 {
			 System.out.println("There are not duplicate element in the array-------");
		 }
		 
		 else
		 {
			System.out.println("The duplicate elements are: ");
			for(int i:dup)
			{
				System.out.println(i);
			}
		 }
	}	

}
