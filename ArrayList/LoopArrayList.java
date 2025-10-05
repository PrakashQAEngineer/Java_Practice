package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class LoopArrayList 
{
	public static void main(String args[])
	{
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		num1.add(1);
		num1.add(2);
		num1.add(3);
		num1.add(4);
		num1.add(1);
		num1.add(0);
		num1.add(9);
		num1.add(7);
		
		System.out.println("Before sorting the elements: "+num1);
		
		//sorting the array
		Collections.sort(num1);
		
		System.out.println("After sorting the elements: "+num1);
		
		for(int num2: num1)
		{
			System.out.println("Its in the loop " +num2);
		}
		
		
	}

}
