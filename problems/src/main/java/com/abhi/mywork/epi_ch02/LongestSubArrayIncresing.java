package com.abhi.mywork.epi_ch02;

import com.abhi.mywork.util.MyUtil.Pair;
import static com.abhi.mywork.util.SOP.print;
import static com.abhi.mywork.util.SOP.println;

public class LongestSubArrayIncresing {

	public static void main(String[] args) {
		
//		int[] A = new int[] {3,4,5,2,3,4,5,6,7,1,2,3,6,7,8,9} ; 
//		int[] A = new int[] {3,2,3} ; 
//		int[] A = new int[] {3,2} ; 
		int[] A = new int[] {3,4,5,6,7,8} ; 
		
		Pair<Integer, Integer> p =  findLongestIncrSubAttBruteForce(A) ;
		println("Pair for longest BF approach is"+p.x+","+p.y);

		p =  findLongestIncrSubAttNonBruteForce(A) ;
		
		println("Pair for longest NON-BF approach is"+p.x+","+p.y);

	}

	
	public static Pair<Integer, Integer> findLongestIncrSubAttNonBruteForce(int[] a){
		// basic checks 
		int streak = 0 , i = 0 ; int n = a.length ;
		boolean isSkip = false ; 
		
		Pair<Integer, Integer>  p = new Pair<Integer, Integer>(0,0) ;
		
		while(i < n ) {
			
			for (int j = (i+streak) ; j > i ; j--) {
				if (a[j-1] < a[j]) {
					continue ; 
				}
				
				isSkip = true ; 
			}
			
			if (!isSkip) {
				int x = streak ; 
				for (int j = (i+x) ; j < n ; j++  ) {
					if ((j+1) < n && a[j] < a[j+1]) {
						++x ; 
						continue ; 
					}
					
					// streak broken
					if (streak < x) {
						p.x = i ; 
						p.y = i+x ; 
						streak = x ; 
					}
					i = j+1 ;
					break  ;
				}
			}
		}
		
		return p ; 
		
		
	}
	
	public static Pair<Integer, Integer> findLongestIncrSubAttBruteForce(int[] A) {
		// basic checks for null, length etc. 
		int n = A.length   ; 
		int x = 0 , i = 0 ;
		Pair<Integer, Integer> p = new Pair<Integer, Integer>(0, 0) ;
		for (i = 0 ; i < n ; i++) {
			if ((i+1 < n) && A[i] < A[i+1]) {
				continue ; 
			}
			// else sub array is broken 
			if ((i -x)  > (p.y - p.x)) {
				p.x = x ; 
				p.y = i ;
				
			}
			x = i+1 ; // reset x
		}
		return p ; 
	}
	

}
