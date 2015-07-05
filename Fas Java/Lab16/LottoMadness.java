import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;


public class LottoMadness extends JFrame {

	LottoEvent lotto = new LottoEvent(this);
	
	
    // set up row 1
    JPanel row1 = new JPanel();
    ButtonGroup option = new ButtonGroup();
    JCheckBox quickpick = new JCheckBox("Quick Pick", false);
    JCheckBox personal = new JCheckBox("Personal", true);
    
	// set up row 2
    JPanel row2 = new JPanel();
    JLabel numbersLabel = new JLabel("Your picks: ", JLabel.RIGHT);
    JTextField[] numbers = new JTextField[5];
    JLabel winnersLabel = new JLabel("Winners: ", JLabel.RIGHT);
    JTextField[] winners = new JTextField[5];
    
	// set up row 3
    JPanel row3 = new JPanel();
    JButton stop = new JButton("Stop");
    JButton play = new JButton("Play");
    JButton reset = new JButton("Reset");
    
	// set up row 4
    JPanel row4 = new JPanel();
	JPanel row4Top = new JPanel();
	JPanel row4Bottom = new JPanel();
    JLabel got3Label = new JLabel("3 of 5: ", JLabel.RIGHT);
    JTextField got3 = new JTextField("0");
    JLabel got4Label = new JLabel("4 of 5: ", JLabel.RIGHT);
    JTextField got4 = new JTextField("0");
    JLabel got5Label = new JLabel("5 of 5: ", JLabel.RIGHT);
    JTextField got5 = new JTextField("0");
    JLabel drawingsLabel = new JLabel("Drawings: ", JLabel.RIGHT);
    JTextField drawings = new JTextField("0");
    JLabel yearsLabel = new JLabel("Years: ", JLabel.RIGHT);
    JTextField years = new JTextField();
	
	//set up row 5
	JPanel row5 = new JPanel();
	JLabel sleepLabel = new JLabel("Sleep Time", JLabel.RIGHT);
	JTextField sleep = new JTextField("0", 10);

    public LottoMadness() {
        super("Lotto Madness");
        setLookAndFeel();
        setSize(550, 400);
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(5, 1, 10, 10);
        setLayout(layout);
		getContentPane().setBackground(Color.MAGENTA);
		
		// Add listeners
        quickpick.addItemListener(lotto);
        personal.addItemListener(lotto);
        stop.addActionListener(lotto);
        play.addActionListener(lotto);
        reset.addActionListener(lotto);

        FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER,
            10, 10);
        option.add(quickpick);
        option.add(personal);
		row1.setBackground(Color.MAGENTA);
        row1.setLayout(layout1);
        row1.add(quickpick);
        row1.add(personal);
		row1.setOpaque(true);
        add(row1);

        GridLayout layout2 = new GridLayout(2, 7, 10, 10);
		row2.setBackground(Color.MAGENTA);
        row2.setLayout(layout2);
        row2.add(numbersLabel);
        for (int i = 0; i < 5; i++) {
            numbers[i] = new JTextField();
            row2.add(numbers[i]);
        }
        row2.add(winnersLabel);
        for (int i = 0; i < 5; i++) {
            winners[i] = new JTextField();
            winners[i].setEditable(false);
            row2.add(winners[i]);
        }
        add(row2);

        FlowLayout layout3 = new FlowLayout(FlowLayout.CENTER,
            10, 10);
		row3.setBackground(Color.MAGENTA);
        row3.setLayout(layout3);
        stop.setEnabled(false);
        row3.add(stop);
		stop.setBackground(Color.RED);
        row3.add(play);
		play.setBackground(Color.GREEN);
        row3.add(reset);
		reset.setForeground(Color.RED);
        add(row3);

        GridLayout layout4 = new GridLayout(1, 3, 20, 10);
		GridLayout layout4Half = new GridLayout(2, 1, 20, 5);
		row4.setLayout(layout4Half);
		
		row4.add(row4Top);
		row4.add(row4Bottom);
		row4Top.setBackground(Color.MAGENTA);
		row4Bottom.setBackground(Color.MAGENTA);
		
        row4.setBackground(Color.MAGENTA);
		row4Top.setLayout(layout4);
		row4Bottom.setLayout(layout4);
        row4Top.add(got3Label);
        got3.setEditable(false);
        row4Top.add(got3);
        row4Top.add(got4Label);
        got4.setEditable(false);
        row4Top.add(got4);
        row4Top.add(got5Label);
        got5.setEditable(false);
        row4Top.add(got5);
        row4Bottom.add(drawingsLabel);
        drawings.setEditable(false);
        row4Bottom.add(drawings);
        row4Bottom.add(yearsLabel);
        years.setEditable(false);
        row4Bottom.add(years);
        add(row4);
		
		FlowLayout layout5 = new FlowLayout(FlowLayout.CENTER);
		row5.setBackground(Color.MAGENTA);
		row5.add(sleepLabel);
		row5.add(sleep);
		sleep.setEditable(true);
		add(row5);
        
        setVisible(true);
    }
    
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
        LottoMadness frame = new LottoMadness();
    }
}
