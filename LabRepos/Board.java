import java.util.Arrays;

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

	public Boolean isFull(){
		for(int i=0;i<this.columns;i++){
			if(!this.board[i].isFull()){
				return false;
			}
		}
		return true;
	}

	public Boolean add(Counter z, int columnNumber){
		return this.board[columnNumber].add(z);
	}

	public String toString(){
		String header = "";
		for(int c=0;c<this.columns;c++){
			header += "|" + c;
		}
		header += "|" + "\n" + new String(new char[this.columns*2]).replace("\0", "-");

		String displayOutputBoard = header + "\n";
		for(int i=this.rows-1;i>=0;i--){
			for(int j=0;j<this.columns;j++){
				displayOutputBoard += "|" + this.board[j].displayRow(i);
			}
			displayOutputBoard += "|" + "\n";
		}
		System.out.print(displayOutputBoard);
		return displayOutputBoard;
	}
}