package com.anidis.logical;

public class LinkedListSingly {
	static Node head = null;

	public static void main(String args[]) {

		// Add: AddFirst & aadLast
		addFirst("Ani");
		addFirst("Anika");

		// Display : triverse all & display value

		displayLinkList();
		addFirst("Deepika");
		addFirst("Deepika 22 ");
		displayLinkList();
	}

	private static void displayLinkList() {
		// TODO Auto-generated method stub
		Node top = head;

		while (top != null) {

			System.out.print("[ " + top.getNext() + " : " + top.getData() + " ]--");
			top = top.getNext();
		}

		System.out.println();
	}

	private static void addFirst(String data) {
		// TODO Auto-generated method stub

		Node firstNode = new Node(data);
		if (head != null) {

			firstNode.setNext(head);
		}
		head = firstNode;

		System.out.println("Added >> " + data + " | " + head + " | " + head.getNext());
	}

}

class Node {

	private Node next;
	private String data;

	public Node(String data) {
		this.data = data;
		this.next = null;
	}

	private Node() {
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node node) {

		this.next = node;
	}

	public String getData() {
		return this.data;
	}

}