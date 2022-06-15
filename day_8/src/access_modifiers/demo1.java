package access_modifiers;

public class demo1 {
	protected int i=10;
	protected void show() {
		System.out.println("puneeth rajkumar");
	}

	public static void main(String[] args) {
		demo1 t1 = new demo1();
		t1.show();
		System.out.println(t1.i);

	}

}
