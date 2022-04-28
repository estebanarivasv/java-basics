package com.erivas.Generics;

public class GenericSample3 {

	public static void main(String[] args) {

		GenericTuplaNumerica<?,?> tupla = new GenericTuplaNumerica<Integer, Double>(10, 20.5);
		
		System.out.println(tupla.getValue1() + " + " + tupla.getValue2() + " = " + tupla.getSuma());
		
	}

}
