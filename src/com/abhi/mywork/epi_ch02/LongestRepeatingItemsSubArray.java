package com.abhi.mywork.epi_ch02;

import com.abhi.mywork.util.SOP;

public class LongestRepeatingItemsSubArray {

	public static void main(String[] args) {

		int[] a = new int[] {2,2,2,2,2,2,3,4,5,5,5,5,5,5,5,5,5,1,2,2,2,2,7,7,7,7,7} ; 
		longestSubArray(a);
	}
	
	
	private static void longestSubArray(int[] a) {

		if (a == null | a.length == 0 ) {
			return ; 
		} else if (a.length == 1) {
			SOP.print("Longest Sub Array indeses are "+0+","+0);
		}
		
		int x=0, y=0, streak  = 0 ;
		int xl = 0 , yl = 0  ;
		int i = 0 ;
		for (i = 1 ; i < a.length ; i++	) {
			if (a[i] == a[i-1]) {
				y++ ; 
			} else { 
//				if ((i-1-x) > streak) { 
				if ((y-x) > streak) { 
//					streak = i-1-x ;
					streak = y-x ;
					xl = x ; 
//					yl = i-1 ; 
					yl = y ; 
				}
				x = i ;
				y = i ; 
			}
		}
		
		// check for last streak if that was bigger. 
//		if ((i-1-x) > streak) { 
		if ((y-x) > streak) { 
//			streak = i-1-x ;
			streak = y-x ;
			xl = x ; 
			yl = y ; 
		}
		
		SOP.print("Longest Sub Array indeses are "+xl+","+yl+", of distance="+(streak+1));
	}

}
