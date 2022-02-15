import java.util.*;

public class ListWorker {
	
	
	Random random = new Random();
	
	ArrayList<Integer>	list = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<>();
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	@SuppressWarnings("boxing")
	public void listDegerEkle() {
		
		synchronized (lock1) {
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			list.add(random.nextInt(100));
		}

	}
	
	
	
	@SuppressWarnings("boxing")
	public void list2DegerEkle() {
		
		synchronized (lock2) {
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));	
			
		}
	}
	
	
	
	void degerAta() {
		for(int i =0; i< 1000; i++) {
			listDegerEkle();
			list2DegerEkle();
		}
	}
	
	
	
	
	public void calistir() {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				degerAta();
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				degerAta();
			}
		});
		
		long baslangic = System.currentTimeMillis();
		
		thread.start();
		thread2.start();
		
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("List1 size : "+ list.size() + " List 2 : " + list2.size());
		
		long bitis = System.currentTimeMillis();
		
		System.out.println("Gecen süre : " + (bitis - baslangic));
	}
	
	
	
}
