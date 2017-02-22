package com.guodong.datastructure;

public class LinkedList implements List {

	private int size = 0;

	private Node head;

	private Node last;

	public void add(Object o) {
		if (head == null) {
			head = new Node(o, null);
			last = new Node(o, null);
		} else {
			Node n = last;
			last = new Node(o, null);
			n.next = last;
		}
		size++;
	}

	public void add(int index, Object o) {

	}

	public Object get(int index) {
		return null;
	}

	public Object remove(int index) {
		return null;
	}

	public int size() {
		return size;
	}

	public void addFirst(Object o) {

	}

	public void addLast(Object o) {

	}

	public Object removeFirst() {
		return null;
	}

	public Object removeLast() {
		return null;
	}

	public Iterator iterator() {
		return null;
	}

	private static class Node {
		Object data;
		Node next;

		public Node(Object data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
}
