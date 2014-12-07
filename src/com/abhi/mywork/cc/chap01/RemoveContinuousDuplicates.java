package com.abhi.mywork.cc.chap01;

import static com.abhi.mywork.util.SOP.*;

public class RemoveContinuousDuplicates {

	public static void main(String[] args) {

//		String s = "ABBCDDEEEEFGHII" ;
//		String s = "abcdez" ;
//		String s = "aaaabbbccc" ;
		String s = "ababab" ;
		
		
		String unique = getUnique(s) ; 
		
		println("New Array="+unique) ; 
		
	}

	private static String getUnique(String s) {
		
		// basic checks 
		
		int uniqueIdx = 0 ; 
		int len  = s.length();
		char[] chArr = s.toCharArray() ; 
		for (int i = 0 ; i < len ; i++) {
			
			while ((i+1) < len && chArr[i] == chArr[i+1]) {
				i++ ; 
				continue ; 
				
			}
			
			chArr[uniqueIdx++] = chArr[i] ; 
			
		}
		
		
		
		return new String(chArr,0,uniqueIdx);
	}

}
