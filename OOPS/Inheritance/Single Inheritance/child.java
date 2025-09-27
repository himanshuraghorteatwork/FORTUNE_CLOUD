package oops_Single_Inheritance;

public class child extends parent { // class 

	void second() {  // method
		System.out.println("child properties ");
	}
	public static void main(String[] args) {
		child ob = new child(); //object -- new child is object store in ob 
		ob.second(); // call the method 
		ob.first();
		
	}

}
