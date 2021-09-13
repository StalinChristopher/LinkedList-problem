package com.yml.linkedlistdemo;

/**
 * @author Stalin Christopher
 * 
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to LinkedList program");
		LinkedList linkedList = new LinkedList();
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		
		linkedList.insertAtPos(3, 10);
		
		linkedList.print();
		
		linkedList.popLast();
		System.out.println("\nElement 30 : "+ linkedList.search(30));
		
		linkedList.print();
	}

}
