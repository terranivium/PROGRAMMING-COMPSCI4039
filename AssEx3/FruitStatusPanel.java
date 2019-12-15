// 2460681S, Wesley Scott

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

// Game status text panel
public class FruitStatusPanel extends JPanel{
	
	private JLabel balance; // Balance status text
	private JLabel message; // Game status message
	private JLabel victory; // Victory status message

	public FruitStatusPanel(){
		// Set layout manager for status texts JPanel
		this.setLayout(new GridLayout(3, 1, 0, 0));

		// Create the 3 different status messages (JLabels)
		this.balance = new JLabel();
		this.message = new JLabel();
		this.victory = new JLabel();

		// Set horizontal alignment of each message
		this.balance.setHorizontalAlignment(JLabel.CENTER);
		this.message.setHorizontalAlignment(JLabel.CENTER);
		this.victory.setHorizontalAlignment(JLabel.CENTER);

		// Manual position adjustment
		this.balance.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
		this.message.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
		this.victory.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));

		// Add message texts JLabels to JPanel
		this.add(balance);
		this.add(message);
		this.add(victory);
	}

	public JLabel getBalance() {
		return this.balance;
	}

	public void setBalance(JLabel balance) {
		this.balance = balance;
	}

	public JLabel getMessage() {
		return this.message;
	}

	public void setMessage(JLabel message) {
		this.message = message;
	}

	public JLabel getVictory() {
		return this.victory;
	}

	public void setVictory(JLabel victory) {
		this.victory = victory;
	}

	// Set balance with value provided by model
	public void updateBalance(int currentBalance){
		this.balance.setText("Player Balance: " + currentBalance);
	}

	// Set status text with value provided by model
	public void updateStatus(String statusMessage){
		this.message.setText(statusMessage);
	}

	// Set victory condition text provided by model
	public void updateVictory(String victoryStatus){
		this.victory.setText(victoryStatus);
	}
}
