public class Column{

	private int numRows;
	private int row = 0;
	private Counter[] columnCounter;

	public Column(int numRows){
		this.numRows = numRows;
		this.row = row;
		this.columnCounter = new Counter[this.numRows];
	}

	public Boolean isFull(){
		if(columnCounter[numRows-1] == null){
			return false;
		} else return true;
	}

	public Boolean add(Counter z){	
		if(isFull() == false){
			columnCounter[row] = z;
			row++;
			return true;
		}
		return false;
	}

	public String displayRow(int row){
		try{
			return columnCounter[row].toString();
		} catch(NullPointerException e){
			return " ";
		}
	}

	public void display(){
		int i = 0;
		int j = 0;
		for(i = numRows-1; j<=numRows-1; i--){
			System.out.println(displayRow(i));
			j++;
		}
	}
}
