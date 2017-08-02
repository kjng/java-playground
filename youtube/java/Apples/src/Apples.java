import java.util.Random;


public class Apples {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int freq[] = new int[7];
		
		for (int i = 0; i < 1000; i++) {
			++freq[rand.nextInt(6) + 1];
		}
		
		System.out.println("Face\tFrequency");
		
		for (int j = 1; j < freq.length; j++) {
			System.out.println(j + "\t" + freq[j]);
		}

	}

}
