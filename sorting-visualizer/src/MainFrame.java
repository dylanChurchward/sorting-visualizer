import javax.swing.JFrame;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MainFrame() {
		DisplayMain dm = new DisplayMain();
		this.setTitle("Sorting Algorithm Visualizer");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.add(dm);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		final MainFrame mf = new MainFrame();
	}
	
}
