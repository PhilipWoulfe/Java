/*
Philip Woulfe
Fas Java 2014/11/11

A copying centre charges 5c per copy for the first 100 copies and 3c per copy for each additional copy.

Write a program that requests the number of copies as input and displays the total cost.
*/

import javax.swing.JOptionPane;

public class L4Q2Copy {

	public static void main(String[] args) {
	
	// declare variables
	int firstHundredCost, additionalCost, input;
	String inputString, output;
	
	firstHundredCost = 5;
	additionalCost = 3;
	
	char euro = '\u20AC';
	
	// take input
	inputString = JOptionPane.showInputDialog(null, "Enter number of copies required: ");
	
	// parse input
	input = Integer.parseInt(inputString);
	
	// calculate cost
	if (input <= 100 && input > 0) {
		output = euro + String.valueOf((input * firstHundredCost) / 100.0);
	} else if (input > 100) {
		output = euro + String.valueOf(((100 * firstHundredCost) + ((input - 100) * additionalCost)) / 100.0);
	} else {
		output = "not valid";
	}
	
		// output total
	JOptionPane.showMessageDialog(null, input + " is " + output);
	
	System.exit(0);
	}
}