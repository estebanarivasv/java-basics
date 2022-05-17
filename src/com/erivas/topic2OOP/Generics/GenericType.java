package com.erivas.topic2OOP.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericType<T> {
	
	private final T value;
	
	GenericType(T v) {
		this.value = v;
	}
	
	public T getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return this.value + " - [" + this.value.getClass().getName() + "]";
	}

	public static void main(String[] args) {

		GenericType<Integer> t1 = new GenericType<Integer>(10);
		GenericType<?> t2 = new GenericType<String>("Hola");
		GenericType<GenericType<Integer>> t3 = new GenericType<GenericType<Integer>>(new GenericType<Integer>(20));

		List<GenericType<Double>> list = new ArrayList<GenericType<Double>>();

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(list);
	}
}
