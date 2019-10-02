import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{

	public static int computerMove(){
		Random rand = new Random();
		int playerTwo = rand.nextInt(3);
		return playerTwo;
	}

	public static int playerMove(){
		Scanner input = new Scanner(System.in);
		System.out.print("Please choose 1. Rock, 2. Paper or 3. Scissors...");
		int playerOne = input.nextInt();
		return playerOne;
	}

	public static void main(String[] args){

		int playerOne;
		int playerOneCounter = 0;
		
		int playerTwo;
		int playerTwoCounter = 0;

		int numberOfWins = 3;

		do{
			playerOne = playerMove();
			playerTwo = computerMove();

			if(playerOne == 1 && playerTwo == 2){
				System.out.print("You Lose!\n");
				playerTwoCounter++;
			}else if (playerOne == 1 && playerTwo == 3){
				System.out.print("You Win!\n");
				playerOneCounter++;
			}else if (playerOne == 2 && playerTwo == 1){
				System.out.print("You Win!\n");
				playerOneCounter++;
			}else if (playerOne == 2 && playerTwo == 3){
				System.out.print("You Lose!\n");
				playerTwoCounter++;
			}else if (playerOne == 3 && playerTwo == 1){
				System.out.print("You Lose!\n");
				playerTwoCounter++;
			}else if (playerOne == 3 && playerTwo == 2){
				System.out.print("You Win!\n");
				playerOneCounter++;
			}else System.out.print("It's a tie!\n");

			if(playerOneCounter == 3){
				System.out.printf("Game Player One: %d - %d\n", playerOneCounter, playerTwoCounter);
				playerOneCounter = 0;
				break;
			}
			else if (playerTwoCounter == 3){
				System.out.printf("Game Player Two: %d - %d\n", playerOneCounter, playerTwoCounter);
				playerTwoCounter = 0;
				break;
			} else continue;
		}while (true);


	}
}