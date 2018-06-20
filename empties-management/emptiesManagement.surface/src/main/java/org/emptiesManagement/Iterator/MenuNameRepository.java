package org.emptiesManagement.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements the IContainer and creates a IIterator object.
 * 
 * @author Timm Schneider
 *
 */
public class MenuNameRepository implements IContainer {

	@Override
	public IIterator getIterator() {
		return new MenuNameIterator();
	}

	/**
	 * Class which implements IIterator and provides a List with the menu names.
	 * 
	 * @author Timm Schneider
	 *
	 */
	private class MenuNameIterator implements IIterator {

		private int index;
		private List<String> names;
		
		/**
		 * Creates a new Iterator and fill the menu names list with Strings. 
		 */
		private MenuNameIterator() {
			fillList();	
		}

		/**
		 * Fill the menu names list with Strings.
		 */
		private void fillList() {
			names = new ArrayList<String>();
			names.add("Datei");
			names.add("Test");	
			
			// add here more menus ..
			
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
