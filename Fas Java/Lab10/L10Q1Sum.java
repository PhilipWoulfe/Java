/* 
Philip Woulfe
Fas Java 2014/12/03

Write a Java application program to compute and print the sum of a given number of squares.  For
example, if 5 is input, then the program will print 55, which equals 1^2 + 2^2 + 3^2 + 4^2 + 5^2.  You are required 
to write your solution using a while loop.
*/

import javax.swing.JOptionPane;


public class L10Q1Sum {
	
	public static void main(String[] args) {
		
		// declare variables and take input from user
		int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer, the sum of the preceding digits to be squared:"));
		int output = 0;
		
		// calculate sum of squares
		int counter = 1;
		
		while (counter <= input) { 					// while counter is less than input
			output += (int)(Math.pow(counter, 2)); 	// add the square of each number to counter
			counter++;								// progress counter
		}
		
		// output result
		JOptionPane.showMessageDialog(null, "The result of summing the square of digits up to " + input + " is " + output);
		System.exit(0);
	}
}