/* 
Philip Woulfe
Fas Java 2015/01/07

Class to handle events for MailWriter2

*/

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.BadLocationException;


public class MailWriterEvent implements ActionListener{
	
	MailWriter2 gui;

	
	public MailWriterEvent(MailWriter2 in) {
		gui = in;
	}
	
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		
		if (source == gui.send) {
			
			System.out.println("To: " + gui.to.getText());
			System.out.println("\nSubject: " + gui.subject.getText());
			System.out.println("\n" + gui.message.getText());
		}
		
		if (source == gui.highlight) { 
			// Highlight part of text from position 8 up to but not including 13
			try {
				gui.message.getHighlighter().addHighlight(Integer.parseInt(gui.start.getText()), Integer.parseInt(gui.end.getText()), DefaultHighlighter.DefaultPainter);
			}
			catch (BadLocationException ble){
				ble.printStackTrace();
			}
		} else {
			gui.message.getHighlighter().removeAllHighlights();
			
		}
	}
	
	

}