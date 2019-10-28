public class Board{

	private int rows;
	private int columns;
	private Column[] board;

	public Board(int rows, int columns){
		this.rows = rows;
		this.columns = columns;
		this.board = new Column[columns];

		for(int i=0;i<columns;i++){
			this.board[i] = new Column(rows);
		}
	}

	public Boolean add(Counter z, int columnNumber){
		if(board[columnNumber].add(z) == true){
			board[columnNumber].add(z);
			return true;
		} else return false;
	}

	public String toString(){
		for(int i = 0; i<=columns-1;i++){
			return board[i].display().toString();
		}
	}
}