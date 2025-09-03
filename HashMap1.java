import java.util.HashMap;

public class HashMap1 
{
	public static void main(String args[])
	{
		//creating a HashMap object called capitalCities.
		
		HashMap<String,String> capitalCities = new HashMap<String, String>();
		
		//adding keys and values to the HashMap (Country,city)
		//we have use Put method to insert the value
		
		capitalCities.put("United Kingdom", "London");
		capitalCities.put("India", "New Delhi");
		capitalCities.put("USA", "Washignton");
		
		//now will be using the get method to get the values of the key.
		
		String coun= capitalCities.get("India");
		System.out.println(coun);
		
		
	}

}
