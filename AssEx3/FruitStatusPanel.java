//import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FruitStatusPanel extends JPanel{
private JTextField balance;
private JTextField message;
private JTextField victory;

	public FruitStatusPanel(){
		this.setLayout(new FlowLayout());

		balance = new JTextField(14);
		message = new JTextField(35);
		victory = new JTextField(8);

		this.add(balance);
		this.add(message);
		this.add(victory);
	}
	
	public void updateText(int currentBalance, String statusMessage){
		balance.setText("Current Balance: " + currentBalance);
		message.setText(statusMessage);
	}

	public void updateVictory(String victoryStatus){
		victory.setText(victoryStatus);
	}
}
