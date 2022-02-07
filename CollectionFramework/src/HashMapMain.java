import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapMain {
	
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(10, "Java");
		hashMap.put(20, "Python");
		hashMap.put(50, "Php");
		hashMap.put(34, "Kotlin");
		
		hashMap.put(15, "Php");
		
		// key degerleri önemli, aynı key degerli eleman girilerse,
		// son girilen elemanı, eskisinin yerine update eder.
		
	//	System.out.println(hashMap);
		
	//	System.out.println(hashMap.keySet());
		
		for (Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Key : "+entry.getKey() + " Value : "+entry.getValue());
		}
		
		System.out.println("-------------------");
		
		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Key : "+entry.getKey() + " Value : "+entry.getValue());
		}
		
		
	}
	
	
	
	
	
	
	
	
}
