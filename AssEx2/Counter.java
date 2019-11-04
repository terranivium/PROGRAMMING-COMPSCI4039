// Wesley Scott, 2460681S

// Task 1b Counter
public class Counter{

	private Player player;

	public Counter(Player player){
		this.player = player;
	}

	public Player getPlayer(){
		return this.player;
	}

	public void setPlayer(Player newPlayer){
		this.player = newPlayer;
	}

	// Checks if passed object is a counter from the same player (Task 1d)
	public boolean equals(Object o){
		if(o instanceof Counter){
			Counter a = (Counter) o;
			if(a.getPlayer() == this.player) return true;
		} 
		return false;
	}

	// To string set to achieve Task 1c requirement, output symbol of player counter
	public String toString(){
		return Character.toString(this.player.getSymbol());
	}
}