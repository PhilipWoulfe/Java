import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MailWriter2 extends JFrame {
	
	MailWriterEvent mail = new MailWriterEvent(this);
	
	JTextField start = new JTextField(3);
	JTextField end = new JTextField(3);
	JTextField to = new JTextField(24);
	JTextField subject = new JTextField(24);
	JTextArea message = new JTextArea("I felt the hate rise up in me,\nKneel down and clear the stone of leaves." + 
												"\nI wander out where you can see,\ninside my shell I wait and bleed." +
												"I felt the hate rise up in me,\nKneel down and clear the stone of leaves." + 
												"\nI wander out where you can see,\ninside my shell I wait and bleed." +
												"\n\nGOODBYE!\n\nI wipe it off the tiles, \nthe light is brighter this time." + 
												"\nEverything is 3D blasphemy." +
												"\nMy eyes are red and gold,\nthe hair is standing straight up," +
												"\nthis is not the way I pictured me.\nI can't control my shakes," + 
												"\nhow the hell did I get here?\nSomething about this so very wrong." + 
												"\nI have to laugh out loud,\nI wish I didn't like this." + 
												"\nIs it a dream or a memory?" + 
												"\n\nI felt the hate rise up in me,\nKneel down and clear the stone of leaves." + 
												"\nI wander out where you can see,\ninside my shell I wait and bleed." +
												"\nI felt the hate rise up in me,\nKneel down and clear the stone of leaves." + 
												"\nI wander out where you can see,\ninside my shell I wait and bleed.", 10, 22);
	JButton send = new JButton("Send");
	JButton clear = new JButton("Clear");
	JButton highlight = new JButton("Highlight");
	
    public MailWriter2() {
        super("Write an E-Mail");
        setLookAndFeel();
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
        setLayout(flow);
        
        JPanel row1 = new JPanel();
        JLabel toLabel = new JLabel("To:");
        row1.add(toLabel);
        
        row1.add(to);
        add(row1);
        
        JPanel row2 = new JPanel();
        JLabel subjectLabel = new JLabel("Subject:");
        row2.add(subjectLabel);
        
        row2.add(subject);
        add(row2);
        
        JPanel row3 = new JPanel();
        JLabel messageLabel = new JLabel("Message:");
        row3.add(messageLabel);
        
        message.setLineWrap(true);
        message.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(message,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        row3.add(scroll);
        add(row3);
        
        JPanel row4 = new JPanel();
        
		send.addActionListener(mail);
		JLabel startLabel = new JLabel("Start: ");
		row4.add(startLabel);
        row4.add(start);
		JLabel endLabel = new JLabel("End: ");
		row4.add(endLabel);
		row4.add(end);
		row4.add(highlight);
		highlight.addActionListener(mail);
		
		
        add(row4);
		
		JPanel row5 = new JPanel();
		
		row5.add(send);
		row5.add(clear);
		clear.addActionListener(mail);
		add(row5);
		
        
        setVisible(true);
    }
	/*
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		if (source == send){
			System.out.println("To: " + to.getText() + "\nSubject: " + subject.getText() + "\nMessage: " + message.getText());
		}
	}
	*/
	/*
	public void actionPerformed(ActionEvent event) {
		Object source = event.getActionCommand();
		if (source.equals("Send")){
			System.out.println("To: " + to.getText() + "\nSubject: " + subject.getText() + "\nMessage: " + message.getText());
		}
	}
	*/
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore error
        }
    }

    public static void main(String[] arguments) {
        MailWriter2 mail = new MailWriter2();
    }
}
