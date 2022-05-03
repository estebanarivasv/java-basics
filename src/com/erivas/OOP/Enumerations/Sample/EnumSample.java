package com.erivas.OOP.Enumerations.Sample;

public class EnumSample {

	enum dias {
		LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
	}
	
	public static void main(String[] args) {

		System.out.println("Hoy es " + dias.LUNES);
		
		/**
		 * Iteramos sobre los elementos de la enumeracion
		 */
		for (dias d : dias.values()) {
			System.out.println(d);
		}
		
		
		System.out.println(Cargo.GERENTE.getNombre() + Cargo.GERENTE.getDni());
	}

}
