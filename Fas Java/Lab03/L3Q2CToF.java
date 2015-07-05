/*
Philip Woulfe
Fas Java 2014/11/07

Write a program to accept a number from the end user representing degrees Celsius

and convert this temperature to degrees Fahrenheit (see formulae below).  Take input and 

display your result using the JOptionPane class.
*/
import javax.swing.JOptionPane;
public class L3Q2CToF {

	public static void main (String[] args) {
	
	// declare variables
	int celcius; 
	double fahrenheit;
	
	// take input
	String celciusString = JOptionPane.showInputDialog(null, "Enter temperature in celcius:");
	celcius = Integer.parseInt(celciusString);
	
	// convert to fahrenheit F = ((9/5) * C) + 32.
	fahrenheit = ((9.0/5) * celcius) + 32;
	
	// output result
	JOptionPane.showMessageDialog(null, celcius + " celsius is " + fahrenheit + " fahrenheit");
	System.exit(0);
	}

}