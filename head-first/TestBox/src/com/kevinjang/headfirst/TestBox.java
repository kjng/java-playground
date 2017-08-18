package com.kevinjang.headfirst;

public class TestBox {

	Integer i;
	int j;
	
	public static void main(String[] args) {
		TestBox t = new TestBox();
		t.go();
	}
	
	public void go() {
		// j = i; // there is no default value set for Integer i!
		i = new Integer(0);
		j = i;
		System.out.println(j);
		System.out.println(i);
	}

}
