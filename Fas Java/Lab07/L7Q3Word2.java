/* 
Philip Woulfe
Fas Java 2014/11/20

Write a Java application program to allow the end user to enter a word.  Your program
should report whether or not the word entered is a valid or invalid word.  Valid words are 
words that end with a consonant and are directly preceded by a vowel e.g., paper, book are 
examples of valid words whereas bottle, silly are examples of invalid words.

*/

import javax.swing.JOptionPane;

public class L7Q3Word2 {
	
	public static void main(String[] args) {
		
		// declare variables
			String input, output, consonants = "bcdfghjklmnpqrstvwxyz", vowels = "aeiou";
			int messageType = -1;
		
		// take input from user 
		do {
			input = JOptionPane.showInputDialog(null, "Enter a word to test validity:");
		} while (input.equals(""));
		
		// trim and lowercase
		input = input.trim();
		input = input.toLowerCase();
			
			// check if single word
			if (input.indexOf(" ") == -1) {
			
				// test if valid
				if (consonants.lastIndexOf(input.substring(input.length() - 1)) != -1) {
					if (vowels.indexOf(input.substring(input.length() - 2, input.length() -1 )) != -1) {
						output = "valid";
					} else {
						output = "invalid";
					}
				} else {
					output = "invalid";
				}
				
				
			} else {
				output = "Error, please enter a single word";
				messageType = 0;
			}
		
		// output answer
		JOptionPane.showMessageDialog(null, output, "Result", messageType);
		System.exit(0);
	}
}