import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Random random = new Random();
		
		System.out.println("Ramazan Pdidesi Uygulamasi...");
		
		Queue<String> pideKuyrugu = new LinkedList<>();
		
		pideKuyrugu.offer("Murat");
		pideKuyrugu.offer("Hasan");
		pideKuyrugu.offer("Okan");
		pideKuyrugu.offer("Ayse");
		pideKuyrugu.offer("Merve");
		pideKuyrugu.offer("Ezgi");
		pideKuyrugu.offer("Gizem");
		pideKuyrugu.offer("Mehmet");
		pideKuyrugu.offer("Oğuz");
		pideKuyrugu.offer("Azer");
		
		int pideSayisi = random.nextInt(10);
		
		System.out.println("Pideler cikiyor");
		System.out.println("Cikan pide sayisi : "+ pideSayisi);
		Thread.sleep(2000);
		
		while(pideSayisi != 0) {
			System.out.println(pideKuyrugu.poll() + " pideyi aldi");
			pideSayisi--;
			Thread.sleep(1000);
		}
		System.out.println("Pide kalmadi.");
		
	}
	
	
	
	
}
