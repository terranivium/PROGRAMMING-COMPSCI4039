import java.util.Random;
import java.util.ArrayList;

public class LabWeek4Arrays{

	public static double getAverage(Double[] array, double sum){
		double average = sum / array.length;
		return average;
	}

	public static int firstOccur(int[] array, int target){
		for(int i = 0; i < array.length; i++){
			if(array[i] == target) return i;
		}
		return -1;
	}

	public static int lastOccur(int[] array, int target){
		for(int i = array.length -1; i >= 0; i--){
			if(array[i] == target) return i;
		}
		return -1;
	}

	public static String allOccur(int[] array, int target){

		ArrayList<Integer> occur = new ArrayList<>();

		for(int i = 0; i < array.length; i++){
			if(array[i] == target){
				occur.add(i);
			} 
		}
		return occur.toString();
	}


	public static void main(String[] args){

		Random r = new Random();

		int[] randArray = new int[10];

		for(int i = 0; i < randArray.length; i++){
			randArray[i] = r.nextInt(10);
			System.out.printf("Element %d = %d \n", i, randArray[i]);
		}
		System.out.printf("All occurances of 3: %s\n", allOccur(randArray, 3));
		
		//System.out.printf("First Occurance: %d \nLast Occurance: %d \n",firstOccur(randArray, 3),lastOccur(randArray, 3));

		//Double[] randArray = new Double[100];

		//double sum = 0;

		// for(int i = 0; i < randArray.length; i++){
		// 	double input = r.nextDouble();
		// 	randArray[i] = input;
		// 	sum += randArray[i];
		// 	System.out.printf("Element %d = %f \n", i, randArray[i]);
		// }
		// System.out.printf("Average =  %f \n", getAverage(randArray, sum));
	}
}