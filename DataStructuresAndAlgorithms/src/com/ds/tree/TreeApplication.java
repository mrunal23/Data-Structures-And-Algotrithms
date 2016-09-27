package com.ds.tree;

public class TreeApplication {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertNode(100);
		bst.insertNode(150);
		bst.insertNode(175);
		bst.insertNode(180);
		bst.insertNode(182);
		
		//bst.inorder(bst.getRoot());
		bst.deleteNode(175);
		bst.inorder(bst.getRoot());
		System.out.println("root :: " + bst.getRoot().getRight().getRight().getData());
		
	}

}