/* 
Philip Woulfe
Fas Java 2015/01/07



*/

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JScrollPane;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WordThingGUI extends JFrame {
	
	
	WordThingGUIEvent word = new WordThingGUIEvent(this);
	
	// create bold and plain font objects
	Font boldFont = new Font("SansSerif", Font.BOLD, 12);
	Font plainFont = new Font("SansSerif", Font.PLAIN, 12);
	
	// set up top panel
	JPanel row1 = new JPanel();
	
	// set up top left panel
	JPanel row1Left = new JPanel();
	JLabel messageLabel = new JLabel("Enter Text", JLabel.CENTER);
	JTextArea message = new JTextArea("Insane, " +
										"\nam I the only motherfucker with a brain?" + 
										"\nI'm hearing voices," +
										"\nbut all they do is complain." + 
										"\nHow many times have you wanted to kill," + 
										"\neverything and everyone?" + 
										"\nSay you'll do it but never will." +
										"\n\nYou can't see California" + 
										"\nwithout Marlon Brando's eyes." + 
										"\nYou can't see California" + 
										"\nwithout Marlon Brando's eyes." + 
										"\nYOU CAN'T SEE CALIFORNIA" + 
										"\nWITHOUT MARLON BRANDO'S EYES!", 11, 30);
		
	// set up top right panel
	JPanel row1Right = new JPanel();
	
	JPanel blankPanel = new JPanel();
	JPanel secondPanel = new JPanel();
	JPanel thirdPanel = new JPanel();
	JPanel fourthPanel = new JPanel();
	
	JLabel wordAreaLabel = new JLabel("Enter Word", JLabel.LEFT);
	JTextField wordArea = new JTextField(5);
	
	JLabel wordStatusLabel = new JLabel("Status", JLabel.LEFT);
	JTextField wordStatus = new JTextField(5);
	
	JButton findButton = new JButton("Find Word");
	JButton clearButton = new JButton("Clear");
	
	// set up bottom panel
	JPanel row2 = new JPanel();
	
	// set up lower left panel
	JPanel row2Left = new JPanel();
	
	JLabel countWordsLabel = new JLabel( "Count of words and characters", JLabel.CENTER);
	
	JLabel numWordsLabel = new JLabel("Number of words");
	JTextField numWords = new JTextField(5);
	
	JLabel numCharsIncSpacesLabel = new JLabel("Number of characters including spaces          ", JLabel.LEFT);
	JTextField numCharsIncSpaces = new JTextField(5);
	
	JLabel numCharsExcSpacesLabel = new JLabel("Number of characters excluding spaces", JLabel.LEFT);
	JTextField numCharsExcSpaces = new JTextField(5);
	
	JLabel numParaLabel = new JLabel("Number of paragraphs", JLabel.LEFT);
	JTextField numPara = new JTextField(5);
	
	// set up lower right panel
	JPanel row2Right = new JPanel();
	JButton countButton = new JButton("\nWord Count\n");
	
	public WordThingGUI() {
		
		
		
		super("Word Thing");
		setLookAndFeel();
		setSize(550, 445);
		setResizable(false);
		setLocationRelativeTo(null);								// center on open
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout bLayout = new BorderLayout();
		
		
		FlowLayout layout1 = new FlowLayout();
				
		BorderLayout testLayout = new BorderLayout();
		
		//GridLayout firstGrid = new GridLayout(2, 1, 5, 5);
		//setLayout(firstGrid);
		setLayout(testLayout);
		
		row1.setLayout(layout1); 								// set top row flow layout
		
		row1Left.setLayout(bLayout); 								// set top left(message) to border layout
								
		row1Left.add(messageLabel, BorderLayout.NORTH); 				// make message label north
		message.setLineWrap(true);										// line wrap continue on next line instead of increasing size of box
        message.setWrapStyleWord(true);									// move whole word to next line if wont fit
        JScrollPane scroll = new JScrollPane(message, 
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		row1Left.add(scroll, BorderLayout.SOUTH); 						// make text area south
		row1.add(row1Left); 											// add left panel to row 1
		
		GridLayout layout2 = new GridLayout(4, 1, 10, 10); 
		row1Right.setLayout(layout2); 								// top right panel grif layout
		GridLayout layout3 = new GridLayout(2, 1, 10, 10);
		row1Right.add(blankPanel); 										// first panel blank for asthetics
		secondPanel.setLayout(layout3); 								// subsections of top right panel also grids for label and text box
		wordAreaLabel.setVerticalTextPosition(JLabel.BOTTOM);
		secondPanel.add(wordAreaLabel);										// add label
		
		//wordAreaLabel.setFont(plain);
		secondPanel.add(wordArea);											// add word area
		row1Right.add(secondPanel);											// add panel
		thirdPanel.setLayout(layout3);									// subsections of top right panel also grids for label and text box
		thirdPanel.add(wordStatusLabel);									// add label
		//wordStatusLabel.setFont(plain);
		thirdPanel.add(wordStatus);											// add word area
		wordStatus.setEditable(false);										// text field not editable
		row1Right.add(thirdPanel);										// add panel
		fourthPanel.setLayout(layout1);							// flow layout
		
		findButton.addActionListener(word);						// add listener	
		fourthPanel.add(findButton);							// add find button
		findButton.setFont(plainFont);							// setFont plain
		
		clearButton.addActionListener(word);					// ad listerner
		fourthPanel.add(clearButton);							// add clear button
		clearButton.setFont(plainFont);							// setFont plain
		
		row1Right.add(fourthPanel);								// add last panel
		row1.add(row1Right);									// add top right panel
		
		add(row1, BorderLayout.NORTH);							// add top row
		
		FlowLayout yetAnotherFlowLayout = new FlowLayout();
		row2.setLayout(yetAnotherFlowLayout);					// row 2 layout flow
		BorderLayout oneMoreBLayout = new BorderLayout();
		//row2.setLayout(oneMoreBLayout);								// TEST
		GridLayout layout4 = new GridLayout(5, 1, 5, 5);
		row2Left.setLayout(layout4);							// set lower left panel to 1 x 5 grid
		
		
		JPanel row2LeftRow1 = new JPanel();						// new panel
		
		row2LeftRow1.setOpaque(false);							// not opaque
		row2LeftRow1.setLayout(layout1);						// flow layout
		row2LeftRow1.add(countWordsLabel);						// add label
		
		
		row2Left.add(row2LeftRow1);								// add first row
		
		
		JPanel row2LeftRow2 = new JPanel();						// new panel
		row2LeftRow2.setOpaque(false);							// make see through
		BorderLayout bLayout2 = new BorderLayout();				
		row2LeftRow2.setLayout(bLayout2);						// border layout
		numWords.setEditable(false);							// not editable
		row2LeftRow2.add(numWordsLabel, BorderLayout.WEST); 	// num words label on the left
		numWordsLabel.setFont(plainFont);						// setFont plain
		row2LeftRow2.add(numWords, BorderLayout.EAST);			// num words text field on the right
		row2Left.add(row2LeftRow2);								// add to lower left panel
		
		
		
		
		JPanel row2LeftRow3 = new JPanel();						// new p[anel
		row2LeftRow3.setOpaque(false);							// make see through
		BorderLayout bLayout3 = new BorderLayout();				
		row2LeftRow3.setLayout(bLayout3);						// border layout
		numCharsIncSpacesLabel.setFont(plainFont);
		row2LeftRow3.add(numCharsIncSpacesLabel, 
							BorderLayout.WEST);					// char inc space label to left
		numCharsIncSpaces.setEditable(false);					// not editable
		row2LeftRow3.add(numCharsIncSpaces, BorderLayout.EAST);	// char inc space text area to right
		row2Left.add(row2LeftRow3);								// ADD to lower left panel
		
		
		
		
		JPanel row2LeftRow4 = new JPanel();						// new panel
		row2LeftRow4.setOpaque(false);							// not opaque
		BorderLayout bLayout4 = new BorderLayout();						
		row2LeftRow4.setLayout(bLayout4);						// border alyout
		numCharsExcSpacesLabel.setFont(plainFont);
		row2LeftRow4.add(numCharsExcSpacesLabel, 
							BorderLayout.WEST);					// char ecx space label to left
		numCharsExcSpaces.setEditable(false);					// not editable
		row2LeftRow4.add(numCharsExcSpaces, BorderLayout.EAST);	// char exc space to right
		row2Left.add(row2LeftRow4);								// ad to lower left panel
		
		
		
			
		JPanel row2LeftRow5 = new JPanel();						// new panel
		row2LeftRow5.setOpaque(false);							// not opaque
		BorderLayout bLayout5 = new BorderLayout();	
		row2LeftRow5.setLayout(bLayout5);						// border alyout
		numParaLabel.setFont(plainFont);						// setFont plain
		row2LeftRow5.add(numParaLabel, BorderLayout.WEST);		// set num paragraphs label to left
		numPara.setEditable(false);								// niot editable
		row2LeftRow5.add(numPara, BorderLayout.EAST);			// set num PARAGRAPHS TO RIGHT
		row2Left.add(row2LeftRow5);								// add to lower left panel
		
		
		
		row2.add(row2Left);				// add lower left panel to row 2
		
		JPanel row2Right = new JPanel();						// new panel
		row2Right.setSize(100, 50);
		FlowLayout newestFlowlayout = new FlowLayout();
		BorderLayout reallyLastBLayout = new BorderLayout();
		row2Right.setLayout(reallyLastBLayout);					// flow layout
		//row2Right.setOpaque(false);								// make see through
		
		JPanel testBlankPanelN = new JPanel();		
		JPanel testBlankPanelN2 = new JPanel();		
		JPanel testBlankPanelN3 = new JPanel();		
		JPanel testBlankPanelN4 = new JPanel();	
		
		JPanel testBlankPanelS = new JPanel();		
		JPanel testBlankPanelS2 = new JPanel();		
		JPanel testBlankPanelS3 = new JPanel();		
		JPanel testBlankPanelS4 = new JPanel();		
		
		JPanel testBlankPanelE = new JPanel();		
		JPanel testBlankPanelE2 = new JPanel();		
		JPanel testBlankPanelE3 = new JPanel();		
		JPanel testBlankPanelE4 = new JPanel();	
		
		JPanel testBlankPanelW = new JPanel();		
		JPanel testBlankPanelW2 = new JPanel();		
		JPanel testBlankPanelW3 = new JPanel();		
		JPanel testBlankPanelW4 = new JPanel();	
		
		
		//testBlankPanel.setOpaque(false);
		
		/*
		row2Right.add(testBlankPanelN, BorderLayout.NORTH);
		row2Right.add(testBlankPanelN2, BorderLayout.NORTH);
		row2Right.add(testBlankPanelN3, BorderLayout.NORTH);
		row2Right.add(testBlankPanelN4, BorderLayout.NORTH);
		
		row2Right.add(testBlankPanelS, BorderLayout.SOUTH);
		row2Right.add(testBlankPanelS2, BorderLayout.SOUTH);
		row2Right.add(testBlankPanelS3, BorderLayout.SOUTH);
		row2Right.add(testBlankPanelS4, BorderLayout.SOUTH);
		
		row2Right.add(testBlankPanelE, BorderLayout.EAST);
		row2Right.add(testBlankPanelE2, BorderLayout.EAST);
		row2Right.add(testBlankPanelE3, BorderLayout.EAST);
		row2Right.add(testBlankPanelE4, BorderLayout.EAST);
		
		row2Right.add(testBlankPanelW, BorderLayout.WEST);
		row2Right.add(testBlankPanelW2, BorderLayout.WEST);
		row2Right.add(testBlankPanelW3, BorderLayout.WEST);
		row2Right.add(testBlankPanelW4, BorderLayout.WEST);
		*/
		
		
		JPanel yetAnotherBlankPanel = new JPanel();				// These three panels are cheating by being between the lower left
		yetAnotherBlankPanel.setOpaque(false);					// make see through
		JPanel anotherBlankPanel = new JPanel();				// panel and the lower right panel. The position of the count burtton 
		anotherBlankPanel.setOpaque(false);						// make see through
		JPanel lastAnotherBlankPanel = new JPanel();			// look better.
		lastAnotherBlankPanel.setOpaque(false);					// make see through
		
		row2.add(anotherBlankPanel);							// add cheater panels
		row2.add(yetAnotherBlankPanel);
		row2.add(lastAnotherBlankPanel);
		
		countButton.addActionListener(word);					// add listener to button
		row2Right.add(countButton, BorderLayout.CENTER);								// add countButton
		countButton.setFont(plainFont);							// setFont plain
		
		row2.add(row2Right, BorderLayout.EAST);									// add lower right panel
		
		add(row2);							// add lower panel
		
		setVisible(true);										// make it all visible
		
		
		
	}
	
	
	// method to set the look and feel of the gui
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			// ignore error
		}
	}
	
	// main method
	public static void main(String[] args) {
		WordThingGUI gui = new WordThingGUI();
	}
}