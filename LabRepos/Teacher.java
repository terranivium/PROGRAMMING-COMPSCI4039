public class Teacher extends Person{

	private int salary;

	public Teacher(String name, int age, String nickname, int salary){
		super(name, age, nickname);
		this.salary = salary;
	}
	public int getSalary(){
		return this.salary;
	}

	public void setSalary(int newSalary){
		this.salary = newSalary;
	}

	public String toString(){
		return name + age + nickname + salary;
	}
}