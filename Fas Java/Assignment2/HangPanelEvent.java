import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class HangPanelEvent {
	HangPanel gui;

	
	HangPanelEvent(HangPanel in) {
		gui = in;
			
	}
	
	
	
	
	
	public void actionPerformed (ActionEvent event) {
		Object source = event.getSource();
		
		int i = 7;
		
		if (source == gui.button) {
			gui.nextElement(i--);
		}
	}
}