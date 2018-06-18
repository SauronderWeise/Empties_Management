package org.emptiesManagement.buttons;

public class NormalizedButtonNames {

	private String NameOfButton;
	private String NameOfButtonOnFrame;

	/**
	 * This class contains the two name Strings of the JButton in the created
	 * objects.
	 * 
	 * @param buttonName
	 *            the button name in java.
	 * @param buttonNameOnFrame
	 *            the button name on the screen for the user.
	 */
	public NormalizedButtonNames(String buttonName, String buttonNameOnFrame) {
		this.NameOfButton = buttonName;
		this.NameOfButtonOnFrame = buttonNameOnFrame;
	}

	/**
	 * Gets the name of the button.
	 * 
	 * @return NameOfButton.
	 */
	public String getNameOfButton() {
		return NameOfButton;
	}

	/**
	 * Gets the name of the button on frame.
	 * 
	 * @return NameOfButtonOnFrame.
	 */
	public String getNameOfButtonOnFrame() {
		return NameOfButtonOnFrame;
	}

}
