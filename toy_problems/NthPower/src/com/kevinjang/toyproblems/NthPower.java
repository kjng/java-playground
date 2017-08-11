package com.kevinjang.toyproblems;

public class NthPower {
	
	// https://www.codewars.com/kata/57d814e4950d8489720008db/train/java

	public static void main(String[] args) {

		Helpers.runTest(-1, nthPower(new int[] {1, 2}, 2));
		Helpers.runTest(8, nthPower(new int[] {3,1,2,2}, 3));
		Helpers.runTest(4, nthPower(new int[] {3,1,2}, 2));

	}
	
	public static int nthPower(int[] array, int n) {
		
		if (n > array.length - 1) { return -1; }
		
		int num = array[n];
		return (int) Math.pow(num, n);
		
	}

}
