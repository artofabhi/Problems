/**
 * 
 */
package com.abhi.mywork.epi_ch01;

/**
 * @author apurohit
 * 
 */
public class BitwiseReverseBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long x = 0b1100;

		long y = reverse(x);
		
		System.out.println("y ="+y) ; 
	}

	
	/**
	 * This program return reverse bits. 
	 * E.g. 1010 -> 101 
	 *      1111 -> 1111
	 *      101 -> 101
	 *      1100 -> 11
	 * @param x
	 * @return
	 */
	private static long reverse(long x) {
		long r = 0;
		
		if (x == 0 || x == 1) {
			return x ; 
		}
		
		while (x >= 1) {
			if ((x & 1) == 1) {
				//r = r << 1 | 1;
				r |= 1 ; 
			} else {
				//r &= 1;
			}
			
			x >>=1  ;
			
			// one more check 
			if (x > 0) {
				r <<= 1 ;	
			}
			 
		}

		return r;
	}

}
