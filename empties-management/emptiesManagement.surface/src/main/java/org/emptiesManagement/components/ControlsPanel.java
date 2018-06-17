package org.emptiesManagement.components;

import java.awt.GridBagLayout;

import javax.swing.JPanel;

/**
 * The ControlsPanel for all control elements in the bottom of the view.
 * 
 * @author Timm Schneider
 *
 */
@SuppressWarnings("serial")
public class ControlsPanel extends JPanel {
	
	/**
	 * Creates the ControlsPanel with a {@link GridBagLayout}.
	 */
	public ControlsPanel() {
		GridBagLayout gblControlsPanel = new GridBagLayout();
		gblControlsPanel.columnWidths = new int[] { 0, 0 };
		gblControlsPanel.rowHeights = new int[] { 0, 0, 0, 0 };
		gblControlsPanel.columnWeights = new double[] { 0.0, 1.0 };
		gblControlsPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0 };
		this.setLayout(gblControlsPanel);

	}

}
