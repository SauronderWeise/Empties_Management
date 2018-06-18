package org.emptiesManagement.components;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

import org.emptiesManagement.buttons.NormalizedButton;
import org.emptiesManagement.buttons.NormalizedButtonList;
import org.emptiesManagement.gui.util.GBCBuilder;

/**
 * The ButtonsPanel for all button elements in the middle of the view.
 * 
 * @author Timm Schneider
 *
 */
@SuppressWarnings("serial")
public class ButtonsPanel extends JPanel {

	private final NormalizedButtonList list = new NormalizedButtonList();

	/**
	 * Creates the ButtonsPanel with a {@link GridBagLayout}.
	 */
	public ButtonsPanel() {

		this.editButtonPanel();

	}

	/**
	 * Adds buttons to the button panel.
	 */
	private void editButtonPanel() {

		GridBagLayout gblLeftButtonsPanel = new GridBagLayout();
		this.setLayout(gblLeftButtonsPanel);

		int index = 0;
		while (list.checkIfOutOfBounds(index)) {
			GridBagConstraints gbcButton = new GBCBuilder()//
					.insets(25, 25, 25, 25).gridy(index % 3).gridx(index / 3).build();
			NormalizedButton button = new NormalizedButton(index, list);
			this.add(button.getButton(list.getListOfButtonNamesObjects(index).getNameOfButton()), gbcButton);
			index++;
		}
	}

}
