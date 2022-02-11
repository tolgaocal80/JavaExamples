package com.tolgaocal.thread3;

public class Main {

	public static void main(String[] args) {
		
		/*
		Thread printer1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread calisiyor...");
				for(int i = 1; i<3; i++) {
					System.out.println("Yaziyor : "+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		});
		
		printer1.start();
		*/
		
		
		new Thread ( new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread calisiyor...");
				for(int i = 1; i<3; i++) {
					System.out.println("Yaziyor : "+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		System.out.println("Main Thread calisiyor...");
		
	}

}
