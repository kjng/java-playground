package com.kevinjang.toyproblems;

public class CountAllTheSheepOnFarm {

	// https://www.codewars.com/kata/58e0f0bf92d04ccf0a000010/train/java
	
	public static void main(String[] args) {

		int result1 = lostSheeps(new int[] {1, 2}, new int[] {3, 4}, 15);
		int result2 = lostSheeps(new int[] {3, 1, 2}, new int[] {4, 5}, 21);
		
		System.out.println("Running tests...");
		System.out.println("Test 1: " + result1 + ". " + (result1 == 5 ? "passed" : "failed"));
		System.out.println("Test 2: " + result2 + ". " + (result2 == 6 ? "passed" : "failed"));

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
