import javax.swing.*;
import java.awt.Graphics;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HangPanel extends JPanel {
	
	HangPanelEvent testHang = new HangPanelEvent(this);
	JButton	button = new JButton("next");
	public HangPanel() {
		
		
		//button.addActionListener(testHang);
		add(button);
		setVisible(true);
		
		
	}
	
	Graphics temp = new Graphics();
	
	/*
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		temp = g;
		temp.drawRect(0, 0, 180, 180); // box
		
		
		setVisible(true);
	}
	*/
	
	
	public void nextElement(int num) {
			switch(num) {
				case 7 :
					temp.drawRect(40, 150, 100, 30); // bottom box
					repaint();
					break;
				case 6 :
					temp.drawRect(40, 30, 10, 120); // upright
					repaint();
					break;
				case 5 :
					temp.drawRect(50, 30, 80, 10); // horizontal
					repaint();
					break;
				case 4 :
					temp.drawLine(115, 40, 115, 55);// rope
					repaint();
					break;
				case 3 :
					temp.drawOval(105, 55, 20, 20);// head
					repaint();
					break;
				case 2 :
					temp.drawLine(115, 75, 115, 100);// body
					repaint();
					break;
				case 1 :
					temp.drawLine(115, 75, 105, 90); // l arm
					temp.drawLine(115, 75, 125, 90); // r arm
					repaint();
					break;
				case 0 :
					temp.drawLine(115, 100, 105, 125);// l leg
					temp.drawLine(115, 100, 125, 125);// r leg
					repaint();
					break;
				default :
					JOptionPane.showMessageDialog(null, "Panic");
			}
	}
	
	public static void main(String[] args) {
		HangPanel panel = new HangPanel();
	}
}