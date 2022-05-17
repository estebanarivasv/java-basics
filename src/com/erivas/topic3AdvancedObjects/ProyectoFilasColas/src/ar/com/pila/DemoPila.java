package com.erivas.topic3AdvancedObjects.ProyectoFilasColas.src.ar.com.pila;

public class DemoPila {

	public static void main(String[] args) {
		Pila<Integer> p = new Pila<Integer>();
		
		p.push(10);
		p.push(20);
		p.push(30);
		p.push(40);
		
		Integer v = null;
		
		do {
			v = p.pop();
			
			if (v != null) {
				System.out.println(v);
			}
		} while (v != null);
		
		System.out.println("-------------------------------------");
		
		Pila2<Integer> p2 = new Pila2<Integer>();
		
		p2.push(10);
		p2.push(20);
		p2.push(30);
		p2.push(40);
		
		do {
			v = p2.pop();
			
			if (v != null) {
				System.out.println(v);
			}
		} while (v != null);
		
		
	}

}
