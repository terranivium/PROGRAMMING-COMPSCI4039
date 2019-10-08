public class Student extends Person{

	private double gpa;

	public Student(String name, int age, String nickname, double gpa){
		super(name, age, nickname);
		this.gpa = gpa;
	}

	public double getGpa(){
		return this.gpa;
	}

	public void setGpa(double newGpa){
		this.gpa = newGpa;
	}

	public String toString(){
		return name + age + nickname + gpa;
	}
}