// 2460681S, Wesley Scott

import java.util.Random;

// Game data model
public class FruitModel{
	
	// Game model variables
	private final String[] possibleCards = {"Ace", "King", "Queen", "Jack", "<html><i>Joker</i>"}; // Possible card selections
	private String[] selectedCards = new String[3]; // Holds selected cards for slots
	private int playerBalance = 100; // Holds players balance, used to decide game state/victory conditions
	private String statusText; // Holds text to be used for view status updates

	public FruitModel(){
	}

	public void setPlayerBalance(int newBalance){
		this.playerBalance = newBalance;
	}

	public int getPlayerBalance(){
		return this.playerBalance;
	}

	public void setSelectedCards(String[] newSelectedCards){
		this.selectedCards = newSelectedCards;
	}

	public String[] getSelectedCards(){
		return this.selectedCards;
	}

	public void setStatusText(String newStatusText){
		this.statusText = newStatusText;
	}

	public String getStatusText(){
		return this.statusText;
	}

	public void updateSlots(){
		// Get 3 new random cards
		for (int i = 0; i<3; i++){
			Random generator = new Random();
			int randomCardIdx = generator.nextInt(this.possibleCards.length);
    		this.selectedCards[i] = this.possibleCards[randomCardIdx];
		}
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
	
	public void checkSlots(){
		// Check number of instances of each card in among selected random cards
		int[] counts = this.getCardCount();

		// Check the number of jokers
		if (counts[4] > 0){
			// Player balance update
			this.playerBalance = this.playerBalance - counts[4]*25;
			
			// Values for view update
			String pluralJoker = "";
			if(counts[4] > 1) pluralJoker = "s";
			statusText = String.format("<html>%d Joker%s, you lose <b>%d</b> credits!", counts[4], pluralJoker, counts[4]*(-25));
		} else {
			// Store balance for comparison
			int oldBalance = this.playerBalance;

			for (int i = 0; i<4; i++){
				// Check for 2 of a kind
				if (counts[i] == 2){
					// Player balance update (+20)
					this.playerBalance = this.playerBalance + 20;

					// View update 
					statusText = String.format("<html>%d %s" + "s, you win <b>%d</b> credits!", counts[i], this.possibleCards[i], 20);
					
				// Check for 3 of a kind
				} else if (counts[i] == 3){
					// Player balance update (+50)
					this.playerBalance = this.playerBalance + 50;

					// View update
					statusText = String.format("<html>%d %s" + "s, you win <b>%d</b> credits!", counts[i], this.possibleCards[i], 50);
				}
			}
			// In the event that the player's balance does not change (3 different cards with no joker)
			if (oldBalance == this.playerBalance){
				statusText = String.format("No balance change. Spin again!"); // View update
			}
		}
	}
}