public class Bulgarian {
	private int money;
	private String job;
	private String name;

	// Constructor defines what the instance of the class is
	// by giving values to the object's fields
	public Bulgarian(int money, String job, String name) {
		this.money = money;
		this.job = job;
		this.name = name;
	}

	// This is a method that increases the money value
	public void setMoney(int newMoney) {
		this.money = newMoney;
	}

	public int getMoney() {
		return this.money;
	}

	public String getName() {
		return this.name;
	}

	public String increaseMoney(int increase) {
		int newMoney = this.money + increase;
		this.setMoney(newMoney);

		return "Bulgarian " + this.getName() + " has " + this.getMoney() + " money now.";
	}

	public static void main(String[] args) {
		// Create a Bulgarian named Daniela that is a developer and has 40 money
		Bulgarian daniela = new Bulgarian(40, "developer", "Daniela");

		// Check how much money Daniela has initially
		System.out.println("Daniela has " + daniela.getMoney() + " money.");

		// Give Daniela more money :-)
    	System.out.println(daniela.increaseMoney(80)); 
  }
}