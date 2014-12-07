/**
 * 
 */
package com.abhi.mywork.algods.sorting;

/**
 * @author abpurohit
 *
 */
public class MergeSort {

	int[] arr  ;
	
	int[] temp  ;
	
	public MergeSort(){
		
	}
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		

		MergeSort ms = new MergeSort() ;
//		int[] arr = new int[] {2,6,3,0,1,7,9,0} ;
		int[] arr = new int[] {2,6,3,0} ;
		
		ms.temp = new int[arr.length];
		ms.mergeSort(arr, 0, arr.length-1) ;

		
	}
	
	private void mergeSort(int[] arr, int l , int r) { 
		

		if ((r-l) <= 2) {
			return ; 
			
		}
		
		if (l < r ) {
			int m = (l+r)/2 ; 

			mergeSort(arr, l,m) ;
			
			mergeSort(arr, m+1, r) ;
			
			//now merge it
			merge(arr, l, m,r)  ; 
			
		}

	}
	
	private void merge(int[] arr, int l, int m, int r) {
		
		for(int i = l ; i <= r ; i++)
			temp[i] = arr[i];
		
		if (l == r) {
			return ; 
		} else if ((r-l+1) == 2) {
			if (arr[l] < arr[r]) {
				int t = arr[l] ; 
				arr[l] = arr[r] ; 
				arr[r] = t ; 
			}
		} else {
		
		
			int firstArrStart = l ; 
			int secondArrStart = m+1 ; 
			int high = r ; 
			
			while ((firstArrStart <= m) && (secondArrStart <= high)) {
				

				if ((arr[firstArrStart] > arr[secondArrStart])) {
					int t = arr[firstArrStart] ; 
					arr[firstArrStart] = arr[secondArrStart] ; 
					arr[secondArrStart] = t; 
					secondArrStart++ ; 
				} else {
					
				}
			}
		}		
	}
}
