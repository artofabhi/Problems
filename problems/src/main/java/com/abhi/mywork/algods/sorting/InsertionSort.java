/**
 * 
 */
package com.abhi.mywork.algods.sorting;

/**
 * @author abpurohit
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Test....") ;
//		int[] arr = new int[]{5,2,4,6,1,3} ;
		int[] arr = new int[]{6,5,4,3,2,1} ;
		
		InsertionSort iSort = new InsertionSort() ; 
		iSort.sortASC(arr) ;
		System.out.println("done"); 

	}
	
	
	private void sortASC(int[] arr) {
		
		if (arr == null || arr.length == 0) {
			System.out.println("Empty Array") ; 
			return ; 
		}
		
		int key = -1 ;
		int j = -1 ;
		for (int i = 1 ; i < arr.length ; i++ ) {
			
			key = arr[i] ;
			j = i-1 ; 
			while (j >= 0 && (arr[j] > key)) {
				// swap 
				arr[j+1] = arr[j] ; 
				j--  ;
				
			}
			arr[j+1] = key ; 
			
			
			
		}
		
	}

}
