package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting 
{
	public static void main(String args[])
	{
		ArrayList<String> str = new ArrayList<String>();
		str.add("Moresand");
		str.add("AQM");
		str.add("HIKEQA");
		str.add("HikeCommerce");
		str.add("Google");
		
		//normal sorting
		Collections.sort(str);
		
		for(String val:str)
		{
			System.out.println(val);
		}
		
		//reversing the order
		Collections.sort(str,Collections.reverseOrder());
		 for(String sor: str)
		 {
			 System.out.println("This is the Reverse order: "+sor);
		 }
	}

}
