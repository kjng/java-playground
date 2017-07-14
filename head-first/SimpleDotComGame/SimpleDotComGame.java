public class SimpleDotComGame {
  public static void main (String[] args) {
    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();

    SimpleDotCom game = new SimpleDotCom();
    int randomNum = (int) (Math.random() * 5);
    int[] locations = {randomNum+1, randomNum+2, randomNum+3};

    game.setLocationCells(locations);

    boolean isAlive = true;

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
