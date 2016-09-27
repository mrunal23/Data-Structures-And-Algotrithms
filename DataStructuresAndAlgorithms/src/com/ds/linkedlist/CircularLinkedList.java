package com.ds.linkedlist;

public class CircularLinkedList {
	
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void insertNodeAtBeginning(int data){		
		Node newNode = new Node();
		newNode.setData(data);
		if(head==null){			
			head = newNode;
			head.setNext(head);
			System.out.println(" head cha next"+ head.getNext().getData());
			return;
		}else{
			Node temp = new Node();
			temp = head;
			System.out.println("temp " + temp.getData());
			newNode.setNext(temp);
			System.out.println("newnode " + newNode.getData());
			temp.setNext(newNode);
			head = newNode;
			System.out.println("head is " + head.getData());
		
		}
			/*if(head.getNext()==head){
				newNode.setNext(head);
				head = newNode;
				return;
			}
			else{	//System.out.println("head is not null");
			Node temp = new Node();
			temp = head;
			newNode.setNext(head);
			
			while(temp.getNext()!=head){
				temp=temp.getNext();
			}
			temp.setNext(newNode);			
			head =  newNode;*/
		
	}
	
	public void insertNodeAtEnd(int data){
		Node newNode = new Node();
		newNode.setData(data);
		if(head==null){
			head = newNode;
			head.setNext(head);
		}else{
			Node temp = new Node();
			while(temp.getNext()!=head){
				temp = temp.getNext();
			}
			temp.setNext(newNode);
			newNode.setNext(head);
		}
	}

	public void deleteNode(int data){
		if(head==null)
			return;
		
		Node temp = new Node();
		temp = head;
		while(temp.getData()!=data && temp.getNext()!=head){
			temp = temp.getNext();
		}
		if(temp==head && data==head.getData()){
			if(temp.getNext()==head){
				head=null;
				return;
			}
			while(temp.getNext()!=head){
				temp=temp.getNext();
			}
		
			temp.setNext(head.getNext());
			temp=head;
			head =head.getNext();
			temp.setNext(null);
		}
	}
	
	public void printList(){
		if(head==null){
			System.out.println("List is empty!!!");
		}else{
			Node temp = head;
			System.out.println(temp.getData());
			while(temp.getNext()!=head){
				System.out.print(temp.getData() + "\t");
				temp=temp.getNext();
			}
		}
	}
	
	
}
