package com.ds.linkedlist;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class DoubleLinkedList {
	
	private DoubleNode head;
	private DoubleNode tail;
	
	public DoubleNode getHead() {
		return head;
	}
	public void setHead(DoubleNode head) {
		this.head = head;
	}
	public DoubleNode getTail() {
		return tail;
	}
	public void setTail(DoubleNode tail) {
		this.tail = tail;
	}
	
	public void insertAtFront(int data){
		DoubleNode newNode = new DoubleNode();
		newNode.setData(data);
		if(head==null){			
			head = newNode;
			tail = newNode;
		}else{
			newNode.setNext(head);
			head.setPrev(newNode);
			head = newNode;
		}
	}
	
	public void insertAtEnd(int data){
		DoubleNode newNode = new DoubleNode();
		newNode.setData(data);
		
		if(tail==null){
			tail = newNode;
			head = newNode;
		}else{
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail = newNode;
		}
	}
	
	public void printList(){
		if(head==null)
			return;
		DoubleNode temp = new DoubleNode();
		temp = head;
		while(temp!=null){
			System.out.print(temp.getData() + "\t");
			temp = temp.getNext();			
		}
	}
	
	public void deleteNode(int data){
		
		if(head==null)
			return;		
		
		if(head==tail && head.getData()==data){
			head = null;
			tail = null;
		}				
		
		DoubleNode temp = new DoubleNode();
		DoubleNode prev = null;
		temp = head;
		
		while(temp.getData()!=data && temp.getNext()!=null){
			prev = temp;
			temp = temp.getNext();
		}
		System.out.println(temp==head);
		if(temp==head){
			head = temp.getNext();
			head.setPrev(null);
			temp.setNext(null);
			return;
		}
		if(temp.getData()==tail.getData()){
			tail = temp.getPrev();
			tail.setNext(null);
			temp.setPrev(null);
			return;
		}
		temp.getPrev().setNext(temp.getNext());
		temp.getNext().setPrev(temp.getPrev());
		temp.setNext(null);
		temp.setPrev(null);
	}
}
