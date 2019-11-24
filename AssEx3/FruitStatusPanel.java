import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class FruitStatusPanel extends JPanel{
private JLabel balance;
private JLabel message;
private JLabel victory;

	public FruitStatusPanel(){
		this.setLayout(new GridLayout(3, 1));

		balance = new JLabel();
		message = new JLabel();
		victory = new JLabel();

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
