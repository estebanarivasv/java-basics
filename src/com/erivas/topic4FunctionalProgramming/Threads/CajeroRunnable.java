package com.erivas.topic4FunctionalProgramming.Threads;

public class CajeroRunnable implements Runnable {

	private String nombre;
	
	private Cliente cliente;
	
	private long initialTime;

	public CajeroRunnable(String n, Cliente cli, long init) {
		this.setNombre(n);
		this.setCliente(cli);
		this.setInitialTime(init);	
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public long getInitialTime() {
		return initialTime;
	}

	public void setInitialTime(long initialTime) {
		this.initialTime = initialTime;
	}

	@Override
	public void run() {
		System.out.println("El cajero " + this.getNombre() + " comienza a procesar la compra del cliente [" + cliente.getNombre() + "] " + 
						   "en el tiempo " + (System.currentTimeMillis() - this.getInitialTime()) / 1000 + " seg");
		int count = 0;
		for (Integer i : cliente.getTiemposCarroCompra()) {
			this.esperarXsegundos(i);
			System.out.println("[" + this.getNombre() + "] - Procesado el producto " + (++count) + " en el tiempo " + (System.currentTimeMillis() - this.getInitialTime()) / 1000 + " seg");
		}

		System.out.println("El cajero " + this.getNombre() + " ha terminado de procesar la compra del cliente [" + cliente.getNombre() + "] " + 
				   "en el tiempo " + (System.currentTimeMillis() - this.getInitialTime()) / 1000 + " seg");

	}

	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
