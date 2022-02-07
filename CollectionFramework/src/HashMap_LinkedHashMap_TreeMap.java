import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMap_LinkedHashMap_TreeMap {
	
	
	public static void main(String[] args) {
		
		
		
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treemap = new TreeMap<Integer, String>();
		
		System.out.println("---------------");
		yazdir(hashmap);
		System.out.println("---------------");
		yazdir(linkedhashmap);
		System.out.println("---------------");
		yazdir(treemap);
		
		
		
		
	}
	
	static void yazdir(Map<Integer, String> map) {
		map.put(10, "C++");
		map.put(5, "Java");
		map.put(1, "Python");
		map.put(2, "Php");
		map.put(100, "C");
		
		for(Integer i : map.keySet()) {
			System.out.println("Key : "+i+" Value : "+map.get(i));
		}
	
		/*
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key : "+entry.getKey() + " Value : "+entry.getValue());
		}
		*/
	}
	
	
	
	
	
	
	
	
	
}
