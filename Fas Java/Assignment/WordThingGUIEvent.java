/* 
Philip Woulfe 
Fas Java 2015/01/08

Event class for WordThingGui 
*/


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.text.DefaultHighlighter;
import javax.swing.text.BadLocationException;


public class WordThingGUIEvent implements ActionListener {
	
	WordThingGUI gui; 
	
	WordThingGUIEvent(WordThingGUI in) {
		gui = in;
	}
	
	public void actionPerformed(ActionEvent event) {
		
		Object source = event.getSource();
		
		if (source == gui.findButton) { // if the source is the find button
			
			gui.message.getHighlighter().removeAllHighlights(); 	// clear any previous highlights
			
			
			String lookedForWord = gui.message.getText();
			String areaLookingIn = gui.wordArea.getText();
			
			// to lower case
			lookedForWord = lookedForWord.toLowerCase();
			areaLookingIn = areaLookingIn.toLowerCase();
			
			int wordStartLocation = lookedForWord.indexOf(areaLookingIn); // get text of message and find index of text in wordArea 
			int wordFinishLocation = wordStartLocation + areaLookingIn.length(); // highlight to wordStartLocation + length of word in word area
			
			try { // try to highlight
				gui.message.getHighlighter().addHighlight(wordStartLocation, wordFinishLocation, DefaultHighlighter.DefaultPainter);
			}
			catch (BadLocationException ble) {
				// ignore exception
				//ble.printStackTrace();
			}
			
			if (gui.wordArea.getText() == null || gui.wordArea.getText().equals("")){
				
				// do nothing
				
			} else if (wordStartLocation != -1) {								// if the words is found
				
				gui.wordStatus.setForeground(Color.BLUE);							// text blue
				gui.wordStatus.setText("Word found at: " + wordStartLocation);		// say this
				
			} else {															// else
				
				gui.wordStatus.setForeground(Color.RED);							// red text
				gui.wordStatus.setText("Word not found");							// say this
			
			}	
			
			
			
		} else if (source == gui.clearButton) {					 	// else if the source is the clear button
			gui.message.getHighlighter().removeAllHighlights(); 	// clear highlightts
			gui.message.setText("");							 	// clear text in message
			gui.wordArea.setText("");								// clear text in word area
			gui.wordStatus.setText("");									// clear test in status
			
			gui.numWords.setText("");								// clear numwords
			gui.numCharsIncSpaces.setText("");						// clear numCharsIncSpaces
			gui.numCharsExcSpaces.setText("");						// clear numCharsExcSpaces
			gui.numPara.setText("");								// clear numPara
			
		} else if (source == gui.countButton) {
			
			
			String messageText = gui.message.getText();
			
			if(messageText.equals("")) { // if no text in message area
				
				// do nothing
				
			} else {
			
				gui.numWords.setText(StringProcessor.numWordsInPara(messageText) + "");
				gui.numCharsIncSpaces.setText(StringProcessor.numCharsIncSpacesInPara(messageText) + "");
				gui.numCharsExcSpaces.setText(StringProcessor.numCharsExcSpacesInPara(messageText) + "");
				gui.numPara.setText(StringProcessor.numPara(messageText) + "");
				//gui.numPara.setText(StringProcessor.numPara("\n\n\n") + "");
				//System.out.println(areaLookingIn);
			
			}
		}
	}	
}
