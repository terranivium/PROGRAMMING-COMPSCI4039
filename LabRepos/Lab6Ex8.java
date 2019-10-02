public class Lab6Ex8{
	public static String ammendString(String input, String padder, int stringLength){
		String ammendedString = "";
		for(int i = 0; ammendedString.length() + input.length() < stringLength; i++){
			ammendedString = ammendedString + padder;
		}
		ammendedString = ammendedString + input + "\n";
		return ammendedString;
	} 

	public static void main(String[] args){
		System.out.print(ammendString("Wesley", "!", 10));
	}
}