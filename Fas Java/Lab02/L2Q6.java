/*
 * Philip Woulfe 
 * Fas Java 2014/11/06
 *
 * Write a program that calculates and displays the conversion of €57 into €20s, €10s, €5s, €2s and €1s
 *
 * notes and coins.  You must ensure that you calculations result in minimizing the number of each 
 *
 * denomination.  Declare a variable of integer type and assign it the value of 57.  Display the results using 
 *
 * the JOptionPane class (see lecture slide Java Programmer Notes 6 for solution).
 */

import javax.swing.JOptionPane;

public class L2Q6 {

	public static void main (String[] args) {
	
		//declare variables
		int totalMoney, remainder, numTwenties, numTens, numFives, numTwos, numOnes;
		
		// take input
		String totalMoneyString = JOptionPane.showInputDialog(null, "Enter amount of money");
		
		// parse String
		totalMoney = Integer.parseInt(totalMoneyString);
		
		// calculate number of individual units of currency
		
		numTwenties = totalMoney / 20;
		remainder = totalMoney % 20;
		
		numTens = remainder / 10;
		remainder = remainder % 10;
		
		numFives = remainder / 5;
		remainder = remainder % 5;
		
		numTwos = remainder / 2;
		remainder = remainder % 2;
		
		numOnes = remainder;
		
		char euro = '\u20AC';
		
		// Output result to JOptionPane
		
		// ask about concatenation between euro char \|/ and totalMoney
		JOptionPane.showMessageDialog(null, euro + "" + totalMoney + " can be divided into\n" + numTwenties + " * " + euro + "20 notes \n" +
											numTens + " * " + euro + "10 notes\n " + numFives + " * " + euro + "5 notes\n" + numTwos + " * " + 
											euro + "2 coin(s)\n" + numOnes + " * " + euro + "1 coin(s)", "Answer", JOptionPane.INFORMATION_MESSAGE);
										
		System.exit(0);
	}
}