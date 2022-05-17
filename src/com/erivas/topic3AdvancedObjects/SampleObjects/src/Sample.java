package com.erivas.topic3AdvancedObjects.SampleObjects.src;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

public class Sample {

	public static final String VALOR = "HOLA";
	
	public static void main(String[] args) {
		String value = "HOLA";
		
		if (Objects.equals(value, Sample.VALOR)) {
			System.out.println("son iguales");
		} else {
			System.out.println("son diferentes");
		}
		
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(1);
		s.add(2);		
		s.add(3);
		s.add(4);
		
		Set<Integer> s2 = new HashSet<Integer>();
		
		s2.add(1);
		s2.add(2);		
		s2.add(3);
		s2.add(4);		
		
		boolean comparacion = s.retainAll(s2);
		
		System.out.println(comparacion + " " + s.size());
		
		Queue<String> l = new LinkedList<String>();
		l.element();
	}

}
