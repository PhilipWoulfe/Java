/*
Philip Woulfe
Fas Java 2014/11/13

Assume that the amount of holidays an employee receives from his/her employment depends on the

number of years the employee has been with the company, as shown in the following table.  Write a 

program that prompts the user to enter the number of years the employee has been with the company.  

The program should then display the appropriate number of holiday weeks.

Years with the company 		Weeks of holidays

1 to 5 						1 

6 to 10 					2

11 and over 				3 

0 							0

*/

import javax.swing.JOptionPane;

public class L5Q2Holidays {
	
	public static void main(String [] args) {
		
		// declare variables 
		int numberOfYears, holidays1To5, holidays6To10, holidays11Plus, holidaysZero;
		
		String answer = "";
		
		holidays1To5 = 1;
		holidays6To10 = 2;
		holidays11Plus = 3;
		holidaysZero = 0;
		
		// take number of years as input from user
		numberOfYears = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of years worked as an integer: "));
		
		// calculate number of holidays due
		if (numberOfYears >= 0 ) {
			if (numberOfYears == 0) {
				answer = String.valueOf(holidaysZero);
			} else if (numberOfYears > 0 && numberOfYears <= 5 ){
				answer = String.valueOf(holidays1To5);
			} else if (numberOfYears > 5 && numberOfYears <= 10) {
				answer = String.valueOf(holidays6To10);
			} else {
				answer = String.valueOf(holidays11Plus);
			}
		} else {
			answer = "not a valid integer";
		}
		
		// output result
		JOptionPane.showMessageDialog(null, "The amount of holidays due to someone working for " + numberOfYears + " years is " + answer + " weeks");
		
		System.exit(0);
	}
}