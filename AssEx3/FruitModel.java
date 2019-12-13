// 2460681S, Wesley Scott

import java.util.Random;

public class FruitModel{
	// Model attributes
	private String[] possibleCards = {"Ace", "King", "Queen", "Jack", "<html><i>Joker</i>"}; // All possible card selections (static)
	private String[] selectedCards = new String[3]; // Holds selected cards for slots
	private int playerBalance; // Holds players balance
	private String statusText; // Holds text to be used for status indicator

	public FruitModel(){
		this.playerBalance = 100; // Initial player balance
		// this.victory = null;
	}

	public int getPlayerBalance(){
		return this.playerBalance;
	}

	public String getStatusText(){
		return this.statusText;
	}

	public void setPlayerBalance(int newBalance){
		this.playerBalance = newBalance;
	}

	// Get count number of each card within random selection
	public int[] getCardCount(){
		int[] counts = {0, 0, 0, 0, 0}; // Initial counts
		for (int i=0; i<5; i++){
			String card = possibleCards[i];
			for (String selectedCard : this.selectedCards){
				if (card.equals(selectedCard)){
					counts[i]++; // Increment count for i-th card
				}
			}
		}
		return counts;
	}

	public String[] updateSlots(){
		// Get 3 new random cards
		for (int i = 0; i<3; i++){
			Random generator = new Random();
			int randomCardIdx = generator.nextInt(this.possibleCards.length);
    		this.selectedCards[i] = this.possibleCards[randomCardIdx];
		}
		return this.selectedCards;
	}

	public String[] getSelectedCards(){
		return this.selectedCards;
	}
	
	public String checkSlots(){
		// Check number of instances of each card in selected random cards
		int[] counts = getCardCount();

		// Check number of jokers
		if (counts[4] > 0){
			this.playerBalance = this.playerBalance - counts[4]*25; // Player balance update

			// View update
			String pluralJ = "";
			if(counts[4] > 1) pluralJ = "s";
			statusText = String.format("%d Joker%s, you lose %d credits!", counts[4], pluralJ, counts[4]*(-25));
		} else {
			int oldBalance = this.playerBalance; // Store balance for comparison
			for (int i = 0; i<4; i++){
				// If 2 of a kind
				if (counts[i] == 2){
					this.playerBalance = this.playerBalance + 20; // Player balance update

					// View update 
					statusText = String.format("%d %s" + "s, you win %d credits!", counts[i], this.possibleCards[i], 20);
					
				// If 3 of a kind
				} else if (counts[i] == 3){
					this.playerBalance = this.playerBalance + 50; // Player balance update

					// View update
					statusText = String.format("%d %s" + "s, you win %d credits!", counts[i], this.possibleCards[i], 50);
				}
			}
			// In the event the playerBalance does not change
			if (oldBalance == this.playerBalance){
				statusText = String.format("No balance change. Spin again!"); // View update
			}
		}
		return statusText;
	}
}