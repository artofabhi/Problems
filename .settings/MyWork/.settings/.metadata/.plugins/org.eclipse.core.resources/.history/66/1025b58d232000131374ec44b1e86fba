/**
 * 
 */
package com.abhi.mywork.algods.sorting;

/**
 * @author abpurohit
 *
 */
public class SelectionSort {

	/**
	 * 
	 */
	public SelectionSort() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SelectionSort s = new SelectionSort() ; 
		System.out.println("Test....") ;
		int[] arr = new int[]{5,2,4,6,1,3} ;
//		int[] arr = new int[]{6,5,4,3,2,1} ;
		
		s.sortASC(arr) ;
		System.out.println("done"); 
		

	}
	
	
	public void sortASC(int[] arr) {
		
		if (arr == null || arr.length == 0) {
			return ; 
		}
		
		int key = -1 ;
		int smallest = -1 ;
		int index = -1 ;
		for (int i = 0 ; i < arr.length ; i++) {
			key = arr[i] ;
			smallest = arr[i] ;
			index = i ;
			for (int j = i+1 ; j < arr.length ; j++) {
				if (smallest > arr[j]) {
					smallest = arr[j] ;
					index = j ;
				}
			}
			
			arr[index] = arr[i] ; 
			arr[i] = smallest ;
		}
		
	}

}
