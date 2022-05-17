package com.erivas.topic4FunctionalProgramming.Threads;

public class CajeroSecuencial {

	private String nombre;

	public CajeroSecuencial(String n) {
		this.setNombre(n);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	public void procesarCompra(Cliente cliente, long timeStamp) {
		System.out.println("El cajero " + this.getNombre() + " comienza a procesar la compra del cliente [" + cliente.getNombre() + "] " + 
						   "en el tiempo " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
		int count = 0;
		for (Integer i : cliente.getTiemposCarroCompra()) {
			this.esperarXsegundos(i);
			System.out.println("[" + this.getNombre() + "] - Procesado el producto " + (++count) + " en el tiempo " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
		}

		System.out.println("El cajero " + this.getNombre() + " ha terminado de procesar la compra del cliente [" + cliente.getNombre() + "] " + 
				   "en el tiempo " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");

	}

	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
