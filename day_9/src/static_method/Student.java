package static_method;
public class Student {
		int rollno;
		String name;
		static String college = "AIT";
		Student(int r, String n) {
			rollno=r;
			name=n;
		}
		static void change() {
			college = "Acharya";
		}
		void display () {
	System.out.println(rollno+" "+name+" "+college);
		}
			public static void main(String[] args) {
			Student s1=new Student(8,"shashank");
			Student s2=new Student(10,"anu");
			change();
			s1.display();
			s2.display();

		}

		}

