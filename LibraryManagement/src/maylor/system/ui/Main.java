/*
 * Main.java
 *
 * Created on __DATE__, __TIME__
 */

package maylor.system.ui;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import maylor.system.util.DateUtil;
import maylor.system.util.GlobalUser;

/**
 *
 * @author  __USER__
 */
public class Main extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 907406449685862563L;

	/** Creates new form Main */
	public Main() {
		super("Library Manager System");
		Image ime = Toolkit.getDefaultToolkit().getImage(
				"/images/ico.png");
		setIconImage(ime);
		initComponents();
		setLocationRelativeTo(null);
		this.setResizable(false);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		main_img = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		user_name = new javax.swing.JLabel();
		main_time = new javax.swing.JLabel();
		main_status = new javax.swing.JPanel();
		status = new javax.swing.JProgressBar();
		message = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu6 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenuItem6 = new javax.swing.JMenuItem();
		jMenuItem7 = new javax.swing.JMenuItem();
		jMenuItem8 = new javax.swing.JMenuItem();
		jMenuItem9 = new javax.swing.JMenuItem();
		manager = new javax.swing.JMenu();
		jMenu5 = new javax.swing.JMenu();
		jMenuItem10 = new javax.swing.JMenuItem();
		jMenuItem11 = new javax.swing.JMenuItem();
		jMenuItem12 = new javax.swing.JMenuItem();
		jMenu7 = new javax.swing.JMenu();
		jMenuItem13 = new javax.swing.JMenuItem();
		jMenuItem14 = new javax.swing.JMenuItem();
		jMenuItem15 = new javax.swing.JMenuItem();
		jMenu8 = new javax.swing.JMenu();
		jMenuItem16 = new javax.swing.JMenuItem();
		borrow_back = new javax.swing.JMenuItem();
		borrow_delete = new javax.swing.JMenuItem();
		borrow_query = new javax.swing.JMenu();
		jMenuItem19 = new javax.swing.JMenuItem();
		jMenuItem20 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenu10 = new javax.swing.JMenu();
		jMenuItem21 = new javax.swing.JMenuItem();
		jMenuItem22 = new javax.swing.JMenuItem();
		reader_query = new javax.swing.JMenu();
		jMenuItem23 = new javax.swing.JMenuItem();
		jMenuItem24 = new javax.swing.JMenuItem();
		jMenu1 = new javax.swing.JMenu();
		user_manager = new javax.swing.JMenu();
		jMenuItem27 = new javax.swing.JMenuItem();
		jMenuItem28 = new javax.swing.JMenuItem();
		jMenuItem29 = new javax.swing.JMenuItem();
		jMenu13 = new javax.swing.JMenu();
		jMenuItem30 = new javax.swing.JMenuItem();
		jMenuItem31 = new javax.swing.JMenuItem();
		jMenuItem26 = new javax.swing.JMenuItem();
		jMenuItem25 = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		jMenuItem17 = new javax.swing.JMenuItem();
		jMenuItem18 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Library Manager System");

		main_img.setIcon(new javax.swing.ImageIcon(
				"main_3.jpg")); // NOI18N

		jLabel3.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jLabel3.setText("\u5f53\u524d\u7528\u6237\uff1a");

		user_name.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		user_name.setForeground(new java.awt.Color(249, 2, 2));
		user_name.setText("            user");

		main_time.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		main_time.setForeground(new java.awt.Color(102, 102, 102));
		main_time.setText("time");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(250, Short.MAX_VALUE)
										.addComponent(
												main_time,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												211,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(223, 223, 223))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(273, Short.MAX_VALUE)
										.addComponent(jLabel3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												user_name,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												172,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(162, 162, 162))
						.addGroup(
								jPanel1Layout.createSequentialGroup()
										.addGap(41, 41, 41)
										.addComponent(main_img)
										.addContainerGap(43, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(31, 31, 31)
										.addComponent(main_img)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(user_name))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												26, Short.MAX_VALUE)
										.addComponent(main_time)
										.addContainerGap()));

		main_status.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		message.setForeground(new java.awt.Color(63, 159, 195));
		message.setText("--\u6b22\u8fce\u4f7f\u7528--");

		javax.swing.GroupLayout main_statusLayout = new javax.swing.GroupLayout(
				main_status);
		main_status.setLayout(main_statusLayout);
		main_statusLayout
				.setHorizontalGroup(main_statusLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								main_statusLayout
										.createSequentialGroup()
										.addComponent(
												message,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												435,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												195, Short.MAX_VALUE)
										.addComponent(
												status,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												50,
												javax.swing.GroupLayout.PREFERRED_SIZE)));
		main_statusLayout
				.setVerticalGroup(main_statusLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								main_statusLayout
										.createSequentialGroup()
										.addGroup(
												main_statusLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																status,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																17,
																Short.MAX_VALUE)
														.addComponent(
																message,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));

		jMenu6.setText("\u5de5\u5177");
		jMenu6.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));

		jMenuItem1.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem1.setText("cmd");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem1);

		jMenuItem2.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem2.setText("\u622a\u56fe");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem2);

		jMenuItem3.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem3.setIcon(new javax.swing.ImageIcon(
				"/images/draw.jpg")); // NOI18N
		jMenuItem3.setText("\u753b\u56fe");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem3);

		jMenuItem4.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem4.setText("\u952e\u76d8");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem4);

		jMenuItem5.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem5.setText("\u8bb0\u4e8b\u672c");
		jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem5ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem5);

		jMenuItem6.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem6.setText("\u8ba1\u7b97\u5668");
		jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem6ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem6);

		jMenuItem7.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem7.setText("\u7cfb\u7edf\u7248\u672c");
		jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem7ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem7);

		jMenuItem8.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem8.setText("\u7cfb\u7edf\u4fe1\u606f");
		jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem8ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem8);

		jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_Q,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem9.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem9.setText("\u9000\u51fa");
		jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem9ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem9);

		jMenuBar1.add(jMenu6);

		manager.setText("\u7ef4\u62a4");
		manager.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));

		jMenu5.setText("          \u56fe\u4e66 ");
		jMenu5.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));

		jMenuItem10.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem10.setText("          \u589e\u52a0\u56fe\u4e66 ");
		jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem10ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem10);

		jMenuItem11.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem11.setText("          \u4fee\u6539\u56fe\u4e66 ");
		jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem11ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem11);

		jMenuItem12.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem12.setText("          \u5220\u9664\u56fe\u4e66 ");
		jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem12ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem12);

		manager.add(jMenu5);

		jMenu7.setText("          \u8bfb\u8005  ");
		jMenu7.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));

		jMenuItem13.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem13.setText("          \u589e\u52a0\u8bfb\u8005 ");
		jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem13ActionPerformed(evt);
			}
		});
		jMenu7.add(jMenuItem13);

		jMenuItem14.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem14.setText("          \u4fee\u6539\u8bfb\u8005 ");
		jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem14ActionPerformed(evt);
			}
		});
		jMenu7.add(jMenuItem14);

		jMenuItem15.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem15.setText("          \u5220\u9664\u8bfb\u8005 ");
		jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem15ActionPerformed(evt);
			}
		});
		jMenu7.add(jMenuItem15);

		manager.add(jMenu7);

		jMenuBar1.add(manager);

		jMenu8.setText("\u501f\u9605");
		jMenu8.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));

		jMenuItem16.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem16.setText("          \u501f\u4e66 ");
		jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem16ActionPerformed(evt);
			}
		});
		jMenu8.add(jMenuItem16);

		borrow_back.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		borrow_back.setText("          \u8fd8\u4e66 ");
		borrow_back.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				borrow_backActionPerformed(evt);
			}
		});
		jMenu8.add(borrow_back);

		borrow_delete.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		borrow_delete.setText("          \u5220\u9664\u8bb0\u5f55");
		borrow_delete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				borrow_deleteActionPerformed(evt);
			}
		});
		jMenu8.add(borrow_delete);

		borrow_query.setText("          \u501f\u9605\u67e5\u8be2");
		borrow_query.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));

		jMenuItem19.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem19.setText("      \u7f16\u53f7\u67e5\u8be2  ");
		jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem19ActionPerformed(evt);
			}
		});
		borrow_query.add(jMenuItem19);

		jMenuItem20.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem20.setText("      \u5173\u952e\u5b57\u67e5\u8be2  ");
		jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem20ActionPerformed(evt);
			}
		});
		borrow_query.add(jMenuItem20);

		jMenu8.add(borrow_query);

		jMenuBar1.add(jMenu8);

		jMenu3.setText("\u67e5\u8be2");
		jMenu3.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));

		jMenu10.setText("          \u56fe\u4e66\u67e5\u8be2 ");
		jMenu10.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));

		jMenuItem21.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem21.setText("      \u7f16\u53f7\u67e5\u8be2  ");
		jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem21ActionPerformed(evt);
			}
		});
		jMenu10.add(jMenuItem21);

		jMenuItem22.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem22.setText("      \u5173\u952e\u5b57\u67e5\u8be2  ");
		jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem22ActionPerformed(evt);
			}
		});
		jMenu10.add(jMenuItem22);

		jMenu3.add(jMenu10);

		reader_query.setText("          \u8bfb\u8005\u67e5\u8be2 ");
		reader_query.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));

		jMenuItem23.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem23.setText("      \u7f16\u53f7\u67e5\u8be2  ");
		jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem23ActionPerformed(evt);
			}
		});
		reader_query.add(jMenuItem23);

		jMenuItem24.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem24.setText("      \u5173\u952e\u5b57\u67e5\u8be2  ");
		jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem24ActionPerformed(evt);
			}
		});
		reader_query.add(jMenuItem24);

		jMenu3.add(reader_query);

		jMenuBar1.add(jMenu3);

		jMenu1.setText("\u7ba1\u7406");
		jMenu1.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));

		user_manager.setText("          \u7528\u6237  ");
		user_manager.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));

		jMenuItem27.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem27.setText("      \u6dfb\u52a0\u7528\u6237  ");
		jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem27ActionPerformed(evt);
			}
		});
		user_manager.add(jMenuItem27);

		jMenuItem28.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem28.setText("      \u4fee\u6539\u7528\u6237  ");
		jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem28ActionPerformed(evt);
			}
		});
		user_manager.add(jMenuItem28);

		jMenuItem29.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem29.setText("      \u5220\u9664\u7528\u6237  ");
		jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem29ActionPerformed(evt);
			}
		});
		user_manager.add(jMenuItem29);

		jMenu13.setText("      \u67e5\u8be2\u7528\u6237   ");
		jMenu13.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));

		jMenuItem30.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem30.setText("      \u7f16\u53f7\u67e5\u8be2  ");
		jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem30ActionPerformed(evt);
			}
		});
		jMenu13.add(jMenuItem30);

		jMenuItem31.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem31.setText("      \u5173\u952e\u5b57\u67e5\u8be2  ");
		jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem31ActionPerformed(evt);
			}
		});
		jMenu13.add(jMenuItem31);

		user_manager.add(jMenu13);

		jMenu1.add(user_manager);

		jMenuItem26.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem26.setText("          \u4fee\u6539\u5bc6\u7801");
		jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem26ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem26);

		jMenuItem25.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem25.setText("          \u6ce8\u9500");
		jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem25ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem25);

		jMenuBar1.add(jMenu1);

		jMenu4.setText("\u5e2e\u52a9");
		jMenu4.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));

		jMenuItem17.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem17.setText("About");
		jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem17ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem17);

		jMenuItem18.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jMenuItem18.setText("help");
		jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem18ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem18);

		jMenuBar1.add(jMenu4);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(main_status,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										13, Short.MAX_VALUE)
								.addComponent(main_status,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										23,
										javax.swing.GroupLayout.PREFERRED_SIZE)));

		pack();
		
		//HEAD Start
		
		//ÉèÖÃÖ÷½çÃæÏÔÊ¾Ä£ÐÍ....

        //ÉèÖÃ´°¿Ú¹Ø±Õ·½Ê½
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter(){
			   public void windowClosing(WindowEvent e) {
			    if(JOptionPane.showConfirmDialog(null, "ÄãÈ·¶¨ÒªÍË³öÂð£¿","ÌáÊ¾",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
			     System.exit(0);}
			   }
		});
		
		//ÉèÖÃ´°¿Ú·ç¸ñ
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			  


        //ÉèÖÃÖ÷½çÃæÌáÊ¾Óï
        new Thread(){
             public void run(){
                   while(true){
                	   try {
						Thread.sleep(13000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                       message.setText("Ð¡ÌáÊ¾:ÔÚÎÄ¼þ²Ëµ¥Àï¿ÉÒÔ´ò¿ªwindows¹¤¾ß!");
                       try {
						Thread.sleep(13000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					message.setText("Ð¡ÌáÊ¾:¹ÜÀí²Ëµ¥¿ÉÒÔÐÞ¸ÄµÇÂ½ÃÜÂë£¡");
					
					try {
						Thread.sleep(13000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					message.setText("--Application by Java.");
					
					try {
						Thread.sleep(13000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					message.setText("--RockAgen Inc.");
                   
                   }
                   
             }
        }.start();

		//Ö÷½çÃæÍ¼Æ¬ÂÖ»»
		new Thread(){
			public void run(){
				while(true){
					try {
						Thread.sleep(8000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					main_img.setIcon(new javax.swing.ImageIcon(
							"/images/main_1.jpg")); // NOI18N
					try {
						Thread.sleep(8000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					main_img.setIcon(new javax.swing.ImageIcon(
							"/images/main_2.jpg")); // NOI18N
					try {
						Thread.sleep(8000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					main_img.setIcon(new javax.swing.ImageIcon(
							"/images/main_3.jpg")); // NOI18N
					try {
						Thread.sleep(8000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					main_img.setIcon(new javax.swing.ImageIcon(
							"/images/main_4.jpg")); // NOI18N
					
				}
			}
		}.start();
		
		//Ìí¼ÓÊ±ÖÓ
		new Thread(){
			public void run(){
				while(true){
					main_time.setText(DateUtil.getDateTime());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();

		
		
		//ÉèÖÃµ±Ç°ÓÃ»§
		user_name.setText(GlobalUser.LOGIN_USER.getName());

		
		
		
		//ÉèÖÃÈ¨ÏÞ
		if(GlobalUser.LOGIN_USER.getIs_admin()!=0){
	    manager.setEnabled(false);
	    borrow_back.setEnabled(false);
        borrow_delete.setEnabled(false);
        borrow_query.setEnabled(false);
        reader_query.setEnabled(false);
        user_manager.setEnabled(false);    
        }
		//ÉèÖÃMainµÄ½ø¶ÈÌõ
		status.setIndeterminate(true);
		
		//HEAD END
		
	}// </editor-fold>
	//GEN-END:initComponents

	private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {
		//help
		try {
			Runtime.getRuntime().exec("cmd /c start help.chm");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {
		//°ïÖú
		About.start();
	}

	private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {
		//×¢ÏúµÇÂ¼
		GlobalUser.LOGIN_USER = null;
		Login.main(null);
		this.dispose();
	}

	private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {
		//ÐÞ¸ÄÃÜÂë
		_Modify_Password.start();
	}

	private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {
		//²éÑ¯ÓÃ»§-by ¹Ø¼ü×Ö
		User_K_Find.start();
	}

	private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {
		//²éÑ¯ÓÃ»§-by ±àºÅ
		UserFind.start();
	}

	private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {
		//„h³ýÓÃ‘ô
		UserDelete.start();
	}

	private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {
		//ÐÞ¸ÄÓÃ‘ô
		UserUpdate.start();
	}

	private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {
		//Ìí¼ÓÓÃ‘ô
		UserAdd.start();
	}

	private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {
		//¶ÁÕß²éÑ¯-by ¹Ø¼ü×Ö
		Reader_K_Find.start();
	}

	private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {
		//¶ÁÕß²éÑ¯-by ±àºÅ
		ReaderFind.start();
	}

	private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {
		//Í¼Êé²éÑ¯-by ¹Ø¼ü×Ö
		Book_K_Find.start();
	}

	private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {
		//Í¼Êé²éÑ¯-by ±àºÅ
		BookFind.start();
	}

	private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {
		//½èÔÄ²éÑ¯-by ¹Ø¼ü×Ö
		Borrow_K_Find.start();
	}

	private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {
		//½èÔÄ²éÑ¯-by ±àºÅ
		BorrowFind.start();
	}

	private void borrow_deleteActionPerformed(java.awt.event.ActionEvent evt) {
		//É¾³ý½èÔÄ¼ÇÂ¼
		BorrowDelete.start();
	}

	private void borrow_backActionPerformed(java.awt.event.ActionEvent evt) {
		//»¹Êé
		BorrowUpdate.start();
	}

	private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {
		//Ôö¼Ó½èÔÄÕß
		BorrowAdd.start();
	}

	private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {
		//É¾³ý¶ÁÕß
		ReaderDelete.start();
	}

	private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {
		//ÐÞ¸Ä¶ÁÕß
		ReaderUpdate.start();
	}

	private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {
		//Ôö¼Ó¶ÁÕß
		ReaderAdd.start();
	}

	private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {
		//É¾³ýÍ¼Êé
		BookDelete.start();
	}

	private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {
		//ÐÞ¸ÄÍ¼Êé
		BookUpdate.start();
	}

	private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {
		//Ôö¼ÓÍ¼Êé
		BookAdd.start();
	}

	private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {
		//ÍË³öÏµÍ³
		if (JOptionPane.showConfirmDialog(this, "ÄãÈ·¶¨ÒªÍË³öÂð£¿", "ÌáÊ¾",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
		//ÏµÍ³ÐÅÏ¢
		OsINF.start();
	}

	private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
		//¼ì²âÏµÍ³°æ±¾
		try {
			Runtime.getRuntime().exec("cmd /c start  winver");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
		//´ò¿ª¼ÆËãÆ÷
		try {
			Runtime.getRuntime().exec("cmd /c start  CALC");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
		//´ò¿ª¼ÇÊÂ±¾
		try {
			Runtime.getRuntime().exec("cmd /c start  notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		//´ò¿ªÆÁÄ»¼üÅÌ
		try {
			Runtime.getRuntime().exec("cmd /c start  osk");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
		//´ò¿ª»­Í¼°å
		try {
			Runtime.getRuntime().exec("cmd /c start  mspaint");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		// ´ò¿ª½ØÍ¼
		try {
			Runtime.getRuntime().exec("cmd /c start  snippingtool");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		// ´ò¿ªcmd
		try {
			Runtime.getRuntime().exec("cmd /c start  cmd");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void start() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JMenuItem borrow_back;
	private javax.swing.JMenuItem borrow_delete;
	private javax.swing.JMenu borrow_query;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu10;
	private javax.swing.JMenu jMenu13;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenu jMenu6;
	private javax.swing.JMenu jMenu7;
	private javax.swing.JMenu jMenu8;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem10;
	private javax.swing.JMenuItem jMenuItem11;
	private javax.swing.JMenuItem jMenuItem12;
	private javax.swing.JMenuItem jMenuItem13;
	private javax.swing.JMenuItem jMenuItem14;
	private javax.swing.JMenuItem jMenuItem15;
	private javax.swing.JMenuItem jMenuItem16;
	private javax.swing.JMenuItem jMenuItem17;
	private javax.swing.JMenuItem jMenuItem18;
	private javax.swing.JMenuItem jMenuItem19;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem20;
	private javax.swing.JMenuItem jMenuItem21;
	private javax.swing.JMenuItem jMenuItem22;
	private javax.swing.JMenuItem jMenuItem23;
	private javax.swing.JMenuItem jMenuItem24;
	private javax.swing.JMenuItem jMenuItem25;
	private javax.swing.JMenuItem jMenuItem26;
	private javax.swing.JMenuItem jMenuItem27;
	private javax.swing.JMenuItem jMenuItem28;
	private javax.swing.JMenuItem jMenuItem29;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem30;
	private javax.swing.JMenuItem jMenuItem31;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JMenuItem jMenuItem7;
	private javax.swing.JMenuItem jMenuItem8;
	private javax.swing.JMenuItem jMenuItem9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel main_img;
	private javax.swing.JPanel main_status;
	private javax.swing.JLabel main_time;
	private javax.swing.JMenu manager;
	private javax.swing.JLabel message;
	private javax.swing.JMenu reader_query;
	private javax.swing.JProgressBar status;
	private javax.swing.JMenu user_manager;
	private javax.swing.JLabel user_name;
	// End of variables declaration//GEN-END:variables

}