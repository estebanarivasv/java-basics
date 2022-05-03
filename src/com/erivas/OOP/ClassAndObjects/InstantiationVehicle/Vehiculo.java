package com.erivas.OOP.ClassAndObjects.InstantiationVehicle;

public class Vehiculo {
	private String color;
	
	private String marca;
	
	private int kilometraje;
	
	public Vehiculo() {
		this("", "", 0);
	}
	
	public Vehiculo(String c, String m, int k) {
		this.setColor(c);
		this.setMarca(m);
		this.setKilometraje(k);
	}

	public String getColor() {
		return color;
	}

	public String getMarca() {
		return marca;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	private String concateno(String s1, String s2) {
		return s1 + s2;
	}
	
	@Override
	public String toString() {
		return concateno(this.getMarca(), " color ") + this.getColor() + " con " + this.getKilometraje() + " kilometros.";
	}

}
