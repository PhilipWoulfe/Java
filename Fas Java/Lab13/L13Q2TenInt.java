/*
Philip Woulfe 
Fas Java 2014/12/10

Write a Java application program that will accept ten integer values from the end user.  Your program
should store these values in an array.  You should use a for loop to accept and store these values.  In 
addition your program should determine the sum, average, minimum and maximum of the numbers 
entered.  Display the results neatly and appropriately to the end user.
*/
import javax.swing.JOptionPane;
public class L13Q2TenInt {
	
	// main method
	public static void main(String[] args) {
		
		// declare varibales
		int[] input = new int[10];
		int sum, min, max;
		double average;
		String output = "", inputText;
		
		// take input from user
		for (int i = 0; i < 10; i++) { // loop to take 10 seperate ints from user
			if (i == 0) {
				inputText = "Please enter an integer:"; // first iteration of loop
			} else {
				inputText = "Please enter another integer:"; // every subsequent iteration
			}
			input[i] = Integer.parseInt(JOptionPane.showInputDialog(null, inputText)); // assign input to array location
		} // end for loop
		
		// determine sum
		sum = sum(input);
		output += "The sum of the numbers entered is: " + sum; 					// concat to output
		
		// determine average
		average = average(input);
		output += "\nThe average of the numbers entered is: " + average;		// concat to output
		
		// determine min
		min = min(input);
		output += "\nThe minimium number of the numbers entered is: " + min;	// concat to output
		
		// determine max
		max = max(input);
		output += "\nThe maximium number of the numbers entered is: " + max;	// concat to output
		
		// display results
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}
	
	// sum method
	private static int sum(int[] num) {
		
		// declare variables
		int returnNum = 0;
		
		// for loop to add elements of array together
		for (int i = 0; i < num.length; i++) {
			returnNum += num[i]; // add value of each element together
		} // end loop
		
		return returnNum; // return total
	}
	
	// average method
	private static double average(int[] num) {
		return (sum(num) * 1.0) / (num.length); // return sum of array elements divided by number of elements 
						// times 1.0 to ensure double value
	}
	
	// min method
	private static int min(int[] num) {
		
		// declare variables
		int min = num[0];
		
		// for loop cycle through array elements
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {	// if this element is smaller than min
				min = num[i];	// assign that value to min
			}
		}
		return min; // return min
	}
	
	// max method
	private static int max(int[] num) {
		
		// declare variables
		int max = 0;
		
		// for loop cycle through array elements
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) { // if this element is biger than max, 
				max = num[i];	// it becomes max
			}
		}
		return max; // return max
	}
}