package com.kevinjang.toyproblems;

public class CaffeineScript {

	public static void main(String[] args) {
		Helpers.runTest("mocha_missing!", caffeineBuzz(1));
		Helpers.runTest("Java", caffeineBuzz(3));
		Helpers.runTest("JavaScript", caffeineBuzz(6));
		Helpers.runTest("CoffeeScript", caffeineBuzz(12));
	}

	public static String caffeineBuzz(int n) {
		String output = "";

		if (n % 3 == 0) {
			if (n % 4 == 0) {
				output = "Coffee";
			} else {
				output = "Java";
			}

			if (n % 2 == 0) {
				output += "Script";
			}
		}

		return output.equals("") ? "mocha_missing!" : output;
	}

}
