// Visually displays a set of integers being sorted by popular sorting algorithms in real time. 
// Author: Dylan - last updated 9/17/21

/**
 * List of functionalities that need to included:
 * 
 * Start, stop, & clear buttons
 * Text collection - user chooses number of randomly generated integers to sort
 * JPanel for buttons and text collection on the bottom of the JFrame
 * JPanel to display the sorting on the main upper bulk of the JFrame
 * Algorithm buttons
 * 
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DisplayMain extends JFrame {

	/**
	 * Default Serial ID for JFrames.
	 */
	private static final long serialVersionUID = 1L;

	// ???

	// JPanels
	/**
	 * JPanel that houses the sub-JPanels, which contain all of the buttons. Sits at
	 * the bottom of the JFrame.
	 */
	private JPanel buttonsMasterPanel;

	/**
	 * JPanel on which the sorting is displayed.
	 */
	private JPanel sortingPanel;

	/**
	 * JPanel that houses the start/stop and clear buttons. Nested in
	 * buttonsMasterPanel. Sits to the left on the bottom of the JFrame.
	 */
	private JPanel leftButtonsPanel;

	/**
	 * JPanel that houses the input collection. Nested in buttonsMasterPanel. Sits
	 * on the center of the bottom of the JFrame.
	 */
	private JPanel centerButtonsPanel;

	/**
	 * JPanel that houses the algorithm buttons. Nested in buttonsMasterPanel. Sits
	 * on the right of the bottom of the JFrame.
	 */
	private JPanel rightButtonsPanel;

	// JButtons
	/**
	 * JButton that starts/stops the chosen sorting algorithm.
	 */
	private JButton startStopButton;

	/**
	 * JButtons that clears the chosen sorting algorithm.
	 */
	private JButton clearButton;

	/**
	 * JButton for selecting bubble sort.
	 */
	private JButton mergeSortButton;

	/**
	 * JButton for selecting bubble sort.
	 */
	private JButton quickSortButton;

	/**
	 * JButton for selecting bubble sort.
	 */
	private JButton radixSortButton;

	/**
	 * JButton for selecting bubble sort.
	 */
	private JButton heapSortButton;

	/**
	 * JButton for selecting bubble sort.
	 */
	private JButton bubbleSortButton;

	/**
	 * JFormattedTextField for user input collection.
	 */
	private JTextField inputCollector;

	/**
	 * JLabel for test on the centerButtons JPanel.
	 */
	private JLabel inputInstructions;

	/**
	 * Private constructor for this class.
	 */
	private DisplayMain() {
		setup();
	}

	/**
	 * TODO!!!
	 */
	private void setup() {
		/**
		 * Setup parameters such as exiting behavior, size of the JFrame, visibility of
		 * the JFrame, and the layout.
		 */
		this.setTitle("Sorting Algorithm Visualizer");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setLayout(new BorderLayout());

		// Instantiate JPanels.
		sortingPanel = new JPanel();
		buttonsMasterPanel = new JPanel();
		leftButtonsPanel = new JPanel();
		centerButtonsPanel = new JPanel();
		rightButtonsPanel = new JPanel();

		/**
		 * Set the layouts of all JPanels and nests the left, center, and right JPanels
		 * in the buttonsMasterPanel.
		 */
		buttonsMasterPanel.setLayout(new BorderLayout());
		leftButtonsPanel.setLayout(new FlowLayout());
		centerButtonsPanel.setLayout(new FlowLayout());
		rightButtonsPanel.setLayout(new FlowLayout());
		buttonsMasterPanel.add(leftButtonsPanel, BorderLayout.WEST);
		buttonsMasterPanel.add(centerButtonsPanel, BorderLayout.CENTER);
		buttonsMasterPanel.add(rightButtonsPanel, BorderLayout.EAST);

		// Set background colors of the JPanels.
		sortingPanel.setBackground(Color.DARK_GRAY);
		rightButtonsPanel.setBackground(Color.yellow);
		centerButtonsPanel.setBackground(Color.yellow);
		leftButtonsPanel.setBackground(Color.yellow);

		// Instantiate JButtons & add actions listeners to them.
		startStopButton = new JButton("          Start           ");
		clearButton = new JButton("Clear Algorithm");
		mergeSortButton = new JButton("Merge Sort");
		radixSortButton = new JButton("Radix Sort");
		heapSortButton = new JButton("Heap Sort");
		quickSortButton = new JButton("Quick Sort");
		bubbleSortButton = new JButton("Bubble Sort");
		startStopButton.addActionListener(new StartStopListener());
		clearButton.addActionListener(new ClearListener());
		mergeSortButton.addActionListener(new MergeSortListener());
		radixSortButton.addActionListener(new RadixSortListener());
		heapSortButton.addActionListener(new HeapSortListener());
		quickSortButton.addActionListener(new QuickSortListener());
		bubbleSortButton.addActionListener(new BubbleSortListener());

		// Instantiate, add actionListen to, & setup JTextField.
		inputCollector = new JTextField();
		inputCollector.setColumns(4);
		inputCollector.addActionListener(new InputListener());

		// Instantiate, set font size, set font style, & set font color of JLabel.
		inputInstructions = new JLabel("To choose the number of random integers to sort, "
				+ "type an integer from 100 to 1000 then press enter.");
		inputInstructions.setFont(new Font("Serif", Font.BOLD, 16));
		inputInstructions.setForeground(Color.black);

		// Add JButtons to leftButtonsPanel JPanel.
		rightButtonsPanel.add(startStopButton);

		// Add JButtons to rightButtonsPanel JPanel.
		leftButtonsPanel.add(bubbleSortButton);
		leftButtonsPanel.add(mergeSortButton);
		leftButtonsPanel.add(radixSortButton);
		leftButtonsPanel.add(heapSortButton);
		leftButtonsPanel.add(quickSortButton);

		// Add JFormattedTextField and inputInstruction JLabel to centerButtons JPanel.
		centerButtonsPanel.add(inputInstructions);
		centerButtonsPanel.add(inputCollector);

		// Add main JPanels to JFrame.
		this.add(sortingPanel, BorderLayout.CENTER);
		this.add(buttonsMasterPanel, BorderLayout.SOUTH);

		// Set JFrame as visible.
		this.setVisible(true);

	}

	// Action listener for the startStop button.
	private class StartStopListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

	// Action listener for the bubbleSort button.
	private class BubbleSortListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

	// Action listener for the mergeSort button.
	private class MergeSortListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

	// Action listener for the heapSort button.
	private class HeapSortListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

	// Action listener for the quickSort button.
	private class QuickSortListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

	// Action listener for the radixSort button.
	private class RadixSortListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

	// Action listener for the clear button.
	private class ClearListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

	// Action listener for the clear button.
	private class InputListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

	/**
	 * TODO!!!
	 * 
	 * @param args
	 */
	public static void main(final String[] theArgs) {
		DisplayMain dm = new DisplayMain();
	}
}
