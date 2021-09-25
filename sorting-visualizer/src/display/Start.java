package display;
import javax.swing.JFrame;

public class Start extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Start() {
		UserInterface dm = new UserInterface();
		this.setTitle("Sorting Algorithm Visualizer");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.add(dm);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		final Start mf = new Start();
	}
	
}
