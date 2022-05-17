package com.erivas.topic3AdvancedObjects.Arboles;

import java.util.Objects;

public class Tree<T extends Comparable<T>> {
	private Node<T> init = null;
	
	private void add(Node<T> n, T value) {
		if (n.getValue().compareTo(value) <= 0) {
			if (Objects.isNull(n.getRight())) {
				n.setRight(new Node<T>(value));
			} else {
				this.add(n.getRight(), value);
			}
		} else {
			if (Objects.isNull(n.getLeft())) {
				n.setLeft(new Node<T>(value));
			} else {
				this.add(n.getLeft(), value);
			}
		}
	}
	
	public void add(T value) {
		if (!Objects.isNull(value)) {
			if (Objects.isNull(this.init)) {
				this.init = new Node<T>(value);
			} else {
				this.add(this.init, value);
			}
		}
	}
	
	
	
	/**
	 * IN_ORDER
	 * 
	 * izquierda -> raiz -> derecha
	 * @param n
	 */
	private void inOrder(Node<T> n) {
		if (!Objects.isNull(n)) {
			this.inOrder(n.getLeft());
			System.out.println(n.getValue());
			this.inOrder(n.getRight());
		}
	}

	/**
	 * PRE_ORDER
	 * 
	 * raiz -> izquierda -> derecha
	 * @param n
	 */
	private void preOrder(Node<T> n) {
		if (!Objects.isNull(n)) {
			System.out.println(n.getValue());
			this.preOrder(n.getLeft());
			this.preOrder(n.getRight());
		}
	}
	
	/**
	 * POS_ORDER
	 * 
	 * Izquierda -> Derecha -> Raiz
	 * @param n
	 */
	private void posOrder(Node<T> n) {
		if (!Objects.isNull(n)) {
			this.posOrder(n.getLeft());
			this.posOrder(n.getRight());
			System.out.println(n.getValue());
		}
	}
	
	public void recorrer(Recorrido recorrido) {
		switch(recorrido) {
			case IN_ORDER:
				this.inOrder(this.init);
				break;
			case PRE_ORDER:
				this.preOrder(this.init);
				break;
			case POS_ORDER:
				this.posOrder(this.init);
				break;
			default:
				throw new RuntimeException("Recorrido no implementado");
		}
	}
	
	
}
