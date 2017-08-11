package com.kevinjang.toyproblems;

import java.util.Arrays;

/**
 * @author sfk1j
 *
 */
public class LarioAndMuigiPipeProblem {

	public static void main(String[] args) {
		
		int[] result = pipeFix(new int[] {1, 4, 9});
		System.out.println(Arrays.toString(result));
		
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
