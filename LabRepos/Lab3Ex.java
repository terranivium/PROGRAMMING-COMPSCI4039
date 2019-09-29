import java.util.Scanner;

public class Lab3Ex {

	private static double pi = Math.PI; // declaring PI constant
	private double radius; // declaring radius variable

	// the constructor assigns a value to the variable radius
	// when creating an instance of the object Lab3Ex
	public Lab3Ex(double radius){
		this.radius = radius;
	}

	// Returns the current radius value
	public double getRadius(){
		return this.radius;
	}

	// Updates the current radius value
	public void setRadius(double newRadius){
		this.radius = newRadius;
	}

	// Calculates area of circle given the radius and pi
	public double calculateArea(){
		double area = this.pi * this.radius * this.radius;
		return area;
	}

	// Calculates circumference of curcle given the radius and pi
	public double calculateCirc(){
		double circ = 2 * this.pi * this.radius;
		return circ;
	}

	// Returns a summary of the circle's circumference and area
	public String sumariseCirc(){
		double area = this.calculateArea();
		double circ = this.calculateCirc();
		String summary = "This circle has an area of: " + area + ", and a circumference of: " + circ + ".";
		return summary;
	}

	public static void main(String[] args){

		// User input of circle radius
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter radius of circle, followed by pressing the return key...");
		double userRadius = keyboard.nextDouble();

		// Create two different circle instances with different radii
		Lab3Ex circle = new Lab3Ex(userRadius); 
		// Print summary for each circle
		String summary = circle.sumariseCirc();

		System.out.println(summary);
	}
}