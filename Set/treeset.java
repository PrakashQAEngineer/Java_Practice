package Set;

import java.util.TreeSet;

public class treeset 
{
	//this is used for no duplictes and sorted saved
	public static void main(String args[])
	{
		TreeSet<Integer> in = new TreeSet<Integer>();
		in.add(8);
		in.add(7);
		in.add(6);
		in.add(5);
		in.add(4);
		in.add(3);
		in.add(2);
		in.add(1);
		in.add(7);
		
		System.out.println(in);
		
		boolean chk = in.contains(3);
		System.out.println(chk);
		
		in.remove(3);
		System.out.println(in);
	}

}
