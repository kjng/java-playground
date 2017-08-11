package com.kevinjang.toyproblems;

import java.util.Arrays;

public class Helpers {

	public static void main(String[] args) {
		Helpers.testHelpers();
	}

	public static void testHelpers() {
		runTest(1, 1);
		runTest("test", "test2");
		runTest(new int[] {1, 2}, new int[] {1, 2});
		runTest(new String[][] {{"one", "two"}, {"three", "four"}}, new String[][] {{"one"}, {"two"}});
	}

	public static void runTest(int val1, int val2) {
		boolean result = assertEqual(val1, val2);
		System.out.println("Test: " + val1 + " == " + val2 + ". " + (result == true ? "PASSED." : "FAILED."));
	}


	public static void runTest(String val1, String val2) {
		boolean result = assertStringsEqual(val1, val2);
		System.out.println("Test: " + val1 + " == " + val2 + ". " + (result == true ? "PASSED." : "FAILED."));
	}

	public static void runTest(int[] array1, int[] array2) {
		boolean result = assertIntArraysEqual(array1, array2);
		System.out.println("Test: " + Arrays.toString(array1) + " == " + Arrays.toString(array2) + ". " + (result == true ? "PASSED." : "FAILED."));
	}

	public static void runTest(String[][] array1, String[][] array2) {
		boolean result = assertTwoDimensionalStringArraysEqual(array1, array2);
		System.out.println("Test: ");
		print2dArray(array1);
		System.out.println(" == ");
		print2dArray(array2);
		System.out.println(result == true ? "PASSED." : "FAILED.");
	}

	public static boolean assertEqual(int val1, int val2) {
		return val1 == val2;
	}

	public static boolean assertStringsEqual(String val1, String val2) {
		return val1.equals(val2);
	}

	public static boolean assertIntArraysEqual(int[] array1, int[] array2) {
		return Arrays.equals(array1, array2);
	}

	public static boolean assertTwoDimensionalStringArraysEqual(String[][] array1, String[][] array2) {
		return Arrays.deepEquals(array1, array2);
	}

	public static void print2dArray(String[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
