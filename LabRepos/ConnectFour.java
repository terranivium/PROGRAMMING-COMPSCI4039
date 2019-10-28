import java.util.Random;

public class ConnectFour{

	public static void randomPlay(int rows, int columns){
		Board board = new Board(rows, columns);

		Player p1 = new Player("Wes",'o');
		Player p2 = new Player("Daniela",'x');

		Random r = new Random();

		while(board.isFull() != true){
			board.add(new Counter(p1),r.nextInt(columns));
			board.add(new Counter(p2),r.nextInt(columns));
		}
		board.toString();
	}

	public static void main(String[] args){
		// Player p1 = new Player("Clive",'x');
		// Counter c = new Counter(p1);
		// System.out.println(c.getPlayer().toString() + ", " + c.toString());

		// Player p2 = new Player("Gimp",'y');
		// Counter d = new Counter(p2);
		// System.out.println(d.getPlayer().toString() + ", " + d.toString());

		// System.out.println(c.equals(d));

		// Column col = new Column(4);
		// for(int i=0;i<5;i++){
		// 	Boolean result = col.add(new Counter(p1));
		// 	System.out.println(result);
		// }

		// System.out.println(col.displayRow(3));

		// Column col = new Column(6);
		// Player p1 = new Player("Clive", 'o');
		// Player p2 = new Player("Sharon", 'x');
		// for(int i = 0; i<3; i++){
		// 	col.add(new Counter(p1));
		// 	col.add(new Counter(p2));
		// }
		// col.display();

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

		// System.out.print(board.toString());

		// System.out.println(board.isFull());

		randomPlay(6,7);

		}
}