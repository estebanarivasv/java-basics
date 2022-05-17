package com.erivas.topic2OOP.Iteracion;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iteracion {

	public static void main(String[] args) {
		List<String> l = Arrays.asList(new String[] {"1", "2", "3", "4", "5", "6"});
		
			
		for (int i = 0; i < l.size(); i++) {
			System.out.println("[FOR] Elemento [" + i + "] = " + l.get(i));
		}

		System.out.println("========================================================");
		
		int i = 0;
		for (String s : l) {
			System.out.println("[FOR EACH] Elemento [" + (i++) + "] = " + s);
		}

		System.out.println("========================================================");
		
		i = 0;
		while (i < l.size()) {
			System.out.println("[WHILE] Elemento [" + i + "] = " + l.get(i));
			i++;
		}

		System.out.println("========================================================");

		i = 0;
		do {
			System.out.println("[DO WHILE] Elemento [" + i + "] = " + l.get(i));
			i++;
		} while (i < l.size());

		System.out.println("========================================================");

		Iterator<String> it = l.iterator();
		
		i = 0;
		while(it.hasNext()) {
			System.out.println("[ITERATOR] Elemento [" + (i++) + "] = " + it.next());
		}
		
	}

}
