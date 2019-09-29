public class NameAppend{

	public static void changeName(String oldString){
		oldString = oldString + "Scott";
		System.out.println("The string is: " + oldString);
	}

	public static void main(String[] args){
		String firstName = "Wesley";
		System.out.println(firstName);
		changeName(firstName);
		System.out.println(firstName);
	}
}