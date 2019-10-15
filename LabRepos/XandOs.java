import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream; 

public class XandOs{

	
	// public static void printBoard(char[][] board){
	// 	for(char[] a:board){
	// 		for(int i:a){
	// 		System.out.print(i + "\t");
	// 	}
	// 	System.out.println("\n");
	// 	}
	// }

	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		char[][] board = new char[3][3];

		int playerTurn = 1;

		for(;;){
			int coordinate1 = 0;
			int coordinate2 = 0;

			System.out.println("Player " + playerTurn + ": please select an x or o...");
			char player = keyboard.next().charAt(0);

			switch(player){
			case 'x':
				System.out.println("Now please choose coordinates of placement...");

				System.out.println("Row = ...");
				coordinate1 = keyboard.nextInt();

				System.out.println("Column = ...");
				coordinate2 = keyboard.nextInt();

				if(coordinate1 <= 2 && coordinate2 <= 2 && board[coordinate1][coordinate2] == 0){
					board[coordinate1][coordinate2] = 'x';
				} else {
					System.out.println("This move cannot be made");
					break;
				}
				System.out.println(Arrays.deepToString(board));
				
				if(playerTurn == 1){
					playerTurn = 2;
				} else playerTurn = 1;

				break;
			case 'o':
				System.out.println("Now please choose coordinates of placement...");
				
				System.out.println("Row = ...");
				coordinate1 = keyboard.nextInt();
				
				System.out.println("Column = ...");
				coordinate2 = keyboard.nextInt();
				
				if(coordinate1 <= 2 && coordinate2 < 2 && board[coordinate1][coordinate2] == 0){
					board[coordinate1][coordinate2] = 'o';
				} else {
					System.out.println("This move cannot be made");
					break;
				}	
				System.out.println(Arrays.deepToString(board));
				
				if(playerTurn == 1){
					playerTurn = 2;
				} else playerTurn = 1;

				break;
			default:
				System.out.println("Incorrect input, please select an appropriate character, x or o...");
				break;
			}
			// for(char[] element : board){
			// 	if (element != null){
			// 		continue;
			// 	} else System.out.println("All possible moves have been made... It's a draw!");

		}
	}
}
