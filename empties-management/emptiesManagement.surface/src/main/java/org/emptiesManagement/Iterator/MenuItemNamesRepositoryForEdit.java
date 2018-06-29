package org.emptiesManagement.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements the IContainer and creates a IIterator object.
 * 
 * @author Timm Schneider
 *
 */
public class MenuItemNamesRepositoryForEdit implements IContainer {

	@Override
	public IIterator getIterator() {
		return new MenuItemNameIterator();
	}

	/**
	 * Class which implements IIterator and provides a List with the menu item names
	 * for the edit menu.
	 * 
	 * @author Timm Schneider
	 *
	 */
	private class MenuItemNameIterator implements IIterator {

		private int index;
		private List<String> names;

		/**
		 * Creates a new Iterator and fill the menu item names list with Strings.
		 */
		private MenuItemNameIterator() {
			fillList();
		}

		/**
		 * Fill the menu item names list with Strings.
		 */
		private void fillList() {
			names = new ArrayList<String>();
			names.add("Test");
			names.add("Test2");

			// add here more menu items ..

		}

		@Override
		public boolean hasNext() {

			if (index < names.size()) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {

			if (this.hasNext()) {
				return names.get(index++);
			}
			return null;
		}

	}

}
