package com.javacode;

import javax.swing.SwingUtilities;

public class Launch {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				MainWindow main = new MainWindow();
			}
//			public void run() {
//				JFrameOne frame1 = new JFrameOne();
//				JFrameTwo frame2 = new JFrameTwo();
//			}
		});
	}

}
