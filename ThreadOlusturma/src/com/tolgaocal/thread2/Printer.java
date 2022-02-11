package com.tolgaocal.thread2;

public class Printer implements Runnable{

	private String isim;
	
	public Printer(String isim) {
		this.isim = isim;
	}
	
	
	@Override
	public void run() {
		System.out.println(isim + " calisiyor...");
		for(int i = 1; i <= 3; i++) {
			System.out.println(isim + " yaziyor : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread kesintiye ugradi...");
			}
		}
		System.out.println(isim + " işini bitirdi.");
	}
	
	
}
