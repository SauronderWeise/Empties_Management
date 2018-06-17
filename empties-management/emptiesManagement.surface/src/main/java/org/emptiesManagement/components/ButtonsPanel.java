package org.emptiesManagement.components;

import java.awt.GridBagLayout;

import javax.swing.JPanel;

/**
 * The ButtonsPanel for all button elements in the middle of the view.
 * 
 * @author Timm Schneider
 *
 */
@SuppressWarnings("serial")
public class ButtonsPanel extends JPanel {
	
	/**
	 * Creates the ButtonsPanel with a {@link GridBagLayout}.
	 */
	public ButtonsPanel() {
		GridBagLayout gblButtonsPanel = new GridBagLayout();
		gblButtonsPanel.columnWidths = new int[] { 200, 100, 200 };
		gblButtonsPanel.columnWeights = new double[] { 1.0, 1.0, 1.0 };
		gblButtonsPanel.rowWeights = new double[] { 1.0 };
		this.setLayout(gblButtonsPanel);

	}
}
