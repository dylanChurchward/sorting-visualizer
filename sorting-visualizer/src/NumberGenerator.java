import java.util.concurrent.ThreadLocalRandom;

public class NumberGenerator {

	
	
	/**
	 * 
	 */
	public NumberGenerator() {
		
	}
	
	public int[] getRandomArray(final int theSize) {
		int output[] = new int[theSize];
		
		for (int i = 0; i < theSize; i++) {
			output[i] = generateRandomInt();
		}
		return output;
	}
	
	private int generateRandomInt() {
		return ThreadLocalRandom.current().nextInt(1, 700);
	}
}
