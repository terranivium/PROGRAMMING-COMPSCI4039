// Wesley Scott, 2460681S

// Task 2a Column
public class Column{

	private int numRows;
	private int row = 0;
	private Counter[] columnCounter;

	public Column(int numRows){
		this.numRows = numRows;
		this.row = row;
		this.columnCounter = new Counter[this.numRows]; // columnCounter is a new array of Counters, length numRows
	}

	// Get row within column
	public int getRow(){
		return this.row;
	}

	// Get counter within column
	public Counter getCounter(int position){
		return this.columnCounter[position];
	}

	// Checks instance of coulumn for 'full' status and returns whether true or false (Task 2b)
	public Boolean isFull(){
		if(this.columnCounter[this.numRows-1] == null){
			return false;
		} else return true;
	}

	// Sets logic of adding counter to a column, allowing addition if column is not full
	// Returns true if addition is successful (Task 2c)
	public Boolean add(Counter z){
		if(isFull() == false){
			this.columnCounter[this.row] = z;
			this.row++;
			return true;
		}
		return false;
	}
	
	// Defines string of a single row's value within a column (Task 2d)
	public String displayRow(int selectRow){
		try{
			return this.columnCounter[selectRow].toString();
		} catch(NullPointerException e){
			return " "; // If there is no Counter in the selected row, add a blank space to the String
		}
	}
	
	// Defines a string with column of counters (Task 2e)
	public String display(){
		int i = 0;
		int j = 0;
		
		// Initialising return string
		String displayOutput = "";
		
		// Loop through each row within a column and append counter symbols to String
		for(i=this.numRows-1;j<this.numRows;i--){
			displayOutput += displayRow(i) + "\n";
			j++;
		}
		System.out.print(displayOutput); // Print String as console output for assessment testing purposes
		return displayOutput;
	}
}
