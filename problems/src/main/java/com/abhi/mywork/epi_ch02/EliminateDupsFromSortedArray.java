package com.abhi.mywork.epi_ch02;

import java.util.Arrays;

import com.abhi.mywork.util.SOP;

public class EliminateDupsFromSortedArray {

	public static void main(String[] args) {
		
//		int[] A = new int[] {1,1,2,2,3,4,5,6,6,6} ;
		int[] A = new int[] {1,1,2} ;
		A = elemininateDupsBigO_n(A) ; 
		
		SOP.println("new Array of length ="+A.length);
		
		for (int i = 0 ; i < A.length ; i++) {
			SOP.print(""+A[i]+",");
			
		}
	}
	
	
	public static int[] elemininateDupsBigO_n(int[] A) {
	
		// basic chescks
		int x = 0 ;
		for (int i = 1 ; i < A.length ; i++) {
			while (i < A.length && A[i] == A[i-1]) {
				i++ ; 
				continue ; 
			}
			if (i < A.length) {
				A[++x] = A[i] ;
			}
		}
		
		// discard all after x 
		return Arrays.copyOf(A, x+1) ; 
		
	}
	
	

}
