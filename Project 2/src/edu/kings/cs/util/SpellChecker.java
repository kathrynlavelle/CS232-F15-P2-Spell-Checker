package edu.kings.cs.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Kathryn Lavelle
 * @version 2015-11-10
 */
public class SpellChecker {
	
	private LinkedSet<String> dictionary;
	private LinkedBag<String> readDocument;
	private LinkedSet<String> readDocumentNoDuplicates;
	private LinkedSet<String> correctWords;
	private LinkedSet<String> incorrectWords;
	private boolean modified = false;
	
	/**
	 * 
	 * @throws FileNotFoundException Thrown if no dictionary file was found by the
	 * name of "dictionary.txt".
	 */
	public SpellChecker() throws FileNotFoundException {
		// Initialize dictionary with contents of provided "dictionary.txt" file.
		dictionary = new LinkedSet<String>();
		File file = new File("tempDictionary.txt");
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				dictionary.add(line);
			}
			scanner.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occurred while initializing program dicitonary. File not found.");
		}
		
		System.out.println("dictionary initialized size: " + dictionary.size());
	}
	
	/**
	 * Prompts user for name of file that contains the read document.
	 * Scans file and reads words one at a time storing them in a collection.
	 * After, displays message indicating number of words found in that document.
	 */
	public void readDocument() {
		readDocument = new LinkedBag<String>();
		readDocumentNoDuplicates = new LinkedSet<String>();
	}
	
	/**
	 * Lists all the words in the read document that are spelled correctly.
	 * These words are also found in the programs dictionary. Correctly spelled
	 * words are not listed more than once.
	 */
	public void listCorrectWords() {
		correctWords = new LinkedSet<String>();
		
	}
	
	/**
	 * Lists all the words in the read document that are spelled incorrectly.
	 * These words are not in the programs dictionary. Incorrect words are not
	 * be listed more than once.
	 */
	public void listIncorrectWords() {
		incorrectWords = new LinkedSet<String>();
	}
	
	/**
	 * User reviews incorrectly spelled words one at a time, and decides if the
	 * word is properly spelled. If user indicates a word is spelled correctly,
	 * it is added to the programs dictionary. Words listed for approval are not
	 * listed more than once.
	 */
	public void approve() {
		// TO-DO1
	}
	
	/**
	 * User reviews incorrectly spelled words and decides if they want to approve
	 * them all. If so, all words are added to the programs dictionary. Incorrect words
	 * are listed more than once.
	 */
	public void approveAll() {
		// TO-DO
		
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
