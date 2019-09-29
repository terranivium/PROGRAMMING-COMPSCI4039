import java.time.LocalDate;

public class Lab4ExYear {
	/* This class calculates whether a year is infact a leap year, and also tells the user how many
	days in the month there will be for an input year and month combination. */
	
	// Calculate leap year, true or false.
	public static boolean calculateLeap(int year){

		boolean isLeapYear;
		boolean leapYearRule = year % 4 == 0;
		boolean leapYearException100 = year % 100 == 0;
		boolean leapYearException400 = year % 400 == 0;

		// Calculate if year is a leap year
		// NOTE: Try to improve the implementation of logic operation.
		if (leapYearRule){
			if(leapYearException100){
				if(leapYearException400){
					isLeapYear = true;
				} else isLeapYear = false;
			} else isLeapYear = true;
		} else isLeapYear = false;
		return isLeapYear;
	}

	// Calculate the number of days in a month, depending on leap year 't' or 'f'.
	public static int calculateDays(String month, boolean isLeapYear){

		int daysOfMonth;

		if((month.equals("Jan")) || (month.equals("Mar")) || (month.equals("May")) || (month.equals("Jul")) || (month.equals("Aug")) || (month.equals("Oct")) || (month.equals("Dec"))){
			daysOfMonth = 31;
		} else if((month.equals("Apr")) || (month.equals("Jun")) || (month.equals("Sep")) || (month.equals("Nov"))){
			daysOfMonth = 30;
		} else if((month.equals("Feb")) && isLeapYear == true){
			daysOfMonth = 29;
		} else daysOfMonth = 28;
		return daysOfMonth;
	}
	
	public static void main(String[] args){

		String month = "Feb"; // input month
		int year = 2013; // input year

		boolean isLeapYear = calculateLeap(year);
		int daysOfMonth = calculateDays(month, isLeapYear);

		String leapYear;

		//Year first then winning condition? Simple implementation.
		if(isLeapYear){
			leapYear = "was";
		} else leapYear = "was not";

		System.out.println("The month of " + month + " in the year " + year + " has " + daysOfMonth + " days. " + year + " " + leapYear + " a leap year.");
	}
}