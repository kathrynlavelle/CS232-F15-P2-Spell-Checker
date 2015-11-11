package edu.kings.cs.util;

/**
 * This class is a linked-list implementation of the Set<T> interface.
 * @author Kathryn Lavelle
 * @version 2015-11-10
 *
 * @param <T>
 */
public class LinkedSet<T> implements Set<T> {
	
	private Node first;
	private int size;
	
	/**
	 * Initializes an empty set.
	 */
	public LinkedSet() {
		first = null;
		size = 0;
	}
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
		return first == null;
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
		boolean added = false;
		if (!this.contains(newEntry)) {
			Node newNode = new Node(newEntry);
			newNode.setNext(first);
			first = newNode;
			added = true;
		}
		return added;
		
	}

	/**
	 * Removes a specific entry from this set, if possible.
	 * 
	 * @param anEntry
	 *            The entry to be removed.
	 * @return True if the removal was successful, or false if not.
	 */
	public boolean remove(T anEntry) {
		boolean removed = false;
		if (this.contains(anEntry)) {
			Node currNode = first;
			while (removed == false) {
				if (currNode.getData().equals(anEntry)) {
					currNode.setData(first.getData());
					remove();
					removed = true;
				}
				currNode = currNode.getNext();
			}
		}
		return removed;
	}

	/**
	 * Removes one unspecified entry from this set, if possible.
	 * 
	 * @return Either the removed entry, if the removal was successful, or null.
	 */
	public T remove() {
		T removedEntry = null;
		if (!isEmpty()) {
			Node oldfirst = first;
			first = oldfirst.getNext();
			removedEntry = oldfirst.getData();
			size--;
		}
		return removedEntry;
	}

	/** Removes all entries from this set. */
	public void clear() {
		first = null;
		size = 0;
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
		if (!isEmpty()) {
			Node currNode = first;
			while ((currNode != null) && (found == false)) {
				if (currNode.getData().equals(anEntry)) {
					found = true;
				}
				currNode = currNode.getNext();
			}
		}
		return found;
	}

	/**
	 * Retrieves all entries that are in this set.
	 * 
	 * @return A newly allocated array of all the entries in the set.
	 */
	public Object[] toArray() {
		Object[] entries = null;
		Node currNode = first;
		while (currNode != null) {
			entries = new Object[size];
			for (int i = 0; i < size; i++) {
				entries[i] = currNode.getData();
				currNode = currNode.getNext();
			}
		}
		return entries;
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
	
	/**
	 * Private inner class representing a node in this Bag.
	 */
	private class Node {

		private T data;
		private Node next;

		private Node(T element) {
			this(element, null);
		}

		private Node(T element, Node nextNode) {
			data = element;
			next = nextNode;
		}

		private T getData() {
			return data;
		}

		private void setData(T newData) {
			data = newData;
		}

		private Node getNext() {
			return next;
		}

		private void setNext(Node nextNode) {
			next = nextNode;
		}
	}

}
