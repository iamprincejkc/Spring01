package com.javacode;

import javax.swing.JFrame;

public class JFrameOne extends JFrame {
	public JFrameOne() {
		initialize();
	}

	public void initialize() {
		setTitle("JFrameOne");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500, 400);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}
}