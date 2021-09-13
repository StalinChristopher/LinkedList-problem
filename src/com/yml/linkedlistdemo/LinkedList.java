package com.yml.linkedlistdemo;

public class LinkedList {
	private int size;
	private Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public void  print() {
		System.out.println("Linked list:");
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
			
		}
		
	}
}
