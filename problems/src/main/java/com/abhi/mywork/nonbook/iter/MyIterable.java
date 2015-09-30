package com.abhi.mywork.nonbook.iter;

import java.util.Iterator;


public class MyIterable<E> implements Iterable<E> {

	private E[] array;
	private int currentSize;


	public MyIterable(E[] e) {
		this.array = e;
		this.currentSize = e.length;
	}


	public Iterator<E> iterator() {
			return new Iterator<E>() {
				int currentIndx = 0;


				public boolean hasNext() {
					return (currentIndx < currentSize);
				}


				public E next() {
					if (currentIndx >= currentSize) {
						throw new ArrayIndexOutOfBoundsException("Overflow collection");
					}
					return array[currentIndx++];
				}


				public void remove() {
					if (currentSize == 0) {
						throw new ArrayIndexOutOfBoundsException("Empty collection");
					}

					array[currentSize--] = null;
				}
			};
		}
}
