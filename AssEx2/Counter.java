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

	public boolean equals(Object o){
		if(o instanceof Counter){
			Counter a = (Counter) o;
			if(a.getPlayer() == this.player) return true;
		} 
		return false;
	}

	public String toString(){
		return Character.toString(this.player.getSymbol());
	}
}