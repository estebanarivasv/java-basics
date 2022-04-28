package com.erivas.MainExample;

public class MainExample {
	
	public void cantidadDeParametrosDesconocida(String ... p) {
		int count = 0;
		for (String arg : p) {
			if (count == 0) {
				System.out.print("{");
			} else {
				System.out.print(", ");
			}
			
			System.out.print(arg);
			count++;

		}
		
		System.out.println("}");
		
	}

	public static void main(String[] args) {

		int numArgs = args.length;
		
		if (numArgs == 0) {
			System.out.println("Usted no hay ingresado parametros!");
		} else {
			System.out.println("Usted ha ingresado " + numArgs + " parametros:");
			int count = 0;
			for (String arg : args) {
				if (count == 0) {
					System.out.print("{");
				} else {
					System.out.print(", ");
				}
				
				System.out.print(arg);
				count++;

			}
			
			System.out.println("}");
		}
		
	}

}
