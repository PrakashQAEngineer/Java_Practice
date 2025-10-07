package Set;

import java.util.TreeSet;

public class treeset4 
{
	public static void main(String args[])
	{
		TreeSet<String> name = new TreeSet<String>();
		name.add("a");
		name.add("b");
		name.add("c");
		name.add("d");
		name.add("f");
		name.add("e");
		name.add("b");
		name.add("a");
		
		System.out.println(name);
		
		name.remove("d");
		System.out.println(name);
		
		System.out.println(name.contains("d"));
		
		for(String str: name)
		{
			System.out.println(str);
		}
	}

}
