/*
Philip Woulfe
Fas Java 2014/11/07

Write a second program to undertake Fahrenheit to Celsius conversion so that you

can check your answers (see formulae below).  Take input and display your result using 

the JOptionPane class.

C = (5/9) * (F - 32)
*/

import javax.swing.JOptionPane;
public class L3Q3FToC {

	public static void main (String[] args) {
	
	// declare variables
	double celcius; 
	int fahrenheit;
	
	// take input
	String fahrenheitString = JOptionPane.showInputDialog(null, "Enter temperature in fahrenheit:");
	fahrenheit = Integer.parseInt(fahrenheitString);
	
	// convert to celcius  C = (5/9) * (F - 32)
	celcius = ((5.0/9) * (fahrenheit - 32));
	
	// output result
	JOptionPane.showMessageDialog(null, fahrenheit + " fahrenheit is " + celcius + " celsius");
	System.exit(0);
	}

}