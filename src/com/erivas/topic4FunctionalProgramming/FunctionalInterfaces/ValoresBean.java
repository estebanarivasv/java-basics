package com.erivas.topic4FunctionalProgramming.FunctionalInterfaces;

public class ValoresBean {

	int valorA;
	int valorB;
	int valorC;
	
	public ValoresBean(int a, int b, int c) {
		this.valorA = a;
		this.valorB = b;
		this.valorC = c;
	}
	
	public double procesarValores(InterfaceFuncionalEjemplo ifun) {
		return ifun.process(this.valorA, this.valorB, this.valorC);
	}
}
