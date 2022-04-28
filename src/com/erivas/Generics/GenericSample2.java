package com.erivas.Generics;

public class GenericSample2 {

	public static void main(String[] args) {

		GenericTupla<?,?> tupla = new GenericTupla<Integer, String>(10, "diez");
		
		System.out.println(tupla.getValue1() + " - " + tupla.getValue2());
	}

}
