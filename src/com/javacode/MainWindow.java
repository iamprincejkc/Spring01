package com.javacode;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow {
	private JFrame window;

	public MainWindow() {
		window = new JFrame();
		window.setTitle("Hello World");
		window.setLayout(new BorderLayout(10, 5));
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(800, 500);
		window.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		panel.setBackground(Color.red);

		Button btn1 = new Button("Button 1");
		Button btn2 = new Button("Button 2");
		Button btn3 = new Button("Button 3");
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);

		panel.setPreferredSize(new Dimension(250, 250));

		window.add(panel, BorderLayout.WEST);

		window.setVisible(true);
	}

}
