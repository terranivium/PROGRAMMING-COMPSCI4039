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

	public int getColumns(){
		return this.columns;
	}

	// Checks if a player has achieved a winning 4-in-a-row position (Task 5)
	public Boolean checkVictory(Counter token, int column){
		if(playerVictoryColumn(token, column) || playerVictoryRow(token, column) || playerVictoryDiagonalDLUR(token, column) || playerVictoryDiagonalULDR(token, column)){
			return true;
		}
		return false;
	}

	// columns
	public Boolean playerVictoryColumn(Counter token, int column){
		int counters = 0;
		int lastCounterPos = this.board[column].getRow();

		// If the number of counters added to column is less than 4, not possible for winning position
		if (lastCounterPos < 4){
			return false;
		}
		while(lastCounterPos > 0 || counters < 4){
			if (this.board[column].getCounter(lastCounterPos-1).equals(token)) {
				counters++;
				lastCounterPos--;
			} else break;
		}
		if (counters == 4){
			return true;
		}
		return false;
	}

	// rows
	public Boolean playerVictoryRow(Counter token, int column){
		int counters = 1;
		int lastCounterPos = this.board[column].getRow();

		for (int i = 1; i<=4; i++){
			int leftOfCol = column - i;
			// Checking left
			if(leftOfCol >= 0){
				if(this.board[leftOfCol].getCounter(lastCounterPos-1) != null && this.board[leftOfCol].getCounter(lastCounterPos-1).equals(token)){
					counters++;
				} else {
					// Break going left
					break;
				}
			}
		}
		
		for (int i = 1; i<=4; i++){
			int rightOfCol = column + i;
			// Checking right
			if(rightOfCol < this.getColumns()){
				if(this.board[rightOfCol].getCounter(lastCounterPos-1) != null && this.board[rightOfCol].getCounter(lastCounterPos-1).equals(token)){
					counters++;
				} else {
					// Break going right
					break;
				}
			}
		}
		if (counters >= 4) {
			return true;
		} 
		return false;
	}

	// diagonals
	public Boolean playerVictoryDiagonalDLUR(Counter token, int column){
		int counters = 1;
		int lastCounterPos = this.board[column].getRow();
		for (int i = 1; i<=4; i++){
			int downOfRow = lastCounterPos - 1 - i;
			int leftOfCol = column - i;
			// Checking left and down
			if(leftOfCol >= 0 && downOfRow >= 0){
				if(this.board[leftOfCol].getCounter(downOfRow) != null && this.board[leftOfCol].getCounter(downOfRow).equals(token)){
					counters++;
				} else {
					// Break going left and down
					break;
				}
			}
		}
		
		for (int i = 1; i<=4; i++){
			int upOfRow = lastCounterPos - 1 + i;
			int rightOfCol = column + i;
			// Checking right and up
			if(rightOfCol < this.getColumns() && upOfRow < this.rows){
				if(this.board[rightOfCol].getCounter(upOfRow) != null && this.board[rightOfCol].getCounter(upOfRow).equals(token)){
					counters++;
				} else {
					// Break going right and up
					break;
				}
			}
		}
		if (counters >= 4) {
			return true;
		} 
		return false;
	}
	public Boolean playerVictoryDiagonalULDR(Counter token, int column){
		int counters = 1;
		int lastCounterPos = this.board[column].getRow();
		for (int i = 1; i<=4; i++){
			int upOfRow = lastCounterPos - 1 + i;
			int leftOfCol = column - i;
			// Checking left and up
			if(leftOfCol >= 0 && upOfRow < this.rows){
				if(this.board[leftOfCol].getCounter(upOfRow) != null && this.board[leftOfCol].getCounter(upOfRow).equals(token)){
					counters++;
				} else {
					// Break going left and up
					break;
				}
			}
		}
		
		for (int i = 1; i<=4; i++){
			int downOfRow = lastCounterPos - 1 - i;
			int rightOfCol = column + i;
			// Checking right and down
			if(rightOfCol < this.getColumns() && downOfRow >= 0){
				if(this.board[rightOfCol].getCounter(downOfRow) != null && this.board[rightOfCol].getCounter(downOfRow).equals(token)){
					counters++;
				} else {
					// Break going right and down
					break;
				}
			}
		}
		if (counters >= 4) {
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