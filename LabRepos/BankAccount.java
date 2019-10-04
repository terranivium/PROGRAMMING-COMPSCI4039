public class BankAccount{

	private String accountHolder;
	private int accountNumber;
	private double accountBalance;
	private static int nextAccountNumber = 0;

	public BankAccount(String accountHolder){
		this.accountHolder = accountHolder;
		this.accountNumber = nextAccountNumber;
		nextAccountNumber++;
		this.accountBalance = 0.0;
	}

	public int getAccountNumber(){
		return this.accountNumber;
	}
}