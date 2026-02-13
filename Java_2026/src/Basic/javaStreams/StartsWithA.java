package javaStreams;

import java.util.ArrayList;

public class StartsWithA 
{
	public static void main(String args[])
	{
		ArrayList<String> name = new ArrayList<String>();
		name.add("Prakash");
		name.add("Jyoti");
		name.add("akash");
		name.add("anamika");
		name.add("Prabhat");
		name.add("akshat");
		name.add("anu");
		
		int count = 0;
		
		for(int i=0;i<name.size();i++)
		{
			String str = name.get(i);
			if(str.startsWith("a"))
			{
				count++;
			}
		}
		
		System.out.println("The no. of names atart with A are: "+count);
	}

}
