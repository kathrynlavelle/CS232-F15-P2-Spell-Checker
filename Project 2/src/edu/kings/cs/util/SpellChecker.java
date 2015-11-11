package edu.kings.cs.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Kathryn Lavelle
 * @version 2015-11-11
 */
public class SpellChecker {
	
	private Set<String> dictionary;
	private Bag<String> readDocument;
	private Set<String> readDocumentNoDuplicates;
	private Set<String> correctWords;
	private Set<String> incorrectWords;
	private boolean modified = false;
	
	/**
	 * 
	 * @throws FileNotFoundException Thrown if no dictionary file was found by the
	 * name of "dictionary.txt".
	 */
	public SpellChecker() throws FileNotFoundException {
		// Initialize empty dictionary collection.
		dictionary = new LinkedSet<String>();
		
		// Add contents of provided "dictionary.txt" file to dictionary.
		File file = new File("tempDictionary.txt");
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				dictionary.add(line);
			}
			scanner.close();
			System.out.println("dictionary initialized");
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occurred while initializing program dicitonary. File not found.");
		}
	}
	
	/**
	 * Prompts user for name of file that contains the read document.
	 * Scans file and reads words one at a time storing them in a collection.
	 * After, displays message indicating number of words found in that document.
	 */
	public void readDocument() throws FileNotFoundException{
		// Initialize 2 empty read document collections, one without duplicate words.
		readDocument = new LinkedBag<String>();
		readDocumentNoDuplicates = new LinkedSet<String>();
		
		// Prompt user for name of read document file.
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the file you would like checked with extension: ");
		String readDocFileName = keyboard.nextLine();
		
		// If exists, open file specified by user. Then add words to both collections.
		File file = new File(readDocFileName);
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String word = scanner.next();
				readDocument.add(word);
				readDocumentNoDuplicates.add(word);
			}
			scanner.close();
			System.out.println("Document read");

			// Display message showing how many words were in the read document.
			System.out.println("This document contains " + readDocument.size() + " words.");
			System.out.println("Set contains " + readDocumentNoDuplicates.size() + " words");
		}
		catch (FileNotFoundException e) {
			readDocument = null;
			readDocumentNoDuplicates = null;
			System.out.println("Error: File '" + readDocFileName + "' not found. Please try again.");
		}
	}
	
	/**
	 * Lists all the words in the read document that are spelled correctly.
	 * These words are also found in the programs dictionary. Correctly spelled
	 * words are not listed more than once.
	 */
	public void listCorrectWords() {
		// Initialize empty corretWords collection.
		correctWords = new LinkedSet<String>();
		if (readDocumentNoDuplicates != null) {
			// Add all of the words from the readDocument that are also in the dictionary to the
			// correctWords collection.
			correctWords = readDocumentNoDuplicates.intersection(dictionary);
			
			// List the correctly spelled words from the read document.
			System.out.println("Correctly spelled words:");
			Object[] correctWordsArray = correctWords.toArray();
			for (int i = 0; i < correctWordsArray.length; i++) {
				System.out.println(correctWordsArray[i]);
			}
		}
		else {
			System.out.println("You have not read in a document to be spell checked. Please indicate file name"
					+ " before using this feature.");
		}
	}
	
	/**
	 * Lists all the words in the read document that are spelled incorrectly.
	 * These words are not in the programs dictionary. Incorrect words are not
	 * be listed more than once.
	 */
	public void listIncorrectWords() {
		incorrectWords = new LinkedSet<String>();
		if (readDocument != null) {
			// TO-DO
		}
		else {
			System.out.println("You have not read in a document to be spell checked. Please indicate file name"
					+ " before using this feature.");
		}
	}
	
	/**
	 * User reviews incorrectly spelled words one at a time, and decides if the
	 * word is properly spelled. If user indicates a word is spelled correctly,
	 * it is added to the programs dictionary. Words listed for approval are not
	 * listed more than once.
	 */
	public void approve() {
		if (readDocument != null) {
			// TO-DO
		}
		else {
			System.out.println("You have not read in a document to be spell checked. Please indicate file name"
					+ " before using this feature.");
		}
	}
	
	/**
	 * User reviews incorrectly spelled words and decides if they want to approve
	 * them all. If so, all words are added to the programs dictionary. Incorrect words
	 * are listed more than once.
	 */
	public void approveAll() {
		if (readDocument != null) {
			// TO-DO
		}
		else {
			System.out.println("You have not read in a document to be spell checked. Please indicate file name"
					+ " before using this feature.");
		}
	}
	
	/**
	 * Returns the number of times a word appears in the read document. 
	 * 
	 * @return count The number of times a word appears in a document.
	 */
	public int getFrequencyOf(String word) {
		int frequency = 0;
		if (readDocument != null) {
			frequency = readDocument.getFrequencyOf(word);
			System.out.println("Frequency: " + frequency);
		}
		else {
			System.out.println("You have not read in a document. Please indicate file name"
					+ " before using this feature.");
		}
		return frequency;
	}
	
	/**
	 * Displays message stating how many words are in the programs dictionary.
	 */
	public void dictionarySize() {
		System.out.println("There are currently " + dictionary.size() + " words in the dictionary.");	
	}
	
	/**
	 * Saves the contents of the programs dictionary to the "dictionary.txt" file.
	 * (Replaces current contents and writes each word on a new line)
	 */
	public void saveDictionary() {
		// TO-DO
		System.out.println("Saving...");
	}
	
	/**
	 * 
	 * @return modified Whether or not the programs dictionary was modified.
	 */
	public boolean getModified() {
		return modified;
	}

}
