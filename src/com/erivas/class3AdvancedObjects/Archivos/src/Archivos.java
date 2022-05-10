package com.erivas.class3AdvancedObjects.Archivos.src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {

	public void writeTexto() throws IOException {
		File f = new File("texto.txt");
		
		FileWriter fw = new FileWriter(f);
		
		for (int i = 0; i < 10; i++) {
			fw.write("Linea " + i + "\n");
		}
		
		fw.flush();
		
		fw.close();
	}

	public void writeTextoConBuffer() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("texto.txt")));
		
		for (int i = 0; i < 10; i++) {
			bw.write("Linea " + i + "\n");
		}
		
		bw.flush();
		
		bw.close();
	}
	
	public void readTexto() throws IOException {
		File f = new File("texto.txt");
		
		FileReader fr = new FileReader(f);
		
		int c;
		
		while ((c = fr.read()) != -1) {
			System.out.print((char)c);
		}
		
		fr.close();
	}
	
	public void readTextoConBuffer() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("texto.txt")));
		
		String line;
		
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		Archivos a = new Archivos();
		
		a.writeTexto();
		
		a.readTexto();
		
		a.writeTextoConBuffer();
		
		a.readTextoConBuffer();

	}

}
