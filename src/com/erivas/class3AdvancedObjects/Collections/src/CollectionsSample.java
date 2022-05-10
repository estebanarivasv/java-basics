package com.erivas.class3AdvancedObjects.Collections.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CollectionsSample {

	/**
	 * Tranforma una lista en un formato String para ser facilmente mostrada en consola
	 * 
	 * @param l  Lista que ser� tranformada en un String de tipo {elem1, elem2, ...}
	 * @return   String que representa a la lista
	 */
	public static <E> String show(List<E> l) {
		int count = 0;
		
		StringBuffer strBuffer = new StringBuffer();
		
		strBuffer.append("{");
		
		for (E e : l) {
			if (count > 0) {
				strBuffer.append(", ");
			}
			strBuffer.append(e);
			count++;
		}
		
		strBuffer.append("}");
		
		return strBuffer.toString();
	}

	/**
	 * Algoritmo de ordenamiento recursivo MergeSort. Un buen ejemplo para ver el comportamiento recursivo.  Le puse
	 * bastante comentario para que muestre el camino que sigue.
	 * 
	 * @param l
	 * @return
	 */
	public static <E extends Comparable<E>> List<E> ordenar(List<E> l) {
		System.out.println("ORDENANDO --> " + show(l));
		if ((l != null) && (l.isEmpty() || (l.size() == 1))) {
			System.out.println("ORDEN FINAL --> " + show(l));
			return l;
		}
		
		System.out.println("SE MEZCLARAN --> " + show(l.subList(0, l.size() / 2)) + " y " + show(l.subList((l.size() / 2), l.size())));
		
		List<E> lParcial =  mezclar(ordenar(new ArrayList<E>(l.subList(0, l.size() / 2))), 
					   				ordenar(new ArrayList<E>(l.subList((l.size() / 2), l.size()))));
		
		System.out.println("ORDEN PARCIAL --> " + show(lParcial));
		
		return lParcial;
	}
	
	private static <E extends Comparable<E>> List<E> mezclar(List<E> l1, List<E> l2) {
		List<E> result = new ArrayList<E>();
		
		System.out.println("MEZCLANDO --> " + show(l1) + " y " + show(l2));
		
		if (l1.isEmpty() && l2.isEmpty()) {
			return result;
		} else if (l1.isEmpty()) {
			return l2;
		} else if (l2.isEmpty()) {
			return l1;
		} else {
			E v1 = l1.get(0);
			E v2 = l2.get(0);

			while (!l1.isEmpty() || !l2.isEmpty()) {
				if (v1.compareTo(v2) > 0) {
					result.add(v2);
					l2.remove(0);
					if (!l2.isEmpty()) {
						v2 = l2.get(0);
					} else {
						result.addAll(l1);
						l1.clear();
					}
				} else {
					result.add(v1);
					l1.remove(0);
					if (!l1.isEmpty()) {
						v1 = l1.get(0);
					} else {
						result.addAll(l2);
						l2.clear();
					}
				}
			}			
		}
		
		System.out.println("MEZCLA OBTENIDA --> " + show(result));
		
		
		return result;
	}
	
	public static void main(String[] args) {
		/**
		 * Utilizamos un LinkedList como pila LIFO
		 */
		
		Deque<Integer> pila = new LinkedList<Integer>();
		
		pila.offer(1);
		pila.offer(2);
		pila.offer(3);
		pila.offer(4);
		pila.offer(5);
		
		while (!pila.isEmpty()) {
			Integer i = pila.pollLast();
			
			System.out.println(i);
		}

		List<Integer> l = new ArrayList<Integer>();
		
		l.addAll(Arrays.asList(new Integer[] {19, 8, 15, 32, 2, 9, 5}));
		
		System.out.println("============================================");
		System.out.println("INICIAL --> " + show(l));
		
		List<Integer> ordenada = ordenar(l);

		System.out.println("ORDENADA --> " + show(ordenada));
		
		System.out.println("============================================");
		
		System.out.println("----------------");
		
		List<Integer> listaOrdenada = ordenar(Arrays.asList(new Integer[] {1}));
		
		Iterator<Integer> lOrdenadaIter = listaOrdenada.iterator();
		
		while(lOrdenadaIter.hasNext()) {
			System.out.println(lOrdenadaIter.next());
		}
		
		System.out.println("----------------");
		
		List<Integer> listaOrdenada2 = ordenar(Arrays.asList(new Integer[] {10, 1}));
		
		for(int i = 0; i < listaOrdenada2.size(); i++) {
			System.out.println(listaOrdenada2.get(i));			
		}

		System.out.println("----------------");
		
		List<Integer> listaOrdenada3 = ordenar(Arrays.asList(new Integer[] {}));
		
		for(Integer value : listaOrdenada3) {
			System.out.println(value);
		}
		
		/**
		 * Mapas
		 * 
		 * Generaremos un Mapa y recorreremos las colecciones internas que lo forman
		 */
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(1, "UNO");
		m.put(2, "DOS");
		m.put(3, "TRES");
		
		/**
		 * Iterar sobre las claves
		 */
		
		m.keySet().forEach(System.out::println);
		
		/**
		 * Iterar sobre los valores
		 */
		m.values().forEach(System.out::println);
		
		/**
		 * Iteramos sobre los pares (clave, valor)
		 */
		m.entrySet().forEach(System.out::println);
	}

}
