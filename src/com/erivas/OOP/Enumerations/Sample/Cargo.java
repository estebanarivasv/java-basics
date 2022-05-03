package com.erivas.OOP.Enumerations.Sample;

public enum Cargo {

	JEFE("Juan Perez", 253972459),
	GERENTE("Juan Perez", 32432432)
	;
	
	private String nombre;
	
	private int dni;

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}
	
	private Cargo(String str, int d) {
		this.nombre = str;
		this.dni = d;
	}
	
	public void prueba() {
		System.out.println("HOLA");
	}
}
