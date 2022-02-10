import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		
		Queue<Hasta> acilServis = new PriorityQueue<Hasta>();
		
		acilServis.offer(new Hasta("Murat Bey", "Yanık"));
		acilServis.offer(new Hasta("Okan Bey", "Baş Ağrısı"));
		acilServis.offer(new Hasta("Elif Hanım", "Apandisit"));
		acilServis.offer(new Hasta("Oğuz Bey", "Yanık"));
		acilServis.offer(new Hasta("Sefa Bey", "Yanık"));
		acilServis.offer(new Hasta("Gizem", "Apandisit"));
		
		int i = 1;
		
		while(!acilServis.isEmpty()) {
			System.out.println("----------------------");
			System.out.println(i + ". sırada");
			System.out.println(acilServis.poll());
			System.out.println("----------------------");
			i++;
		}
		
		
		
	}
	
	
	
	
	
}
