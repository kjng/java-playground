package com.kevinjang.headfirst;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener {
	private JButton button;
	private boolean buttonToggle = false;
	
	public static void main(String[] args) {
		
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();
		
	}
	
	private void go() {
		
		JFrame frame = new JFrame();
		button = new JButton("Click me");

		button.addActionListener(this);
		
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent event) {
		
		if (buttonToggle == false) {
			button.setText("You clicked me! :D");			
		} else {
			button.setText("You clicked me! :P");
		}
		
		buttonToggle = !buttonToggle;
		
	}
	
	

}
