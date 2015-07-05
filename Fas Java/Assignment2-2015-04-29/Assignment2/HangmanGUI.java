/*

You are advised to read all instructions carefully before starting work and to check with your 

instructor/assessor, if necessary, to ensure that you have fully understood what is required.

Assignment set up: A scenario is provided for candidates in the form of a company specification 

for a new product

Scenario

A games software development company, CheckMate Associates, is developing a games 

program. It will be run using a Java application. The application will allow a user to play the classic 

game of Hangman in which the player is given the number of letters in a word and then, by 

guessing letters, has to complete the word. As a contracted employee of CheckMate Associates, 

you have been asked to create and test a GuessWord application that fulfils the specification.

The outline specification for the application states that:

 The player is given the number of letters in a word, initially displayed as asterisks (*), and 

then, by guessing letters, has to complete the word.

 If a wrong letter is chosen i.e. one that is not in the word, the player loses a life

 If the guessed letter is in the word then it is inserted in the correct position and the 

(incomplete) word displayed

 The games continues until either the player has solved the word or has lost all their lives

 If the player guesses the word before they have lost all their lives, they have ‘won’

 If the player loses all their lives before they guess the word they have ‘lost’ the game.

Task

Candidates should use the following detailed specification to fulfil the company's requirements:

1. Global variables may be declared, but as far as possible, local variables should be used. 

i.e., in Java with large programs there should generally be more local variables than other 

forms of variables.  And often more instance variables than class variables.  Choose an 

appropriate form of variable with an appropriate name and data type at all times.

2. Create a GuessWord application that has a Graphical User Interface (GUI) similar to that 

shown in the following picture.

3. The title GUESS THE WORD must be produced as a Label with the text in red.

4. The characters of the word to be guessed are to be written into the read only TextField 

beneath the title. This TextField must be set to 24 characters in width.

5. The title GUESSES REMAINING is a Label with the text set to red.

6. The number of guesses remaining is to be shown in a read only TextField which is 3 

characters wide and on the same line as the GUESSES REMAINING Label.

7. Letters are chosen by clicking the mouse on one of a grid of buttons representing the letters 

of the alphabet. 

8. Selecting the button START must clear the two TextFields ready to start the game. The 

program must then select a word from the following list in the order shown:

MEMORY COMPUTER PRINTER TROUSERS BUTTERCUP

9. Each letter of the selected word should be displayed at the right of the 24 character 

TextField as an asterisk (*).

10. A player has 8 ‘lives’ in which to guess the word.

11. The number of guesses remaining should be displayed at the right of the three character 

TextField.

12. The player selects a letter by clicking the mouse on the corresponding button. If the letter is 

in the hidden word then it is displayed in its correct position(s) in the 24 character TextField. 

If the letter is not in the word then the number of guesses remaining should be reduced by 

one and its value displayed in the three character TextField.

13. If the number of guesses remaining reaches zero and the hidden word has not been solved 

then a dialog box should appear with 'You Lose' in the centre in a large red font. An OK 

button should be used to allow the player to return to the game.
*/


import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.BoxLayout;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Graphics;
import javax.swing.*;


public class HangmanGUI extends JFrame {
	
	HangmanEvent hangman = new HangmanEvent(this);
	
	// declare variables
		
	// top panel
	private JPanel top = new JPanel();
	private JPanel topFiller = new JPanel();
	private JPanel topGrid = new JPanel();
	private JPanel topGrid1 = new JPanel();
	private JPanel topGrid2 = new JPanel();
	private JPanel topGrid2Row1 = new JPanel();
	private JPanel topGrid2Row2 = new JPanel();
	private JPanel topGrid3 = new JPanel();
	private JLabel guessWordLabel = new JLabel("GUESS THE WORD", JLabel.CENTER);
	public JTextField guessWordField = new JTextField(24);
	private JLabel guessLeftLabel = new JLabel("Guesses Left                                                  ", JLabel.LEFT);
	public JTextField guessLeftField = new JTextField(3);
	private JPanel cheat1 = new JPanel();
	private JPanel cheat2 = new JPanel();
	private JPanel cheat3 = new JPanel();
	private JPanel cheat4 = new JPanel();
	private JPanel cheat5 = new JPanel();
	private JPanel cheat6 = new JPanel();
	HangPanel hang = new HangPanel();
	
	// bottom panel
	private JPanel bottom = new JPanel();
	JButton start = new JButton("Start");
	JButton answer = new JButton("Answer");
	JButton[] buttons = new JButton[28];
	private JPanel bottomRow1 = new JPanel();
	private JPanel bottomRow1Fill = new JPanel();
	private JPanel bottomRow2 = new JPanel();
	private JPanel bottomRow2Fill = new JPanel();
	private JPanel bottomRow3 = new JPanel();
	private JPanel bottomRow3Fill = new JPanel();
	private JPanel bottomRow4 = new JPanel();
	private JPanel bottomRow4Fill = new JPanel();
		
	// constructor
		
