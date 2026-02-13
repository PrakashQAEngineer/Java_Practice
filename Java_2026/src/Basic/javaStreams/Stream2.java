package javaStreams;

import java.util.ArrayList;

public class Stream2 
{
	public static void main(String args[])
	{
		ArrayList<String> name = new ArrayList<String>();
		name.add("prakash");
		name.add("jyoti");
		name.add("Kaminder");
		name.add("prabhat");
		
		long str = name.stream().filter(s->s.startsWith("p")).count();
		System.out.println("the name that start with p count is: "+str);
		
	
	}

}
