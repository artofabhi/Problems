package com.abhi.mywork.epi_ch01;

public class XbyY {

	public static void main(String[] args) {
		
//		System.out.println("result ="+xByYBruteForce(19, 6)); 
		int x = 190 ; 
		int y = 6 ; 
		System.out.println("result ="+xByY(x,y)+" x/y is:"+(x/y)); 
		
	}


	public static int xByY( int x, int y) {
		if (x < y ) {
			return 0 ; 
		}
		if (x == y ) {
			return 1 ; 
		}
		
		 int r  = 1 ; 
		while(y <= x) {
			int power = 1 ;
			while ((y << power)  >= (y << (power-1)) && (y << power) <= x) {
				++power ; 
			}
			
			r += 1L << (power-1) ; 
			
			x -= y <<(power-1) ; 
		}
		return r ; 
	}
	
	public static int xByYBruteForce(int x, int y) {
		if (x < y ) {
			return 0 ; 
		}
		if (x == y ) {
			return 1 ; 
		}
		
		int origY = y ; 
		int res = 0 ; 
		while (y <= x ) {
//			x >>= 1 ; 
//			y <<= 1 ;
			y += origY ; 
			res++ ;
		}
		
		return res ; 
		
	}

}
