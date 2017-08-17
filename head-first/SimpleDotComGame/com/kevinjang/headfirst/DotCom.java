package com.kevinjang.headfirst;

import java.util.ArrayList;

public class DotCom {
	
	private ArrayList<String> locationCells; // ArrayList of cell locations
	private String name; // the DotCom's name
	
	public void setLocationCells(ArrayList<String> loc) { // setter that updates the DotCom's location provided by GameHelper placeDotCom method
		this.locationCells = loc;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput); // if the user guess is one of the entries in the ArrayList, indexOf will return its ArrayList location. if not, indexOf will return -1
		if (index >= 0) {
			locationCells.remove(index); // use ArrayList's remove method to delete an entry
			
			if (locationCells.isEmpty()) { // see if all of the locations have been guessed
				result = "kill";
				System.out.println("Ouch! You sunk: " + name); // tell the user which DotCom has sunk
			} else {
				result = "hit";
			}
		}
		return result; // return "miss", "hit", or "kill"
	}
	
}
