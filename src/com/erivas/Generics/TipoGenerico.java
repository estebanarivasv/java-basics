package com.erivas.Generics;

public class TipoGenerico<T> {
	
	private T value;
	
	TipoGenerico(T v) {
		this.value = v;
	}
	
	public T getValue() {
		return this.value;
	}
	
	public String toString() {
		return this.value + " - [" + this.value.getClass().getName() + "]";
	}
}
