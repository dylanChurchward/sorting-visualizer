/**
 * Provides a layout for sorting algorithm classes in this project. 
 * @author Dylan
 *
 */
public interface Sorter {
	
	/**
	 * Standard bubble sort algorithm. 
	 * @param theInts
	 * @return array of integers sorted in ascending order. 
	 */
	public abstract int[] sort(final int[] theInts);
	
	/**
	 * Sorts theInts incrementally with each call to the method.
	 * @param theInts
	 * @return array of integers, that has been sorted by a single increment
	 * in ascending order. 
	 */
	public abstract int[] sortWithTracking(final int[] theInts);
	
	/**
	 * @return the index of the most recently sorted element. 
	 */
	public abstract int getPointer();
	
	/**
	 * Resets the state of the instance of the class so sorting can begin on a new set of integers.
	 */
	public abstract void reset();
}
