package com.kevinjang.headfirst;

public class DotComBust {
	
	// declare and initialize the variables we'll need
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	
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
			checkUserGuess(userGuess); // call our own checkUserGUess method
		}
		finishGame(); // call our own finishGame method
	}
	
}
