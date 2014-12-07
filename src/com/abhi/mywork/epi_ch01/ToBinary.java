package com.abhi.mywork.epi_ch01;

public class ToBinary {

	public static void main(String[] args) {

		int x = 41 ; 
		String b = toBinary(x) ;
		
		System.out.format("Binary of %s = %s",x,b) ;
		
		
		System.out.format("Decimal of %s = %s",b,toDecimalNumber(b)) ;

		
	}
	
	
	public static int toDecimalNumber(String b){
		int r = 0 ; 
		
		char[] chArr = b.toCharArray() ; 
		for (char c : chArr) {
			r = (r << 1) + c - '0' ; 
			
		}
		
		return r ; 
	}
	public static String toBinary(int x) {
		if (x == 0 || x == 1) {
			return ""+x ; 
		}

		StringBuilder r = new StringBuilder() ; 
		if (x < 0) {
			r.append("-") ;
			x = -x ; 
		}
		
		
		
		while (x > 0) {
			r.append(((x & 1) == 1) ? "1" : "0") ;
			x >>= 1 ; 
		}
		
		return r.reverse().toString() ;
	}

}
