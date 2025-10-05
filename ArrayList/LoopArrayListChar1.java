package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class LoopArrayListChar1 
{
	public static void main(String args[])
	{
		ArrayList<String> str = new ArrayList<String>();
		str.add("Prakash");
		str.add("prashant");
		str.add("Jyoti");
		str.add("Shruti");
		str.add("Rameshji");
		
		System.out.println("Before sorting the strings: "+str);
		Collections.sort(str);
		
		System.out.println("After Sorting the Strings: "+str);
		
		//looping of the arraylist
		for(String st: str)
		    System.out.println(st);
		
		
		String third = 	str.get(3);
		System.out.println(third);
		
	}

}
