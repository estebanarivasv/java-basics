package com.erivas.ClassAndObjects;

public class Hijo extends Padre implements PuedePasar {

	public Hijo(String n) {
		super.nombre = n;
	}
	
	@Override
	public int getMonto() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return 0;
	}
	
}
