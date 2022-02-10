import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	
	/*
	 * QUEU da FIFO yani "ilk giren ilk cikar" mantigi vardir.
	 * Pide kuyrugu gibi.
	 */
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Java");
		queue.offer("Python");
		queue.offer("Php");
		queue.offer("C++");
		
		System.out.println(queue.peek());
		
		for (String string : queue) {
			System.out.println(string);
		}
		
		
		System.out.println("---------------");
		System.out.println("Eleman çıkarılıyor : "+ queue.poll() +" Yeni kuyruk :");
		

		for (String string : queue) {
			System.out.println(string);
		}
		
		System.out.println(queue.isEmpty());
		
		
		
	}
	
	
}
