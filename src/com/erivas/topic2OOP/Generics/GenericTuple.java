package com.erivas.topic2OOP.Generics;

// We use V and E to represent multiple generic values
public class GenericTuple<V,E> {

	private V valueV;
	private E valueE;

	public GenericTuple(V valueV, E valueE) {
		this.valueV = valueV;
		this.valueE = valueE;
	}

	public V getValueV() {
		return valueV;
	}

	public void setValueV(V valueV) {
		this.valueV = valueV;
	}

	public E getValueE() {
		return valueE;
	}

	public void setValueE(E valueE) {
		this.valueE = valueE;
	}

	@Override
	public String toString() {
		return "GenericTuple{" +
				"valueV=" + valueV +
				", valueE=" + valueE +
				'}';
	}

	public static void main(String[] args) {

		// Question marks ignore compiler errors
		GenericTuple<?,?> tuple = new GenericTuple<Integer, String>(10, "diez");
		System.out.println(tuple);

	}
	
}
