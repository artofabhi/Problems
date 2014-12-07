package com.abhi.mywork.nonbook.iter;

import java.util.Iterator;


public class MyIterable<E> implements Iterable<E> {

	private E[] array ; 
	private int currentSize ; 
	
	
	
	public MyIterable(E[] e) {
		this.array = e ;
		this.currentSize = e.length ;
	}



	@Override
	public Iterator<E> iterator() {
		Iterator<E> iterator = new Iterator<E>() {
			int currentIndx = 0 ; 
			
			@Override
			public boolean hasNext() {
				return (currentIndx < currentSize);
			}

			@Override
			public E next() {
				if (currentIndx >= currentSize) {
					throw new ArrayIndexOutOfBoundsException("Overflow collection") ;
				}
				return array[currentIndx++];
			}

			@Override
			public void remove() {
				if (currentSize == 0 ) {
					throw new ArrayIndexOutOfBoundsException("Empty collection") ;
				}
				
				array[currentSize--] = null ;
			}
		};
		return iterator;
	}
}
