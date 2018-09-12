/*
 * BookAdd.java
 *
 * Created on __DATE__, __TIME__
 */

package maylor.system.ui;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JOptionPane;

import maylor.system.factory.DAOFactory;
import maylor.system.util.DateUtil;
import maylor.system.model.Book;

/**
 * 
 * @author __USER__
 */
public class BookAdd extends javax.swing.JFrame {

	private static final long serialVersionUID = -4036478391423600029L;

	public BookAdd() {
		super("Library Book Add");
		Image ime = Toolkit.getDefaultToolkit().getImage(
				("/images/ico.png"));
		setIconImage(ime);
		initComponents();
		this.setResizable(false);
		setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jComboBox1 = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jLabel1.setText("\u6dfb\u52a0\u56fe\u4e66\u4fe1\u606f");

		jLabel2.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel2.setText("\u7f16       \u53f7\uff1a");

		jLabel3.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel3.setText("\u540d       \u79f0\uff1a");

		jLabel4.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel4.setText("\u4f5c       \u8005\uff1a");

		jLabel5.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel5.setText("\u7c7b      \u522b\uff1a");

		jLabel6.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel6.setText("\u4ef7      \u683c\uff1a");

		jLabel7.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel7.setText("\u7b80       \u8ff0\uff1a");

		jLabel8.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel8.setText("\u51fa\u7248\u65e5\u671f\uff1a");

		jTextField1.setFont(new java.awt.Font("΢���ź�", 0, 14));

		jTextField2.setFont(new java.awt.Font("΢���ź�", 0, 14));

		jTextField3.setFont(new java.awt.Font("΢���ź�", 0, 14));

		jTextField5.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});

		jTextField6.setFont(new java.awt.Font("΢���ź�", 0, 14));

		jTextArea1.setColumns(20);
		jTextArea1.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jTextArea1.setLineWrap(true);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jButton1.setBackground(new java.awt.Color(223, 216, 216));
		jButton1.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jButton1.setText("save");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(223, 216, 216));
		jButton2.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jButton2.setText("close");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(223, 216, 216));
		jButton3.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jButton3.setText("reset");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jComboBox1.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"�Ļ�����ѧ������������", "���Ρ�����", "ũҵ��ѧ", "�����ѧ", "����", "��ѧ", "��ѧ",
				"�����", "���ԡ�����", "����ѧ��������ѧ", "ҽѧ������", "�ۺ���ͼ��", "����" }));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(111, 111, 111)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel2)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel3)
																				.addComponent(
																						jLabel4)
																				.addComponent(
																						jLabel5)
																				.addComponent(
																						jLabel6)
																				.addComponent(
																						jLabel8)
																				.addComponent(
																						jLabel7))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jComboBox1,
																						0,
																						227,
																						Short.MAX_VALUE)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jButton1)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																										16,
																										Short.MAX_VALUE)
																								.addComponent(
																										jButton3)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jButton2))
																				.addComponent(
																						jTextField2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						227,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField3,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						227,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField5,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						227,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField6,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						227,
																						Short.MAX_VALUE)
																				.addComponent(
																						jScrollPane1,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						227,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField1,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						227,
																						Short.MAX_VALUE))))
								.addGap(146, 146, 146))
				.addGroup(
						layout.createSequentialGroup().addGap(228, 228, 228)
								.addComponent(jLabel1)
								.addContainerGap(223, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addGap(47, 47, 47)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(
														jTextField3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel5,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jComboBox1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel6)
												.addComponent(
														jTextField5,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel8)
												.addComponent(
														jTextField6,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(11, 11, 11)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel7)
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														92,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(28, 28, 28)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton1)
												.addComponent(jButton2)
												.addComponent(jButton3))
								.addGap(44, 44, 44)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// �����Ϣ
		jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("");
		jComboBox1.setSelectedIndex(0);
		jTextField5.setText("");
		jTextField6.setText("");
		jTextArea1.setText("");
		jTextField1.requestFocus();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String id = jTextField1.getText().trim();
		String name = jTextField2.getText().trim();
		String author = jTextField3.getText();
		String classify = (String) jComboBox1.getSelectedItem();
		String price = jTextField5.getText().trim();
		String publishdata = jTextField6.getText().trim();
		String news = jTextArea1.getText().trim();
		Book book = new Book();
		book.setId(id);
		book.setName(name);
		book.setAuthor(author);
		book.setClassify(classify);
		book.setPrice(Double.parseDouble(price));
		book.setNews(news);
		book.setPublishdata(DateUtil.getStringToDate(publishdata));
		boolean flag = false;
		if (book != null) {
			try {
				flag = DAOFactory.getIBookDAOInstance().doCreate(book);
				if (flag) {
					JOptionPane.showMessageDialog(null, "���ӳɹ���", "��Ϣ", 1);

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void start() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new BookAdd().setVisible(true);

			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	// End of variables declaration//GEN-END:variables

}