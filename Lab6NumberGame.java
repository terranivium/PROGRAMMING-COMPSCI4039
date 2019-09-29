import java.util.Scanner;
import java.util.Random;

public class Lab6NumberGame{

	public static void main(String[] args){

		Random rand = new Random();
		int randomNum = rand.nextInt(10);

		int answerResponse;
		int attempts = 3;

		System.out.println("Welcome to the number guessing game... ");
		System.out.println("Please guess a number between 0-9... " + attempts + " tries remaining.");
		Scanner keyboard = new Scanner(System.in);

		do{
			answerResponse = keyboard.nextInt();

			if(answerResponse < randomNum){
				attempts--;
				System.out.println("Too low! Try again... " + attempts + " tries remaining.");
			}
			else if(answerResponse > randomNum){
				attempts--;
				System.out.println("Too high! Try again... " + attempts + " tries remaining.");
			}
			else System.out.println("Correct! Well done!");
		} while (answerResponse != randomNum && attempts > 0);

		keyboard.close();
	}
}
