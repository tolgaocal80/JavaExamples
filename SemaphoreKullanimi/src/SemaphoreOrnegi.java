import java.util.concurrent.Semaphore;

public class SemaphoreOrnegi {
	
	
	private Semaphore semaphore = new Semaphore(4);
	
	

	public void threadFonksiyonu(int i) {
		
		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread basliyor... ID : "+ i);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread cikiyor... ID : "+i);
		
		semaphore.release();
		
	}
	
	
	
	
	
	
	
}
