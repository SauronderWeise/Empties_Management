package org.emptiesManagement.gui;

import javax.swing.JFrame;

/**
 * The main frame of which the empties management program consists.
 * 
 * @author Timm Schneider
 *
 */
@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	/**
	 * Sets JFrame options of the MainFrame object like title, size of the frame,
	 * default close operation and relative location.
	 * 
	 * @param frameTitle
	 *            the title of the JFrame.
	 * @param width
	 *            the width of the JFrame.
	 * @param height
	 *            the height of the JFrame.
	 */
	public MainFrame(String frameTitle, int width, int height) {

		this.setTitle(frameTitle);
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

}
