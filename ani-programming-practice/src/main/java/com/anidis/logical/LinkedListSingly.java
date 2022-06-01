package com.anidis.logical;

import java.util.Optional;

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

		// Delete First & Last
		deleteLast();
		displayLinkList();
		
		deleteLast();
		deleteLast();
		displayLinkList();
		
		deleteLast();
		displayLinkList();
		deleteLast();
	}

	private static void deleteLast() {
		// TODO Auto-generated method stub
		Node top = head;
		Node lastNode = null;
//		System.out.println("<< "+head +" | "+head.getNext());
		if (head == null) {
			System.out.println("-- NO Node --");
			return;
		} else if (head.getNext() == null) {
			head = null;
//			System.out.println("-- Deleted Last Node ------");
			return;
		}

		while (top.getNext() != null) {
			lastNode = top;
//			System.out.println(">> " + lastNode.getData() + " | " + top.getData());
			top = top.getNext();
//			System.out.println(">> " + top.getData());
		}

//		while(top.getNext()!=null) {
//			
//			top =top.getNext();
//		}

		lastNode.setNext(null);

	}

	private static void displayLinkList() {
		// TODO Auto-generated method stub
		Node top = head;
		if(head==null) {
			
			System.out.println("========= EMPTY LIST ===========");
		}
		
		int index = 1;
		while (top != null) {

			System.out.println("(" + index++ + ") [ " + top.getNext() + " : " + top.getData() + " ]--");
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

//		System.out.println("Added >> " + data + " | " + head + " | " + head.getNext());
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