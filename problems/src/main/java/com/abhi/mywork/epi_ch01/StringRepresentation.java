package com.abhi.mywork.epi_ch01;

import java.util.LinkedList;

public class StringRepresentation {

	private static final String[] DIGITS = 
				new String[] 
							{"0","1","2","3","4","5","6","7","8","9"} ; 
	public static void main(String[] args) {

		int x = -10004 ; 
		System.out.format("toString of %s is %s",x,toString(x));
	}
	
	public static String toString(int x) {
		

		StringBuilder r = new StringBuilder() ;
		if (x == 0 ) {
			return "0" ;
		}
		if (x < 0) {
			r.append("-") ;
			x = -x ; 
		}
		
		while (x > 0) {
			int d = x%10 ; 
			x = x/10 ; 
			r.append(DIGITS[d]) ; 
		}
		return r.reverse().toString() ; 
	}

}
