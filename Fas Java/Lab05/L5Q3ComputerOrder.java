/* 
Philip Woulfe
Fas Java 2014/11/13

Mr. Michael Dell is offering a monthly payment option on three of the latest models of PC.  He has

requested you to write a program that will allow the end user to enter the model type and the number of 

machines he/she would like to purchase of this same model type.  The possible model types and the 

associated monthly payback prices are shown in Figure 1.1

Model Type 		Monthly Pay-back Price (€) 

1              	62.50 

2             	55 

3             	35.75 

Figure 1.1

Your program should present a menu similar to that shown in Figure 1.2.  Once the user has specified 

the model type you must next request the number of units he/she would like to buy of this model type (cf. 

Figure 1.3).  For example is the user chose to buy machines of model type 2 you would request the 

number of machines he/she required for model type 2 (cf. Figure 1.3).

You may assume that the end user will enter a model type of 1, 2 or 3.  You may also assume that the 

end user will enter an integer value that is greater than 0 for the number of machines required.
*/

import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class L5Q3ComputerOrder {
	
	public static void main(String[] args) {
		
		// declare variables
		int choiceOfComputer, numberOfComputers;
		
		double pC1 = 62.5, pC2 = 55, pC3 = 35.75, total = 0.0, costOfPC = 0.0;
				
		char euro = '\u20AC';

		String choiceOfPc = "";
		
		// convert numbers to two decimal places
		BigDecimal pC1BD = new BigDecimal(String.valueOf(pC1));
		BigDecimal pC2BD = new BigDecimal(String.valueOf(pC2));
		BigDecimal pC3BD = new BigDecimal(String.valueOf(pC3));
		BigDecimal totalBD; 
		
		pC1BD = pC1BD.setScale(2, RoundingMode.CEILING);
		pC2BD = pC2BD.setScale(2, RoundingMode.CEILING);
		pC3BD = pC3BD.setScale(2, RoundingMode.CEILING);
				
		// Take choice of computer from user
		choiceOfComputer = Integer.parseInt(JOptionPane.showInputDialog(null, "Which PC would you like to purchase? Enter 1, 2 or 3\nOption 1: " +
															euro + pC1BD+ "\nOption 2: " + euro + pC2BD + "\nOption 3: " + euro + pC3BD));
															
		// take number of computers required from user
		
		numberOfComputers = Integer.parseInt(JOptionPane.showInputDialog(null, "How many computers would you like?"));
		
		// calculate total cost of computers
		if (choiceOfComputer > 0 && choiceOfComputer < 4 ) {
			if (choiceOfComputer == 1) {
				total = pC1 * numberOfComputers;
				choiceOfPc = "PC 1";
				costOfPC = pC1;
			} else if (choiceOfComputer == 2) {
				total = pC2 * numberOfComputers;
				choiceOfPc = "PC 2";
				costOfPC = pC2;
			} else {
				total = pC3 * numberOfComputers;
				choiceOfPc = "PC 3";
				costOfPC = pC3;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Invalid Input, please select either 1, 2 or 3");
		}
		
		
		totalBD = new BigDecimal(String.valueOf(total));
		totalBD = totalBD.setScale(2, RoundingMode.CEILING);
		
		
		// output result
		JOptionPane.showMessageDialog(null, "The total for " + numberOfComputers + " x " + choiceOfPc + " is " + euro + totalBD);
		// JOptionPane.showMessageDialog(null, choiceOfPc + "@ " + euro + costOfPC + "\nx                 " + numberOfComputers+ "\n__________ \n         " + euro + totalBD);
		System.exit(0);
		
	}
}
