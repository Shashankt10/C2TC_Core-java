package inheritance;

public class Animals {
void eat() {
	System.out.println("eating");
}
}
class Dogs extends Animals{
	void bark () {
		System.out.println("barking");
	}
	
	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eat();

	}

}
