import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockOrnegi {
	
	private int say = 0;
	
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	
	
	
	
	public void artir() {		
		for(int i =0; i<10000; i++) {
			say++;
		}		
	}
	



	public void thread2Fonksiyonu() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Scanner scanner = new Scanner(System.in);
		
		lock.lock();
		System.out.println("Thread 2 calisiyor...");
		
		artir();
		System.out.println("Devam etmek için bir tuşa basınız");
		scanner.nextLine();
		
		condition.signal();
		
		System.out.println("Thread 1 uyandırıldı...");
		
		lock.unlock();
	}


	public void thread1Fonksiyonu() {
		
		lock.lock();
		
		System.out.println("Thread 1 calısıyor...");
		
		try {
			condition.await();
			System.out.println("Thread 1 uyandırılmayı bekliyor...");
		} catch (Exception e) {
			e.printStackTrace();
			lock.unlock();
		} 
		
		System.out.println("Thread 1 uyandırıldı ve işlemine devam ediyor...");
		artir();
		
		lock.unlock();
	}




	public void threadOver() {
		System.out.println("Say değişkeninin degeri : "+ say);
	}
	
	
}
