package com.javacode;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainWindow {
	private JFrame window;

	public MainWindow() {
		window = new JFrame();
		window.setTitle("Hello World");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(800, 500);
		centerWindow();
	}

	private void centerWindow() {
		// Get the dimensions of the screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		// Calculate the x and y positions to center the window
		int x = (screenSize.width - window.getWidth()) / 2;
		int y = (screenSize.height - window.getHeight()) / 2;

		// Set the window's location
		window.setLocation(x, y);
	}

	public void show() {
		window.setVisible(true);

	}
}
