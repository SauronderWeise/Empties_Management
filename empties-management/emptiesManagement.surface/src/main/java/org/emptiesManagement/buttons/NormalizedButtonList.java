package org.emptiesManagement.buttons;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides information about the button names.
 * 
 * @author Timm Schneider
 *
 */
public class NormalizedButtonList {

	private List<NormalizedButtonNames> listOfButtonNamesObjects = new ArrayList<NormalizedButtonNames>();
	private List<String> listOfButtonNames = new ArrayList<String>();
	private List<String> listOfButtonNamesOnFrame = new ArrayList<String>();

	/**
	 * Initialize and fill all lists.
	 */
	public NormalizedButtonList() {

		this.initializeListOfButtonNames();
		this.initializeListOfButtonNamesOnFrame();
		this.initializeListOfButtonNamesObjects();

	}

	/**
	 * Initialize and fill ListOfButtonNames.
	 */
	private void initializeListOfButtonNames() {

		String name = "addEntryButton";
		this.listOfButtonNames.add(name);

		name = "changeEntry";
		this.listOfButtonNames.add(name);

		name = "baseDataButton";
		this.listOfButtonNames.add(name);

		name = "evaluationButton";
		this.listOfButtonNames.add(name);

		name = "closeApplicationButton";
		this.listOfButtonNames.add(name);

		name = "conclusionButton";
		this.listOfButtonNames.add(name);

		// add new button names here...

	}

	/**
	 * Initialize and fill ListOfButtonNamesOnFrame.
	 */
	private void initializeListOfButtonNamesOnFrame() {

		String name = "Eintrag hinzufügen";
		this.listOfButtonNamesOnFrame.add(name);

		name = "Eintrag ändern";
		this.listOfButtonNamesOnFrame.add(name);

		name = "Stammdaten";
		this.listOfButtonNamesOnFrame.add(name);

		name = "Auswertung";
		this.listOfButtonNamesOnFrame.add(name);

		name = "Abschluss";
		this.listOfButtonNamesOnFrame.add(name);

		name = "Anwendung schließen";
		this.listOfButtonNamesOnFrame.add(name);

		// add new button names on frame here...
	}

	/**
	 * Initialize and fill ListOfButtonNamesObjects.
	 */
	private void initializeListOfButtonNamesObjects() {

		// Check if there is the same amount of entries in the lists, otherwise there
		// will be a NullPointerException.
		if (!(this.listOfButtonNames.size() == this.listOfButtonNamesOnFrame.size())) {
			System.err.println("Each button name also needs a name on the frame and vice versa.");
			return;
		}

		for (int i = 0; i < listOfButtonNames.size(); i++) {
			NormalizedButtonNames normalizedButtonNames = new NormalizedButtonNames(this.listOfButtonNames.get(i),
					this.listOfButtonNamesOnFrame.get(i));
			this.listOfButtonNamesObjects.add(normalizedButtonNames);
		}

	}

	/**
	 * Gets the value of the ListOfButtonNamesObjects.
	 * 
	 * @param index
	 *            is the position from which the value is determined.
	 * @return The value of the ListOfButtonNamesObjects.
	 */
	public NormalizedButtonNames getListOfButtonNamesObjects(int index) {
		return this.listOfButtonNamesObjects.get(index);
	}

	/**
	 * Checks if an index is already out of bounds.
	 * 
	 * @param index
	 *            which is checked.
	 * @return true if index is not out of bounds, else false.
	 */
	public boolean checkIfOutOfBounds(int index) {

		return index < this.listOfButtonNamesObjects.size();
	}
}
