package com.erivas.topic2OOP.ClassAndObjects.TicketOfficeExample;

public class Hijo extends Padre implements PuedePasar {

	public Hijo(String n) {
		super.nombre = n;
	}
	
	@Override
	public int getMonto() {
		return 0;
	}

	final public String getNombre() {
		return super.getNombre();
	}
	
	public void setNombre(String s) {
		super.setNombre(s);
	}

	@Override
	public int getNumeroTicket() {
		return 0;
	}
	
}
