package com.kevinjang.headfirst;

import java.util.ArrayList;

public class DotComBust {
	
	// declare and initialize the variables we'll need
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame() {
		// first make some dot coms and give them locations
		// make three DotCom objects, give 'em names, and stick 'em in the ArrayList
		DotCom one = new DotCom();
		DotCom two = new DotCom();
		DotCom three = new DotCom();
		one.setName("ShopRite.com");
		two.setName("Wakefern.com");
		three.setName("kevinjang.com");
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		// print brief instructions to the user
		System.out.println("Your goal is to sink three dot coms");
		System.out.println(one.getName() + ", " + two.getName() + ", " + three.getName());
		System.out.println("Try to sink them all with the fewest number of guesses");
		
		for (DotCom dotComToSet : dotComsList) { // repeat with each DotCom in the list
			ArrayList<String> newLocation = helper.placeDotCom(3); // ask the helper for a DotCom location
			dotComToSet.setLocationCells(newLocation); // call the setter method on this DotCom to give it the location you just got from the helper
		}
	}
	
	private void startPlaying() {
		while (!dotComsList.isEmpty()) { // as long as the DotCom list is NOT empty
			String userGuess = helper.getUserInput("Enter a guess: "); // get user input
			checkUserGuess(userGuess); // call our own checkUserGuess method
		}
		finishGame(); // call our own finishGame method
	}
	
	private void checkUserGuess(String userGuess) {
		numOfGuesses++; // increment the number of guesses the user has made
		String result = "miss"; // assume it's a 'miss', unless told otherwise
		
		for (DotCom dotComToTest : dotComsList) { // repeat with all DotComs in the list
			result = dotComToTest.checkYourself(userGuess); // ask the DotCom to check the user guess, looking for a hit (or kill)
			if (result.equals("hit")) {
				break; // get out of the loop early, no point in testing the others
			} else if (result.equals("kill")) {
				dotComsList.remove(dotComToTest); // this guy's dead, so take him out of the DotComs list then get out of the loop
				break;
			}
		}
		System.out.println(result); // print the result for the user
	}
	
	private void finishGame() {
		// print a message telling the user how he did in the game
		System.out.println("All Dot Coms are dead! Your stock is now worthless.");
		if (numOfGuesses <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println("You got our before your options sank.");
		} else {
			System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
			System.out.println("Fish are dancing with your options.");
		}
	}
	
	public static void main (String[] args) {
		DotComBust game = new DotComBust(); // create the game object
		game.setUpGame();
		game.startPlaying();
	}
	
}
