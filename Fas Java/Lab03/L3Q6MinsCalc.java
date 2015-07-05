/*
Philip Woulfe
Fas Java 2014/11/10

Adapting Q4 from Lab 2: Write a program that declares a variable of integer type

that represents the number of minutes worked on a job. Take the value of minutes as input 

from the user using the JOptionPane class.  Convert and display the value in hours and 

minutes using the JOptionPane class.
*/


import javax.swing.JOptionPane;

public class L3Q6MinsCalc {
	public static void main (String[] args) {
		
		// declare variable
		// int numMins = 2304;
		
		
		// take input from JOptionPane
		String inputString = JOptionPane.showInputDialog(null, "Enter number of minutes");
		// Parse string
		int inputInt = Integer.parseInt(inputString);
		
		// declare constant
		final int NUM_MINS_IN_HOUR = 60;
		
		// divide total hours by number of minutes in an hours
		int hours = inputInt / NUM_MINS_IN_HOUR;
		// use modulus to find remaining minutes
		int remMins = inputInt % NUM_MINS_IN_HOUR;
		
		// output answer on JOptionPane
		JOptionPane.showMessageDialog(null, inputInt + " minutes is " + hours + " hours and " + remMins + " minutes", "Answer", JOptionPane.INFORMATION_MESSAGE);
		// JOptionPane.showMessageDialog(null, inputInt + " minutes is " + hours + " hours and " + remMins + " minutes", "Answer", JOptionPane.ERROR_MESSAGE);
		
		System.exit(0);
	}
}