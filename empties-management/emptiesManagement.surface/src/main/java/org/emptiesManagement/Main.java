package org.emptiesManagement;

import java.awt.EventQueue;

import org.emptiesManagement.gui.MainFrame;

/**
 * The main class of empties-management.
 * 
 * @author Timm Schneider
 */
public class Main {

	/**
	 * The constructor of the Main class, calls the {@link #createMainFrame()}
	 * Method.
	 */
	public Main() {
		createMainFrame();
	}

	/**
	 * Initialize three new variables to pass them to the constructor of the
	 * MainFrame class. The parameters specify the name, width and height of the new
	 * MainFrame object.
	 * 
	 * @see org.emptiesManagement.gui.MainFrame#MainFrame(String, int, int)
	 */
	private void createMainFrame() {

		final String frameTitle = "Pfandverwaltung";
		final int width = 600;
		final int height = 400;

		MainFrame mainFrame = new MainFrame(frameTitle, width, height);
		mainFrame.setVisible(true);

	}

	/**
	 * The main method of empties management program.
	 * 
	 * @param args
	 *            arguments of command line.
	 */
	public static void main(String[] args) {

		Runnable runnable = () -> {
			@SuppressWarnings("unused")
			Main main = new Main();
		};
		EventQueue.invokeLater(runnable);

	}

}
