package examples;
public class demo_1 {
int id;
String name;
void insertRecord(int i, String n) {
	id=i;
	name=n;
      }
}
class main{
	
	public static void main(String[] args) {
		demo_1 s1 = new demo_1();
		demo_1 s2 = new demo_1();
		s1.insertRecord(810, "shashank");
		s2.insertRecord(111, "puneeth");
		System.out.println(s1.id +" "+ s1.name);
		System.out.println(s2.id +" "+ s2.name);

	}

}
