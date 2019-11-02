// Wesley Scott, 2460681S

// Task 3 Board
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

	// Checks if a player has achieved a winning 4-in-a-row position (Task 5) 
	// Currently only working with columns
	public Boolean playerVictory(Counter token, int column){
		int counters = 0;
		int lastCheckerPos = this.board[column].getRow();

		// If the number of counters added to column is less than 4, not possible for winning position
		if (lastCheckerPos < 4){
			return false;
		}
		while(lastCheckerPos > 0 || counters < 4){
			if (this.board[column].getCounter(lastCheckerPos-1).equals(token)) {
				counters++;
				lastCheckerPos--;
			} else break;
		}
		if (counters == 4){
			return true;
		}
		return false;
	}

	// Checks all coulumns for 'full' status and returns whether true or false (Task 3e)
	public Boolean isFull(){
		for(int i=0;i<this.columns;i++){
			if(!this.board[i].isFull()){
				return false;
			}
		}
		return true;
	}

	// Adds a new counter to a given column, returns a Boolean value depending on wether this action was successful (Task 3b)
	public Boolean add(Counter z, int columnNumber){
		return this.board[columnNumber].add(z);
	}

	// Creation of game board as string(Task 3c)
	public String toString(){
		// Create string for board header based on number of columns
		String header = "";
		for(int c=0;c<this.columns;c++){
			header += "|" + c;
		}
		// Create divider between header and main table, considers number of columns
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