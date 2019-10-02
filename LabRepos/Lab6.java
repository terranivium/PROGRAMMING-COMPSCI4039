//import java.util.Scanner;
//import java.util.Random;

public class Lab6{

	public static void timesTable(double multiplier, double cycles){

		for(int i = 1; i <= cycles; i++){
			double valuesLive = multiplier * i;
			System.out.printf("%7.3f * %2d = %9.3f\n", multiplier, i, valuesLive);
		}
	}

	// public static String guessNumber(int guess){

	// 	Random rand = new Random();
	// 	int randomNum = rand.nextInt(100);
	

	// public static boolean calcPrime(int queried){

	// 	// Calculate if any anumber to n is prime
	// 	// made more efficient with 2*i which checks if divisable by 2
	// 	for(int i = 2; 2*i < queried; i++){
	// 		if(queried % i == 0) return false;
	// 	} 
	// 	return true;
	// }

	public static void main(String[] args){

	timesTable(57.2345, 99);


	}
}