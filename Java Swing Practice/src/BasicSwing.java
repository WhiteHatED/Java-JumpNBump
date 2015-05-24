import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BasicSwing extends JFrame{
	
	JPanel panel = new JPanel();
	JButton button = new JButton("Hello");
	JTextField text = new JTextField("Hi",20);
	JTextArea textArea = new JTextArea("How\n are\n you?", 20, 5);
	JLabel label = new JLabel("What's up?");
	String choices[] = {
		"one",
		"Two",
		"Three"
	};
	JComboBox comboBox = new JComboBox(choices);
	public static void main(String[] args){
		new TicTacToe();
	}
	
	public BasicSwing(){
		super("Basic Swing App");
		setSize(400,300);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(button);
		panel.add(text);
		panel.add(textArea);
		panel.add(label);
		panel.add(comboBox);
		add(panel);
		setVisible(true);
	}
}
