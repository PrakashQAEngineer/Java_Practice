package ArrayList;

import java.util.ArrayList;

public class AddDelUpadateArrayList1 
{
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>();
		
		//adding the element on to the array list
		al.add("MOreSand");
		al.add("HikeQA");
		al.add("HikeCommerce");
		al.add("AQM");
		
		System.out.println("The list added on the array list is: "+al);
		
		//adding element at the specific index
		al.add(0, "MOresand technologies");
		System.out.println(al);
		
		//removig element using index
		al.remove(1);
		System.out.println(al);
		
		//removing element using the value
		al.remove("AQM");
		
		System.out.println(al);
		
		//update value using the index
		al.set(2, "AQM");
		
		System.out.println(al);
		
		//get the vlaue at index
        String st =	al.get(2);
        System.out.println("The value of 2nd index is: "+st);
		
		
	}

}
