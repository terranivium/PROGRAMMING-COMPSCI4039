public class Connect4Test{
	public static void main(String[] args){
		Player p1 = new Player("Clive",'x');
		Counter c = new Counter(p1);
		System.out.println(c.getPlayer().toString() + ", " + c.toString());

		Player p2 = new Player("Gimp",'y');
		Counter d = new Counter(p2);
		System.out.println(d.getPlayer().toString() + ", " + d.toString());

		System.out.println(c.equals(d));

	}
}