package javaStreams;

import java.util.stream.Stream;

public class StreamMapUpperCase 
{
    public static void main(String args[])
    {
    	Stream.of("Prakash","Aman", "Anil", "Anjali","Prashant","Lovely","Ajit", "Akansha")
    	.filter(name->name.startsWith("A")).limit(4).map(name->name.toUpperCase()).sorted().forEach(name->System.out.println(name));
    }
	

}
