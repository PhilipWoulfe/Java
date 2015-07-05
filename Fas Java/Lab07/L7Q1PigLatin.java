/*
Philip Woulfe
Fas Java 2014/11/20

Write a Java application program to accept a word from the end user in Pig Latin.  
Your program should covert this user entry to English and display the result using 
the showMessageDialog() method.
The rules for translating a word from English to Pig Latin are as follows:
Rule 1: 
If a word begins with a consonant, move the first letter to the end of the word and 
add ay to the end of the word.  For example, Chip becomes hipCay.
Rule 2: 
If the word begins with a vowel, add way to the end of the word.  For example, else 
becomes elseway.
*/
import javax.swing.JOptionPane;

public class L7Q1PigLatin {
	
	public static void main(String[] args) {
		
		// declare variables
		String input = "", output = "", vowels = "aeiou", consonants = "abcdefghijklmnopqrstuvwxyz";
		int messageType = -1;
		
		// take in word from user
		while (input.equals("")) {
			input = JOptionPane.showInputDialog(null, "Enter a single word to be translated into Pig Latin: ");
		}
		
		// check value isn't null
		if (input != null) {
			// trim
			input = input.trim();
			// convert to lower case
			input = input.toLowerCase();
		
			// make sure only single word 
			if (input.indexOf(" ") == -1) {
					// check for non letters
					for (int i = 0; i < input.length(); i++) {
						if (consonants.indexOf(input.charAt(i)) == -1) {
							// translate to pig latin
							output = "Error, invalid characters detected";
							messageType = 0;
							break;
						} else {				
							// check if word begins with a vowel
							if (vowels.indexOf(input.charAt(0)) != -1) {
								output += input + " in pig latin is: " + input + "way";
								break;
							} else {							
								output += input + " in pig latin is: " + input.substring(1) + input.charAt(0) + "ay";
								break;
							}
						}
					} // end for loop
			} else {
				output = "Error, please enter a single word";
				messageType = 0;
			}
			
			// output answer
			JOptionPane.showMessageDialog(null, output, "Answer", messageType);
		} else {
			System.exit(0);
		}
		System.exit(0);
		
	}
}