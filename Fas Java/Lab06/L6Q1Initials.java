/*

Philip Woulfe 
Fas Java 2014/11/17

Write a program to ask a user to enter their name in the format ‘firstName surname’.

Using JOptionPane class for input and output, display the txt: 

Hello ‘firstName surname’.

Your initials are ‘fs’

e.g., user input ‘Simon Grogan’

Display:

Hello Simon Grogan.

Your initials are SG
*/

import javax.swing.JOptionPane;

public class L6Q1Initials {
	
	public static void main(String[] args) {
	
		// create variables
		String inputName, firstName, lastName, initials;
		char firstInitial, lastInitial;
		
		// take name from user
		inputName = JOptionPane.showInputDialog(null, "Enter your first and surname seperated by a space:\n e.g. Philip Woulfe");
		
		// divide into first and last names and trim
		inputName = inputName.trim();
		// System.out.println(inputName);
		
		firstInitial = inputName.charAt(0);
		// System.out.println(firstInitial);
		
		firstName = inputName.substring(0, inputName.indexOf(" "));
		firstName = firstName.trim();
				
		lastName = inputName.substring(inputName.lastIndexOf(" ")); // Last index to ignore middle names
		lastName = lastName.trim();		
		
		lastInitial = lastName.charAt(0);
		
		// convert output to capital first letter
		firstName = Character.toUpperCase(firstName.charAt(0)) + (firstName.substring(1)).toLowerCase();
		System.out.println(firstName);
		
		lastName = Character.toUpperCase(lastName.charAt(0)) + (lastName.substring(1)).toLowerCase();
		System.out.println(lastName);
		
		
		// change to upper case
		initials = firstInitial + "." + lastInitial + ".";
		initials = initials.toUpperCase();
			
		// output initials
		JOptionPane.showMessageDialog(null, firstName + " " + lastName + ", your initials are " + initials);
		System.exit(0);
		
	}
}