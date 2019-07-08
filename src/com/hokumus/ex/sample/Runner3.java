package com.hokumus.ex.sample;

public class Runner3 {

	private static int hesapla(int a, int b) throws MyException{
		System.out.println("hesapla geldi");
		b--;
		try {
			if (b == 0)
				throw new MyException(101,"/ by zero");
			else
				return a / b;
		} catch (RuntimeException e) {
			System.out.println("1");
		}
		return 10;
	}
	private static int hesapla2(int a, int b) throws Exception {
		System.out.println("hesapla2 geldi");
		b--;

		return a / b;
	}
	public static void main(String[] args) {
		System.out.println("baþladý");
		try {
			hesapla(5, 1);
			hesapla2(20, 1);
		} catch (ArithmeticException e) {
			System.out.println("2");
		} catch (RuntimeException e) {
			System.out.println("3");
		} catch (Exception e) {
			System.out.println("4"+ e.getMessage() +" Cause :: "+ e.getCause());
		}
		System.out.println("bitti");
	}

}
