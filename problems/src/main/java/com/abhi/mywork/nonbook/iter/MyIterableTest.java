package com.abhi.mywork.nonbook.iter;

import java.util.Iterator;



import com.abhi.mywork.util.SOP;

public class MyIterableTest {


	public void testIterator() {
		
		String[] strArr = new String[] {"A","B","C","D"} ;
		
		MyIterable<String> myItr = new MyIterable<String>(strArr) ;
		
		Iterator<String> itr = myItr.iterator() ; 
		
		while (itr.hasNext()) {
			SOP.println(itr.next());
		}
		
	}

}
