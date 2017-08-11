package com.kevinjang.toyproblems;

public class CountAllTheSheepOnFarm {

	// https://www.codewars.com/kata/58e0f0bf92d04ccf0a000010/train/java
	
	public static void main(String[] args) {
		System.out.println("Running tests...");

		Helpers.runTest(lostSheeps(new int[] {1, 2}, new int[] {3, 4}, 15), 5);
		Helpers.runTest(lostSheeps(new int[] {3, 1, 2}, new int[] {4, 5}, 21), 6);
	}
	
	public static int lostSheeps(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepsTotal) {
		int sheepsReturned = 0;
		
		for (int x : fridayNightCounting) {
			sheepsReturned += x;
		}
		for (int y : saturdayNightCounting) {
			sheepsReturned += y;
		}
		
		return sheepsTotal - sheepsReturned;
	}

}
