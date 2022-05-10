package com.erivas.class3AdvancedObjects.Arboles;

public class Node<T extends Comparable<T>> {
	private T value;
	
	private Node<T> left, right = null;
	
	public Node(T v) {
		this.setValue(v);
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}
	
}
