/* 
Philip Woulfe
Fas Java 2014/12/10

Write a Java application program to accept a sequence of characters from the end user.  Using the
Character methods, determine and display the number of these characters that are digits and the 
number of non-numeric characters.
*/

import javax.swing.JOptionPane;
public class L13Q1CharSeq {
	
	public static void main(String[] args){
		
		// declare variables
		String input, output;
		int numCount = 0, symbolCount = 0;
		
		// take input from user
		input = JOptionPane.showInputDialog(null, "Enter a string of symbols and numbers: ");
		
		// loop to count chars and numbs
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i)) ) { 	// if the char at the value of i is a number
				numCount++; 								// increment the number count
			} else { 									// if the char at the value of i is not a number
				symbolCount++; 								// increment the symbol count
			}
		} // end for loop
		
		// output result
		output = "The number of symbols in " + input + " is: " + symbolCount + "\nThe number of numbers in " + input + " is: " + numCount;
		
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}
}