package Practices;

import java.util.HashMap;

public class CollectionValueView {
	public static void main(String args[]){  

		   HashMap<String,String> hash_map = new HashMap<String,String>();//creating an empty hash map
		   //adding key values to the hash map
		   hash_map.put("1","Monday");
		   hash_map.put("2","Tuesday");
		   hash_map.put("3","Wednesday");
		   hash_map.put("4","Thursday");
		   hash_map.put("5","Friday");
		   hash_map.put("6","Saturday");
		   hash_map.put("7","Sunday");
		   //printing the original hash map
		   System.out.println("The original hash map is as follows : " + hash_map);
		   //printing the collection view of the hash map
		   System.out.println("The collection view is as follows : " + hash_map.values());
		 }

}
