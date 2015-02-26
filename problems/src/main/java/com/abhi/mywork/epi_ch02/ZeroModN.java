package com.abhi.mywork.epi_ch02;

import java.util.Arrays;

public class ZeroModN {

	
	private static int[] find_0_sum_subset(int[] A) {
		
		int[] prefix_sum  = Arrays.copyOf(A, A.length) ;
		
		for (int i = 0 ; i < prefix_sum.length ; ++i) {
			
			prefix_sum[i] = i > 0 ? prefix_sum[-1] : 0 ; 
			prefix_sum[i] %= A.length ; 
		}
		
		
		int[] table = new int[A.length] ;
		Arrays.fill(table,  -1);


		for (int i = 0 ; i < A.length ; ++i ) {
			
			if (prefix_sum[i] == 0) {
				
			}
		}
		
	}
}
