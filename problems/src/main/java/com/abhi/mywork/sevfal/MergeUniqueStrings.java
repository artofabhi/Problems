package com.abhi.mywork.sevfal;


public class MergeUniqueStrings {

	public static void main(String[] args) {
		

		MergeUniqueStrings mp = new MergeUniqueStrings() ;
		
		// Test 1 : Null check
		String msg = "Test 1 : Null check" ;
		String[] a = null ; 
		String[] b = null ;
		String[] result = mp.mergeTwo(a, b, 3) ;
		mp.printResult(result,msg) ; 

		// Test 2: blank string test
		msg = "Test 2: internal elements blank string test" ; 
		a = new String[] {"", "c", "z"} ; 
		b = new String[] {"b", "", "z"} ;
		try {
			result = mp.mergeTwo(a, b, 3) ;
			mp.printResult(result,msg) ;
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Test 2: internal elements blank string test"); 
			System.out.println(e.getMessage()); 
			System.out.println("---------------"); 
		}

		// Test 3: 
		msg = "Test 3: N=3 {\"a\", \"c\", \"z\"}, {\"b\", \"f\", \"z\"}  --> {a,b,c}" ; 
		a = new String[] {"a", "c", "z"} ; 
		b = new String[] {"b", "f", "z"} ;
		result = mp.mergeTwo(a, b, 3) ;
		mp.printResult(result,msg) ; 

		// Test 4: 
		msg = "Test 4: N=3 {\"a\", \"c\", \"z\"}, {\"c\", \"f\", \"z\"}  --> {a,c,f}" ; 
		a = new String[] {"a", "c", "z"} ; 
		b = new String[] {"c", "f", "z"} ;
		result = mp.mergeTwo(a, b, 3) ;
		mp.printResult(result,msg) ; 

		// Test 5: 
		msg = "Test 5: N=3 {\"f\", \"g\", \"z\"}, {\"c\", \"f\", \"z\"}  --> {c,f,g}" ; 
		a = new String[] {"f", "g", "z"} ; 
		b = new String[] {"c", "f", "g"} ;
		result = mp.mergeTwo(a, b, 3) ;
		mp.printResult(result,msg) ; 

		// Test 6: 
		msg = "Test 6:N=3  a[] and b[] elemets are more than n {\"k\", \"l\", \"r\", \"s\"}, {\"b\", \"f\", \"q\",\"t\"}  --> {b,f,k}" ;  
		a = new String[] {"k","l","r","s"} ; 
		b = new String[] {"b","f","q","t"} ;
		result = mp.mergeTwo(a, b, 3) ;
		mp.printResult(result,msg) ; 

		// Test 7: 
		msg = "Test 7:N=4  {\"k\", \"l\", \"r\", \"s\"}, {\"b\", \"f\", \"q\",\"t\"}  --> {b,f,k,l}" ;  
		a = new String[] {"k","l","r","s"} ; 
		b = new String[] {"b","f","q","t"} ;
		result = mp.mergeTwo(a, b, 4) ;
		mp.printResult(result,msg) ; 

		// Test 8: 
		msg = "Test 8:N=1  {\"k\"}, {\"b\"}  --> {b}" ;  
		a = new String[] {"k"} ; 
		b = new String[] {"b"} ;
		result = mp.mergeTwo(a, b, 1) ;
		mp.printResult(result,msg) ; 
		
	}
	
	
	/**
	 * Problem statement: 
	 * Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
	 * Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical 
	 * order and without duplicates.
	 * A and B will both have a length which is N or more. 
	 * 
	 * Examples are: 
	 * mergeTwo({"a", "c", "z"}, {"b", "f", "z"}, 3) → {"a", "b", "c"}
	 * mergeTwo({"a", "c", "z"}, {"c", "f", "z"}, 3) → {"a", "c", "f"}
	 * mergeTwo({"f", "g", "z"}, {"c", "f", "g"}, 3) → {"c", "f", "g"}
	 *  
	 *  O(n) time complexity and O(n) space complexity
	 *  
	 *  If elements in a[] or b[] are blank or null, it throws {@link RuntimeException} 
	 *  
	 * @param a
	 * @param b
	 * @param n
	 * @return
	 */
	public String[] mergeTwo(String[] a, String[] b, int n) {
		if (a == null || a.length == 0 || b == null || b.length == 0 || n == 0 ) {
			return new String[]{} ; 
		}
		
		// 0 or -ve n passed
		if (n <= 0) {
			return new String[]{} ;
		}
		
		String[] result = new String[n] ;
		
		// initialize counters 
		int ia = 0 ; // for a[]
		int ib = 0 ; // for b[]
		
		for (int ir = 0 ; ir < n ; ir++ ) {
			
			if (a[ia] == null || a[ia].trim().length() == 0) {
				throw new RuntimeException("Invalid input provided for a[]") ;  
			}
			if (b[ib] == null || b[ib].trim().length() == 0) {
				throw new RuntimeException("Invalid input provided for b[]") ;				
			}

			// takes care of string comparison lexicographically, i.e. "a" < "b" or , "ba" < "ca"
			if (a[ia].compareTo(b[ib]) < 0 ) {   
				result[ir] = a[ia++] ; 
			} else if (a[ia].compareTo(b[ib]) > 0) { 
				result[ir] = b[ib++] ; 
			} else { // in case equal, increment both to avoid duplicates in result
				result[ir] = b[ib++] ; 
				ia++ ; 
			}
		}
		return result ; 
	}
	
	
	/**
	 * Prints result[] strings contents. 
	 * @param result
	 * @param msg
	 */
	private void printResult(String[] result, String msg) {
		
		if (result == null) {
			System.out.print("blank result");
			return ;
		}

		System.out.println(msg+":result array length="+result.length);
		System.out.print("{");
		for (int i = 0 ; i < result.length ; i++) {
			char c = ',' ; 
			if (i == result.length-1) {
				c = '}' ; 
			}
			System.out.print("\""+result[i]+"\""+c); 
		}
		System.out.println();
		System.out.println("-----------------");
	}
}

