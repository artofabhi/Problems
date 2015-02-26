package com.abhi.mywork.epi_ch01;

import static java.lang.Math.*;
import static com.abhi.mywork.util.SOP.* ;

public class GCD {

	public static void main(String[] args) {

		int x = 75, y = 90 ; 
		println(""+gcdRecur_BigO_2_Pow_N(x,y)) ;
		
	}
	
	
	public static int gcdRecur_BigO_2_Pow_N(int x, int y) {
		
		return (x==y) ? x : gcdRecur_BigO_2_Pow_N((max(x,y) - min(x,y)),min(x,y)) ;
	}
	
	
	

}
