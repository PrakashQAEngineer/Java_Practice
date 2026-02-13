package javaStreams;

import java.util.stream.Stream;

public class OptimizedStream 
{
	public static void main(String args[])
	{
		Long str = Stream.of("prakash","akash","prashant","radhika").filter(s->s.contains("sh")).count();
		System.out.println("The number of sh contains in name are: "+str);
	}

}
