package com.kevinjang.headfirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestExceptions {

	public static void main(String[] args) {
		String test = "no";
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter 'yes' or 'no': ");
			test = is.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("start try");
			doRisky(test);
			System.out.println("end try");
		} catch (ScaryException se) {
			System.out.println("scary exception");
		} finally {
			System.out.println("finally");
		}
		System.out.println("end of main");
	}
	
	static void doRisky(String test) throws ScaryException {
		System.out.println("start risky");
		if (test.equals("yes")) {
			throw new ScaryException();
		}
		System.out.println("end risky");
	}

}
