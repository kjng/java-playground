package com.kevinjang.headfirst;

import java.util.ArrayList;

public class SimpleDotComTestDrive {
  public static void main (String[] args) {
    SimpleDotCom dot = new SimpleDotCom();
    ArrayList<String> locations = new ArrayList<String>();
    locations.add("2");
    locations.add("3");
    locations.add("4");
    
    dot.setLocationCells(locations);

    String missResult = dot.checkYourself("1");
    String hitResult = dot.checkYourself("2");

    boolean testsPassed = true;

    if (missResult.equals("miss")) {
      testsPassed = testsPassed && true;
    }

    if (hitResult.equals("hit")) {
      testsPassed = testsPassed && true;
    }

    if (testsPassed == true) {
      System.out.println("passed");
    } else {
      System.out.println("failed");
    }
  }
}
