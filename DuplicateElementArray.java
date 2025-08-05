import java.util.HashSet;

public class DuplicateElementArray 
{
	public static void main(String args[])
	{
		//we are creating a programe that prints the duplicate Element from an Array
		
		// declare and initialize the array
		int[] arr = {1,2,3,4,5,6,2,8,9,99,1,3,4,20};
		
		//Creating two HashSet
		//uni will store the unique elements
		
		HashSet<Integer>uni = new HashSet<>();
		
		//dup will store the duplicate elements
		
		HashSet<Integer> dup = new HashSet<>();
		
	   //loop through each element in an array for checking the duplication array
		
		for(int i:arr)
		{
			if(uni.add(i)==false)
			{
				dup.add(i);
			}
		}	
		
		if(dup.isEmpty())
			System.out.println("There are no duplicate elemenets");
		
		else
		{
			System.out.println("Duplkicate elements are: ");
			for(int i:dup)
			{
				System.out.println(i);
			}
		}
	}

}
