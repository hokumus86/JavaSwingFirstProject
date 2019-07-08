package com.hokumus.ex.sample;

public class MyException extends Exception {

	private int hataKodu;
	private String message;

	public int getHataKodu() {
		return hataKodu;
	}

	public void setHataKodu(int hataKodu) {
		this.hataKodu = hataKodu;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MyException(int hataKodu, String message) {
		super(message , new Throwable("0 geldi "));
		this.hataKodu = hataKodu;
		this.message = message;
	};

}
