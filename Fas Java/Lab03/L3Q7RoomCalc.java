/*
Philip Woulfe
Fas Java 2014/11/10


Adapting Q5 from Lab 2: Write a Java program that declares variables of integer data

type to represent the length and width of a room in feet.  Take input from the user for the 

width and length variables and compute and display the floor space of the room in square 

feet.  Do not display only a value as output but include explanatory text.  Output should be 

displayed using the JOptionPane class.
*/

import javax.swing.JOptionPane;

public class L3Q7RoomCalc {
	public static void main (String[] args) {
		
		// declare variables
		int length, width;
		
		// Take input
		String lengthString = JOptionPane.showInputDialog(null, "Input length of room in feet");
		String widthString = JOptionPane.showInputDialog(null, "Input width of room inn feet");
		
		// parse strings
		length = Integer.parseInt(lengthString);
		width = Integer.parseInt(widthString);
		
		
		// calculate area
		int area = length * width;
		
		// output answer to JOptionPane
		JOptionPane.showMessageDialog(null, "The area of the room of length " + length + "' and width " 
											+ width + "' is: " + area + "' squared", "Answer", JOptionPane.ERROR_MESSAGE);
		
		System.exit(0);
	}
}