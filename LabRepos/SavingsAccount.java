public class SavingsAccount extends BankAccount{

	private static double interestRate = 5.6;

	public SavingsAccount(Person accountHolder){
		super(accountHolder);
		this.interestRate = interestRate;
	}

	public double getIntrestRate(){
		return this.interestRate;
	}

	public String toString(){
		return getAccountHolder() + " " + getAccountNumber() + " " + getAccountBalance();
	}

	public void addInterest(){
		double interestAmount = getAccountBalance() * (interestRate / 100);
		setAccountBalance(getAccountBalance() + interestAmount);
		System.out.print("You have earned: " + interestAmount + " in interest, this has been added to your account, new balance: " + getAccountBalance() + "\n");
	}

	public void transferFunds(double transferAmount, BankAccount toAccount){
		try{
			if((getAccountBalance() - transferAmount) < 0) throw new OverDrawnException();
			setAccountBalance(getAccountBalance() - transferAmount);
			toAccount.setAccountBalance(toAccount.getAccountBalance() + transferAmount);
		}catch(OverDrawnException e){
			System.out.println("This account type cannot go overdrawn.");
		}
	} 
}