	public HangmanGUI() {
		super("Hangman");
		setLookAndFeel();
		setSize(560, 420);
		//setResizable(false);
		setLocationRelativeTo(null);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		// top
		GridLayout mainLayout = new GridLayout(2, 1);
		setLayout(mainLayout);
		
	
		
		GridLayout topGridLayout = new GridLayout(3, 1);
		topGrid.setLayout(topGridLayout);
		
		BorderLayout topGrid1Layout = new BorderLayout();
		topGrid1.setLayout(topGrid1Layout);
		
		GridLayout topGrid2Layout = new GridLayout(2, 1);
		topGrid2.setLayout(topGrid2Layout);
		
		topGrid1.add(guessWordLabel, BorderLayout.CENTER);
		guessWordLabel.setVerticalTextPosition(JLabel.CENTER);
		guessWordLabel.setForeground(Color.RED);
		guessLeftLabel.setForeground(Color.RED);
		topGrid.add(topGrid1);
		
		topGrid2Row1.add(guessWordField);
		topGrid2Row2.add(guessLeftLabel);
		topGrid2Row2.add(guessLeftField);
		guessWordField.setEditable(false);
		guessWordField.setHorizontalAlignment(JTextField.RIGHT);
		guessLeftField.setEditable(false);
		guessLeftField.setHorizontalAlignment(JTextField.RIGHT);
		topGrid2.add(topGrid2Row1);
		topGrid2.add(topGrid2Row2);
		topGrid.add(topGrid2);
		topGrid.add(topGrid3);
		//cheat1.setVisible(true);
		/*top.add(cheat1);		// cheats move the top gui elements off center
		top.add(cheat2);
		top.add(cheat3);
		top.add(cheat4);
		top.add(cheat5);
		top.add(cheat6);*/
		
		
		
		
		hang.setPreferredSize(new Dimension(180, 180));
		//hang.add(temp);
		topFiller.add(hang);
		topFiller.add(topGrid); // hang test 
		top.add(topFiller);
		add(top);
		
		
		/*
		// bottom
		char letter = 'A';
		for (int i = 0; i < 7; i++) {
			
			String buttonName = letter++ + "";
			buttons[i] = new JButton(buttonName);
			buttons[i].setPreferredSize(new Dimension(70, 30));
			//buttons[i].addActionListener(hangman);
			bottomRow1Fill.add(buttons[i]);
		}
		for (int i = 7; i < 14; i++) {
			
			String buttonName = letter++ + "";
			buttons[i] = new JButton(buttonName);
			buttons[i].setPreferredSize(new Dimension(70, 30));
			//buttons[i].addActionListener(hangman);
			bottomRow2Fill.add(buttons[i]);
		}
		for (int i = 14; i < 21; i++) {
			
			String buttonName = letter++ + "";
			buttons[i] = new JButton(buttonName);
			buttons[i].setPreferredSize(new Dimension(70, 30));
			//buttons[i].addActionListener(hangman);
			bottomRow3Fill.add(buttons[i]);
		}
		for (int i = 22; i < 27; i++) {
			
			String buttonName = letter++ + "";
			buttons[i] = new JButton(buttonName);
			buttons[i].setPreferredSize(new Dimension(70, 30));
			//buttons[i].addActionListener(hangman);
			bottomRow4Fill.add(buttons[i]);
		}
		//start.addActionListener(hangman);
		//answer.addActionListener(hangman);
		bottomRow4Fill.add(start);
		start.setPreferredSize(new Dimension(70, 30));
		bottomRow4Fill.add(answer);
		answer.setPreferredSize(new Dimension(70, 30));
		
		bottomRow1.add(bottomRow1Fill);
		bottomRow2.add(bottomRow2Fill);
		bottomRow3.add(bottomRow3Fill);
		bottomRow4.add(bottomRow4Fill);
		
		BoxLayout box = new BoxLayout(bottom, BoxLayout.Y_AXIS);
		
		bottom.add(bottomRow1);
		bottom.add(bottomRow2);
		bottom.add(bottomRow3);
		bottom.add(bottomRow4);
		add(bottom);
		
		pack();
		*/
		
		char letter = 'A';
		for (int i = 0; i < 26; i++) {
			
			String buttonName = letter++ + "";
			buttons[i] = new JButton(buttonName);
			buttons[i].setPreferredSize(new Dimension(70, 30));
			buttons[i].addActionListener(hangman);
			buttons[i].setEnabled(false);
			bottom.add(buttons[i]);
		}
		
		answer.setEnabled(false);
		start.addActionListener(hangman);
		answer.addActionListener(hangman);
		bottom.add(start);
		start.setPreferredSize(new Dimension(70, 30));
		bottom.add(answer);
		answer.setPreferredSize(new Dimension(80, 30));
		add(bottom);
		setVisible(true);
	}
	
		
	/*
	@Override
	public Insets getInsets() {
		Insets squeeze = new Insets (50, 15, 10, 15);
		return squeeze;
	}
	*/
	
	// set guessWordField
	
	// set guessLeftField
	
	// method to set the look and feel of the gui
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			// ignore error
		}
	}
	

	
	public static void main(String[] args) {
		HangmanGUI hangman = new HangmanGUI();
	}
}