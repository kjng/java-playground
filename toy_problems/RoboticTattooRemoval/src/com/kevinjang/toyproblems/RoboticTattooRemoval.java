package com.kevinjang.toyproblems;

public class RoboticTattooRemoval {

	public static void main(String[] args) {
		Helpers.runTest(new String[][] {
				{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
				{" ", " ", "*", "*", " ", " ", " ", "*", "*", " ", " "},
				{" ", "*", " ", " ", "*", " ", "*", " ", " ", "*", " "},
				{" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "},
				{" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "},
				{" ", "*", " ", " ", " ", " ", " ", " ", " ", "*", " "},
				{" ", "*", " ", " ", " ", " ", " ", " ", " ", "*", " "},
				{" ", "*", " ", " ", " ", " ", " ", " ", " ", "*", " "},
				{" ", " ", "*", " ", " ", " ", " ", " ", "*", " ", " "},
				{" ", " ", " ", "*", " ", " ", " ", "*", " ", " ", " "},
				{" ", " ", " ", " ", "*", " ", "*", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " ", "P", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
		},
		RoboticTattooRemoval.robot(new String[][] {
				{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
				{" ", " ", "X", "X", " ", " ", " ", "X", "X", " ", " "},
				{" ", "X", " ", " ", "X", " ", "X", " ", " ", "X", " "},
				{" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
				{" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
				{" ", "X", " ", " ", " ", " ", " ", " ", " ", "X", " "},
				{" ", "X", " ", " ", " ", " ", " ", " ", " ", "X", " "},
				{" ", "X", " ", " ", " ", " ", " ", " ", " ", "X", " "},
				{" ", " ", "X", " ", " ", " ", " ", " ", "X", " ", " "},
				{" ", " ", " ", "X", " ", " ", " ", "X", " ", " ", " "},
				{" ", " ", " ", " ", "X", " ", "X", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " ", "P", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
		}
				));

		Helpers.runTest(new String[][] {
				{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", "*", "*", " ", " ", " ", " ", " "},
				{" ", " ", " ", "*", " ", " ", "*", " ", " ", " ", " "},
				{" ", " ", " ", "*", " ", " ", "*", " ", " ", " ", " "},
				{" ", " ", " ", "*", " ", " ", "*", " ", " ", " ", " "},
				{" ", " ", " ", "*", " ", " ", "*", " ", " ", " ", " "},
				{" ", " ", " ", "*", " ", " ", "*", " ", " ", " ", " "},
				{" ", " ", " ", "*", " ", " ", "*", " ", " ", " ", " "},
				{" ", " ", " ", "*", " ", " ", "*", " ", " ", " ", " "},
				{" ", " ", "*", "*", " ", " ", "*", "*", " ", " ", " "},
				{" ", "*", " ", " ", " ", " ", " ", " ", "*", " ", " "},
				{" ", "*", " ", " ", " ", " ", " ", " ", "*", " ", " "},
				{" ", "*", " ", " ", "*", "*", " ", " ", "*", " ", " "},
				{" ", " ", "*", "*", " ", " ", "*", "*", " ", " ", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
		},
		RoboticTattooRemoval.robot(new String[][] {
				{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", "X", "X", " ", " ", " ", " ", " "},
				{" ", " ", " ", "X", " ", " ", "X", " ", " ", " ", " "},
				{" ", " ", " ", "X", " ", " ", "X", " ", " ", " ", " "},
				{" ", " ", " ", "X", " ", " ", "X", " ", " ", " ", " "},
				{" ", " ", " ", "X", " ", " ", "X", " ", " ", " ", " "},
				{" ", " ", " ", "X", " ", " ", "X", " ", " ", " ", " "},
				{" ", " ", " ", "X", " ", " ", "X", " ", " ", " ", " "},
				{" ", " ", " ", "X", " ", " ", "X", " ", " ", " ", " "},
				{" ", " ", "X", "X", " ", " ", "X", "X", " ", " ", " "},
				{" ", "X", " ", " ", " ", " ", " ", " ", "X", " ", " "},
				{" ", "X", " ", " ", " ", " ", " ", " ", "X", " ", " "},
				{" ", "X", " ", " ", "X", "X", " ", " ", "X", " ", " "},
				{" ", " ", "X", "X", " ", " ", "X", "X", " ", " ", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
		}
				));

		Helpers.runTest(new String[][] {
				{" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "},
				{"*", "$", "*", " ", " ", "*", " ", " ", "*", "$", "*"},
				{" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "},
				{" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
				{"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
				{"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
				{" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
				{" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "},
				{"*", "$", "*", " ", " ", "*", " ", " ", "*", "$", "*"},
				{" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "}
		},
		RoboticTattooRemoval.robot(new String[][] {
				{" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
				{"X", "$", "X", " ", " ", "X", " ", " ", "X", "$", "X"},
				{" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
				{" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
				{"X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X"},
				{"X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X"},
				{" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
				{" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
				{"X", "$", "X", " ", " ", "X", " ", " ", "X", "$", "X"},
				{" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "}
		}
				)
				);
	}

	public static String[][] robot(String[][] skinScan) {
		for (int i = 0; i < skinScan.length; i++) {
			for (int j = 0; j < skinScan[i].length; j++) {
				if (skinScan[i][j].equals("X")) {
					skinScan[i][j] = "*";
				}
			}
		}
		return skinScan;
	}

}