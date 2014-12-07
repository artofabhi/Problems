package com.abhi.mywork.epi_ch07;

import com.abhi.mywork.util.SOP;

public class Palindrom {

	public static void main(String[] args) {


//		String s = "Abba" ; 
		String s = "A man, a plan, a canal,  Panama" ; 
		SOP.println(s+" is palindrom?:"+isPalindrom(s));
	}
	
	
	public static boolean isPalindrom(String s) {
		if (s == null) {
			return false ; 
		}
		
		if (s.length() == 0) {
			 return true ; 
		}
		
		s = s.toLowerCase() ;
		
		char[] chA = s.toCharArray() ; 
		
		int j = chA.length-1 ; 
		int i = 0 ; 
		while (i < j) {
			
			while (chA[i] < 'a' || chA[i] > 'z' && i < j) {
				i++ ; 
			}
			
			while (chA[j] < 'a' || chA[j] > 'z' && i < j) {
				j-- ; 
			}
			
			if (chA[i++] != chA[j--]) {
				return false ; 
			}
		}
		
		return true ; 
	}

}
