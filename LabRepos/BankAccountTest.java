public class BankAccountTest{
	public static void main(String[] args){
		Person geoff = new Person("Geoff", 28, "G");
		Person ruth = new Person("Ruth", 56, "R");

		BankAccount geoffSavings = new BankAccount(geoff);
		BankAccount geoffCurrent = new BankAccount(geoff);

		BankAccount ruthSavings = new BankAccount(ruth);
		BankAccount ruthCurrent = new BankAccount(ruth);

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
	}
}