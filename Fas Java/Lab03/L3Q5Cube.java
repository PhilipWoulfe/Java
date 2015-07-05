/*
Philip Woulfe
Fas Java 2014/11/10

Adapting Q3 from Lab 2: Write a program that will display the result of cubing a

number.  Declare a variable of integer type representing the number to be cubed.  Take in 

the number to be cubed as input from the user and display the result using the JOptionPane 

class.
*/

import javax.swing.JOptionPane;

public class L3Q5Cube {

	public static void main (String[] args) {
		
		// decalre variable
		int num;
		String numString;
		
		// take input
		numString = JOptionPane.showInputDialog(null, "Enter a number to be cubed :");
		num = Integer.parseInt(numString);
		
		// cube variable
		int result = num * num * num;
		
		//output answer on JOptionPane
		JOptionPane.showMessageDialog(null, "The result of " + num + "^3 is " + result, "Answer", JOptionPane.ERROR_MESSAGE);
		
		System.exit(0);
	}
}