package com.hokumus.swing.ui.thread;

public class Runner1 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("Thread 1");
		//t1.setName("Thread 1");
		t1.start();
		MyThread t2 = new MyThread("Thread 2");
		//.setName("Thread 2 ");
		t2.start();

	}

}
