package com.erivas.class3AdvancedObjects.ProyectoFilasColas.src.ar.com.pila;

import java.util.ArrayList;
import java.util.List;

public class Pila2<T> {
	
	private List<T> lista = new ArrayList<T>();
	
	public void push(T value) {
		lista.add(value);
	}
	
	public T pop() {
		if (lista.isEmpty()) {
			return null;
		} 
		
		T elem = lista.get(lista.size() - 1);
		
		lista.remove(lista.size() - 1);
		
		return elem;
	}
}
