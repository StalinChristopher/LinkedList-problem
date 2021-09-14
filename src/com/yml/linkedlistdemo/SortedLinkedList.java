package com.yml.linkedlistdemo;

public class SortedLinkedList <T> {
	
	private Node head;
	
	private class Node <E extends Comparable<E>> {

		private E data;
		private Node<E> next;
		
		public E getData() {
			return data;
		}
		public Node(E data) {
			this.data = data;
			this.next = null;
		}


		
	}
	
	public <E extends Comparable<E>> void add(E data) {
		Node<E> newNode = new Node<E>(data);
		
		if(head == null || head.data.compareTo(data)>0) {
			newNode.next = head;
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.next != null && temp.next.data.compareTo(data)<0) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	
	public void print() {
		if(head == null) {
			System.out.println("Linked List is empty");
		} else {
			Node temp = head;
			while(temp.next != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
}
