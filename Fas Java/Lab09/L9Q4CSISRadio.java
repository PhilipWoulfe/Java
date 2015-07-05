/* 
Philip Woulfe
Fas Java 2014/11/26


*/

import javax.swing.JOptionPane;
public class L9Q4CSISRadio {
	
	public static void main(String[] args) {
		String category, result;
		double cost;
		char bookCategory;
		category = JOptionPane.showInputDialog(null, "Enter category selected by winner");
		category = category.toUpperCase();
		bookCategory = category.charAt(0);
		if ((bookCategory != 'A') && (bookCategory != 'B') && (bookCategory != 'C'))
			result = "Invalid Book Category";
		else {
			if (bookCategory == 'A')
				cost = 32.50 * 2 + 10;
			else if (bookCategory == 'B')
				cost = 30 * 2 + 10;
			else 
				cost = 25.75 * 2 + 10;
			result = "Cost of books is \u20AC" + cost;
		}
		JOptionPane.showMessageDialog(null, result, "Output", JOptionPane.INFORMATION_MESSAGE);
	}
}