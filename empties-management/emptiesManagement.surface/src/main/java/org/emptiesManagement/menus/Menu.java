package org.emptiesManagement.menus;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import org.emptiesManagement.Iterator.IContainer;
import org.emptiesManagement.Iterator.IIterator;
import org.emptiesManagement.Iterator.MenuItemNamesRepositoryForEdit;
import org.emptiesManagement.Iterator.MenuItemNamesRepositoryForFile;

/**
 * This class creates a new JMenu with it's JMenuItems.
 * 
 * @author Timm Schneider
 *
 */
@SuppressWarnings("serial")
public class Menu extends JMenu {

	// save all MenuItemNamesRepository objects in this list.
	private List<IContainer> repoList = new ArrayList<IContainer>();

	private MenuItemNamesRepositoryForFile file = new MenuItemNamesRepositoryForFile();
	private MenuItemNamesRepositoryForEdit edit = new MenuItemNamesRepositoryForEdit();

	private static int index = 0;

	/**
	 * Creates a new JMenu object.
	 * 
	 * @param name
	 *            of the menu.
	 */
	public Menu(String name) {
		super(name);
		repoList.add(file);
		repoList.add(edit);
		this.addMenuItem(this);
	}

	/**
	 * Adds JMenuItems to a menu.
	 * 
	 * @param menu
	 *            the items get added to.
	 */
	private void addMenuItem(Menu menu) {
		for (IIterator iterator = repoList.get(index).getIterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			menu.add(new JMenuItem(name));
		}
		index++;
	}
}
