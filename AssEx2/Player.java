// Wesley Scott, 2460681S

// Task 1a Player
public class Player{

	private String name;
	private char symbol;

	public Player(String name, char symbol){
		this.name = name;
		this.symbol = symbol;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String newName){
		this.name = newName;
	}

	public char getSymbol(){
		return this.symbol;
	}

	// Sets player counter symbol
	public void setSymbol(char newSymbol){
		this.symbol = newSymbol;
	}

	public String toString(){
		return this.name;
	}
}