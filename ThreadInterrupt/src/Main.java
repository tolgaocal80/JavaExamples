import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>(); 
		
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Thread calisiyor...");
				
				for(int i=0; i<10_000_000; i++) {
					
					if(Thread.currentThread().isInterrupted()) {
						System.out.println("Kesintiye ugradi..");
						return;
					}
					
					list.add(i);
					
				}
				
				System.out.println("Thread kesintiye ugramadan isini bitirdi.");
				
				/*
				for(int i=0; i<10 ; i++) {
					System.out.println("Thread yazıyor..." + i);
					try {
						Thread.sleep(1000);
						System.out.println("Uykunun " + i + ".saniyesindeyim.");
					} catch (InterruptedException e) {
						System.out.println("Uykum bölündü.");
					}
				}
				*/
				
				
			}
		});
		
		
		
		t.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t.interrupt();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
