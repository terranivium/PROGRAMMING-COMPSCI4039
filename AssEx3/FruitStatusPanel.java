//import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class FruitStatusPanel extends JPanel{
private JTextField balance;
private JTextField message;
private JTextField victory;

	public FruitSlotPanel(){
		this.setLayout(new FlowLayout());
		balance = new JTextField(14);
		message = new JTextField(35);
		victory = new JTextField(8);

		this.add(balance);
		this.add(message);
		this.add(victory);
	}
	
	public void updateText(int currentBalance, String statusMessage, int statusVictory){
		balance.setText("Current Balance: " + currentBalance);
		message.setText(statusMessage);
	}

	public void updateVictory(boolean victoryCondition){
		if(victoryCondition){
			victory.setText("You Win!")
		} else victory.setText("You Lose!");
	}
}
