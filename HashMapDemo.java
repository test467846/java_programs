import java .util.*;
import java.util.Map.Entry;

class HashMapDemo
{
	public static void main(String[] args)
	{
		HashMap<String,String> map1= new HashMap<>();
		map1.put("India","New Delhi");
		map1.put("USA","Washington DC");
		map1.put("UK","London");
		map1.put("UK","London1");
		map1.put("France","Paris");
		map1.put(null,"Berlin");
		map1.put("Russia",null);
		map1.put("Germany",null);
		map1.put(null,"Tokyo");
		
		//To get full map
		System.out.println(map1);

		//To get one entry from the map
		String capital=map1.get("India");
		System.out.println(capital);

		//To iterate map keys one by one 
		//we cannot iterate map keys directly we have to first convert map into either set or collection
		//keySet() will provide us the set of keys in the given map
		Set<String> s=map1.keySet();
		System.out.println(s);

		System.out.println("-------------------------------------------");

		//After getting Set then Iterate 
		Iterator<String> it=s.iterator();
		while(it.hasNext())
		{
			String key=it.next();
			String value=map1.get(key);
			System.out.println("Key = "+key+" value = "+value);
		}
		System.out.println("-------------------------------------------");

		//To iterate one key value pair, use entrySet() method , which will provide Set of entries 
		//Set<Map.Entry<String,String>> set= map1.entrySet();
		Set<Entry<String, String>> entrySet = map1.entrySet();
		System.out.println(entrySet);

		System.out.println("================================");

		Iterator<Entry<String,String>> it1=entrySet.iterator();
		while(it1.hasNext())
		{
			Entry<String,String> entry=it1.next();
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println("Key= "+key+" value= "+value);
		}


		 
	}
}