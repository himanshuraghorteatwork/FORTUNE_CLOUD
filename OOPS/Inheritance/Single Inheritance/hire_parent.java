package oops_Single_Inheritance;

class hire_child1 extends hire_parent {
	static void c1() {
		System.out.println("child 1");

	}

}

class hire_child2 extends hire_parent {
	static void c2() {
		System.out.println("child 2");

	}

}

public class hire_parent {
	static void p() {
		System.out.println("parent ");

	}

	public static void main(String[] args) {
		// NON STATIC
		hire_child1 obj = new hire_child1();
		obj.c1();
		obj.p();

		hire_child2 obj2 = new hire_child2();
		obj2.c2();

		// if it is static we can call direct to method
		// STATIC

		// p();

	}

}
