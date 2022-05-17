package com.erivas.topic2OOP.ClassAndObjects.InstantiationVehicle;

public class EjemploClassAndObject {

	public static void main(String[] args) {

		Vehiculo obj1 = new Vehiculo("Gris", "Chevrolet", 5000);
		
		System.out.println(obj1);
		
		Vehiculo obj2 = new Vehiculo();
		
		System.out.println(obj2);
		
		obj2.setColor("Azul");
		obj2.setMarca("Ford");
		obj2.setKilometraje(10000);
		
		System.out.println(obj2);
	}

}
