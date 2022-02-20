
public class Main {

	public static void main(String[] args) {

		SemaphoreOrnegi semaphoreOrnegi = new SemaphoreOrnegi();

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				semaphoreOrnegi.threadFonksiyonu(1);
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				semaphoreOrnegi.threadFonksiyonu(2);
			}
		});

		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				semaphoreOrnegi.threadFonksiyonu(3);
			}
		});

		Thread thread4 = new Thread(new Runnable() {

			@Override
			public void run() {
				semaphoreOrnegi.threadFonksiyonu(4);
			}
		});

		Thread thread5 = new Thread(new Runnable() {

			@Override
			public void run() {
				semaphoreOrnegi.threadFonksiyonu(5);
			}
		});
		
		
		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		
		try {
			thread.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
