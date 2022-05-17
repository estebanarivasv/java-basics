package com.erivas.topic2OOP.Blocks;

/*
* Un bloque de código es un grupo de sentencias que se comportan como una unidad
* */
public class Blocks {

	// This block is executed everytime a new Blocks instance is generated
	{
		System.out.println("New Blocks instance created.");
	}
	
	public static void main(String[] args) {
		Blocks b1 = new Blocks();
		Blocks b2 = new Blocks();
		Blocks b3 = new Blocks();
		Blocks b4 = new Blocks();
		Blocks b5 = new Blocks();

	}

	// This block executes itself for once
	static {
		System.out.println("Blocks class is loaded.");
	}
	
}
