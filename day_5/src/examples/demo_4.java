package examples;

public class demo_4 {

	private String name;

	public static void main(String[] args) {
demo_4 c = new demo_4();
demo_4 c1 = c;
c1.name = " C2TC ";
c = null;
System.out.println(c.name);
	}

}
