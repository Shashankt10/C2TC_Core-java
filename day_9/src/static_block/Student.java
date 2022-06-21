package static_block;

public class Student {
int rollno;
String name;
static String college;
static
{
	college = "MSRIT";
	
}
Student (int r, String n) {
	rollno = r;
	name = n;
	}
static void change() {
	college = "AIT";
	
}
void display () {
	System.out.println(rollno+" "+name+" "+college);
	
}
	public static void main(String[] args) {
	Student s1 = new Student(111,"arbaz");
	Student s2 = new Student(222,"aishwarya");
	change();
	s1.display();
	s2.display();
	}

}
