/* 
Philip Woulfe
Fas Java 2014/11/25

When forming plurals of common nouns that end in y in English the following rules are observed:
 Common nouns ending in y preceded by a vowel form their plurals by adding s, for example, bay,
bays; key, keys; toy, toys.
 Common nouns ending in y preceded by a consonant or by qu change the y to i and add es, for 
example, city, cities; faculty, faculties; soliloquy, soliloquies;
You are required to write a program that accepts a sequence of characters as input (cf. Figure 1.1).  You 
may assume that this sequence of characters represents a common noun.  Your program should apply 
the rules listed here to determine the plural form of this common noun.  If the plural form can be
determined your program should display the singular form of this common noun and its plural form for
example, if the user entered the word Toy your program would display output similar to that shown in
Figure 1.2.  If the rules do not apply for example, if the user entered the word book your program would 
display a message similar to that shown in Figure 1.3.  If the user fails to supply your program with input 
your program should display a message similar to that shown in Figure 1.4.
*/

import javax.swing.JOptionPane;

public class L8Q1Plurals {
	
	public static void main(String[] args) {
		
		// declare variables
		String input, output = "", vowels = "aeiou";
		
		// take input
		input = JOptionPane.showInputDialog(null, "Enter a word to pluralise:");
		
		// trim and lower case
		input = input.trim();
		input = input.toLowerCase();
		
		
		// check for multiple words
		if (input.indexOf(" ") != -1) {
			input = input.substring(0, input.indexOf(" "));
		}
		
		// if no input
		if (input.equals("")) {
			output = "You are required to enter a word";
			// Looks like I forgot about endsWith()
		} else if (input.charAt(input.length() - 1) == 'y') { // if ends with y
			output += "The plural of " + input + " is "; 
			if ((input.charAt(input.length() - 3) == 'q') && (input.charAt(input.length() - 2) == 'u')) { // if ends in "quy" replace "y" with "ies"
				output += input.substring(0, input.length() - 1) + "ies";
			} else if (vowels.indexOf(input.charAt(input.length() - 2)) != -1 ) { // if ends with vowel + "y" add "s"
				output += input + "s";
			} else {
				output += input.substring(0, input.length() - 1) + "ies"; // if ends in consonant + "y" change "y" to "ies"
			}
		} else { // else if rules don't apply
			output = "Cannot form the plural of the word " + input + " using the rules provided here.";
		}
		
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
		
	}
}