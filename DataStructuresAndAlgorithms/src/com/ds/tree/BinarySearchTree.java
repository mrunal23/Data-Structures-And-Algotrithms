package com.ds.tree;

public class BinarySearchTree {

	private Node root;
	
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		this.root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void insertNode(int data){
		Node newNode = new Node();
		newNode.setData(data);
		
		if(root==null){
			root = newNode;
		}else{
			Node current = root;
			Node parent = null;
			
			while(current!=null){
				parent = current;
				if(newNode.getData()<current.getData()){
					if(current.getLeft()!=null){
						current = current.getLeft();
					}else{
						current = null;
					}
				}else{
					if(newNode.getData()>=current.getData()){
						if(current.getRight()!=null){
							current = current.getRight();
						}else{
							current = null;
						}
					}
				}
			}
			
			if(newNode.getData()<parent.getData()){
				parent.setLeft(newNode);
			}else{
				parent.setRight(newNode);
			}
		}
	}
	
	public void deleteNode(int data){
	
		Node current = root;
		Node parent = null;
		
		while(current!=null && current.getData()!=data){
			parent = current;
			if(data<current.getData()){
				current = current.getLeft();
			}else{				
				current = current.getRight();				
			}
		}
		
		//if node is found
		if(current.getData()==data){
				System.out.println("node found!");
				//Node to be deleted is leaf node
				if(current.getLeft()==null && current.getRight()==null){
					//if root is the only node in the tree and has to be deleted
					if(parent==null){
						root = null;
					}else{
						
						if(current.getData()==parent.getLeft().getData()){
							parent.setLeft(null);
						}else{
							parent.setRight(null);
						}
					}
				}
				else{
					//Node to be deleted has only one child
					if((current.getLeft()!=null && current.getRight()==null) || (current.getLeft()==null && current.getRight()!=null)){
						Node child = null;
						if(current.getLeft()!=null){
							child = current.getLeft();
						}else{
							child = current.getRight();
						}
						if(parent==null){
							root = child;
						}else{
							if(parent.getLeft()==current){
								parent.setLeft(child);
								current.setLeft(null);
							}else{
								parent.setRight(child);
								current.setRight(null);
							}
							current = null;
						}
					}else{
						//node to be deleted has two children
						//find largest node from left child or smallest node from right child
						Node replaceNode = new Node();
						
						Node temp = current.getRight();
						Node tempParent = null;
						
						while(temp!=null && temp.getLeft()!=null){
							tempParent = temp;
							temp =temp.getLeft();
						}
						
						
						if(temp.getLeft()==null && temp.getRight()==null){	
							if(tempParent!=null){															
								tempParent.setLeft(null);
							}else{
								current.setRight(null);
							}
							
						}else{
							if(temp.getRight()!=null){
								if(tempParent!=null)
									tempParent.setLeft(temp.getRight());
								else
									current.setRight(temp.getRight());								
							}
						}
						//temp : node that will replace the node to be deleted.
						temp.setLeft(current.getLeft());
						temp.setRight(current.getRight());
						if(parent.getLeft()==current){
							parent.setLeft(temp);
						}else{
							parent.setRight(temp);
						}
					}
				}
		}
		else{
			//if node does not exist
			System.out.println("node does not exist in the tree!!");
		}
	}		

	public void inorder(Node root){
		if(root!=null){
			inorder(root.getLeft());
			System.out.println(root.getData() + "\t");
			inorder(root.getRight());
		}
	}
}
