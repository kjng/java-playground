package com.kevinjang.toyproblems;

public class MaxDiff {
	
	// https://www.codewars.com/kata/588a3c3ef0fbc9c8e1000095/train/java

	public static void main(String[] args) {
		Helpers.runTest(4, maxDiff(new int[] {1, 2, 3, 4, 5, 5, 4}));
		Helpers.runTest(30, maxDiff(new int[] {-4, -5, -3, -1, -31}));
		Helpers.runTest(10, maxDiff(new int[] {1, 2, 3, 4, -5, 5, 4}));
		Helpers.runTest(0, maxDiff(new int[] {1000000}));
		Helpers.runTest(0, maxDiff(new int[] {}));
	}
	
	public static int maxDiff(int[] list) {
		if (list.length <= 1) { return 0; }
		int min = list[0];
		int max = list[0];
		
		for (int num : list) {
			if (num < min) {
				min = num;
			} else if (num > max) {
				max = num;
			}
		}

		return max - min;
	}

}
