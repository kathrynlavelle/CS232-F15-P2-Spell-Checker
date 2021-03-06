package edu.kings.cs.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Uses SpellChecker to spell-check a document provided by the user.
 * Read document should be found in the root directory of this project, and should
 * be the same level as the src folder.
 * @author Kathryn Lavelle
 * @version 2015-11-13
 */
public class Main {

	/**
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * Displays a menu of options to the user in order to read and spell check a document.
	 * @param args An array of String arguments.
	 * @throws 
	 */
	public static void main(String[] args) throws IOException {
		// Initialize program dictionary.
		SpellChecker sc = new SpellChecker();
		System.out.println("Welcome!");
		
		// Create scanner to read input from keyboard.
		Scanner keyboard = new Scanner(System.in);
		
		// Boolean flag to re-prompt user for input.
		boolean proceed = true;
		
		// While user wants to continue
		while (proceed) {
			// Displays a menu of options to the user.
			System.out.println("\nSpell Checker Menu:");
			System.out.println("1) Read Document");
			System.out.println("2) List Correct Words");
			System.out.println("3) List Incorrect Words");
			System.out.println("4) Approve");
			System.out.println("5) Approve all");
			System.out.println("6) Get Frequency of");
			System.out.println("7) Dictionary Size");
			System.out.println("8) Save Dictionary\n");
			
			// Prompts the user for the option they wish to execute.
			System.out.print("Select option number (or 'quit' to exit): ");
			
			// Retrieves the number option that user chooses.
			String input = keyboard.next();
			
			// For each option call the appropriate SpellChecker method.
			switch(input.toLowerCase()) {
			case "1":		sc.readDocument();
							break;
			case "2":		sc.listCorrectWords();
							break;
			case "3":		sc.listIncorrectWords();
							break;
			case "4":		sc.approve();
							break;
			case "5":		sc.approveAll();
							break;
			case "6":		System.out.print("Get frequency of: ");
							String word = keyboard.next();
							sc.getFrequencyOf(word);
							break;
			case "7":		sc.dictionarySize();
							break;
			case "8":		sc.saveDictionary();
							break;
			case "quit":	proceed = false;
							if (sc.getModified()) {
								System.out.print("You have modified the program's dicitonary. If you would like to "
										+ "permanantly save your changes enter 'Y', otherwise enter 'N': ");
								String save = keyboard.next();
								if (save.equalsIgnoreCase("y")) {
									sc.saveDictionary();
								}
								else {
									System.out.println("No changes were made to the program's dicitonary.");
								}
							}
							break;
			default:		System.out.println("Sorry, I did not understand your response. Please try again.");
							proceed = true;
			}
		}
		// Close scanner.
		keyboard.close();
		
		// Exit program.
		System.out.println("Goodbye!");
		System.exit(0);
	}
}