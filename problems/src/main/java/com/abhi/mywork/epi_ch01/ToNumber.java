package com.abhi.mywork.epi_ch01;

public class ToNumber {

	public static void main(String[] args) {

	}

	
	public static int toNumber(String s) {
		

		boolean isNeg = s.charAt(0) == '-' ; 
		
		char c = ' ' ; 
		int j = 0 ; 
		for (int i = (isNeg ?1 : 0) ; i < s.length() ; i++ ) {
			if (isNeg) {
				j = (int) Math.pow((double)10,(double)(i-1) ) ;
			} else {
				j = (int) Math.pow((double)10,(double)i ) ;
			}
			
			c = s.charAt(i) ;
			
			// get number form for c and multiply with j. Keep adding. 
			
		}
	}
}
