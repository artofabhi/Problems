package com.abhi.mywork.nonbook;

import com.abhi.mywork.util.SOP;

public class Insersiontracker {

	private static  int top ; 
	public static void main(String[] args) {

		int[] a = new int[10] ;
		int[] insertionOrder = new int[a.length] ;
		
		// initialize with -1 ; 
		for (int i = 0 ; i < insertionOrder.length ; i++) {
			insertionOrder[i] = -1 ; 
		}

		put(5,3,a,insertionOrder) ;  // 0 -> 5th of a
		put(0,10,a,insertionOrder) ; // 1 -> 0th of A 
		put(2,33,a,insertionOrder) ; // 2 -> 2nd of A
		put(9,23,a,insertionOrder) ; // 3 -> 9th of A 
		put(6,13,a,insertionOrder) ; // 4 -> 6th of A
		put(4,1,a,insertionOrder) ;  // 5 -> 4th of A 
		
		
		SOP.println("5th element = "+get(5,a,insertionOrder)+""); // 5 -> 4th of A 
		SOP.println("4th element = "+get(4,a,insertionOrder)+""); // 4 -> 6th of A
		SOP.println("0th element = "+get(0,a,insertionOrder)+""); // 0 -> 5th of a
//		SOP.println("9th element = "+get(9,a,insertionOrder)+""); // IndexOut of bound 
		SOP.println("9th element = "+get(3,a,insertionOrder)+""); // 3 -> 9th of A 
	}

	public static void put(int key, int value ,int[] a, int[] insertionOrder) {
		// basic checks and MAX checks for ArrayIndexOutOfBound 
		
		insertionOrder[top++] = key ; 
		a[key] = value ; 
		
	}
	
	/**
	 * Returns nth element which was inserted. 
	 * @param n
	 * @param a
	 * @param insertionOrder
	 * @return
	 */
	public static int get(int key, int[] a, int[] insertionOrder) {
		// basic checks 
		return a[insertionOrder[key]] ; 
	}

}
