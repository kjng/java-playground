import java.util.Scanner;
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
		
		Scanner input = new Scanner(System.in);
		Random dice = new Random();
		
		System.out.print("Enter number of dice rolls: ");
		int count = input.nextInt();
		System.out.println();
		
		int num;
		
		for (int i = 0; i < count; i++) {
			
			num = dice.nextInt(6) + 1;
			System.out.println(num);
			
		}
		
	}

}
