import java.util.Arrays;
import java.util.stream.IntStream; 

public class PersonTestArrays{
	public static void main(String[] args){
		Person[] adults = new Person[4];
		Person[] children = new Person[5];

		adults[0] = new Person("Mary", 53, "Mags");

		children[0] = new Person("Barry", 12, "BigBaz");
		children[1] = new Person("Kaylie", 20, "Oakley");
		children[2] = new Person("Dustin", 17, "Dusty");
		children[3] = new Person("Kaylie", 20, "Oakley");
		children[4] = new Person("Dustin", 17, "Dusty");

		adults[0].addDependant(children[0]);
		adults[0].addDependant(children[1]);
		adults[0].addDependant(children[2]);
		adults[0].addDependant(children[3]);
		adults[0].addDependant(children[4]);

		adults[0].sayHello();

		//System.out.println(Arrays.deepToString(adults[0].getDependants()));
	}
}