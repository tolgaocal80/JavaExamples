import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
	
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Python");
		list.add("C++");
		
		
		System.out.println(list.get(0));
		
		System.out.println(list.get(2));
	//	System.out.println(list.get(4));
		
		
	}
	
}
