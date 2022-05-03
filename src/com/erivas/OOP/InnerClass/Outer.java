package com.erivas.OOP.InnerClass;

public class Outer {

	// Nested Inner Class: Outer object property
	class Inner {
		public Inner() {
			System.out.println("Esta es una Nested Inner Class!");
		}
	}

	static class StaticInner {
		public static void print() {
			System.out.println("Esta es una Static Inner Class!!!");
		}
	}
	
	public void createInner() {
		Inner in1 = new Inner();
	}
	
	public void createInnerClassMethod() {
		// Inner Class inside Local Method
		class InnerMethod {
			public InnerMethod() {
				System.out.println("Esta es una Method Local Inner Class!!!");
			}
		}
		
		InnerMethod inMeth = new InnerMethod();
	}

	public static void main(String[] args) {

		Outer out = new Outer();
		
		out.createInner();
		
		// Inner in2 = new Inner();
		// Inner in3 = new Inner();


		out.createInnerClassMethod();
		
		StaticInner.print();
		
		Parent p = new Parent();
		p.show();

		// Anonymous inner class - By inheritance
		p = new Parent() {
			public void show() {
				System.out.println("Esta es una Anonymous Inner Class!!! (Por herencia)");
			}
		};
		p.show();
		
		// Anonymous inner class - Interface implementation
		Demo demo = new Demo() {
			@Override
			public void show() {
				System.out.println("Esta es una Anonymous Inner Class!!! (Por implementaciond de interface)");
			}
		};
		
		demo.show();

	}

}
