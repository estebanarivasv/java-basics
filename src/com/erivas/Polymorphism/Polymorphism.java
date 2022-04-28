package com.erivas.Polymorphism;

public class Polymorphism {

	// Methods overload
	public void processNumber(Double n) {
		System.out.println("Me invocaste con un DOUBLE");
	}

	public void processNumber(Integer n) {
		System.out.println("Me invocaste con un INTEGER");
	}

	
	public static void main(String[] args) {
		
		BaseInterface i = new Child();

		// With static polymorphism, the compiler does not know which method to call
		// Dynamicly, the compiler calls:
		i.method1();	// From Child.class
		i.method2();	// From Parent.class
		
		Polymorphism ps = new Polymorphism();
		
		ps.processNumber(20.5);
		ps.processNumber(5);

	}

}
