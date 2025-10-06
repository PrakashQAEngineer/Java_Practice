package Set;

import java.util.TreeSet;

public class TreesetString2 
{
	public static void main(String args[])
	{
		TreeSet<String> str = new TreeSet<String>();
		str.add("Prakash");
		str.add("Singh");
		str.add("Rajput");
		str.add("Odisha");
		
		System.out.println(str);
		
		for(String name: str)
		{
			System.out.println(name);
		}
		
		str.remove("Prakash");
		System.out.println(str);
	}

}
