package examples;

public class demo_3 {
String name;
	public static void main(String[] args) {
		demo_3 c1 = new demo_3();
		c1.name = " C2TC ";
		demo_3 c2 = c1;
		c1 = null;
		System.out.println(c2.name);
		new demo_3();
		demo_3 c3 = null;
		c3.name = " C2TC ";
		System.out.println(c3.name);
		
		

	}

}
