package com.hokumus.swing.ui.thread;

public class MyThread extends Thread {
	private static int count = 0;

	private  String threadName;

	public MyThread(String name) {
		this.threadName = name;
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		incrementCounter(threadName);

	}

	private static synchronized void incrementCounter(String name) {
		for (int i = 0; i <= 10; i++) {
			count++;
			System.out.println(name + " " + count);
		}
	}

}
