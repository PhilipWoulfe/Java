/*
 * Philip Woulfe 
 * Fas Java 2014/11/05
 *
 * Testing is the process of finding errors (bugs) in a program and debugging is the process of
 *
 * correcting errors that are found.  Determine if bugs exists in the program in Figure 1.3.  If so, please fix 
 *
 * them.  First try correct the code on paper only then check it on the computer.
 */
import javax.swing.JOptionPane;

public class L2Q3 {

	public static void main (String[] args) {
		
		// decalre variable
		int num = 3;
		
		// cube variable
		int result = num * num * num;
		
		//output answer on JOptionPane
		JOptionPane.showMessageDialog(null, "The result of " + num + "^3 is " + result, "Answer", JOptionPane.ERROR_MESSAGE);
		
		System.exit(0);
	}
}