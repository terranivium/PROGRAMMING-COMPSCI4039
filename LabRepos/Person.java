import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream; 

public class Person{
	protected String name;
	protected int age;
	protected String nickname;
	protected ArrayList<Person> dependants = new ArrayList<>();
	
	public Person(String name, int age, String nickname, ArrayList<Person> dependants){
		this.name = name;
		this.age = age;
		this.nickname = nickname;
		this.dependants = dependants;
	}

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

	public ArrayList<Person> getDependants(){
		return this.dependants;
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

	public void addDependant(Person singleDependant){
		dependants.add(singleDependant);
	}

	public void sayHello(){
		System.out.printf("Hi, I'm %s %s and I am %d years old.\n", name, nickname, age);
		System.out.printf("Here are my children, \n%s.\n", dependants);
	}

	public String toString(){
		return name + age + nickname + dependants;
	}	
}