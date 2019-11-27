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
		this.setLayout(new GridLayout(3, 1, 0, 10));

		// Create the 3 different status messages (JLabels)
		balance = new JLabel();
		message = new JLabel();
		victory = new JLabel();

		// Set horizontal alignment of each message
		balance.setHorizontalAlignment(JLabel.CENTER);
		message.setHorizontalAlignment(JLabel.CENTER);
		victory.setHorizontalAlignment(JLabel.CENTER);

		// Manual position adjustment
		balance.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
		message.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
		victory.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));

		// Add message texts JLabels to JPanel
		this.add(balance);
		this.add(message);
		this.add(victory);
	}

	// Set status messages with values provided by model
	public void updateText(int currentBalance, String statusMessage){
		balance.setText("Player Balance: " + currentBalance);
		message.setText(statusMessage);
	}

	// Set victory condition text provided by model
	public void updateVictory(String victoryStatus){
		victory.setText(victoryStatus);
	}
}
