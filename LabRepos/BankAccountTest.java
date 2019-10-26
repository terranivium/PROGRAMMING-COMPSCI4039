public class BankAccountTest{
	public static void main(String[] args){
		Person geoff = new Person("Geoff", 28, "G");
		Person ruth = new Person("Ruth", 56, "R");

		SavingsAccount geoffSavings = new SavingsAccount(geoff);
		BankAccount geoffCurrent = new BankAccount(geoff);

		SavingsAccount ruthSavings = new SavingsAccount(ruth);
		BankAccount ruthCurrent = new BankAccount(ruth);

		geoffSavings.setAccountBalance(100);
		geoffCurrent.setAccountBalance(10000);

		System.out.print(geoffSavings + "\n");
		System.out.print(geoffCurrent + "\n");

		geoffSavings.transferFunds(50.24, geoffCurrent);

		System.out.print(geoffSavings + "\n");
		System.out.print(geoffCurrent + "\n");

	}
}