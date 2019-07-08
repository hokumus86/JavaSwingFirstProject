package com.hokumus.ex.sample;

public class Runner1 {

	public static void main(String[] args) {
		System.out.println("Baþladý");
		try {
			int a = 5;
			int b = 1;
			int sonuc = hesapla(a, b);

			int[] dizi = new int[2];
			dizi[2] = 4;

		} catch (ArithmeticException e) {
			System.out.println("1");
			//e.printStackTrace();
		} catch (RuntimeException e) {
			System.out.println("2");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("3");
			e.printStackTrace();
		}
		hesapla2(4, 0);
		System.out.println("Bitti");
	}

	private static int hesapla(int a, int b) {
		System.out.println("hesapla geldi");
		b--;
		if (b == 0)
			throw new ArithmeticException("/ by zero");
		else
			return a / b;
	}

	private static int hesapla2(int a, int b) throws RuntimeException {
		System.out.println("hesapla2 geldi");
		return a / b;

	}

}
