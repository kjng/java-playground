package com.kevinjang.headfirst;

import java.awt.*;
import javax.swing.*;

public class Animation {
	
	int x = 5;
	int y = 5;

	public static void main(String[] args) {
		Animation a = new Animation();
		a.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel panel = new MyDrawPanel();
		
		frame.getContentPane().add(panel);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		for (int i = 0; i < 100; i++) {
			
			x += 2;
			y += 2;
			
			panel.repaint();
			
			try {
				Thread.sleep(50);
			} catch (Exception e) {}
			
		}
	}
	
	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.setColor(new Color(255, 0, 0));
			g.fillOval(x, y, 40, 40);
		}
	}

}
