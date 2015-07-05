/* 
Philip Woulfe
Fas Java 2014/12/03

Q2. Rewrite your solution to Q1. using a do…while loop.

*/

import javax.swing.JOptionPane;


public class L10Q2Sum2 {
	
	public static void main(String[] args) {
		
		// declare variables and take input from user
		int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer, the sum of the preceding digits to be squared:"));
		int output = 0;
		
		// calculate sum of squares
		int counter = 1;
		
		do { 					
			output += (int)(Math.pow(counter, 2)); 	// add the square of each number to counter
			counter++;								// progress counter
		} while (counter <= input);		 			// while counter is less than input
		
		// output result
		JOptionPane.showMessageDialog(null, "The result of summing the square of digits up to " + input + " is " + output);
		System.exit(0);
	}
}