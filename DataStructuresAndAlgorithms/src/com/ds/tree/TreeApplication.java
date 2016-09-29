package com.ds.tree;

public class TreeApplication {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		/*bst.insertNode(100);
		bst.insertNode(150);
		bst.insertNode(175);
		bst.insertNode(180);
		bst.insertNode(50);			
		bst.insertNode(25);
		bst.insertNode(75);
		bst.insertNode(12);
		bst.insertNode(35);
		bst.insertNode(62);
		bst.insertNode(85);			
		bst.insertNode(125);
		bst.insertNode(112);
		bst.insertNode(145);
		bst.insertNode(163);*/
		//bst.deleteNode(100);
		//bst.inorderIterative();
		bst.insertNode(50);
		bst.insertNode(75);
		bst.insertNode(25);
		bst.insertNode(13);			
		bst.insertNode(37);
		bst.insertNode(62);
		bst.insertNode(87);
		/*System.out.print("\npreorder traversal :: ");
		bst.preorderIterative();
		System.out.print("\ninorder traversal :: ");
		bst.inorderIterative();*/
		System.out.print("\npostorder traversal ::");
		bst.postorderIterative();
	}

}