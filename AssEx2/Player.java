// Wesley Scott, 2460681S

// Task 1a Player
public class Player{

	private String name;
	private char symbol;

	public Player(String name, char symbol){
		this.name = name;
		this.symbol = symbol; // Character used to show this player's counter on board
	}

	// Get player's name
	public String getName(){
		return this.name;
	}

	// Set player's name
	public void setName(String newName){
		this.name = newName;
	}

	// Get player's counter symbol
	public char getSymbol(){
		return this.symbol;
	}

	// Set player's counter symbol
	public void setSymbol(char newSymbol){
		this.symbol = newSymbol;
	}

	// toString defined as per task 1c
	public String toString(){
		return this.name;
	}
}