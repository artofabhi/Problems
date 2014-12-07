package com.abhi.mywork.nonbook;

import com.abhi.mywork.util.SOP;

public class Test {

	public static void main(String[] a) {
		
		Test t = (Test) getT() ; 
		
		SOP.print("T="+t);
		
		String[] str = new String[]{"a",null,"b"} ;
		
		for (String s : str) {
			SOP.print(s.trim());
			
		}
		
	}
	
	private static Object  getT() {
		return null ; 
	}
	
}
