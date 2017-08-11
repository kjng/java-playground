package com.kevinjang.toyproblems.TwoFightersOneWinner;

import com.kevinjang.toyproblems.Helpers;

public class TwoFightersOneWinner {

	public static void main(String[] args) {
		Helpers.runTest("Lew", declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
		Helpers.runTest("Harry", declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"));
		Helpers.runTest("Harald", declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
		Helpers.runTest("Harald", declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
		Helpers.runTest("Harald", declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
		Helpers.runTest("Harald", declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
	}
	
	public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
		Fighter currentAttacker = firstAttacker.equals(fighter1.name) ? fighter1 : fighter2;
		
		while (fighter1.health > 0 && fighter2.health > 0) {
			if (currentAttacker == fighter1) {
				fighter2.health -= fighter1.damagePerAttack;
				currentAttacker = fighter2;
			} else {
				fighter1.health -= fighter2.damagePerAttack;
				currentAttacker = fighter1;
			}
		}
		
		// If fighters health is above 0, that means he won!
		return fighter1.health > 0 ? fighter1.name : fighter2.name;
	}

}
