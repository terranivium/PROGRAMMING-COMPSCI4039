public class BankAccount{

	private Person accountHolder;
	private int accountNumber;
	private double accountBalance;
	private static int nextAccountNumber = 0;

	public BankAccount(Person accountHolder){
		this.accountHolder = accountHolder;
		this.accountNumber = nextAccountNumber;
		nextAccountNumber++;
		this.accountBalance = 0.0;
	}

	public Person getAccountHolder(){
		return this.accountHolder;
	}

	public int getAccountNumber(){
		return this.accountNumber;
	}

	public double getAccountBalance(){
		return this.accountBalance;
	}

	public void setAccountBalance(double newBalance){
		this.accountBalance = newBalance;
	}

	public String toString(){
		return accountHolder + " " + accountNumber + " " + accountBalance;
	}

	public void transferFunds(double transferAmount, BankAccount toAccount){
		setAccountBalance(getAccountBalance() - transferAmount);
		toAccount.setAccountBalance(toAccount.getAccountBalance() + transferAmount);
	} 
}