package com.abhi.mywork.epi_ch08;

import com.abhi.mywork.util.SOP;


public class MergeSortedLinkLists {

	public static void main(String[] args) {

		Node aH = new Node(12) ;
		Node aT = new Node(14) ;
		aH.next = aT ;  
		 
		
		aT.next = new Node(16) ; 
		aT = aT.next ; 
		
		aT.next = new Node(18) ; ; 
		aT = aT.next ; 
		
		aT.next = new Node(20) ; ; 
		aT = aT.next ; 
		
	
		Node bH = new Node(13) ;
		Node n = new Node(15) ;
		bH.next =  n ; 

		n.next = new Node(15) ; 
		n = n.next ; 
		
		n.next = new Node(17) ;
		n = n.next ; 

		n.next = new Node(19) ;
		n = n.next ; 
		
		Node mH = merge(aH,bH) ; 
		
		while (true) {
			if (mH == null) {
				break ; 
			}

			SOP.print(mH.data+",");
			mH = mH.next ;
		}
	}
	
	private static Node merge(Node a, Node b) {
		Node dummyNode = new Node(0) ; 
		
		Node tail = dummyNode ;
		
		while (a != null && b != null) {
			if (a.data < b.data) {
				tail.next = a ; 
				a = a.next ;
			} else {
				tail.next = b ; 
				b = b.next ;
			}
			tail = tail.next ;
		}
		if (a != null) {
			tail.next = a ; 
			
		} else if (b != null ) {
			tail.next = b ;
		}
		return dummyNode.next ;
	}

	private void appendNode(Node n , Node app) {
		
	}
	
	public static class Node {
		
		int data ; 
		Node next ; 
		Node prev ;
		
		public Node(int d) {
			this.data = d ; 
		}
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
		public Node getPrev() {
			return prev;
		}
		public void setPrev(Node prev) {
			this.prev = prev;
		} 
		
	}

}
