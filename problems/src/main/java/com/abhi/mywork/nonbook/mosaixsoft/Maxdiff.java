package com.abhi.mywork.nonbook.mosaixsoft;

/**
 * Created by apurohit on 9/14/15.
 *
 */
public class Maxdiff {


    public static void main(String[] a){

        int[] arr = new int[]{4,2,5,1,7,9,10 } ; // max diff is between 1 and 10 i.e.9

        int lowIndx = Integer.MAX_VALUE ;
        int diff = 0 ;

        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] < lowIndx) {
                lowIndx = arr[i] ;
                continue ;
            } else if (diff < arr[i] - lowIndx) {
                diff = arr[i] - lowIndx ;
            }
        }
        System.out.println("Max Diff is "+diff) ;
    }
}
