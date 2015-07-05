import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.BadLocationException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;


public class Highlighter extends JFrame implements ActionListener {
	
	JTextField start = new JTextField(5);
	JTextField end = new JTextField(5);
	JTextArea message = new JTextArea("I want to slit your throat,\n and fuck the wound. " + 
												"\nI want to push my face in,\nand feel the swoon." +
												"\nI want to dig inside,\nand find a little bit of me." +
												"\nBecause the lines get crossed,\nif you don't come clean." +
												"\nMy wormwood meets your pesticide,\nyou'll never get out cause you were never alive." +
												"\nI am infinite, I am the infinite finite." +
												"\nCome a little closer and I'll show you why.", 10, 22);
	JButton highlight = new JButton("Highlight");
	JButton clear = new JButton("Clear");
	
	public Highlighter() {
		super("Highlighter");
		setLookAndFeel();
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		JPanel row1 = new JPanel();
		JLabel startLabel = new JLabel("Start");
		row1.add(startLabel);
		row1.add(start);
		JLabel endLabel = new JLabel("End");
		row1.add(endLabel);
		row1.add(end);
		add(row1);
		
		JPanel row2 = new JPanel();
		JLabel messageLabel = new JLabel("Text Field");
		message.setLineWrap(true);
		message.setWrapStyleWord(true);
		JScrollPane scroll = new JScrollPane(message, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		row2.add(messageLabel);
		//row2.add(message);
		row2.add(scroll);
		add(row2);
		
		JPanel row3 = new JPanel();
		row3.add(highlight);
		highlight.addActionListener(this);
		row3.add(clear);
		clear.addActionListener(this);
		add(row3);
		
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();
		
		if (source == highlight) { 
			// Highlight part of text from position 8 up to but not including 13
			try {
				message.getHighlighter().addHighlight(Integer.parseInt(start.getText()), Integer.parseInt(end.getText()), DefaultHighlighter.DefaultPainter);
			}
			catch (BadLocationException ble){
				ble.printStackTrace();
			}
		} else {
			message.getHighlighter().removeAllHighlights();
			
		}
	}
	
	
	public void setLookAndFeel() {
		 try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore error
        }
	}
	
	public static void main(String[] args) {
		
		Highlighter highlight = new Highlighter();
		
	}	
}