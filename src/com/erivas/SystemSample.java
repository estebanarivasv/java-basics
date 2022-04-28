package com.erivas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class SystemSample {

	public void pruebaOUT() {
		System.out.print("Hola, ");
		System.out.println("�qu� tal?");
		System.out.println();
		System.out.println("�c�mo estas?");
		
		System.err.println("Esto es un ERROR!!!!!!");
	}

	public void pruebaOutInFile() throws FileNotFoundException {
		PrintStream actualOut = System.out;
		
		System.setOut(new PrintStream("salida.txt"));
		
		System.out.println("Hola mundo!");
		
		System.setOut(actualOut);
		
	}
	
	public void pruebaIN() throws IOException {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
	    System.out.println("Ingrese su nombre: ");
	    String nombre = reader.readLine();
	    reader.close();
	    System.out.println("Hola " + nombre + "!!!");
	}	
	
	private void showArray(int[] array) {
		
		int count = 0;
		for (int i : array) {
			if (count == 0) {
				System.out.print("[");
			} else {
				System.out.print(", ");
			}
			System.out.print(i);
			count++;
		}
		System.out.println("]");
	}
	
	public void pruebaArrayCopy() {
		int[] a = new int[] {1, 2, 3, 4, 5};
		
		showArray(a);
		
		int[] b = new int[5];
		
		System.arraycopy(a, 0, b, 0, 5);
		
		showArray(b);
	}
	
	public void showTime() {
		Date d = new Date(System.currentTimeMillis());
		
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println(sdf.format(d));
		
	}
	
	public void showProperties() {
		Properties p = System.getProperties();
		
		for (String keyProperty : p.stringPropertyNames()) {
			System.out.println(keyProperty + " : " + p.getProperty(keyProperty));
		}
	}
	
	public static void main(String[] args) throws IOException {
		SystemSample ss = new SystemSample();
		
		ss.pruebaOUT();
		
		ss.pruebaOutInFile();
		
		ss.pruebaIN();
		
		ss.pruebaArrayCopy();
		
		ss.showTime();
		
		ss.showProperties();

	}

}
