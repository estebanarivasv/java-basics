package com.erivas.topic3AdvancedObjects.Arboles;

public class SampleTree {

	public static void main(String[] args) {
		Tree<Integer> t = new Tree<Integer>();

		// Insertar
		t.add(10);
		t.add(5);
		t.add(15);
		t.add(7);
		t.add(12);

		System.out.println("IN ORDER ->");
		t.recorrer(Recorrido.IN_ORDER);
		
		System.out.println();
		System.out.println("PRE ORDER ->");
		t.recorrer(Recorrido.PRE_ORDER);

		System.out.println();
		System.out.println("POS ORDER ->");
		t.recorrer(Recorrido.POS_ORDER);
	
	}

}
