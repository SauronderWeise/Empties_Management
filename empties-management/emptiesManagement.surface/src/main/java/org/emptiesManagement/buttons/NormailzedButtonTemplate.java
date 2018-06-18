package org.emptiesManagement.buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.util.TreeMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import org.emptiesManagement.gui.util.Icon;

/**
 * This class provides information and settings of a standard button.
 * 
 * @author Timm Schneider
 *
 */
public abstract class NormailzedButtonTemplate {

	protected Icon icon = new Icon("Blume.png");
	protected TreeMap<String, JButton> buttonsList = new TreeMap<String, JButton>();

	/**
	 * Sets the button options like size, border, background, icon and alignment.
	 * 
	 * @param button
	 *            we want to set the options of.
	 */
	protected void setButtionOptions(JButton button) {
		button.setPreferredSize(new Dimension(200, 50));
		button.setFocusable(false);
		button.setBorder(new LineBorder(new Color(34, 139, 34), 4));
		button.setBackground(new Color(229, 255, 229));
		button.setIconTextGap(20);
		button.setIcon(new ImageIcon(icon.getImage()));
		button.setHorizontalAlignment(SwingConstants.LEFT);

	}

	/**
	 * Returns the JButton associated with the key.
	 * 
	 * @param key
	 *            the buttonName is the key to get the JButton object in the
	 *            TreeMap.
	 * @return the JButton object.
	 */
	public JButton getButton(String key) {
		return buttonsList.get(key);
	}

	/**
	 * Initialize a new JButton.
	 * 
	 * @param index
	 *            position of the list where the names are located.
	 */
	abstract protected void init(int index, NormalizedButtonList list);

}
