import java.util.HashSet;

public class HashSetFirstDuplicate 
{
	public static void main(String args[])
	{
		System.out.println("This is the program to get the first Dupicate element: ");
		
		int[] arr = {1,2,3,4,5,6,7,8,9,1,9,2,3,4};
		HashSet<Integer> uni = new HashSet<>();
		HashSet<Integer> dup = new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(uni.add(arr[i]) == false )
			{
				dup.add(arr[i]);
				break;
			}
		}
		
		if(dup.isEmpty())
			System.out.println("There is no duplicate elements");
		
		else
		{
			System.out.print("The First Duplicate element is:  ");
			for(int i:dup)
			{
				System.out.println(i);
			}
		}		
	}

}
