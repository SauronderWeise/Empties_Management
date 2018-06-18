package org.emptiesManagement.buttons;

import javax.swing.JButton;

/**
 * Creates new JButtons and and sets the options for them.
 * 
 * @see #setButtionOptions(JButton)
 * @author Timm Schneider
 *
 */
public class NormalizedButton extends NormailzedButtonTemplate {

	private JButton button;

	/**
	 * Calls the {@link NormalizedButton#init(int, NormalizedButtonList)} method.
	 * 
	 * @param index
	 *            is the position in the list from which information is to be
	 *            retrieved.
	 * @param list
	 *            in which all information about the buttonNames are.
	 */
	public NormalizedButton(int index, NormalizedButtonList list) {
		this.init(index, list);
	}

	@Override
	protected void init(int index, NormalizedButtonList list) {
		this.button = new JButton(list.getListOfButtonNamesObjects(index).getNameOfButtonOnFrame());
		this.setButtionOptions(this.button);
		this.buttonsList.put(list.getListOfButtonNamesObjects(index).getNameOfButton(), this.button);
	}

}
