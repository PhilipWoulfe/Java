/* 
Philip Woulfe
Fas Java 2014/11/17

Write a program to ask a user to enter their favourite colour of the rainbow from the list:

Red, Orange, Yellow, Green, Blue, Indigo and Violet.  

If the user enters Red, Green or Blue: Output: “Good choice, [colour] is a primary colour". 

If the user enters Yellow / Orange: Output: “Good choice, [colour] is a lovely colour". 

If the user enters Indigo or Violet: Output: “Good choice, [colour] is an exotic favourite".  

Use if statements, String methods and Boolean logic in your answer and use JOptionPane 

class for input and output.
*/

import javax.swing.JOptionPane;

public class L6Q3Rainbow {
	
	public static void main(String[] args) {
		
		// declare variables
		String colour, output = "";
		
		// take input from user
		colour = JOptionPane.showInputDialog(null, "Enter your favourite colour of the rainbow:\ni.e. choose from red, orange, yellow, green, " +
													" blue, indigo or violet");
		// make input lowercase and trim
		colour = colour.toLowerCase();
		colour = colour.trim();
		
		// determine output
		if (colour.equals("red") || colour.equals("green") || colour.equals("blue")) {
			output = "Good choice, " + colour + " is a primary colour";
		} else if (colour.equals("yellow") || colour.equals("orange")) {
			output = "Good choice, " + colour + " is a lovely colour";
		} else if (colour.equals("indigo") || colour.equals("violet")) {
			output = "Good choice, " + colour + " is an exotic favourite";
		} else {
			JOptionPane.showMessageDialog(null, "Invalid selection");
		}
			
		// output message
		JOptionPane.showMessageDialog(null, output);
		
		System.exit(0);
	}
}