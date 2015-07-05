/* 
Philip Woulfe
Fas Java 2014/11/26

You are required to write a Java application to accept a date of the format day/month/year from the
end user (as a single input i.e. a String).  Your program should extract the individual elements i.e. day, 
month and year.  You should then write out the day, month and year for example, if the user input 
18/10/2007 your program should write the message It is day 18 of month 10 in the year 2007.
Use JOptionPane class for input and output.
*/

import javax.swing.JOptionPane;

public class L9Q5Day {
		
	public static void main(String[] args) {
		
		// declare variables
		String input, output;
		int day, month, year;
		
		// take input
		input = JOptionPane.showInputDialog(null, "Enter a date in the format DD/MM/YYYY");
		// divide into individual numbers and parse
		day = Integer.parseInt(input.substring(0, input.indexOf("/")));
		month = Integer.parseInt(input.substring(input.indexOf("/") + 1, input.lastIndexOf("/")));
		year = Integer.parseInt(input.substring(input.lastIndexOf("/") + 1));
		
		// determine output
		output = "It is day " + day + " of month " + month + " in the year " + year + ".";
		
		// output result
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}
}