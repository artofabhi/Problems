package com.abhi.mywork.epi_ch02;

import com.abhi.mywork.util.SOP;

public class DeleteKFromUnSortedArray {

	public static void main(String[] args) {

		int[] A = new int[] {3,1,3,4,3,6,4,3,7,3,3} ; 
		
		int lastIndex = deleteKey(A,3) ;
		
		SOP.print(lastIndex+"");
	}

	private static int deleteKey(int[] a, int k) {
		
		// basic checks
		int i = 0 ; 
		
		while (i < a.length && a[i] != k ) {
			i++ ; 
			continue ; 
		}
		if (i > a.length) {
			return a.length -1 ; // no key found
		}
		
		int cpI = i + 1  ; 
		int currI = i ; 
		
		while (cpI < a.length && currI < a.length) {
			
			if (a[cpI] == k ) {
				cpI++ ; 
				if ( currI > a.length) {
					return currI ; 
				}
				continue ; 
			}
			
			a[currI++] = a[cpI++] ;
		}
		
		return currI-1;
	}

}
