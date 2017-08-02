import java.util.Random;

/**
 * 
 */

/**
 * @author sfk1j
 *
 */
public class RandomNumber {

	public static void main(String[] args) {
		
		Random dice = new Random();
		System.out.println("Rolling dice...");
		System.out.print("You rolled a ");
		System.out.print(dice.nextInt(6) + 1);
		System.out.println(".");
		
//		One-liner
//		System.out.println("Rolling dice...\nYou rolled a " + (dice.nextInt(6) + 1) + ".");

	}

}
