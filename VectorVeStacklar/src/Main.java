import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		
		/*
		 * 
		 * Stack ler ve Vector ler "syncronized" methodlar bulundururlar, thread safe
		 * olması gereken yerlerde, senkronize methodları, tek bir thread te işlem yapılmasını
		 * sağlarlar, yani o method bütmeden başka işlem yapılmaz.
		 * Thread güvenli veri yapılarıdır.
		 * 
		 */
		
		
		/*
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("Tolga");
		vector.add("Ocal");
		vector.add("Bad");
		vector.add("Boy");
		
		
		ListIterator<String> iterator = vector.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		Enumeration<String> enumeration = vector.elements();
		
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		*/ 
		
		Stack<String> stack = new Stack<String>();
		
	//	stack.add("Tolga");
		
		
		stack.push("Tolga");
		stack.push("Java");
		stack.push("Python");
		stack.push("Go");
		stack.push("Php");
		
		/*
		for (String string : stack) {
			System.out.println(string);
		}
		*/
		
		
		
		// Enumeration ile iterate yapalim.
		 
		Enumeration<String> enumeration = stack.elements();
		
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
		System.out.println("Son eleman cikariliyor : "+ stack.pop());
		
		/*
		while(stack.elements().hasMoreElements()) {
			System.out.println(stack.elements().nextElement());
		}
		*/
		
		for (String string : stack) {
			System.out.println(string);
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
