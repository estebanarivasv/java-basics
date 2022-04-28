package com.erivas.Generics;

public class GenericTuplaNumerica<V extends Number,E extends Number> {

	private V value1;
	
	private E value2;
	
	GenericTuplaNumerica(V v1, E v2) {
		this.setValue1(v1);
		this.setValue2(v2);
	}

	public V getValue1() {
		return value1;
	}

	public E getValue2() {
		return value2;
	}

	public void setValue1(V value1) {
		this.value1 = value1;
	}

	public void setValue2(E value2) {
		this.value2 = value2;
	}
	
	public double getSuma() {
		if (value1 != null) {
			if (value2 != null) {
				return this.getValue1().doubleValue() + this.getValue2().doubleValue();
			}
		}
		
		return 0.0;
	}
}

