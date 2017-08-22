package com.kevinjang.headfirst;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui3C implements ActionListener {
	JFrame frame;

	public static void main(String[] args) {
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
	}
	
	public void go() {

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel drawPanel = new MyDrawPanel();

		JButton button = new JButton("Change color!");
		button.addActionListener(this);
		
		Container contentPane = frame.getContentPane();
		
		contentPane.add(BorderLayout.CENTER, drawPanel);
		contentPane.add(BorderLayout.SOUTH, button);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		frame.repaint();
		
	}

}
