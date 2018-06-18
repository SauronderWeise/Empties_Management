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
		this.setLayout(gblControlsPanel);

	}

}
