package com.kevinjang.headfirst;

import java.util.ArrayList;

public class SimpleDotCom {
  private ArrayList<String> locationCells;

  public void setLocationCells(ArrayList<String> locations) {
    locationCells = locations;
  }

  public String checkYourself(String guess) {
    String result = "miss";
    
    int index = locationCells.indexOf(guess);

    if (index >= 0) {
    	locationCells.remove(index);
    	
    	if (locationCells.isEmpty()) {
    		result = "kill";
    	} else {
    		result = "hit";
    	}
    }

    System.out.println(result);
    return result;
  }
}
