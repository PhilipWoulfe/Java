/*
Philip Woulfe
Fas Java 2014/12/11

Write a program that asks the user to enter a series of words, i.e., a sentence.
Using the String split() method, store the sentence in an array (each word goes in a 
different element).
Your program should tell the user how many words their sentence has.
Then report on how many characters each word has.
Display the results neatly and appropriately using JOptionPane class.

*/

import javax.swing.JOptionPane;

public class L14Q1NumWords {
	
	// main method
	public static void main(String[] args) {
		
		// declare variables
		String input, output;
		String[] inputArray;
				
		// take input from user
		input = JOptionPane.showInputDialog(null, "Enter a sentence: ");
		
		// trim input
		input = input.trim();
		
		// assign words to array elements
		inputArray = input.split(" ");
		
		// count number of words
		output = "The sentence \"" + input + "\" has " + inputArray.length + " words.";
		
		// output to user
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}
}