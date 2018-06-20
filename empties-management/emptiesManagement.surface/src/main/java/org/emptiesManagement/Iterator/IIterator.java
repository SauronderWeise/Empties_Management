package org.emptiesManagement.Iterator;

/**
 * Interface for Iterator Objects.
 * 
 * @author Timm Schneider
 *
 */
public interface IIterator {

	/**
	 * Checks if the list object has any entry at the next position.
	 * 
	 * @return true if there is such an entry, else return false.
	 */
	public boolean hasNext();

	/**
	 * Gets the current entry from the list.
	 * 
	 * @return the element of the list as indicated by the index.
	 */
	public Object next();

}
