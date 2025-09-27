package oops_Single_Inheritance;

public class person {

	String name; // feild or properties
	Long phone;

	void walk() {
		System.out.println("walking...");
	}

	void speak() {
		System.out.println("speaking...");
	}

	public static void main(String[] args) {

		// creation of object
		person p1 = new person();

		p1.name = "hima"; // assigining the feilds for person 1
		p1.phone = 9545629727l;

		person p2 = new person();
		p2.name = "ram";
		p2.phone = 8329050076l;

		System.out.println("person 1 name: " + p1.name);

		System.out.println("person 1 phone no. " + p1.phone);

		p1.speak();
		p1.walk();

		System.out.println("-------------------------------");

		System.out.println("person 2 name: " + p2.name);

		System.out.println("person 2 phone no. " + p2.phone);

		p2.speak();
		p2.walk();

	}

}
