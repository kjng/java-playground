package com.kevinjang.toyproblems;

import java.util.stream.IntStream;

public class ArrayMean {

	// https://www.codewars.com/kata/55d277882e139d0b6000005d/train/java
	
	public static void main(String[] args) {
		Helpers.runTest(1, findAverage(new int[] {1}));
		Helpers.runTest(4, findAverage(new int[] {1, 3, 5, 7}));
	}
	
	public static int findAverage(int[] nums) {
		return (int) IntStream.of(nums).average().getAsDouble();
	}

}
