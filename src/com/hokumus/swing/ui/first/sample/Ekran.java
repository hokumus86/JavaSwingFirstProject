package com.hokumus.swing.ui.first.sample;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ekran extends JFrame {
	private JTextField txtKAdi;
	private JTextField txtSifre;
	private JPasswordField passwordField;

	public Ekran() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(100, 500, 200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ýlk Ekran");
		getContentPane().setLayout(null);

		txtKAdi = new JTextField();
		txtKAdi.setBounds(120, 39, 86, 20);
		getContentPane().add(txtKAdi);
		txtKAdi.setColumns(10);

		JLabel lblKadi = new JLabel("Kullan\u0131c\u0131 Ad\u0131");
		lblKadi.setBounds(22, 42, 88, 14);
		getContentPane().add(lblKadi);

		JLabel lblSifre = new JLabel("\u015Eifre");
		lblSifre.setBounds(22, 81, 88, 14);
		getContentPane().add(lblSifre);

		txtSifre = new JTextField();
		txtSifre.setBounds(120, 78, 86, 20);
		getContentPane().add(txtSifre);
		txtSifre.setColumns(10);
		
		
		JLabel lblSonuc = new JLabel("Sonuc");
		lblSonuc.setBounds(10, 214, 240, 34);
		getContentPane().add(lblSonuc);

		JButton btnGiris = new JButton("Giri\u015F");
		btnGiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtKAdi.getText().equals("hokumus")) {
					if(txtSifre.getText().equals("1")) {
						lblSonuc.setText("Giriþ Baþarýlý");
					}
					else {
						lblSonuc.setText("Þifre hatalý");
					}
				}
				else {
					int sonuc =JOptionPane.showConfirmDialog(Ekran.this, "Kullanýcý Adý Hatalý");
					if(sonuc == JOptionPane.YES_OPTION) {
						lblSonuc.setText("yese basýldý");
					}
				}
			}
		});
		btnGiris.setBounds(22, 151, 91, 23);
		getContentPane().add(btnGiris);

		JButton btnIptal = new JButton("\u0130ptal");
		btnIptal.setBounds(137, 151, 91, 23);
		btnIptal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		getContentPane().add(btnIptal);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(120, 109, 86, 20);
		getContentPane().add(passwordField);

		
	}
}
