import javax.swing.*;

public class Test extends JFrame {
	static HangPanel panel;
	
	public Test () {
		panel = new HangPanel();
		panel.nextElement(7);
		add(panel);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		panel.nextElement(7);
		for (int i = 7; i >= 0; i--) {
			//test.panel.nextElement(i);
		}
	}
}