package com.abhi.mywork.heap;


public class Heap {

	int[] heap = null ;
	int max_size = -1 ; 
	int current = 0 ; 
	public Heap(int size) {
		this.heap = new int[size] ;
		max_size = size ; 
	}
 
	public static void main(String[] args) {
		
		Heap h = new Heap(10) ;
		
		h.insert(20);
		h.insert(10);
		h.insert(34);
		h.insert(5);
		h.insert(25);
		h.insert(32);
		h.insert(52);
		h.insert(12);
		h.insert(42);
		h.insert(26);

	}
	
	private void insert(int value) {
		if (current < max_size) {
			heap[current] = value ;
			
			this.trickleUp(current++);
		}
		
		return  ; 
		
	}
	
	private void trickleUp(int index) {
		// basic check 
		int bottom = heap[index] ;
		int parent = (index -1)/2 ;
		
		while (index > 0 &&
				heap[parent] < bottom) {
			
			heap[index] = heap[parent] ; // push down
			index = parent ; 
			parent = (parent-1)/2 ; 
		}
		
		heap[index] = bottom ; 
 	}
	
	
	private void trickleDown(int index) {
		// basic checks
		int top = heap[index] ; 
		int lChild = index*2+1  ;
		int rChild = index*2+2 ; 

		
		
	}

}
