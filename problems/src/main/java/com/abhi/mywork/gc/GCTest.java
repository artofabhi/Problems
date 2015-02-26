package com.abhi.mywork.gc;

public class GCTest {

	public static void main(String[] args) {

		createJunkies();
	}
	
	
	public static void createJunkies() {
		
		long limit = (long)Math.pow(2, 30) ;
		System.out.println(limit) ;
		for (long i = 0 ; i < limit ; i++) {
			Node n = new Node() ; 
			
		}
	}
	

	public static class Node {
		int data = 5 ; 
		
		@Override
		protected void finalize() throws Throwable {
			super.finalize();
			System.out.println("GC invoked") ; 
		}
	}
	
}
