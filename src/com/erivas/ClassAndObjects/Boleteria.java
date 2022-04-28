package com.erivas.ClassAndObjects;

public class Boleteria {
	
	private final static String nombre = "Boleteria 1";

	void revisarTickets(PuedePasar p) {
		p.getNumeroTicket();
	}
	
	
	public static void main(String[] args) {

		
		
		int variable = 10;
		
		switch(variable) {
			case 1: System.out.println("Es un uno");
					break;
			case 2: System.out.println("Es un dos");
					break;
			case 10: System.out.println("Es un diez");
					break;
			default: System.out.println("No se");
			         break;
			
		}
	}
}
