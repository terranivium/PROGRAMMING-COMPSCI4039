public class PersonTest{
	public static void main(String[] args){
		Person gary = new Person("Gary", 54, "A.K.A. BigGaz");
		Person steve = new Person("Steve", 47, "Stevie Boy");
		gary.sayHello();
		steve.sayHello();
		gary.setAge(55);
		gary.sayHello();
		steve.setAge(41);
		steve.sayHello();

		System.out.print(steve);

	}
}