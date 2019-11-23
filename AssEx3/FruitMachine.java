import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.util.Random;
import java.awt.FlowLayout;

// Model
public class FruitMachine extends JFrame implements ActionListener{

private FruitStatusPanel statusPanel;
private FruitSlotPanel slotPanel;
private FruitButtonPanel buttonPanel;

private String[] possibleCards = {"Ace", "King", "Queen", "Jack", "Joker"};
private String[] selectedCards = new String[3];
private int playerBalance;
private boolean gameState = false; // f - game off, t - game on

	public FruitMachine(){
		this.setSize(800,600);
		this.setLocation(20,20);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
// View
		statusPanel = new FruitStatusPanel();
		slotPanel = new FruitSlotPanel();
// Controller
		buttonPanel = new FruitButtonPanel(this);

		playerBalance = 100;

		add(statusPanel);
		add(slotPanel);
		add(buttonPanel);
	}

	public int[] getCardsCount(){
		int[] counts = {0, 0, 0, 0, 0};
		for (int i=0; i<5; i++) {
			String card = possibleCards[i];
			for (String selectedCard : this.selectedCards) {
				if (card.equals(selectedCard)) {
					counts[i]++;
				}
			}
		 	//toCheck.length() - toCheck.replaceAll(card, "").length();
		}
		return counts;
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource() == buttonPanel.getSpinButton()) {
			// whatever happens when spin is pressed goes here

			// get 3 new random cards
			for (int i = 0; i<3; i++) {
				Random generator = new Random();
				int randomCardIdx = generator.nextInt(this.possibleCards.length);
    			this.selectedCards[i] = this.possibleCards[randomCardIdx];
			}
			slotPanel.updateText(this.selectedCards);

			int[] counts = this.getCardsCount();
			if (counts[4] > 0) {
				this.playerBalance = this.playerBalance - counts[4]*25;
				statusPanel.updateText(this.playerBalance, String.format("%d jokers, you lose %d credits!", counts[4], counts[4]*(-25)));
			} else {
				int oldBalance = this.playerBalance;
				for (int i = 0; i<4; i++) {
					if (counts[i] > 1) {
						this.playerBalance = this.playerBalance + counts[i]*25;
						statusPanel.updateText(this.playerBalance, String.format("%d %s s, you win %d credits!", counts[i], this.possibleCards[i], counts[i]*(25)));

					}
				}
				// balance hasn't changed
				if (oldBalance == this.playerBalance) {
					statusPanel.updateText(this.playerBalance, String.format("No balance change. Try again."));
				}
			}

			if (this.playerBalance >= 150) {
				// win
				this.gameState = false;
				this.buttonPanel.buttonState(false);
				statusPanel.updateVictory("You win!");
			} else if (this.playerBalance <= 0) {
				// lose
				this.gameState = false;
				this.buttonPanel.buttonState(false);
				statusPanel.updateVictory("You lose!");
			}

		} else if (e.getSource() == buttonPanel.getNewGameButton()) {
			// whatever happens when new game is pressed
			this.gameState = true;
			this.buttonPanel.buttonState(true);
			this.playerBalance = 100;
			statusPanel.updateText(this.playerBalance, String.format("Press spin to get your cards!"));
			statusPanel.updateVictory("");
		}
	}

	public static void main(String[] args){
		FruitMachine gui =  new FruitMachine();
		gui.setVisible(true);
	}

	
}