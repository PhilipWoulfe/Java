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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Color;

public class HangmanEvent implements ActionListener {
	HangmanGUI gui;
	
	int guessesLeft = 0;
	
	String word;
	char[] hiddenWord;
	
	HangmanEvent(HangmanGUI in) {
		gui = in;
			
	}
	
	
	
	
	
	public void actionPerformed (ActionEvent event) {
		Object source = event.getSource();
		
		
		if (source == gui.start) {
			startGame();
		} else if (source == gui.answer) {
			gui.guessWordField.setText(word);
			gui.guessLeftField.setText("");
		} else {
			JButton button = (JButton)source;
			for (int i = 0; i < word.length(); i++) {
				if (((word.toLowerCase())).indexOf(Character.toLowerCase(button.getText().charAt(0))) == -1) { // if button text  doesn't match letter in string
					guessesLeft--;
					gui.guessLeftField.setText(guessesLeft + "");
					gui.hang.nextElement(guessesLeft);
					
					break;
				} else if (Character.toLowerCase(button.getText().charAt(0)) == Character.toLowerCase(word.charAt(i))) { // if button text matches letter in string
					hiddenWord[i] = word.charAt(i); // convert from astrisk to letter
					
					gui.guessWordField.setText(new String(hiddenWord)); // set text in gui
				} 
			}
			if (word.equalsIgnoreCase(new String(hiddenWord))) {
				endGame();
				//JOptionPane.showMessageDialog(null, "You Win!", "Win", JOptionPane.PLAIN_MESSAGE);
				AnswerWindow window = new AnswerWindow("You Win!", Color.BLUE);
				
			}
			if (guessesLeft == 0) {
				endGame();
				//JOptionPane.showMessageDialog(null, "You Lose!\n The answer was: " + word, "Lose", JOptionPane.PLAIN_MESSAGE);
				//AnswerWindow.showMessageDialog(null, "You Lose!\n The answer was: " + word, "Lose", JOptionPane.PLAIN_MESSAGE);
				AnswerWindow window = new AnswerWindow("You Lose!", Color.RED);
			}
			
		}
		
	}
	
	// chooses a word
	public String chooseWord(){
		
		int num = (1 + (int)(Math.random() * 10)) % 5;
		// System.out.println(num);
		String answer = "";
		
		switch (num) {
			case 0: 
				answer = "Memory";
				break;
			case 1:
				answer = "Computer";
				break;
			case 2:
				answer = "Printer";
				break;
			case 3:
				answer = "Trousers";
				break;
			case 4:
				answer = "Buttercup";
				break;
			default:
				System.out.print("Uh-oh");
		}
		// System.out.println(answer);
		return answer;
	}

	
	
	
	
	
	// starts game
	public void startGame() {
		word = chooseWord();
		hiddenWord = new char[word.length()];
		
		for(int i = 0; i < hiddenWord.length; i++) {
			hiddenWord[i] = '*';
		}
		
		gui.guessWordField.setText(new String(hiddenWord));
		guessesLeft = 8;
		gui.guessLeftField.setText(guessesLeft + "");
		
		for (int i = 0; i < 26; i++) {
			gui.buttons[i].setEnabled(true);
		}
		gui.answer.setEnabled(true);
		
	}
	
	// ends game
	public void endGame() {
		gui.guessWordField.setText("");
		gui.guessLeftField.setText("");
		
		for (int i = 0; i < 26; i++) {
			gui.buttons[i].setEnabled(false);
		}
		gui.answer.setEnabled(false);
		hiddenWord = null;
	}
}