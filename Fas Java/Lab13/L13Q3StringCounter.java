/* 
Philip Woulfe
Fas Java 2014/12/10

Write a Java application program that will accept five words from the end user.  These words should
be stored in an array.  
Use a for loop to accept these words individually and store them.  
Your program should report on the number of characters in each word.
*/

import javax.swing.JOptionPane;
public class L13Q3StringCounter {

	
	// main method
	public static void main(String[] args) {
		
		// declare variables
		String[] input = new String[5];
		String output = "";
		
		// take input from user
		
		for (int i = 0; i < input.length; i++) { // use loop to cycle through array elements
			input[i] = JOptionPane.showInputDialog(null, "Enter a string: "); // assign strinf to array
		} // end loop
			
		// count characters in array element
		
		for (int i = 0; i < input.length; i++) { // use loop to cycle through array elements
			output += input[i] + " has " + input[i].length() + " characters.\n"; // add to output
		}
			
		// output to user.
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}
}