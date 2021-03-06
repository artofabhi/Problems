/**
 * 
 */
package com.abhi.mywork.algods.sorting;

/**
 * @author abpurohit
 *
 */
public class HeapSort {

	private int[] arr = null ; 
	/**
	 * 
	 */
	
	
	public HeapSort(int[] arr) {
		
		if(arr == null || arr.length < 1)   {
			throw new IllegalArgumentException("wrong input size") ; 
		}
		
		this.arr = arr ; 
	}
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = new int[] {5,6,2,3,8,4,9,0,1,7} ;
		HeapSort hSort = new HeapSort(arr) ; 
		
		for (int i = arr.length/2 ; i >= 0 ; i--) {
			hSort.trickleDown(i) ; 
		}

		// print heap 
		// sort
		hSort.sort(0) ; 
	}

	private void trickleUp(int i) {
		
	}
	
	private void sort(int i) {
		
	}


	private void trickleDown(int indx) {

		// LOOP begin
		// 1. find left and right child
		// 2. find larger of left|right
		// 3. store top (indx) 
		// 4. swap larger child with top 
		// LOOP ends
		// 5. store top as larger (loop's last indx) 
		
		int top = this.arr[indx] ;
		
		while (indx < arr.length/2) { 

			int left = arr[indx*2 + 1] ; 
			int right = arr[indx*2+2] ; 
			int larger = -1 ; 
			if (right < arr.length && arr[left] < arr[right]) {
				larger = right ; 
			} else {
				larger = left ; 
			}
			
			if (arr[indx] >= arr[larger]) {
				break ; 
			}
			arr[indx] = arr[larger] ; 
			indx = larger ; 
		}
		arr[indx] = top ; // restore top
	}
	
	
	

}
