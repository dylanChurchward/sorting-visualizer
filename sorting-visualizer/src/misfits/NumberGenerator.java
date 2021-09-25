package misfits;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author Dylan
 *
 */


/**
 * Used to generate a random set of integers in an array. 
 */
public class NumberGenerator {


	public NumberGenerator() {
	}
	
	/**
	 * Generated chosen number of random integers. 
	 * @param theSize - size of array to be return. 
	 * @return array of random integers. 
	 */
	public int[] getRandomArray(final int theSize) {
		int output[] = new int[theSize];
		
		for (int i = 0; i < theSize; i++) {
			output[i] = generateRandomInt();
		}
		return output;
	}
	
	/**
	 * Generates a single random integer.
	 * @return A random integer between 1 and 700.
	 */
	private int generateRandomInt() {
		return ThreadLocalRandom.current().nextInt(1, 700);
	}
}
