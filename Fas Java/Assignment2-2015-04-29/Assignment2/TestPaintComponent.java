import javax.swing.*;
import java.awt.Graphics;


public class TestPaintComponent extends JFrame {
	public TestPaintComponent() {
		add(new HangPanel());
	}
	
	public static void main(String[] args) {
		TestPaintComponent frame = new TestPaintComponent();
		frame.setTitle("TestPaintComponent");
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.setVisible(true);
	}
}

class HangPanel extends JPanel {

	Graphics temp;
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		temp = g;
		temp.drawRect(0, 0, 200, 200); // box
		
		switch(num) {
				case 7 :
					temp.drawLine(40, 170, 140, 170); // box
					repaint();
					break;
				case 6 :
					temp.drawRect(40, 50, 10, 120); // upright
					repaint();
					break;
				case 5 :
					temp.drawRect(50, 50, 80, 10); // horizontal
					repaint();
					break;
				case 4 :
					temp.drawLine(115, 60, 115, 75);// rope
					repaint();
					break;
				case 3 :
					temp.drawOval(105, 75, 20, 20);// head
					repaint();
					break;
				case 2 :
					temp.drawLine(115, 95, 115, 120);// body
					repaint();
					break;
				case 1 :
					temp.drawLine(115, 95, 105, 110); // l arm
					temp.drawLine(115, 95, 125, 110); // r arm
					repaint();
					break;
				case 0 :
					temp.drawLine(115, 120, 105, 145);// l leg
					temp.drawLine(115, 120, 125, 145);// r leg
					repaint();
					break;
				default :
					JOptionPane.showMessageDialog(null, "Panic");
			}
		
		setVisible(true);
	}
	
	
}