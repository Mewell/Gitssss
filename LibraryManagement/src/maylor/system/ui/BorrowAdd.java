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
import maylor.system.model.Borrow;
import maylor.system.model.Reader;
import maylor.system.util.DateUtil;



/**
 * 
 * @author __USER__
 */
public class BorrowAdd extends javax.swing.JFrame {

	private static final long serialVersionUID = -4036478391423600029L;

	public BorrowAdd() {
		super("Library Borrow Add");
		Image ime = Toolkit.getDefaultToolkit().getImage(
				("/images/ico.png"));
		setIconImage(ime);
		initComponents();
		this.setResizable(false);
		setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel1.setText("\u6dfb\u52a0\u501f\u9605\u4fe1\u606f");

		jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jLabel2.setText("\u56fe\u4e66\u7f16\u53f7\uff1a");

		jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jLabel3.setText("\u8bfb\u8005\u7f16\u53f7\uff1a");

		jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jLabel4.setText("\u501f\u4e66\u65e5\u671f\uff1a");

		jTextField1.setFont(new java.awt.Font("微软雅黑", 0, 14));

		jTextField2.setFont(new java.awt.Font("微软雅黑", 0, 14));

		jTextField3.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jTextField3KeyPressed(evt);
			}
		});

		jButton1.setBackground(new java.awt.Color(223, 216, 216));
		jButton1.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jButton1.setText("save");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(223, 216, 216));
		jButton2.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jButton2.setText("close");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(223, 216, 216));
		jButton3.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jButton3.setText("reset");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jLabel5.setText("\u8fd8\u4e66\u65e5\u671f\uff1a");

		jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jLabel6.setText("\u8bf7\u770b\u63d0\u793a\uff01");

		jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jLabel7.setForeground(new java.awt.Color(241, 19, 19));
		jLabel7.setText("\u63d0\u793a\uff1a\u8f93\u5165\u8bfb\u8005\u7f16\u53f7\u548c\u501f\u4e66\u65e5\u671f\u540e\u6309\u4e0b\u56de\u8f66\u5373\u53ef\u663e\u793a\u8fd8\u4e66\u65e5\u671f");

		jLabel8.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jLabel8.setForeground(new java.awt.Color(251, 8, 8));
		jLabel8.setText("\u8bf7\u52ff\u91cd\u590d\u64cd\u4f5c\uff01");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup().addGap(209, 209, 209)
								.addComponent(jLabel1)
								.addContainerGap(211, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(78, 78, 78)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel7)
																.addContainerGap())
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel2)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jLabel3)
																												.addComponent(
																														jLabel4))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jTextField2,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														281,
																														Short.MAX_VALUE)
																												.addComponent(
																														jTextField1,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														281,
																														Short.MAX_VALUE)
																												.addComponent(
																														jTextField3,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														281,
																														Short.MAX_VALUE)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jButton1)
																																.addGap(32,
																																		32,
																																		32)
																																.addComponent(
																																		jButton3)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																		42,
																																		Short.MAX_VALUE)
																																.addComponent(
																																		jButton2)
																																.addGap(14,
																																		14,
																																		14))))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel5)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel6,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										92,
																										javax.swing.GroupLayout.PREFERRED_SIZE)))
																.addGap(94, 94,
																		94))))
				.addGroup(
						layout.createSequentialGroup().addGap(209, 209, 209)
								.addComponent(jLabel8)
								.addContainerGap(221, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(32, 32, 32)
								.addComponent(jLabel1)
								.addGap(86, 86, 86)
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
												.addComponent(jLabel5)
												.addComponent(
														jLabel6,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														25,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(54, 54, 54)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton1)
												.addComponent(jButton2)
												.addComponent(jButton3))
								.addGap(52, 52, 52).addComponent(jLabel7)
								.addGap(18, 18, 18).addComponent(jLabel8)
								.addGap(10, 10, 10)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {
		// 回车得到还书日期
		if (evt.getKeyChar() == '\n') {
			String reader_id = jTextField2.getText();// 得到读者ID
			String borrow_date = jTextField3.getText(); // 获取借书日期
			// 判断输入的信息
			if (reader_id == null || reader_id.equals("")
					|| borrow_date.equals("") || borrow_date == null) {
				JOptionPane
						.showMessageDialog(this, "读者编号输入错误或日期格式错误！", "错误", 0);
				return;
			}
			Reader reader = new Reader();
			try {
				reader = DAOFactory.getIReaderDAOInstance().findById(
						reader_id);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (reader == null) {
				JOptionPane
						.showMessageDialog(this, "读者编号输入错误或日期格式错误！", "错误", 0);
				return;
			}
			int id = reader.getDays_num();
			jLabel6.setText(DateUtil.getAfterDay(borrow_date, id));

		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// 清除信息
		jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("");
		jLabel6.setText("");
		jTextField1.requestFocus();

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String book_id = jTextField1.getText().trim();
		String reader_id = jTextField2.getText().trim();
		String borrow_date = jTextField3.getText().trim();
		String back_date = jLabel6.getText().trim();

		Borrow borrow = new Borrow();
		Reader reader = new Reader();
		if (reader_id != null && !reader_id.equals("")) {
			try {
				reader = DAOFactory.getIReaderDAOInstance().findById(
						reader_id);
				if (reader != null) {
					//判断是否有这个读者
					borrow.setBook_id(book_id);
					borrow.setReader_id(reader_id);
					borrow.setBorrow_date(DateUtil.getStringToDate(borrow_date));
					borrow.setBack_date(DateUtil.getStringToDate(back_date));
					borrow.setIs_back(1);
					boolean flag = false;
					{
						try {
							flag = DAOFactory.getIBorrowDAOInstance().doCreate(
									borrow);
							if (flag) {
								JOptionPane.showMessageDialog(null, "添加成功！",
										"消息", 1);

							} else {
								JOptionPane.showMessageDialog(null, "请认真输入！",
										"消息", 1);
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "读者编号输入错误或日期格式错误！",
							"消息", 1);
				}
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else {
			JOptionPane.showMessageDialog(null, "请认真输入！", "消息", 1);
		}

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void start() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new BorrowAdd().setVisible(true);

			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

}