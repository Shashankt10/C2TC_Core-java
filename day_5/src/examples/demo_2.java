package examples;

public class demo_2 {

	public static void main(String[] args) {
		demo_2 obj = new demo_2();
		obj.start();
	}
	void start() {
		String stra = "do";
		String strb = method(stra);
		System.out.println(";" + stra + strb);
	}
	String method(String stra) {
		stra = stra + "good";
		System.out.println(stra);
		return "good";
		
		
		

	}

}
