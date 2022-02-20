
public class Main {
	
	public static void main(String[] args) {
		
		ReentrantLockOrnegi re = new ReentrantLockOrnegi();
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				re.thread1Fonksiyonu();
			}
		});
		
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				re.thread2Fonksiyonu();
			}
		});
		
		
		
		thread.start();
		thread2.start();
		
		
		
		try {
			thread.join();
			thread2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		re.threadOver();
		
	}
	
	
	
}
