// Wesley Scott, 2460681S

public class Column{

	private int numRows;
	private int row = 0;
	private Counter[] columnCounter;

	// Task 2a Column
	public Column(int numRows){
		this.numRows = numRows;
		this.row = row;
		this.columnCounter = new Counter[this.numRows];
	}

	public int getRow(){
		return this.row;
	}

	public Counter getCounter(int position){
		return this.columnCounter[position];
	}

	// Checks instance of coulumn for 'full' status and returns whether true or false (Task 2b)
	public Boolean isFull(){
		if(columnCounter[numRows-1] == null){
			return false;
		} else return true;
	}

	// Sets logic of adding counter to a column, allowing addition if column is not full
	// Returns true if addition is successful (Task 2c)
	public Boolean add(Counter z){
		if(isFull() == false){
			columnCounter[row] = z;
			row++;
			return true;
		}
		return false;
	}
	
	// Defines string of a single row's value within a column (Task 2d)
	public String displayRow(int row){
		try{
			return columnCounter[row].toString();
		} catch(NullPointerException e){
			return " ";
		}
	}
	
	// Defines a string with column of counters (Task 2e)
	public String display(){
		int i = 0;
		int j = 0;
		
		// Initialising return string
		String displayOutput = "";
		
		// Loop through each row within a column and append counter symbols to String
		for(i=numRows-1;j<numRows;i--){
			displayOutput += displayRow(i) + "\n";
			j++;
		}
		System.out.print(displayOutput); // Print String as console output for assessment testing purposes
		return displayOutput;
	}
}
