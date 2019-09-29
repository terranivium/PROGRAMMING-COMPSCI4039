import java.util.Scanner;
public class Lab5Ex {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your name, followed by your age and press the return key.");
		String userEntry = keyboard.nextLine();

		//System.out.println(userEntry);

		Scanner t = new Scanner(userEntry);
		String name = "";
		int age = 0;
		// //t.next();
		// t.close();
		while (t.hasNext()) {
			if (t.hasNextInt()) {
				age = t.nextInt();
			} else {
				name = name + " " + t.next();
			}
		}

		//Ask daniela?
		System.out.println("Hello " + name + ", age " + age);
	}
}