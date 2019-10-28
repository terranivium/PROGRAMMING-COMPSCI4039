import java.util.Arrays;

public class Board{

	private int rows;
	private int columns;
	private Column[] board;

	public Board(int rows, int columns){
		this.rows = rows;
		this.columns = columns;
		this.board = new Column[columns];

		// Creation of row arrays for each column
		for(int i=0;i<columns;i++){
			this.board[i] = new Column(rows);
		}
	}

	// public playerHasWon(){
	// // Checks if either player has achieved a winning position
	// }

	public Boolean isFull(){
	// Checks all coulumns for 'full' status and returns whether true or false (Task 3e)
		for(int i=0;i<this.columns;i++){
			if(!this.board[i].isFull()){
				return false;
			}
		}
		return true;
	}

	public Boolean add(Counter z, int columnNumber){
	// Adds a new counter to a given column, returns a Boolean value depending on wether this action was successful
		return this.board[columnNumber].add(z);
	}

	public String toString(){
	// Creation of game board as string
		// Create dynamic header based on number of columns
		String header = "";
		for(int c=0;c<this.columns;c++){
			header += "|" + c;
		}
		// Creates the divider between header and main table
		header += "|" + "\n" + new String(new char[this.columns*2]).replace("\0", "-");

		// Create return String and append header
		String displayOutputBoard = header + "\n";

		// Populate output string table with correct coulmn and row foramtting
		for(int i=this.rows-1;i>=0;i--){
			for(int j=0;j<this.columns;j++){
				displayOutputBoard += "|" + this.board[j].displayRow(i);
			}
			displayOutputBoard += "|" + "\n";
		}
		System.out.print(displayOutputBoard); // Print output for assessment testing purposes
		return displayOutputBoard;
	}
}