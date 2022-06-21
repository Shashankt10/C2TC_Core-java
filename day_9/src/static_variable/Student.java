package static_variable;

public class Student {
			int rollno;
			String name;
			static String college = "acharya institute";
			Student(int r, String n) {
				rollno=r;
				name=n;
			}
			void display () {
		System.out.println(rollno+" "+name+" "+college);
			}
				public static void main(String[] args) {
				Student s1=new Student(8,"shashank");
				Student s2=new Student(10,"anu");
				s1.display();
				s2.display();

			}

}
