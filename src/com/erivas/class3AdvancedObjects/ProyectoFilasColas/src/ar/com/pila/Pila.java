package com.erivas.class3AdvancedObjects.ProyectoFilasColas.src.ar.com.pila;

public class Pila<T> {
	
	private Nodo<T> lista = null;
	
	@SuppressWarnings("hiding")
	private class Nodo<T> {

		private T value;
		
		private Nodo<T> sig = null;
		
		public Nodo(T value) {
			this.value = value;
		}

	}	

	public void push(T value) {
		Nodo<T> n = new Nodo<T>(value);
		
		if (lista == null) {
			lista = n;
		} else {
			n.sig = lista;
			lista = n;
		}
	}
	
	public T pop() {
		if (lista == null) {
			return null;
		} 
		
		T value = lista.value;
		
		lista = lista.sig;
		
		return value;
	}
}
