package com.abhi.mywork.tree;

import com.abhi.mywork.util.SOP;

public class BSTree {

	private Node root ; 
	public BSTree(Node root) {
		this.root = root ; 
	}
	
	
	public void deleteNode(int data) {
		// first search the node 
		// remove that node
		// adjust all child nodes by re-adding them into tree
		
		
	}
	
	public Node search(int key) {
		
		if (key == this.root.getData()) {
			return root ;
		}
		Node current = root ; 
		
		while (current != null) {
			if (current.getData() == key) {
				return current ; 
			}
			
			if (key <= current.getData()) {
				current = current.getlChild() ; 
			} else {
				current = current.getrChild() ; 
			}
			
		}
		
		return current ; // null if not found  		
		
	}
	

	public void addNode(Node n) {
		
		if (n == null ) {
			return ; 
		}
		
		// find if n is greater then root
		// if greater then root, go to right
		// else go to left. 
		Node current = root ;
		while (current != null ) {
			if (current.getData() < n.getData()) {
				if (current.getrChild() == null) {
					current.setrChild(n);
					break ; 
				} else { 
					current = current.getrChild() ; 
					continue ;
				}
			} else { 
				if (current.getlChild() == null) {
					current.setlChild(n);
					break ; 
				} else { 
					current = current.getlChild() ; 
					continue ; 
				}
			}
		}
		
	}
	public static void main(String[] args) {

		BSTree tree = new BSTree(new Node(15)) ;
		
		tree.addNode(new Node(12));
		tree.addNode(new Node(16));
		tree.addNode(new Node(11));
		tree.addNode(new Node(10));
		tree.addNode(new Node(2));
		tree.addNode(new Node(13));
		tree.addNode(new Node(20));
		tree.addNode(new Node(17));
		tree.addNode(new Node(19));
		tree.addNode(new Node(1));
		tree.addNode(new Node(7));
		
		Node n = tree.search(15) ;
		SOP.println("Node found="+n);
		
		
		print(tree,ORDER.INORDER) ;
	}

	enum ORDER {
		INORDER,
		PREORDER,
		POSTORDER
	}
	private static void print(BSTree tree, ORDER order) {
		
		switch (order) {
		case INORDER: printInOrder(tree) ; break ; 
		case PREORDER: printPreOrder(tree) ; break ; 
		case POSTORDER:printPostOrder(tree) ; break ; 
			
		default : break ;	
		}
		
		
	}

	private static void printPostOrder(BSTree tree) {
		SOP.println("Printing In Order");
	}

	private static void printPreOrder(BSTree tree) {
		SOP.println("Printing Pre Order");		
	}

	private static void printInOrder(BSTree tree) {
		SOP.println("Printing Post Order");		
	}

}
