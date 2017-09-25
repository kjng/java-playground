package com.kevinjang.toyproblems;

public class MiddleCharacter {

	public static void main(String[] args) {

		System.out.println("Even tests...");
		Helpers.runTest(MiddleCharacter.getMiddle("test"), "es");
		Helpers.runTest(MiddleCharacter.getMiddle("middle"), "dd");

		System.out.println("Odd tests...");
		Helpers.runTest(MiddleCharacter.getMiddle("testing"), "t");
		Helpers.runTest(MiddleCharacter.getMiddle("A"), "A");

	}

	public static String getMiddle(String s) {
		int mid = s.length() / 2;
		// If even
		if (s.length() % 2 == 0) {
			return s.substring(mid - 1, mid + 1);
		} else {
			// If odd
			return s.substring(mid, mid + 1);
		}

	}

}
