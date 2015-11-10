package edu.kings.cs.util;

/**
 * 
 * @author Kathryn Lavelle
 * @version 2015-11-10
 *
 * @param <T>
 */
public class LinkedSet<T> implements Set<T> {
	
	private int size;
	
	/**
	 * Gets the current number of entries in this collection.
	 * 
	 * @return The integer number of entries currently in this collection.
	 */
	public int size() {
		return size;
	}

	/**
	 * Sees whether this collection is empty.
	 * 
	 * @return True if this collection is empty, or false if not.
	 */
	public boolean isEmpty() {
		boolean isEmpty = true;
		if (size > 0) {
			isEmpty = false;
		}
		return isEmpty;
	}
	
	/**
	 * Adds a new entry to this set, avoiding duplicates.
	 * 
	 * @param newEntry
	 *            The object to be added as a new entry.
	 * @return True if the addition is successful, or false if the item already
	 *         is in the set.
	 */
	public boolean add(T newEntry) {
		boolean wasAdded = true;
		return wasAdded;
	}

	/**
	 * Removes a specific entry from this set, if possible.
	 * 
	 * @param anEntry
	 *            The entry to be removed.
	 * @return True if the removal was successful, or false if not.
	 */
	public boolean remove(T anEntry) {
		boolean wasRemoved = false;
		return wasRemoved;
	}

	/**
	 * Removes one unspecified entry from this set, if possible.
	 * 
	 * @return Either the removed entry, if the removal was successful, or null.
	 */
	public T remove() {
		T removedEntry = null;
		return removedEntry;
	}

	/** Removes all entries from this set. */
	public void clear() {
		
	}

	/**
	 * Tests whether this set contains a given entry.
	 * 
	 * @param anEntry
	 *            The entry to locate.
	 * @return True if the set contains anEntry, or false if not.
	 */
	public boolean contains(T anEntry) {
		boolean found = false;
		return found;
	}

	/**
	 * Retrieves all entries that are in this set.
	 * 
	 * @return A newly allocated array of all the entries in the set.
	 */
	public Object[] toArray() {
		Object[] array = null;
		return array;
	}
	
	/**
	 * Creates a new set that combines the contents of this set and anotherSet. Formally, the
	 * union of two sets consists of their contents combined into a new set.  The union method 
	 * returns a new set that contains the union of the collection receiving the call to the 
	 * method and the collection that is the method's one argument. The union of two sets may 
	 * not contain duplicate items.
	 * 
	 * @param anotherSet
	 *            The set that is to be added.
	 * @return A combined set.
	 */
	public Set<T> union(Set<T> anotherSet) {
		Set<T> set = null;
		return set;
	}

	/**
	 * Creates a new set that contains those objects that occur in both this set
	 * and anotherSet.  Formally, the intersection of two sets consists of a new set
	 * of the entries that occur in both sets.  That is it contains the overlapping 
	 * entries.  The intersection method returns a new set that is the intersection 
	 * of the set receiving the call to the method and the set that is the method's 
	 * one argument.  Note that the intersection may not contain duplicate items.
	 * 
	 * @param anotherSet
	 *            The set that is to be compared.
	 * @return A combined set.
	 */
	public Set<T> intersection(Set<T> anotherSet) {
		Set<T> set = null;
		return set;
	}

	/**
	 * Creates a new set of objects that would be left in this set after
	 * removing those that also occur in anotherSet.  Formally, the difference 
	 * of two sets is a new set of the entries that would be left in one set after 
	 * removing those that also occur in the second.  The difference method returns 
	 * a new set that is the difference of the receiving set and the set that is the 
	 * method's one argument.  Note that the difference may not contain duplicate items.
	 * 
	 * @param anotherSet
	 *            The set that is to be removed.
	 * @return A combined set.
	 */
	public Set<T> difference(Set<T> anotherSet) {	
		Set<T> set = null;
		return set;
	}

}
