/* 
Philip Woulfe
Fas Java 2014/11/13

A sales company pays its salespeople a commission based on the amount of their sales, as shown in

the following table.  Write a program to prompt the user to enter the sales.  The program should then 

calculate and display the appropriate commission.

Sales (€) 			|	Commission Rate (%) 
					|
10,000.01 and over 	|	10 
					|
5,000.01 to 10,000 	|	7.5
					|
0-5,000 			|	5.0

*/

import javax.swing.JOptionPane;

public class L5Q1SalesCalc {

	public static void main (String[] args) {
		
		// declare variables
		double sales, answer = 0, tenPercent, sevenHalfPercent, fivePercent, lowerBand, upperBand;
		
		tenPercent = 0.10;
		sevenHalfPercent = 0.075;
		fivePercent = 0.05;
		lowerBand = 5000.0;
		upperBand = 10000.0;
		
		char euro = '\u20AC';
		
		
		// take input from user
		sales = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter amount of sales: "));
		
		// calculate commission
		if (sales < 0 ) {
			JOptionPane.showMessageDialog(null, "Input Invalid");
		} else if (sales >= 0 && sales <= lowerBand) {
			answer = sales * fivePercent;
		} else if (sales > lowerBand && sales <= upperBand) {
			answer = (lowerBand * fivePercent) + ((sales - lowerBand) * sevenHalfPercent);
		} else {
			answer = (lowerBand * fivePercent) + ((upperBand - lowerBand) * sevenHalfPercent) + ((sales - upperBand) * tenPercent);
			System.out.println(lowerBand * fivePercent);
			System.out.println((upperBand - lowerBand) * sevenHalfPercent);
			System.out.println((sales - upperBand) * tenPercent);
		}
		// output answer
		JOptionPane.showMessageDialog(null, "Your commission on your sales of " + euro + "" + sales + " is:\n" + euro + "" + answer);
		
		System.exit(0);
		
	}
}