/* 
Philip Woulfe 
Fas Java 2014/11/13

Computer Science Radio offers each winner of a competition the choice of two books from one of

three categories.  The management have requested you to write a Java program that will allow them to 

enter the category chosen by a winner and calculate the total cost of sending the books to this winner.  

The total cost comprises the cost of the books chosen as well as an additional cost of €10 for postage 

and packaging.  The management should be able to enter a book category in any case, i.e., uppercase 

or lowercase.  If a book category other than those shown in the table below is entered your program 

should display an Incorrect book category message.

Book Category 		Subject Area 		Book Price 

A 					Fitness 			€32.50 

B 					Computing 			€30 

C 					Arts and Crafts 	€25.75

*/

import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class L5Q4Book {
	
	public static void main(String [] args) {
		
		// declare variables
		String input1String, input2String, fitness, computing, artsAndCrafts, output1, output2, catagory1, catagory2;
		
		fitness = "Fitness";
		computing = "Computing";
		artsAndCrafts = "Arts and Crafts";
		catagory1 = "";
		catagory2 = "";
		
		
		double fitnessCost, computingCost, artsAndCraftsCost, totalCost, totalCostPP, pAndP;
		
		fitnessCost = 32.5;
		computingCost = 30.0;
		artsAndCraftsCost = 25.75;
		totalCost = 0;
		pAndP = 10.0;
		
		char euro = '\u20AC';
		
		// take book catagory input from user in either case
		input1String = JOptionPane.showInputDialog(null, "Please select two catagories from the following\nA. Fitness\nB. Computing\nC. Arts and Crafts\n\nEnter first desired catagory:\n i.e A, B or C");
		input2String = JOptionPane.showInputDialog(null, "A. Fitness\nB. Computing\nC. Arts and Crafts\n\nEnter second desirted catagory:\n i.e A, B or C");
		
		// trim input
		input1String = input1String.trim();
		input2String = input2String.trim();
		
		// compare strings and get price from subject
		if (input1String.equalsIgnoreCase("a")) {
			totalCost += fitnessCost;
			catagory1 += fitness;
		} else if (input1String.equalsIgnoreCase("b")) {
			totalCost += computingCost;
			catagory1 += computing;
		} else if (input1String.equalsIgnoreCase("c")) {
			totalCost += artsAndCraftsCost;
			catagory1 += artsAndCrafts;
		} else {
			JOptionPane.showMessageDialog(null, input1String + " is not a valid input.\nPlease enter A, B or C");
		}
		
		if (input2String.equalsIgnoreCase("a")) {
			totalCost += fitnessCost;
			catagory2 += fitness;
		} else if (input2String.equalsIgnoreCase("b")) {
			totalCost += computingCost;
			catagory2 += computing;
		} else if (input2String.equalsIgnoreCase("c")) {
			totalCost += artsAndCraftsCost;
			catagory2 += artsAndCrafts;
		} else {
			JOptionPane.showMessageDialog(null, input2String + " is not a valid input.\nPlease enter A, B or C");
		}
		
		
		// Add cost of postage
		
			
		// convert answer to 2 decimal places
		
		BigDecimal outputBD = new BigDecimal(String.valueOf(totalCost));
		outputBD = outputBD.setScale(2, RoundingMode.CEILING);
		
		BigDecimal pAndPBD = new BigDecimal(String.valueOf(pAndP));
		pAndPBD = pAndPBD.setScale(2, RoundingMode.CEILING);
		
		totalCostPP = totalCost + pAndP;
		
		BigDecimal outputBDPP = new BigDecimal(String.valueOf(totalCostPP));
		outputBDPP = outputBDPP.setScale(2, RoundingMode.CEILING);
		// output total cost
		JOptionPane.showMessageDialog(null, "The total cost for " + catagory1 + " and " + catagory2 + " is: " + euro + outputBD + 
											"\nPostage and Packaging is: " + euro + pAndPBD + "\nTotal is " + euro + outputBDPP);
		
		System.exit(0);
	}
}