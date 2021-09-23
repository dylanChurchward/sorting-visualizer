/** 
 * Sorts an array of integers into ascending value. Has the ability to track and report the pointer index while sorting. 
 * @author Dylan
 *
 */


public class BubbleSort implements Sorter {
	
	private int x;
	
	private int y;
	
	private int pointer; 
	
	public BubbleSort() {
	}
	
	/**
	 * Standard bubble sort algorithm. 
	 * @param theInts
	 * @return
	 */
	@Override
	public int[] sort(final int[] theInts) {
		int swap;
		for (int i = 0; i < theInts.length; i++) {
			for (int j = 0; j < theInts.length - 1; j++) {
				if (theInts[j] > theInts[j + 1]) {
					swap = theInts[j];
					theInts[j] = theInts[j + 1];
					theInts[j + 1] = swap;
				}
			}
		}
		return theInts;
	}
	
	
	@Override
	public int[] sortWithTracking(final int[] theInts) {
		
		int swap;
		
		if (x < theInts.length - 1) {
			if (theInts[y] > theInts[y + 1] && y <= theInts.length - 2) {
				swap = theInts[y];
				theInts[y] = theInts[y + 1];
				theInts[y + 1] = swap;
				pointer = y + 1;
			}
			y++;
			if (y == theInts.length - 1) {
				x++;
				y = 0;
			}
		}
		
		
		if (x == theInts.length - 1) {
			x = 0;
			y = 0;
			pointer = -1;
		}
		
		
		return theInts;
	}
	
	public int getPointer() {
		return pointer;
	}

	@Override
	public void reset() {
		x = 0;
		y = 0;
		pointer = 0;
	}

}
