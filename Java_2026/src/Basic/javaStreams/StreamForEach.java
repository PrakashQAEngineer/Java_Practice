package javaStreams;

import java.util.stream.Stream;

public class StreamForEach 
{
	public static void main(String args[])
	{
		long name = Stream.of("Prakash", "Jyoti","Usha","Prabhat","Shruti").filter(s->s.startsWith("P")).count();
		
		System.out.println(name);
	}

}
