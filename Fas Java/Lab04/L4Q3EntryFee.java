/*
Philip Woulfe
Fas Java 2014/11/11

The entry fee for the local art museum is calculated as follows: children under 5 years, free; adults 65

years and older, €2.00; all others €3.50.  Write a program that requests the user to enter a number 

denoting an age.  Your program should determine and display the corresponding entry fee.
*/

import javax.swing.JOptionPane;

public class L4Q3EntryFee {

	public static void main(String[] args) {
	
	// declare variables
	int input;
		
	double costUnder5, costOver64, everyoneElse;
	
	String output;
	
	costUnder5 = 0.0;
	costOver64 = 2.0;
	everyoneElse = 3.5;	
	
	char euro = '\u20AC';
	
	// take input
	input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter age :"));
	
	// calculate cost of ticket
	
	if (input >= 0 && input < 5) {
		output = euro + String.valueOf(costUnder5);
	} else if (input >= 5 && input < 65) {
		output = euro + String.valueOf(everyoneElse);
	} else if (input >= 65) {
		output = euro + String.valueOf(costOver64);
	} else {
		output = " not valid";
	}
		
	// output cost
		JOptionPane.showMessageDialog(null, "Fee for a " + input + " year old is: " + output);

	System.exit(0);
	
	}

}