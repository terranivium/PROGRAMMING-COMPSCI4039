//import java.util.Scanner;
//import java.util.Random;

public class Lab6{

	// public static void timesTable(int multiplier, int cycles){

	// 	for(int i = 1; i <= cycles; i++){
	// 		int valuesLive = multiplier * i;
	// 		System.out.println(valuesLive);
	// 	}
	// }

	// public static String guessNumber(int guess){

	// 	Random rand = new Random();
	// 	int randomNum = rand.nextInt(100);
	

	public static boolean calcPrime(int queried){

		// Calculate if any anumber to n is prime
		// made more efficient with 2*i which checks if divisable by 2
		for(int i = 2; 2*i < queried; i++){
			if(queried % i == 0) return false;
		} 
		return true;
	}

	public static void main(String[] args){

		for (int i = 2; i<=100; i++) {
			if (calcPrime(i)) System.out.println(i);
		}
	}
}