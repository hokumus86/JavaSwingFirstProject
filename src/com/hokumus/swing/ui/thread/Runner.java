package com.hokumus.swing.ui.thread;

public class Runner {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <100; i++) {
					System.out.println("t2 thread " +i);
				}
				
			}
		});
		t2.start();
	}

}
