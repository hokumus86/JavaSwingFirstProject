package com.hokumus.ex.sample;

public class Runner {
	
	public static void main(String[] args) {
		try {
			int a = 5/0;
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		for (int i = 0; i < 100; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println("Bekliyor");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
