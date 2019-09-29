public class Dog {
	private String name;
	private boolean fluffer;
	private boolean woofer;
	private boolean drooper;
	private boolean longBoy;
	private boolean hench;

	public Dog(String name, boolean fluffer, boolean woofer, boolean drooper, boolean longBoy, boolean hench){
		this.name = name;
		this.fluffer = fluffer;
		this.woofer = woofer;
		this.drooper =  drooper;
		this.longBoy = longBoy;
		this.hench = hench;
	}

	public String getName(){
		return this.name;
	}
	public void setName(String newName){
		this.name = newName;
	}

	public boolean getFluffer(){
		return this.fluffer;
	}
	public void setFluffer(boolean newFluffer){
		this.fluffer = newFluffer;
	}

	public boolean getWoofer(){
		return this.woofer;
	}
	public void setWoofer(boolean newWoofer){
		this.woofer = newWoofer;
	}

	public boolean getDrooper(){
		return this.drooper;
	}
	public void setDrooper(boolean newDrooper){
		this.drooper = newDrooper;
	}

	public boolean getLongBoy(){
		return this.longBoy;
	}
	public void setLongBoy(boolean newLongBoy){
		this.longBoy = newLongBoy;
	}

	public boolean getHench(){
		return this.hench;
	}
	public void setHench(boolean newHench){
		this.hench = newHench;
	}

	public void bark(){
		if (this.woofer == true && this.hench == true){
			System.out.println(this.name + " says: WAOF WAOF GRRRRRRR...");
		} else if (this.woofer == true){
			System.out.println(this.name + " says: Woof Woof Woof!...");
		} else {
			System.out.println(this.name + " says: ZzzzZZZzzzZZZZ...");
		}
	}

	// name, fluffer, woofer, drooper, longBoy, hench
	public static void main(String[] args){
		System.out.println("Welcome to the Dog Shelter!" + "\n");
		Dog kenneth = new Dog("Kenneth A.K.A Kenny", true, false, true, false, false);
		kenneth.bark();
		Dog jamal = new Dog("Jamal LeBron Bacardi Coke", false, true, false, true, true);
		jamal.bark();
		Dog greta = new Dog("Greta Scholtz", true, false, true, false, false);
		greta.bark();
		Dog curtis = new Dog("Cuuurtis", true, false, true, false, false);
		curtis.bark();
		Dog james = new Dog("Jimi the Dog", true, false, true, false, false);
		james.bark();
		Dog vasil = new Dog("VasilLeLeLe", true, false, true, false, false);
		vasil.bark();
		Dog fernandes = new Dog("Fernandes Los Santos A.K.A ChiliQ", true, false, true, false, false);
		fernandes.bark();
	}
}
