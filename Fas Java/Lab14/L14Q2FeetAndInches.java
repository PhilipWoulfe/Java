/*
Philip Woulfe
Fas Java 2014/12/11

To show your understanding of writing methods, write a program that asks the
user for a number for feet then asks for a number for inches.  Your program should 
tell the user how many inches are in that many feet and inches.  
Your program should use a method called feetInchesToInches()  to do the 
calculation.  It has two parameters (one for feet, one for inches) and returns one 
number (inches).  Use appropriate data types for the parameters and the return type, 
and to make your method as reusable as possible, only do the necessary 
calculations inside the method. i.e., program input and output should NOT take place 
inside your method.
*/

import javax.swing.JOptionPane;

public class L14Q2FeetAndInches {
	
	// main method
	public static void main(String[] args) {
		
		// declare variables
		int feet, inches;
		String output;
		
		// take input from user
		feet = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of feet (int): "));
		inches = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of inches (int): "));
		
		// do calc
		output = feet + " feet and " + inches + " inches is " + feetInchesToInches(feet, inches) + " inches.";
		
		
		
		// output answer
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}
	
	// feet to inches method
	private static int feetInchesToInches(int feet, int inches) {
		return (feet * 12) + inches;
	}	
}