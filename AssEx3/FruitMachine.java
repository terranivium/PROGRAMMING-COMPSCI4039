import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class FruitMachine extends JFrame implements ActionListener{

private FruitStatusPanel statusPanel;
private FruitStatusPanel slotPanel;
private FruitStatusPanel buttonPanel;

private String[] cardText;
private int playerBalance;


	public FruitMachine(){
		setSize(300,300);
		setLocation(20,20);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		statusPanel = new FruitStatusPanel();
		slotPanel = new FruitSlotPanel();
		buttonPanel = new FruitButtonPanel(this);

		cardText = {"Ace", "King", "Queen", "Jack", "Joker"};
		playerBalance = 100;

		add(statusPanel);
		add(slotPanel);
		add(buttonPanel);
	}

	public int count(String toCheck, String card){
		return toCheck.length() - toCheck.replaceAll(card, "").length();
	}

	public void actionPerformed(ActionEvent e){
		Random r = new Random();

		String[] selectedCards = {cardText[r.nextInt(5)], cardText[r.nextInt(5)], cardText[r.nextInt(5)]};
		slotPanel.updateText(selectedCards[0]],selectedCards[selector[1]], selectedCards[selector[2]);

		String joinedCards = Arrays.toString(selectedCards);

		int jokerCount = count(joinedCards, "Joker");
		int ofAKind = count(joinedCards, "Ace") + count(joinedCards, "King") + count(joinedCards, "Queen") + count(joinedCards, "Jack");

		while(playerBalance < 150 && playerBalance > -150){
			switch (jokerCount){
				case 1:
					playerBalance -= 25;
					statusPanel.updateText(playerBalance, "1 joker, you lose -25 credits!");
					break;
				case 2:
					playerBalance -= 50;
					statusPanel.updateText(playerBalance, "2 jokers, you lose -50 credits!");
					break;
				case 3:
					playerBalance -= 75;
					statusPanel.updateText(playerBalance, "3 jokers, you lose -75 credits!");
					break;
			}
			switch (ofAKind){
				case 2:
					playerBalance += 50;
					statusPanel.updateText(playerBalance, "2 of a kind! You gain 50 credits!");
					break;
				case 3:
					playerBalance += 75;
					statusPanel.updateText(playerBalance, "2 of a kind! You gain 75 credits!");
					break;
			}
		}
		switch (playerBalance){
				case -150:
					statusPanel.updateVictory(false);
					buttonPanel.buttonState(true);
					break;
				case 150:
					statusPanel.updateVictory(true);
					buttonPanel.buttonState(true);
					break;
				default:
					break;
		}
	}

	public static void main(String[] args){
		FruitMachine gui =  new FruitMachine();
		gui.setVisible(true);
	}

	
}