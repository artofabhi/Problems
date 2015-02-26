package com.abhi.mywork.epi_ch02;

import java.util.LinkedList;
import java.util.ListIterator;

import com.abhi.mywork.util.SOP;


public class IncrementBy1 {

	public static void main(String[] args) {
		LinkedList<Node> ll = new LinkedList<IncrementBy1.Node>() ; 
		
		ll.add(new Node(9)) ;
		ll.add(new Node(9)) ;
		ll.add(new Node(9)) ;
		
		for (Node n : ll) {
			SOP.print(""+n.getValue());
		}
		
		incr(ll) ;
		
		for (Node n : ll) {
			SOP.print(""+n.getValue());
		}
		
	}

	
	public static void incr(LinkedList<Node> ll) {
		
		// basic checks like null etc. 
		
		Node current  = ll.getLast() ; 
		int val = current.getValue() + 1 ; 
		int index = ll.size()-1 ; 
		while (current != null && val == 10) {
			current.setValue(0);
			current = ll.get(--index) ; // IndexOutOfBoundEx
			
			// if reached head
			if (current == null) {
				// set head with 0
				// add new head with 1
				ll.getFirst().setValue(0) ; 
				ll.addFirst(new Node(1));
				
			}
			current.setValue(current.getValue()+1);
			val = current.getValue() ; 
		}
		

		
	}
	
	
	public static class Node {
		Integer value ;

		public Node(int i) {
			this.value = i ; 
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		} 
		
	}
}
