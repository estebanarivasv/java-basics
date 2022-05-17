package com.erivas.topic4FunctionalProgramming.Threads;

import java.util.Arrays;

public class PruebaThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cli1 = new Cliente("CLIENTE-1", Arrays.asList(new Integer[] {1, 3, 2, 4, 1, 1}));
		Cliente cli2 = new Cliente("CLIENTE-2", Arrays.asList(new Integer[] {3, 1, 1, 2}));		
		Cliente cli3 = new Cliente("CLIENTE-3", Arrays.asList(new Integer[] {3, 10}));		
		Cliente cli4 = new Cliente("CLIENTE-4", Arrays.asList(new Integer[] {3, 1, 1, 1}));
		
		long initTime = System.currentTimeMillis();

		CajeroThread caj1 = new CajeroThread("CAJERO-1", cli1, initTime);
		CajeroThread caj2 = new CajeroThread("CAJERO-2", cli2, initTime);		
		CajeroThread caj3 = new CajeroThread("CAJERO-3", cli3, initTime);
		CajeroThread caj4 = new CajeroThread("CAJERO-4", cli4, initTime);
		
		
		caj1.start();
		caj2.start();
		caj3.start();
		caj4.start();
		
	}

}
