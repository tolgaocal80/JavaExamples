
public class Main {
	
	
	public static void main(String[] args) {
		
		WaitNotify waitNotify = new WaitNotify();
		
		
		Thread thread = new Thread(new Runnable() {			
			@Override
			public void run() {
				waitNotify.thread1Fonksiyonu();
			}
		});
		
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				waitNotify.thread2Fonksiyonu();
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
		
		
		
		
	}
	
	
	
	
	
	
	
}
