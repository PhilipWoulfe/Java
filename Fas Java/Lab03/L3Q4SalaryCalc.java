/*
Philip Woulfe
Fas Java 2014/11/07

Write a program which adapts the program written for Q1 which calculates and

displays the weekly salary of an employee.   The program should take in 3 pieces of input 

from the user: hourlyWage, regularHoursWorked, & overtimeHours.  Calculate the 

weekly salary based on earning time and a half for overtime hours worked.  Take input 

and display your result using the JOptionPane class.
*/

import javax.swing.JOptionPane;
public class L3Q4SalaryCalc {

	public static void main (String[] args) {
	
	// initialise variables
	int hoursWorked, overtimeHours, hourlyPay;
	double overtimeRate = 1.5, totalPay, basicPay, overtimePay;
	
	char euro = '\u20AC';
	
	// take input
	String hourlyPayString = JOptionPane.showInputDialog(null, "Enter hourly pay: ");
	hourlyPay = Integer.parseInt(hourlyPayString);
	
	String hoursWorkedString = JOptionPane.showInputDialog(null, "Enter numbers of regular hours worked: ");
	hoursWorked = Integer.parseInt(hoursWorkedString);
		
	String overtimeHoursString = JOptionPane.showInputDialog(null, "Enter number of overtime hours worked: ");
	overtimeHours = Integer.parseInt(overtimeHoursString);
	
	// calculate wages for hours worked
	basicPay = hoursWorked * hourlyPay;
	overtimePay = overtimeHours * hourlyPay * overtimeRate;
	totalPay = basicPay + overtimePay;
	
	// display answer
	JOptionPane.showMessageDialog(null, "Basic Wage: " + euro + hourlyPay + "\nTotal Hours Worked: \t" + hoursWorked + "\nOvertime Hours Worked: \t" + 
										overtimeHours + "\nOvertime Rate: \tx" + overtimeRate + "\nTotal pay: \t "+ euro + totalPay);
	System.exit(0);
	
	}
}