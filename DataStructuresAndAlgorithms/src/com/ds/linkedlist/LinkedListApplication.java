package com.ds.linkedlist;

public class LinkedListApplication {
	
	public static void main(String args[]){
		/*SingleLinkedList singleList = new SingleLinkedList();
		singleList.insertNode(1);
		singleList.insertNode(2);
		singleList.insertNode(3);
		singleList.insertNode(4);
		singleList.insertNode(5);
		singleList.insertNode(6);
		singleList.printList();
		singleList.deleteNode(6);
		System.out.println("\n\nafter deleting first node!!\n");
		singleList.printList();
		System.out.println("\nafter deleting middle node!!\n");
		singleList.deleteNode(3);
		singleList.printList();*/
		
		/*DoubleLinkedList doubleList = new DoubleLinkedList();
		doubleList.insertAtEnd(3);
		doubleList.insertAtEnd(4);
		doubleList.insertAtFront(1);
		doubleList.insertAtFront(2);
		doubleList.deleteNode(1);
		doubleList.deleteNode(4);
		doubleList.printList();*/
		
		CircularLinkedList list = new CircularLinkedList();
		/*list.insertNodeAtBeginning(1);				
		list.insertNodeAtBeginning(2);
		list.insertNodeAtBeginning(3);
		list.insertNodeAtBeginning(4);
		list.insertNodeAtEnd(1);
		list.insertNodeAtEnd(2);*/
		list.insertNodeAtBeginning(1);
		list.insertNodeAtBeginning(2);
		list.printList();
		
	}
}
