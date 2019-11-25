// 2460681S, Wesley Scott

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.util.Random;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

// Model / View class
public class FruitMachine extends JFrame implements ActionListener{
private FruitStatusPanel statusPanel;
private FruitSlotPanel slotPanel;
private FruitButtonPanel buttonPanel;

private String[] possibleCards = {"Ace", "King", "Queen", "Jack", "Joker"}; // All possible card selections
private String[] selectedCards = new String[3]; // Holds selected cards for slots
private int playerBalance; // Holds players balance
private boolean gameState = false; // False - Game inactive, True - Game active

	public FruitMachine(){
		// View
		this.setSize(400,200); // Set window/frame size
		this.setResizable(false); // Lock window/frame size
		this.setLocation(100,100); // Set window/frame open location on screen
		this.setTitle("FruitMachine, AssEx3, 2460681S"); // Set window/frame title bar text
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Stop run on window/frame close
		this.setLayout(new GridBagLayout()); // Set layout manager for JFrame
		GridBagConstraints c = new GridBagConstraints(); // Create constraints for gridbag layout manager
		c.fill = GridBagConstraints.HORIZONTAL;

		// Create new reference to status panel
		statusPanel = new FruitStatusPanel();
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 0;
		add(statusPanel, c); // Add status panel to JFrame with layout constraints

		// Create new reference to card slot panel
		slotPanel = new FruitSlotPanel();
		c.ipady = 20;
		c.weightx = 0.0;
		c.gridheight = 3;
		c.gridx = 0;
		c.gridy = 1;
		add(slotPanel, c); // Add card slot panel to JFrame with layout constraints

		// Create new reference to button panel
		buttonPanel = new FruitButtonPanel(this);
		c.ipady = 0;
		c.ipadx = 10;
		c.weighty = 1.0;
		c.gridx = 1;
		c.gridy = 1;
		add(buttonPanel, c); // Add button panel to JFrame with layout constraints

		playerBalance = 100; // Initial player balance

		buttonPanel.buttonState(this.gameState); // Initial button state
		statusPanel.updateText(this.playerBalance, String.format("Start a New Game!")); // Initial status message
		statusPanel.updateVictory(""); // Initial victory status text
	}
	
	// Count method to get count of each card within random selection
	public int[] getCardsCount(){
		int[] counts = {0, 0, 0, 0, 0}; // Initial count
		for (int i=0; i<5; i++){
			String card = possibleCards[i];
			for (String selectedCard : this.selectedCards){
				if (card.equals(selectedCard)){
					counts[i]++; // Increment count for i card
				}
			}
		}
		return counts;
	}

	public void actionPerformed(ActionEvent e){
		// Spin Button Pressed
		if (e.getSource() == buttonPanel.getSpinButton()){
			// Get 3 new random cards
			for (int i = 0; i<3; i++){
				Random generator = new Random();
				int randomCardIdx = generator.nextInt(this.possibleCards.length);
    			this.selectedCards[i] = this.possibleCards[randomCardIdx];
			}
			// Update card slot text
			slotPanel.updateText(this.selectedCards);

			// Check number of instances of each card in selected random cards
			int[] counts = this.getCardsCount();

			// Check number of jokers
			if (counts[4] > 0){
				this.playerBalance = this.playerBalance - counts[4]*25;
				statusPanel.updateText(this.playerBalance, String.format("%d Jokers, you lose %d credits!", counts[4], counts[4]*(-25)));
			} else {
				int oldBalance = this.playerBalance;
				for (int i = 0; i<4; i++){
					// If 2 of a kind
					if (counts[i] == 2){
						this.playerBalance = this.playerBalance + 20;
						statusPanel.updateText(this.playerBalance, String.format("%d %s" + "s, you win %d credits!", counts[i], this.possibleCards[i], 20));
					// If 3 of a kind
					} else if (counts[i] == 3){
						this.playerBalance = this.playerBalance + 50;
						statusPanel.updateText(this.playerBalance, String.format("%d %s" + "s, you win %d credits!", counts[i], this.possibleCards[i], 50));
					}
				}
				// In the event the playerBalance does not change
				if (oldBalance == this.playerBalance){
					statusPanel.updateText(this.playerBalance, String.format("No balance change. Spin again!"));
				}
			}

			if (this.playerBalance >= 150){
				// Win condition
				this.gameState = false;
				this.buttonPanel.buttonState(false);
				statusPanel.updateVictory("You win! Play again?");
			} else if (this.playerBalance <= 0) {
				// Lose condition
				this.gameState = false;
				this.buttonPanel.buttonState(false);
				statusPanel.updateVictory("You lose! Try again?");
			}
		// New Game button pressed
		} else if (e.getSource() == buttonPanel.getNewGameButton()){
			String[] emptyCards = {" "," "," "}; 
			slotPanel.updateText(emptyCards); // reset card slot display to empty

			this.gameState = true; // Gamestate set to 'on'
			this.buttonPanel.buttonState(true); // Switches the enabled and disabled button
			this.playerBalance = 100; // Reset player balance
			statusPanel.updateText(this.playerBalance, String.format("Press spin to get your cards!")); // Initial status message
			statusPanel.updateVictory(""); // Reset victory status text
		}
	}

	public static void main(String[] args){
		FruitMachine gui =  new FruitMachine();
		gui.setVisible(true);
	}
}