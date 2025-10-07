package HashMap;

import java.util.HashMap;

public class HashMapStruing1 
{
	public static void main(String args[])
	{
		HashMap<String,String> capitalCities = new HashMap<>();
		capitalCities.put("1", "Delhi");
		capitalCities.put("2", "Mumbai");
		capitalCities.put("3", "BBSR");
		capitalCities.put("4", "Patna");
		capitalCities.put("2", "Ranchi");
		
		System.out.println(capitalCities.get("2"));
		capitalCities.remove("2");
		
		for(String str : capitalCities.keySet())
		{
			System.out.println(str);
		}
	}

}
