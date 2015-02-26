package com.abhi.mywork.epi_ch08;

import com.abhi.mywork.epi_ch08.MergeSortedLinkLists.Node;
import com.abhi.mywork.util.SOP;

public class ReverseSinglyLinkedList {

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
		
		
//		Node nH = reverse(aH) ;
//
//		SOP.println("Non recur");
//		while (true) {
//			if (nH == null) {
//				break ; 
//			}
//
//			SOP.print(nH.data+",");
//			nH = nH.next ;
//		}	
//

//		Node newHead = reverseRec(aH) ;
//		SOP.println("");
//		SOP.println("recur");
//		while (true) {
//			if (newHead == null) {
//				break ; 
//			}
//
//			SOP.print(newHead.data+",");
//			newHead = newHead.next ;
//		}	
//
//		
		
	}
	
	public static Node reverse(Node head) {
		
		if (head == null || head.next == null) {
			return head ; 
		}

		Node prev = null ; 
		Node next = head.next ; 
		Node tmp = head.next ;
		
		while (tmp != null ) {
			tmp = next.next ; 
			next.next = prev ;
			prev = next ; 
			next = tmp ; 
		}
		
		 head.next = null ; 
		return prev ; 
		
	}
	
	public static Node reverseRec(Node n ) {
		if (n == null || n.next == null) {
			return n ; 
		}
		
		Node newHead = reverseRec(n.next) ;
		n.next.next = n ; 
		n.next = null ; 
		
		return newHead ; 
		
	}

}
