package com.kevinjang.headfirst;

import java.util.ArrayList;

public class SimpleDotComGame {
  public static void main (String[] args) {
    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();
    SimpleDotCom game = new SimpleDotCom();
    int randomNum = (int) (Math.random() * 5);
    ArrayList<String> locations = new ArrayList<String>();
    locations.add(String.valueOf(randomNum+1));
    locations.add(String.valueOf(randomNum+2));
    locations.add(String.valueOf(randomNum+3));
    boolean isAlive = true;

    game.setLocationCells(locations);

    while (isAlive == true) {
      String guess = helper.getUserInput("Enter a number: ");
      String result = game.checkYourself(guess);

      numOfGuesses++;

      if (result.equals("kill")) {
        isAlive = false;
        System.out.println("You took " + numOfGuesses + " guesses.");
      }
    }
  }
}
