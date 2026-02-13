package javaStreams;

import java.util.ArrayList;

public class Stream1 
{
	public static void main(String args[])
	{
		//here we are using JavaStream
		//and here we will define two types of java stream
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("akash");
		name.add("Nishant");
		name.add("Prakash");
		name.add("akansha");
		name.add("prakshit");
		
		Long cou = name.stream().filter(s->s.startsWith("n")).count();
		System.out.println("The no of Count of name that starts with a is: "+cou);
		
	}

}
