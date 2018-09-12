package Network;

import java.util.*;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class UI extends JFrame implements ActionListener {
	JLabel b0 = new JLabel("选择如下操作");
	JButton b1 = new JButton("显示各省会信息");
	JButton b2 = new JButton("建立理想交通网");
	JButton b3 = new JButton("线路干扰");
	JButton b4 = new JButton("城市干扰");
	JButton b5 = new JButton("退出");

	public UI() {
		this.setTitle("城市交通网");
		this.setLayout(new GridLayout(6, 1));
		this.add(b0);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		this.setBounds(700, 250, 300, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Cityname bs = new Cityname();
		Network_b s = new Network_b();
		if (e.getSource() == b1) {
			bs.displays();
		} else if (e.getSource() == b2) {
			s.show();
		} else if (e.getSource() == b3) {
			String a=JOptionPane.showInputDialog(null, "请输入线路起点编号", "起点", JOptionPane.PLAIN_MESSAGE);
			String b=JOptionPane.showInputDialog(null, "请输入线路终点编号", "重点", JOptionPane.PLAIN_MESSAGE);
			s.show(Integer.parseInt(a), Integer.parseInt(b));
		} else if (e.getSource() == b4) {
			
			String a=JOptionPane.showInputDialog(null, "请输入城市编号", "城市编号", JOptionPane.PLAIN_MESSAGE);
			s.show(Integer.parseInt(a));
		} else if (e.getSource() == b5) {
			System.exit(0);
		}

	}

	public static void main(String[] args) throws IOException {
		new UI();
	}
}
