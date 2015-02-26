package com.abhi.mywork.tree;

public class Node {

	public Node(int data) {
		this.data = data ; 
	}
	
	private int data ; 
	private Node lChild ; 
	private Node rChild ;

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getlChild() {
		return lChild;
	}
	public void setlChild(Node lChild) {
		this.lChild = lChild;
	}
	public Node getrChild() {
		return rChild;
	}
	public void setrChild(Node rChild) {
		this.rChild = rChild;
	} 
	
	
	
}
