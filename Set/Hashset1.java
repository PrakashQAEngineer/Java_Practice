package Set;

import java.util.HashSet;

public class Hashset1 
{
	public static void main(String args[])
	{
		HashSet<String> str = new HashSet<String>();
		str.add("Prakash");
		str.add("Singh");
		str.add("Rajput");
		str.add("Singh");
		str.add("Odisha");
		
		System.out.println(str);
		
		boolean chk = str.contains("Odisha");
		System.out.println(chk);
		
		
	}

}
