public class Lab2Ex24 {
	public static void main(String[] args){
		/* 
		String firstName = "Wesley ";
		String lastName = "Scott";
		String fullName = firstName + lastName;

		System.out.println(fullName);
		*/

		int numberOfPies = 13;
		int numberOfPeople = 4;

		double piesToPeople = (double) numberOfPies / numberOfPeople;
		double leftOvers = (double) numberOfPies % numberOfPeople;

		System.out.println("These lucky sods get " + piesToPeople + " pies each. So " + leftOvers + " is left over.");
		System.out.println("....unless each person eats a quarter of the same pie....");
	}
}