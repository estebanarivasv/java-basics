package com.erivas.topic4FunctionalProgramming.Threads;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nombre;
	private List<Integer> tiemposCarroCompra = new ArrayList<Integer>();
	
	public Cliente(String n, List<Integer> tiempos) {
		this.setNombre(n);
		this.getTiemposCarroCompra().addAll(tiempos);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Integer> getTiemposCarroCompra() {
		return tiemposCarroCompra;
	}

	public void setTiemposCarroCompra(List<Integer> tiemposCarroCompra) {
		this.tiemposCarroCompra = tiemposCarroCompra;
	}
	
}
