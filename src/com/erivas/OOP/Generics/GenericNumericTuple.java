package com.erivas.OOP.Generics;

public class GenericNumericTuple<V extends Number, E extends Number> {

	private V firstValue;
	private E secondValue;

	public GenericNumericTuple(V firstValue, E secondValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
	}

	public V getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(V firstValue) {
		this.firstValue = firstValue;
	}

	public E getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(E secondValue) {
		this.secondValue = secondValue;
	}

	public double getSuma() {
		if (firstValue != null) {
			if (secondValue != null) {
				// doubleValue casts the value to Double
				return this.getFirstValue().doubleValue() + this.getSecondValue().doubleValue();
			}
		}
		
		return 0.0;
	}

	public static void main(String[] args) {

		GenericNumericTuple<?,?> tupla = new GenericNumericTuple<Integer, Double>(10, 20.5);
		System.out.println(tupla.getFirstValue() + " + " + tupla.getSecondValue() + " = " + tupla.getSuma());

	}
}

