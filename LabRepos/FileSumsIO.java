import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileSumsIO{
	public static void main(String[] args){

		FileReader fileInput = null;
		char[] reverseOrder = new char[1000];

		int i = 0;
		int j = 0;

		try{
			fileInput = new FileReader("/Users/tnivium/Desktop/PROGRAMMING-COMPSCI4039/LabRepos/backwards.txt");

			char[] destination = new char[1024];
	
			int charsRead = fileInput.read(destination, 0, destination.length);

			for(i = charsRead; j < charsRead; i--){
				reverseOrder[i] = destination[j];
				j++; 
			}

			System.out.println(String.valueOf(reverseOrder));
			
		} catch(IOException e){
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