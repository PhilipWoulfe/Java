/* 
Philip Woulfe
2014/12/03

Assuming that it costs 5c to translate a word from English to Spanish, you are required to write a
Java application program to accept a sentence of the English language and calculate the cost of 
translating it to Spanish.
*/

import javax.swing.JOptionPane;

public class L10Q3 {
	
	public static void main(String[] args) {
		
		// declare variables
		String input, output, remainder;
		int numberOfWords = 1;
		double individualCost = 0.05, totalCost = 0.0;
		char euro = '\u20AC';
		
		
		// take input from user
		do { 
		input = JOptionPane.showInputDialog(null, "Enter sentence to be translated to Spanish:");
		} while (input.equals("")); // make sure somethig is entered
		
		// trim input
		remainder = input.trim();
		
		
		// calculate number of words in sentence
		while (remainder.indexOf(" ") != -1) { 							// ehile there is spaces in the sentences
			remainder = remainder.substring(remainder.indexOf(" ") + 1);// take a substring of the sentence after the space
			numberOfWords++;											// add one to word counter
		} // end while loop
		
		// calculate cost
		totalCost = individualCost * numberOfWords; // total cost = individual cost * number of words
		
		// output
		output = "The cost for " + numberOfWords + " number of words translated is: " + euro + String.format("%.2f", totalCost);
		
		// output result
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}
}