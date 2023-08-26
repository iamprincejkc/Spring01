package com.javacode;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow {
	private JFrame frame;

	public MainWindow() {
		frame = new JFrame();
		frame.setTitle("Hello World");
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		BorderLayout bLayout = new BorderLayout();
		bLayout.setHgap(10);
		bLayout.setVgap(10);
		frame.setLayout(bLayout);

		frame.add(new JButton("North"), BorderLayout.NORTH);
		frame.add(new JButton("South"), BorderLayout.SOUTH);
		frame.add(new JButton("West"), BorderLayout.WEST);
		frame.add(new JButton("East"), BorderLayout.EAST);
		frame.add(new JButton("Center"), BorderLayout.CENTER);

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
