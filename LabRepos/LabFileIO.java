import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LabFileIO{
	public static void main(String[] args){
		FileReader fileInput = null;

		try{
			fileInput = new FileReader("/Users/tnivium/Desktop/PROGRAMMING-COMPSCI4039/LabRepos/sums.txt");
			Scanner fileParse = new Scanner(fileInput);
			
			while(fileParse.hasNextLine()){
				String[] tokens = fileParse.nextLine().split(" ");

				switch(tokens[1]){
	            	case "+":
	                	int answer = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[2]);
	                	String result = String.format("Calculation: %s %s %s = %04d\n", tokens[0], tokens[1], tokens[2], answer);
	                	System.out.print(result);
	                	break;
	            	case "-":
	                	answer = Integer.parseInt(tokens[0]) - Integer.parseInt(tokens[2]);
	                	result = String.format("Calculation: %s %s %s = %04d\n", tokens[0], tokens[1], tokens[2], answer);
	                	System.out.print(result);                
	                	break;                
	            	default:
	                	result = String.format("Input '%s' is not a valid operator...\n", tokens[1]);
	                	System.out.print(result);
	                	break;
				}
			}
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} finally {
			try{
				fileInput.close();
			} catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}