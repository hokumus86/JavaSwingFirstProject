package com.hokumus.swing.ui.comp;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;

public class Ekran extends JFrame {
	private JTextField txtBasic;
	private JTextArea txtArea;
	private JLabel lblKullanc;
	private JRadioButton rdbtnFemale;
	private JTable table;
	private JTextField txtDd;
	private JTextField txtTt;
	private JButton btnTkla;
	private JTextField txtDers;
	private JSpinner spinner;
	private JProgressBar prbar;
	private JButton btnDoldur;

	public Ekran() {
		intialize();
	}

	private void intialize() {
		setTitle("components using");
		Dimension d = new Dimension();
		d.height = 300;
		d.width = 250;
		setSize(new Dimension(412, 780));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		txtBasic = new JTextField();
		txtBasic.setBounds(34, 11, 71, 41);
		getContentPane().add(txtBasic);
		txtBasic.setColumns(10);

		txtArea = new JTextArea();
		txtArea.setBounds(34, 73, 71, 50);
		getContentPane().add(txtArea);

		JButton btnIslem = new JButton("New button");
		btnIslem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.append("Hüseyin \n");
				txtArea.append("Semih \n");
				txtArea.append("Bilge \n");
				txtArea.append("Utku ");
				txtBasic.setText("Deneme \n Saçma");
				lblKullanc.setText("Týklandý");
			}
		});
		btnIslem.setBounds(34, 282, 91, 23);
		getContentPane().add(btnIslem);

		lblKullanc = new JLabel("Kullan\u0131c\u0131");
		lblKullanc.setBounds(133, 24, 101, 28);
		getContentPane().add(lblKullanc);

		EgitDuz[] egtd = new EgitDuz[6];
		egtd[0] = new EgitDuz(1, "");
		egtd[1] = new EgitDuz(2, "Ýlk Okul");
		egtd[2] = new EgitDuz(3, "Orta Okul");
		egtd[3] = new EgitDuz(4, "Lise");
		egtd[4] = new EgitDuz(5, "Lisans");
		egtd[5] = new EgitDuz(6, "Y. Lisans");

		JComboBox cmbEgtD = new JComboBox(egtd);
		cmbEgtD.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblKullanc.setText("" + ((EgitDuz) cmbEgtD.getSelectedItem()).getKod());
			}
		});
		cmbEgtD.setBounds(133, 89, 122, 22);
		getContentPane().add(cmbEgtD);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Veri", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(27, 157, 207, 88);
		getContentPane().add(panel);
		panel.setLayout(null);

		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (rdbtnMale.isSelected())
					rdbtnFemale.setSelected(false);
			}
		});
		rdbtnMale.setBounds(6, 23, 54, 23);
		panel.add(rdbtnMale);

		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (rdbtnFemale.isSelected())
					rdbtnMale.setSelected(false);

			}
		});
		rdbtnFemale.setBounds(74, 23, 86, 23);
		panel.add(rdbtnFemale);

		rdbtnMale.setSelected(true);
		rdbtnFemale.setSelected(true);

		JCheckBox chckbxEvli = new JCheckBox("Evli");
		chckbxEvli.setBounds(6, 58, 97, 23);
		panel.add(chckbxEvli);

		JCheckBox chckbxBekar = new JCheckBox("Bekar");
		chckbxBekar.setBounds(105, 58, 97, 23);
		panel.add(chckbxBekar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(19, 316, 272, 206);
		getContentPane().add(scrollPane);
		String[] columnNames = { "TC", "Ad Soyad" };
		String[][] data = { { "s12321321", "hüseyin" }, { "123123", "Semih" }, { "12321312", "Bilge" },
				{ "3432432", "Utku" }, { "s12321321", "hüseyin" }, { "123123", "Semih" }, { "12321312", "Bilge" },
				{ "3432432", "Utku" }, { "s12321321", "hüseyin" }, { "123123", "Semih" }, { "12321312", "Bilge" },
				{ "3432432", "Utku" }, { "s12321321", "hüseyin" }, { "123123", "Semih" }, { "12321312", "Bilge" },
				{ "3432432", "Utku" } };
		DefaultTableModel model = new DefaultTableModel(data, columnNames);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				txtDd.setText("" + table.getValueAt(row, 0));
				txtTt.setText("" + table.getValueAt(row, 1));
			}
		});
		table.setModel(model);
		scrollPane.setViewportView(table);

		txtDd = new JTextField();
		txtDd.setBounds(39, 621, 86, 20);
		getContentPane().add(txtDd);
		txtDd.setColumns(10);

		txtTt = new JTextField();
		txtTt.setBounds(148, 621, 86, 20);
		getContentPane().add(txtTt);
		txtTt.setColumns(10);
		getContentPane().add(getBtnTkla());
		getContentPane().add(getTxtDers());
		getContentPane().add(getSpinner());
		getContentPane().add(getPrbar());
		getContentPane().add(getBtnDoldur());

	}

	private JButton getBtnTkla() {
		if (btnTkla == null) {
			btnTkla = new JButton("t\u0131kla");
			btnTkla.setBounds(164, 282, 91, 23);
		}
		return btnTkla;
	}

	private JTextField getTxtDers() {
		if (txtDers == null) {
			txtDers = new JTextField();
			txtDers.setBounds(164, 251, 86, 20);
			txtDers.setColumns(10);
		}
		return txtDers;
	}

	private JSpinner getSpinner() {
		if (spinner == null) {
			spinner = new JSpinner();
			spinner.setBounds(221, 29, 70, 23);
		}
		return spinner;
	}

	private JProgressBar getPrbar() {
		if (prbar == null) {
			prbar = new JProgressBar();
			prbar.setBounds(10, 557, 150, 16);
		}
		return prbar;
	}

	private JButton getBtnDoldur()   {
		if (btnDoldur == null) {
			btnDoldur = new JButton("Doldur");
			btnDoldur.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				prbarStart(e);

				}
			});
			btnDoldur.setBounds(207, 557, 91, 23);
		}
		return btnDoldur;
	}

	protected void prbarStart(ActionEvent e) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 100; i++) {
					prbar.setValue(i);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});
		t1.start();
		
	}
}
