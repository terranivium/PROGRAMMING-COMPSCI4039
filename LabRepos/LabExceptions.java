import java.util.Scanner;
import java.util.InputMismatchException;

public class LabExceptions{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int inputCheck = 0;
		boolean isInt = false;

		while(!isInt){
			try{
				System.out.println("Please enter an int value...");
				inputCheck = keyboard.nextInt();
				isInt = true;
		 	}catch(InputMismatchException e){
				System.out.println("That's no an int mate...");
				keyboard.next();
			}
		}
	}
}
