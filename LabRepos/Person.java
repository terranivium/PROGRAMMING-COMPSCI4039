public class Person{
	private String name;
	private int age;
	private String nickname;
	
	public Person(String name, int age, String nickname){
		this.name = name;
		this.age = age;
		this.nickname = nickname;
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public String getNickname(){
		return this.nickname;
	}

	public void setName(String newName) { // setter for age
		this.name = newName;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}

	public void setNickname(String newNickname){
		this.nickname = newNickname;
	}

	public void sayHello(){
		System.out.printf("Hi, I'm %s %s and I am %d years old.\n", name, nickname, age);
	}

	public String toString(){
		return name + nickname + age;
	}


	
}