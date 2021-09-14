package com.yml.linkedlistdemo;

/**
 * @author Stalin Christopher
 * 
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to LinkedList program");
		
		/*Here linkedList of type Integer is created. Any type of LinkedList can be created since it is of
		 *generic type
		 */
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		
		linkedList.insertAtPos(3, 10);
		
		linkedList.print();
		
		linkedList.popLast();
		
		System.out.println("\nElement 30 : "+ linkedList.search(30));
		
		linkedList.insertAfterValue(30, 40);
		
		linkedList.print();
		
		linkedList.remove(40);
		
		linkedList.print();
	}

}
