/**
 * 
 */
package com.ds.linkedlist;

/**
 * @author mrule
 *
 */
public class SingleLinkedList {
	
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void insertNode(int data){
		Node newNode = new Node();
		newNode.setData(data);
		
		//if list is empty
		if(head==null){
			head = newNode;
		}else{
			//if there are elements in the list
			newNode.setNext(head);
			head = newNode;
		}		
	}
	
	public void deleteNode(int data){
		if(head==null){
			System.out.println("List emptyy!!!");
			return;
		}
		
		Node temp = new Node();
		temp=head;
		if(temp.getData()==data){
			head = temp.getNext();
			temp.setNext(null);
		}else{
			Node prev = null;
			while(temp.getData()!=data && temp!=null && temp.getNext()!=null){
				prev = temp;
				temp = temp.getNext();
			}
			if(prev!=null)
				prev.setNext(temp.getNext());
			
			temp.setNext(null);			
		}
	}
	
	public void printList(){
		if(head==null){
			System.out.println("List is empty!!!");
		}else{
			Node temp = head;
			while(temp!=null){
				System.out.print(temp.getData() + "\t");
				temp=temp.getNext();
			}
		}
	}
	
	
}
