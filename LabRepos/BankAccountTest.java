public class BankAccountTest{
	public static void main(String[] args){
		BankAccount geoffSavings = new BankAccount("Geoff S");
		BankAccount garyCurrent = new BankAccount("Gary F");

		System.out.print(geoffSavings.getAccountNumber() + "\n");
		System.out.print(garyCurrent.getAccountNumber() + "\n");
		System.out.print(geoffSavings.getAccountNumber() + "\n");
	}
}