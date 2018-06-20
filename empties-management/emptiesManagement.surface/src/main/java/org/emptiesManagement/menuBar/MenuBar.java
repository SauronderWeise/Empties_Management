package org.emptiesManagement.menuBar;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import org.emptiesManagement.Iterator.IIterator;
import org.emptiesManagement.Iterator.MenuNameRepository;

/**
 * This class creates the JMenuBar.
 * 
 * @author Timm Schneider
 *
 */
@SuppressWarnings("serial")
public class MenuBar extends JMenuBar {

	MenuNameRepository menuNamesRepository = new MenuNameRepository();
	
	/**
	 * Creates a new JMenuBar object.
	 */
	public MenuBar() {
		super();
		this.fillMenuBar();
	}
	
	/**
	 * Fill the JMenuBar with entries.
	 */
	private void fillMenuBar() {
		
		// go threw loop as long the hasNext() method returns true.
		for (IIterator iterator = menuNamesRepository.getIterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			this.add(new JMenu(name));
		}

	}

}
