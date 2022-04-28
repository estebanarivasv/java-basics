package com.erivas.ExceptionSample;

public class Demo {
	
	public void accesoBD() throws ExceptionDAO {
		System.out.println("Estoy accediendo a la BD");
		
		throw new ExceptionDAO("Error de acceso a los datos");
	}

	public void negocios() throws ExceptionBO {
		System.out.println("Ejecutando politica de negocio");
		
		try {
			System.out.println("comienzo a armar grafico");
			this.accesoBD();
			System.out.println("finalizo grafico");
		} catch (ExceptionDAO e) {
			System.out.println("No puedo obtener datos");
			throw new ExceptionBO("Error de negocio", e);
		} finally {
			System.out.println("finalizo grafico con error");
		}
		
	}
	
	public static void main(String[] args) {
		try {
			new Demo().negocios();
		} catch (ExceptionBO e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
