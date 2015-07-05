/*
Philip Woulfe
Fas Java 2014/11/11

Write a program that prompts the user to enter a number within the range 1 to 10.  Your program should

display the Roman numeral version of that number.  If the number is outside the range 1 to 10 the program 

should display an error message. (use if, if-then, and or if-then-else statements)
*/

import javax.swing.JOptionPane;

public class L4Q1Roman {

	public static void main(String[] args) {
	
		// declare variables
		int input;
		String inputString, output;
		
		// Take input
		inputString = JOptionPane.showInputDialog(null, "Enter integer from 1-10:");
		
		// Parse string
		input = Integer.parseInt(inputString);
		
		// Choose output
		if (input == 1) {
			output = "I";
		} else if (input == 2) {
			output = "II";
		} else if (input == 3) {
			output = "III";
		} else if (input == 4) {
			output = "IV";
		} else if (input == 5) {
			output = "V";
		} else if (input == 6) {
			output = "VI";
		} else if (input == 7) {
			output = "VII";
		} else if (input == 8) {
			output = "VIII";
		} else if (input == 9) {
			output = "IX";
		} else if (input == 10) {
			output = "X";
		} else {
			output = "is not a valid integer";
		}
		
		// Output answer
		JOptionPane.showMessageDialog(null, input + " is " + output + " in roman numerals.");
		
		
		System.exit(0);
	
	}
}