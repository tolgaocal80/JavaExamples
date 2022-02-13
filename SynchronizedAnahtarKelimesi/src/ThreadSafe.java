
public class ThreadSafe {
	
	private int count;
	
	public synchronized void artir() {
		count++; 
	}
	
	public void threadleriCalistir() {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i< 5000; i++) {
					artir();
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i< 5000; i++) {
					artir();
				}
			}
		});
		
		thread.start();
		thread2.start();
		
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count degisken deger : "+ count);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ThreadSafe safe = new ThreadSafe();
		safe.threadleriCalistir();
	}
	
	
	
	
	
	
}


