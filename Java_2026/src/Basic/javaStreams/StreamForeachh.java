package javaStreams;

import java.util.stream.Stream;

public class StreamForeachh 
{
	public static void main(String args[])
	{
	       Stream.of("prakash","anil","aman","prashant","kushal").filter(name->name.length()>4).limit(1)
				.forEach(name->System.out.println(name));
	       
	       
		
	}

}
