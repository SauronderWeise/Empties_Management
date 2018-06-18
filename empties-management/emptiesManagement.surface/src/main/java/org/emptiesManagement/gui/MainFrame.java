package org.emptiesManagement.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.emptiesManagement.components.ButtonsPanel;
import org.emptiesManagement.components.ControlsPanel;
import org.emptiesManagement.gui.util.GBCBuilder;

/**
 * The main frame of which the empties management program consists.
 * 
 * @author Timm Schneider
 *
 */
@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	private JPanel contentPane;
	private ButtonsPanel buttonsPanel;
	private ControlsPanel controlsPanel;

	/**
	 * Sets JFrame options of the MainFrame object like title, size of the frame,
	 * default close operation, resizable, and relative location.
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
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		this.createContentPane();

//		this.createTopSpacePanel();
		this.createButtonsPanel();
//		this.createControlsPanel();
//		this.createBottomSpacePanel();
	}

	/**
	 * Creates a new content pane with a {@link GridBagLayout}.
	 */
	private void createContentPane() {
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(this.contentPane);

		GridBagLayout gblContentPane = new GridBagLayout();
		gblContentPane.columnWeights = new double[] { 1.0 };
		gblContentPane.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0 };

		this.contentPane.setLayout(gblContentPane);

	}

//	/**
//	 * Creates a new panel that creates space to the top of the frame.
//	 */
//	private void createTopSpacePanel() {
//		JPanel upperSpace = new JPanel();
//		GridBagConstraints gbcUpperSpace = new GBCBuilder()//
//				.fill(GridBagConstraints.BOTH).build();
//		this.contentPane.add(upperSpace, gbcUpperSpace);
//	}
	
	/**
	 * Create a new {@link ButtonsPanel} where the buttons are located.
	 */
	private void createButtonsPanel() {
		this.buttonsPanel = new ButtonsPanel();
		GridBagConstraints gbcImagesPanel = new GBCBuilder()//
				.fill(GridBagConstraints.BOTH).gridy(1).build();
		this.contentPane.add(this.buttonsPanel, gbcImagesPanel);
	}
	
//	/**
//	 * Create a new {@link ControlsPanel} where the controls elements are located.
//	 */
//	private void createControlsPanel() {
//		this.controlsPanel = new ControlsPanel();
//		GridBagConstraints gbcControlsPanel = new GBCBuilder()//
//				.fill(GridBagConstraints.BOTH).gridy(2).build();
//		this.contentPane.add(this.controlsPanel, gbcControlsPanel);
//
//	}
	
//	/**
//	 * Creates a new panel that creates space to the bottom of the frame.
//	 */
//	private void createBottomSpacePanel() {
//		JPanel lowerSpace = new JPanel();
//		GridBagConstraints gbcUpperSpace = new GBCBuilder()//
//				.fill(GridBagConstraints.BOTH).gridy(3).build();
//		this.contentPane.add(lowerSpace, gbcUpperSpace);
//
//	}

}
