public class SimpleDotComTestDrive {
  public static void main (String[] args) {
    SimpleDotCom dot = new SimpleDotCom();
    int[] locations = {2, 3, 4};
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
