/*

Philip Woulfe 
Fas Java 2014/11/17

Write a program to ask a user to enter their name in the format ‘firstName surname’.

Then ask the user to enter their sex either ‘male’ or ‘female’.  Using JOptionPane class for 

input and output, display:

“Welcome Mr./Ms. [firstName initial]. [surname]!"

e.g. user input:  Simon Grogan 

Male

output: Welcome Mr. S. Grogan!
*/

import javax.swing.JOptionPane;

public class L6Q2NameSex {
		
	public static void main(String[] args) {
		
		// declare variables
		String inputName, surname, sex, title = "";
		
		char firstInitial;
		
		// take name from user
		inputName = JOptionPane.showInputDialog(null, "Enter your full name seperated by a space: \ne.g. Philip Woulfe");
		inputName = inputName.trim();

		// take sex from user
		sex = JOptionPane.showInputDialog(null, "Enter your gender: \ni.e. male or female");
		
		// determine first initial and converto to upper case
		firstInitial = Character.toUpperCase(inputName.charAt(0));
		
		// determine surname
		surname = inputName.substring(inputName.lastIndexOf(" ")); // Last index ignores middle names
		surname = surname.trim();
		
		// convert surname to lower case with captal first letter
		surname = Character.toUpperCase(surname.charAt(0)) + (surname.substring(1)).toLowerCase();
				
		// determine title
		if (sex.equalsIgnoreCase("male")) {
			title = "Mr.";
		} else if (sex.equalsIgnoreCase("female")) {
			title = "Ms."; 
		} else {
			JOptionPane.showMessageDialog(null, "Invalid gender selection");
		}
				
		// output message
		JOptionPane.showMessageDialog(null, "Welcome " + title + " " + firstInitial + ". " + surname);
		
		System.exit(0);
	}
}



