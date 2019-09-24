public class Lab2Ex23 {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = 12;
		int d = c*(a + b);
		int e = c*a + b;
		int f = c*(a + b*(a + b));
		double g = (double) c / a;
		int h = c % a;


		//Print Commands
		
		//System.out.println(d);
		//System.out.println(e);
		//System.out.println(f);
		System.out.println(g);
		System.out.println("Remainder: " + h);
	}
}