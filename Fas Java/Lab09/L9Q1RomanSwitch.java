/* 
Philip Woulfe
Fas Java 2014/11/26


*/

import javax.swing.JOptionPane;

public class L9Q1RomanSwitch {

	public static void main(String[] args) {
	
		// declare variables
		int input;
		String inputString, output;
		
		// Take input
		inputString = JOptionPane.showInputDialog(null, "Enter integer from 1-10:");
		
		// Parse string
		input = Integer.parseInt(inputString);
		
		// Choose output
		
		switch(input) {
			case 1:
				output = "I";
				break;
			case 2: 
				output = "II";
				break;
			case 3:
				output = "III";
				break;
			case 4:
				output = "IV";
				break;
			case 5:
				output = "V";
				break;
			case 6:
				output = "VI";
				break;
			case 7:
				output = "VII";
				break;
			case 8:
				output = "VIII";
				break;
			case 9:
				output = "IX";
				break;
			case 10:
				output = "X";
				break; 
			default: 
				output = "is not a valid integer";
				break;
		}
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