public class BankAccountTest{
	public static void main(String[] args){
		Person geoff = new Person("Geoff", 28, "G");
		Person ruth = new Person("Ruth", 56, "R");

		SavingsAccount geoffSavings = new SavingsAccount(geoff);
		BankAccount geoffCurrent = new BankAccount(geoff);

		SavingsAccount ruthSavings = new SavingsAccount(ruth);
		BankAccount ruthCurrent = new BankAccount(ruth);

		geoffSavings.setAccountBalance(28000);
		geoffCurrent.setAccountBalance(10000);

		ruthSavings.setAccountBalance(78000);
		ruthCurrent.setAccountBalance(2000);

		System.out.print(geoffSavings + "\n");
		System.out.print(geoffCurrent + "\n");

		System.out.print(ruthSavings + "\n");
		System.out.print(ruthCurrent + "\n");

		geoffSavings.transferFunds(200.24, geoffCurrent);
		ruthSavings.transferFunds(50.99, ruthCurrent);

		System.out.print(geoffSavings + "\n");
		System.out.print(geoffCurrent + "\n");

		System.out.print(ruthSavings + "\n");
		System.out.print(ruthCurrent + "\n");

		geoffCurrent.transferFunds(120.23, geoffSavings);
		ruthCurrent.transferFunds(720.00, ruthSavings);

		System.out.print(geoffSavings + "\n");
		System.out.print(geoffCurrent + "\n");

		System.out.print(ruthSavings + "\n");
		System.out.print(ruthCurrent + "\n");

		geoffSavings.addInterest();
		ruthSavings.addInterest();

		System.out.print(geoffSavings + "\n");
		System.out.print(geoffCurrent + "\n");

		System.out.print(ruthSavings + "\n");
		System.out.print(ruthCurrent + "\n");

	}
}