package com.abhi.mywork.apple;

import com.abhi.mywork.util.SOP;

public class Pangram {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy 121dog 121" ; 

		boolean isPengram = isPengram(sentence) ; 
		
		SOP.print(sentence + " is pengram? : "+isPengram);
	}

	public static boolean isPengram(String sentence) {
		if (sentence == null || sentence.length() == 0) {
			return false ; 
		}
		
		char[] chars = sentence.toCharArray() ; 
		boolean[] hasChar = new boolean[26] ;
		for (char c : chars) {
			if (c-'a' < 0 || c-'a' > 25) {
				continue ; 
			}
			
			hasChar[c-'a'] = true ; 
			
		}
		
		
		for (boolean v : hasChar) {
			if (!v) {
				return false ; 
			}
			
		}
		
		return true ; 
		
	}

}





/* My code online
 * 
# a pangram is a sentence that includes all letters a-z, at least once
# Write a function that will give a boolean answer to isPangram(sentence)
# For example isPangram("The quick brown fox jumps over the lazy dog.") => true
# For example isPangram("hello world, this is false.") => false

# Hint: 
#    Okay to assume its ASCII
#    sentence.toCharArray()
#    char a = 'a'
#    'a' - a == 0
#    'z' - a == 25


public static boolean isPangram(String sentence) 
{

    // null empty checks 
    if (sentence == null || sentence.lenth() == 0 ) {
        return false ; 
    }
    
    sentence = sentence.toLowerCase();
    boolean[] hasChar = new boolean[26];
    

    for(char c : sentence.toCharArray()) {

        // 1. check if c is not white space. 
        // 2. check if c is not digit
        // return false for 1, 2
        
        // 3. if its jut alpha characters, then hasChar[c-'a'] = true
        
        if (c -'a' < 0 || c - 'a' > 25 ) { 
            continue ;  
        }
        
        hasChar[c-'a'] = true ;
        
    }
    
    int len = hasChar.lenth ; 
    
    for (int i = 0 ; i < len ; i++ ) {
    
        if (!hasChar[i]) {
            return false ; 
        } 
        
    }
    
    return true ; 

}
*/