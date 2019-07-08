package com.hokumus.swing.ui.comp;

public class EgitDuz {
	
	private int kod;
	private String adi;
	public int getKod() {
		return kod;
	}
	public void setKod(int kod) {
		this.kod = kod;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public EgitDuz(int kod, String adi) {
		this.kod = kod;
		this.adi = adi;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  adi;
	}

}
