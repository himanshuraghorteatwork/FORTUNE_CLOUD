package oops_polymorphism;

public class methodoverloading {
	void payment() { // by passing no parameter 
		System.out.println("credit card ");
	}
	
	void payment(int num) { // by passing parameter
		System.out.println("debit card");
	}
	
	void payment(int r,String name) { //by passing number of parameter
		System.out.println("UPI");
	}
	
	void payment(String p,int c) { //by changing sequence of parameter
		System.out.println("COD");
	}
	
	void payment(float z,char w) { // by changing datatype
		System.out.println("paytm");
	}
	
	public static void main(String[] args) {
		
		 methodoverloading obj=new methodoverloading();
		 obj.payment();
		 obj.payment(10);
		 obj.payment(10,"himanshu@axl");
		 obj.payment("aybl",100);
		 obj.payment(1.1f, 'v');
			
		}
	}

