package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoArrayList 
{
	public static void main(String args[])
	{
		
		//mergin two differnt stream in a sorted order 
		List<String> name1 = Arrays.asList("Prakash","Aman","Lugun","Anil","Prashant","Arun");
		List<String> name2 = Arrays.asList("Jyoti","Gurdip","Aish","Anjali","Lovely");
		
		Stream<String> newStream = Stream.concat(name1.stream(), name2.stream());
		//newStream.sorted().forEach(name->System.out.println(name));
		boolean flag = newStream.anyMatch(s->s.contains("Prashant"));
		if(flag == true)
			System.out.println("All Passed");
		
		else
			System.out.println("All Fail");
	}

}
