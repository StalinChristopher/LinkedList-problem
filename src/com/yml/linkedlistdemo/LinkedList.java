package com.yml.linkedlistdemo;

/**
 * @author Stalin Christopher
 * Class to write methods related to the linkedList
 *
 */
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
	
	//Method to push the element into the front of the linkedList
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	//Method to print all the elements of the linkedList
	public void  print() {
		System.out.println("Linked list:");
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
			
		}
	}
	
	//Method to append the element into the end of linked list
	public boolean append(int data) {
		boolean isAdded = false;
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			size++;
			isAdded = true;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			size++;
			isAdded = true;
		}
		return isAdded;
	}
	
	//Method to insert an element into the linkedList at a given position
	public void insertAtPos(int pos, int data) {
		if(pos<1) {
			System.out.println("Invalid");
		}
		if(pos == 1 ) {
			push(data);
			size++;
		}
		else {
			Node newNode = new Node(data);
			Node temp = head;
			int count = 1;
			while(count<pos-1) {
				temp = temp.next;
				count++;
			}
			Node cur = temp.next;
			temp.next = newNode;
			newNode.next = cur;
			size++;
		}
	}
	
	//method to pop the first element of the linkedList, it returns the deleted element
	public int pop() {
		if(head == null) {
			System.out.println("List is empty... Deletetion operation is not posibile");
			return 0;
		}
		Node temp = head;
		head = temp.next;
		return temp.data;
	}
	
	//method to pop the last element from the linkedList, it returns the popped element
	public int popLast() {
		if(head == null) {
			System.out.println("List is empty... Deletion operation is not possible");
			return 0;
		}
		if(head.next == null) {
			Node temp = head;
			head = null;
			return temp.data;
		}
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		int data = temp.next.data;
		temp.next = null;
		return data;
	}

	
}
