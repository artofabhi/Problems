package com.abhi.mywork.careercup.chap01;

/**
 * @author apurohit on 9/29/15.
 */
public class ReverseStringRecursive {

    public static String reverse(char[] ch) {
        if (ch == null || ch.length == 0 ) {
            return null ;
        }


        if (ch.length == 1) {
            return ""+ch[0] ;
        }

        return ch[ch.length-1] + reverse(ch[0,ch.length-1)) ;
    }


    public static void main(String[] a) {
        String s = "abc" ;
        String r = reverse(s) ;
        System.out.println(r) ;

        s = "a" ;
        r = reverse(s) ;
        System.out.println(r) ;

        s = "" ;
        r = reverse(s) ;
        System.out.println(r) ;

        s = null ;
        r = reverse(s) ;
        System.out.println(r) ;

        s = "abcde" ;
        r = reverse(s) ;
        System.out.println(r) ;

    }
}
