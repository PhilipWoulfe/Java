/*
Philip Woulfe
Fas Java 2014/11/07

Write a program that calculates and displays the weekly salary of an employee who

earns €25 an hour, works 40 regular hours, 13 overtime hours, and earns time and a half 

for overtime hours worked.  Display your result using the JOptionPane class.
*/

import javax.swing.JOptionPane;

public class L3Q1WageCalc{
	public static void main (String[] args) {
	
	// initialise variables
	int hoursWorked = 40, overtimeHours = 13, hourlyPay = 25;
	
	double overtimeRate = 1.5, totalPay, basicPay, overtimePay;
	
	char euro = '\u20AC';
	
	// calculate wages for hours worked
	basicPay = hoursWorked * hourlyPay;
	overtimePay = overtimeHours * hourlyPay * overtimeRate;
	totalPay = basicPay + overtimePay;
	
	// display answer
	JOptionPane.showMessageDialog(null, "Basic Wage: " + euro + hourlyPay + "\nTotal Hours Worked: \t" + hoursWorked + "\nOvertime Hours Worked: \t" + 
										overtimeHours + "\nOvertimeRate: \tx" + overtimeRate + "\nTotal pay: \t "+ euro + totalPay);
	System.exit(0);
	
	}

}