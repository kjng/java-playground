package com.kevinjang.headfirst;

import javax.swing.*;
import com.kevinjang.headfirst.MyDrawPanel;

public class SimpleGui1B {
	
	public static void main(String[] args) {
		
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();
		
	}
	
	private void go() {
		
		JFrame frame = new JFrame();
		
		frame.getContentPane().add(new MyDrawPanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
	}
	
}
