package com.kevinjang.toyproblems;

public class LarioAndMuigiPipeProblem {
	
	// https://www.codewars.com/kata/56b29582461215098d00000f/train/java

	public static void main(String[] args) {
		
		Helpers.runTest(pipeFix(new int[] {1, 4, 9}), new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});;
		Helpers.runTest(pipeFix(new int[] {1, 2, 3, 12}), new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
		Helpers.runTest(pipeFix(new int[] {-1,4}), new int[] {-1,0,1,2,3,4});
		
	}
	
	public static int[] pipeFix(int[] numbers) {
		int startVal = numbers[0];
		int endVal = numbers[numbers.length - 1];
		int resultLength = endVal - startVal + 1;
		int[] result = new int[resultLength];
		
		for (int i = 0; i < resultLength; i++) {
			result[i] = i + startVal;
		}
		
		return result;
	}

}
