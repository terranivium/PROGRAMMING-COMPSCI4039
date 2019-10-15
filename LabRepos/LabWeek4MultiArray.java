import java.util.Arrays;

public class LabWeek4MultiArray{

//public static void printIntArray(int[] a, int rows, int columns){

//}
	public static void main(String[] args){

		int rows = 6;
		int columns = 6;

		int[][] array = new int[rows][columns];

		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				array[i][j] = i + j;
			}
		}
		//System.out.println(Arrays.deepToString(array));
		//printIntArray(array, rows, columns)
		for(int[] a:array){
			for(int i:a){
			System.out.print(i + "\t");
		}
		System.out.println("\n");
		}
	}
}