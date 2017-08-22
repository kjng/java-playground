package com.kevinjang.headfirst;

import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {

	public void paintComponent(Graphics g) {
		
		g.setColor(new Color(gen255(), gen255(), gen255()));
		g.fillOval(95, 70, 100, 100);
		
	}
	
	public int gen255() {
		return (int) (Math.random() * 256);
	}
	
}
