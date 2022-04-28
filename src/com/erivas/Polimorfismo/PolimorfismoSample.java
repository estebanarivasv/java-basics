package com.erivas.Polimorfismo;

public class PolimorfismoSample {
	
	public void processNumber(Double n) {
		System.out.println("Me invocaste con un DOUBLE");
	}

	public void processNumber(Integer n) {
		System.out.println("Me invocaste con un INTEGER");
	}

	
	public static void main(String[] args) {
		
		InterfaceSample i = new ClaseHijo();
		
		i.metodo1();
		i.metodo2();
		
		PolimorfismoSample ps = new PolimorfismoSample();
		
		ps.processNumber(20.5);
		ps.processNumber(5);

	}

}
