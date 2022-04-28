package com.erivas.Generics;

public class GenericSample {

	public static void main(String[] args) {

		TipoGenerico<Integer> t1 = new TipoGenerico<Integer>(10);
		
		TipoGenerico<?> t2 = new TipoGenerico<String>("Hola");
		
		TipoGenerico<TipoGenerico<Integer>> t3 = new TipoGenerico<TipoGenerico<Integer>>(new TipoGenerico<Integer>(20));
		
		System.out.println(t1);
		
		System.out.println(t2);
		
		System.out.println(t3);
	}

}
