import java.util.Random;

public class ConnectFour{

	// Task 4 random play method
	public static void randomPlay(int rows, int columns){
		// Create new board
		Board board = new Board(rows, columns);

		// Add two players
		Player p1 = new Player("Player 1",'o');
		Player p2 = new Player("Player 2",'x');

		Random r = new Random();

		// Random play loop which runs while at least one column is not full
		while(board.isFull() != true){
			board.add(new Counter(p1),r.nextInt(columns));
			board.add(new Counter(p2),r.nextInt(columns));
		}
		board.toString(); 
		/* Creates string for output of completed game board 
		(I have set this function to call System.out.print for ease of testing task requirements) */
	}

	public static void main(String[] args){
		
		// // Task 1c test code
		// Player p1 = new Player("Clive",'x');
		// Counter c = new Counter(p1);
		// System.out.println(c.getPlayer().toString() + ", " + c.toString());
		// c.toString();

		// // Task 1d test code
		// System.out.println(c.equals(d));

		// // Task 2c test code
		// Column col = new Column(4);
		// for(int i=0;i<5;i++){
		// 	Boolean result = col.add(new Counter(p1));
		// 	System.out.println(result);
		// }

		// // Task 2e test code
		// Column col = new Column(6);
		// Player p1 = new Player("Clive", 'o');
		// Player p2 = new Player("Sharon", 'x');
		// for(int i = 0; i<3; i++){
		// 	col.add(new Counter(p1));
		// 	col.add(new Counter(p2));
		// }
		// col.display();

		// // Task 3d test code
		// Board board = new Board(6,7);
		// Player p1 = new Player("Clive",'o');
		// Player p2 = new Player("Sharon",'x');
		// board.add(new Counter(p2),6);
		// board.add(new Counter(p1),3);
		// board.add(new Counter(p2),4);
		// board.add(new Counter(p1),4);
		// board.add(new Counter(p2),5);
		// board.add(new Counter(p1),5);
		// board.add(new Counter(p2),6);
		// board.add(new Counter(p1),5);
		// board.add(new Counter(p2),6);
		// board.add(new Counter(p1),6);

		// Call randomPlay method (Task 4)
		randomPlay(6,7);
		}
}