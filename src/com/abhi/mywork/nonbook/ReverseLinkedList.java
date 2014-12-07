package com.abhi.mywork.nonbook;

public class ReverseLinkedList {

	public static void main(String[] args) {

		
	}
	
	
	public static Node reverse(Node head) {
		
		if (head == null) {
			return null ; 
			
		}
		
		if (head.next == null) {
			return head ; 
		}
		
		Node prev = head ;
		
		Node tmp = head.next ; 
		Node current = head.next ; 
		
		head.next = null ; 
		
		while (current != null) {
			tmp = current.next ; 
			current.next = prev ; 
			prev = current ; 
			current = tmp; 
		}
		
		return current ; 
	}
	
	
	public static class Node {
		int data ; 
		Node next ;
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		} 
		
		
	}

}
