package com.erivas.InnerClass;

import com.erivas.ExceptionSample.Demo;

public class Outer {
	
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
		
		Inner in2 = out.new Inner();
		
		Inner in3 = new Outer().new Inner();
		
		out.createInnerClassMethod();
		
		StaticInner.print();
		
		Padre p = new Padre();
		
		p.show();
		
		p = new Padre() {
			public void show() {
				System.out.println("Esta es una Anonymous Inner Class!!! (Por herencia)");
			}
		};
		
		p.show();
		
		Demo d = new Demo() {
			public void show() {
				System.out.println("Esta es una Anonymous Inner Class!!! (Por implementaci�n de Interface)");
			}
		};
		// TODO ERROR
		//d.show();
	}

}
