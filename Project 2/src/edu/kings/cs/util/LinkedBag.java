package edu.kings.cs.util;

/**
 * This class is a linked-list implementation of the Bag<T> interface.
 * @author Kathryn Lavelle
 * @version 2015-11-10
 *
 * @param <T>
 */
public class LinkedBag<T> implements Bag<T> {
	
	private Node first;
	private int size;
	
	/**
	 * Initializes an empty bag.
	 */
	public LinkedBag() {
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
	 * Adds a new entry to this bag.
	 * 
	 * @param newEntry
	 *            The object to be added as a new entry.
	 * @return True if the addition is successful, or false if not.
	 */
	public boolean add(T newEntry) {
		Node newNode = new Node(newEntry);
		newNode.setNext(first);
		first = newNode;
		return true;
		
	}

	/**
	 * Removes one unspecified entry from this bag, if possible.
	 * 
	 * @return Either the removed entry, if the removal. was successful, or
	 *         null.
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

	/**
	 * Removes one occurrence of a given entry from this bag.
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

	/** Removes all entries from this bag. */
	public void clear() {
		first = null;
		size = 0;
	}

	/**
	 * Counts the number of times a given entry appears in this bag.
	 * 
	 * @param anEntry
	 *            The entry to be counted.
	 * @return The number of times anEntry appears in the bag.
	 */
	public int getFrequencyOf(T anEntry) {
		int frequency = 0;
		if (this.contains(anEntry)) {
			Node currNode = first;
			while (currNode != null) {
				if (currNode.getData().equals(anEntry)) {
					frequency++;
				}
				currNode = currNode.getNext();
			}
		}
		return frequency;
		
	}

	/**
	 * Tests whether this bag contains a given entry.
	 * 
	 * @param anEntry
	 *            The entry to locate.
	 * @return True if the bag contains anEntry, or false if not.
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
	 * Retrieves all entries that are in this bag.
	 * 
	 * @return A newly allocated array of all the entries in the bag. Note: If
	 *         the bag is empty, the returned array is empty.
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
	 * Creates a new bag that combines the contents of this bag and anotherBag.  Formally, the
	 * union of two bags consists of their contents combined into a new bag.  The union method 
	 * returns a new bag that contains the union of the bag receiving the call to the method 
	 * and the bag that is the method's one argument. Note that the union might contain duplicate 
	 * items.  For example, if object, x, occurs five times in one bag and twice in another, 
	 * the union of these bags contain x seven times.
	 * 
	 * @param anotherBag
	 *            The bag that is to be added.
	 * @return A combined bag.
	 */
	public Bag<T> union(Bag<T> anotherBag) {
		Bag<T> bag = null;
		return bag;
		
	}

	/**
	 * Creates a new bag that contains those objects that occur in both this bag
	 * and anotherBag.  Formally, the intersection two bags consists of a new bag
	 * collection of the entries that occur in both bags.  That is it contains the 
	 * overlapping entries.  The intersection method returns a new bag that is the 
	 * intersection of the bag receiving the call to the method and the bag that is 
	 * the method's one argument.  Note that the intersection might contain duplicate 
	 * items.  For example, if object x occurs five times in one bag and twice in 
	 * another, the intersection of these bags contains $x$ twice.
	 * 
	 * @param anotherBag
	 *            The bag that is to be compared.
	 * @return A combined bag.
	 */
	public Bag<T> intersection(Bag<T> anotherBag) {
		Bag<T> bag = null;
		return bag;
	}

	/**
	 * Creates a new bag of objects that would be left in this bag after
	 * removing those that also occur in anotherBag.  Formally, the difference of two 
	 * bags is a new bag of the entries that would be left in one bag after removing 
	 * those that also occur in the second.  The difference method returns a new bag 
	 * that is the difference of the receiving bag and the bag that is the method's one 
	 * argument.  Note that the difference of two bags might contain duplicate items.  
	 * For example, if object $x$ occurs five times in one bag and twice in another, 
	 * the difference of these bags contains $x$ three times.
	 * 
	 * @param anotherBag
	 *            The bag that is to be removed.
	 * @return A combined bag.
	 */
	public Bag<T> difference(Bag<T> anotherBag) {
		Bag<T> bag = null;
		return bag;
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

