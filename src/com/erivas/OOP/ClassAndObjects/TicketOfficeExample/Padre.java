package com.erivas.OOP.ClassAndObjects.TicketOfficeExample;

public abstract class Padre {
	protected String nombre;

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
    public abstract int getMonto();

}
