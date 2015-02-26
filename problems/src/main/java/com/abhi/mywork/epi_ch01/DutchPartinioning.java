package com.abhi.mywork.epi_ch01;

import com.abhi.mywork.util.SOP;

public class DutchPartinioning {

	public static void main(String[] args) {
		int[] arr = new int[] {6,4,8,1,7,0,2,5,12,5,9,10,16,12} ;
		
		int pivot = 6 ;
		partition(arr, pivot);
		
		print(arr, pivot);
		
	}

	private static void print(int[] arr, int pivot) {
		int numCharacters = 0 ;
		for (int i = 0 ; i < arr.length ; i++) {
			SOP.print(""+arr[i]+",");
			
			if (i < pivot) {
				
				numCharacters += (""+arr[i]+",").length() ;
			}
		}
		
		
		SOP.println("");
		for (int i = 0 ; i < numCharacters ; i++) {
			SOP.print(" ");
			
		}
		SOP.print("^");
	}
	
	public static void partition(int[] arr, int pivot) {
		
		int equal= 0 , smaller = 0, larger = arr.length-1 ; 
		
		print(arr,pivot) ; 
		while (equal <= larger) {
			if (arr[equal] < arr[pivot]) {
				swap(arr, equal++, smaller++) ;
			} else if (arr[equal] == arr[pivot]) {
				++equal ; 
			} else  { // arr[equal] > arr[pivot]
				swap(arr,equal, larger--) ;
			}
			SOP.println("");
			print(arr,pivot) ;
		}
	}

	private static void swap(int[] arr, int i, int j) {
		
		int tmp = arr[i] ; 
		arr[i] = arr[j] ; 
		arr[j] = tmp ; 
 		
	}
	
}
