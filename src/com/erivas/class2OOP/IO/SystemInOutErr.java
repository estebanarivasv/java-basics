package com.erivas.class2OOP.IO;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

public class SystemInOutErr {
	/*
	* - Every flow is asynchronous
	* */
	public void testOutErr() {
		System.out.print("Hi, ");	// Print without newline
		System.out.println("How are you?");		// Print with newline
		System.out.println();
		System.out.println("How are you?");

		System.err.println("This is an ERROR!");
	}

	// Stores output in a file
	public void testOutToFile() throws FileNotFoundException {
		PrintStream actualOut = System.out;
		
		System.setOut(new PrintStream("output.txt"));
		
		System.out.println("Hello World!");
		
		System.setOut(actualOut);
		
	}
	
	public void testIn() throws IOException {
		InputStreamReader iStreamReader = new InputStreamReader(System.in);
	    BufferedReader reader = new BufferedReader(iStreamReader);
		
	    System.out.println("Enter your name: ");
	    String name = reader.readLine();
	    reader.close();

	    System.out.println("Hi " + name + "!!!");
	}	

	// Copies one array content to another array
	public void testArrayCopy() {
		int[] sourceIntArray = new int[] {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(sourceIntArray));

		int[] destinationIntArray = new int[5];
		System.arraycopy(sourceIntArray, 0, destinationIntArray, 0, 5);
		System.out.println(Arrays.toString(destinationIntArray));
	}
	
	public void showDatetime() {
		Date actualDate = new Date(System.currentTimeMillis());
		System.out.println(actualDate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(actualDate));
		
	}

	// Gets environment properties
	public void showEnvProperties() {
		Properties p = System.getProperties();
		
		for (String keyProperty : p.stringPropertyNames()) {
			System.out.println(keyProperty + " : " + p.getProperty(keyProperty));
		}
	}

	// Gets properties from file
	public void showPropertiesFromFile() throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileReader("test.properties"));

		System.out.println("From properties file: " + p.getProperty("day.name"));
	}
	
	public static void main(String[] args) throws IOException {
		SystemInOutErr io = new SystemInOutErr();

		io.testOutErr();
		io.testOutToFile();
		io.testIn();
		io.testArrayCopy();
		io.showDatetime();
		io.showPropertiesFromFile();
		io.showEnvProperties();

	}

}

