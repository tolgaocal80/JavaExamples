import java.util.Scanner;

public class WaitNotify {
	
	
	private Object lock = new Object();
	
	
	public void thread1Fonksiyonu() {
		
		synchronized (lock) {
			System.out.println("Thread 1 çalısıyor");
			System.out.println("Thread 1 Thread 2'nin kendisini uyandırmasını bekliyor.");
			
			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Thread 1 uyandı. Devam ediliyor...");
		}		
	}
	
	
	
	
	public void thread2Fonksiyonu() {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized (lock) {
			System.out.println("Thread 2 çalışıyor...");
			System.out.println("Devam etmek için bir tusa basın");
			
			scanner.nextLine();
			
			lock.notify();
			
			System.out.println("Thread 1 uyandırıldı..");
		}
	}
	
	
	
	
	
	
	
	
}
