import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class AnswerWindow extends JFrame implements ActionListener{
	
	JButton button = new JButton("OK");
	JPanel top = new JPanel();
	JPanel topFill = new JPanel();
	JPanel bottom = new JPanel();
	JPanel bottomFill = new JPanel();
	JLabel messageLabel = new JLabel();
	
	public AnswerWindow(String str){
		super("Answer");
		setLookAndFeel();
		setSize(200, 150);
		setResizable(false);
		setLocationRelativeTo(null);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		messageLabel.setText(str);
		
		
		topFill.add(messageLabel);
		bottomFill.add(button);
		
		GridLayout mainLayout = new GridLayout(2, 1);
		setLayout(mainLayout);
		
		top.add(topFill);
		bottom.add(bottomFill);
		
		add(top);
		add(bottom);
		
		button.addActionListener(this);
		
		
		setVisible(true);
	}
	
	public AnswerWindow(String str, Color clr){
		super("Answer");
		setLookAndFeel();
		setSize(200, 150);
		setResizable(false);
		setLocationRelativeTo(null);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		messageLabel.setText(str);
		messageLabel.setForeground(clr);
		
		topFill.add(messageLabel);
		bottomFill.add(button);
		
		GridLayout mainLayout = new GridLayout(2, 1);
		setLayout(mainLayout);
		
		top.add(topFill);
		bottom.add(bottomFill);
		
		add(top);
		add(bottom);
		
		button.addActionListener(this);
		
		
		setVisible(true);
	}
	
	public void actionPerformed (ActionEvent event) {
			Object source = event.getSource();
			
			if (source == button) {
				this.dispose();
			}
			
	
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			// ignore error
		}
	}
	
	
}
