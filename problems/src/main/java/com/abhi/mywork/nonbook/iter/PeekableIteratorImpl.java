package com.abhi.mywork.nonbook.iter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by apurohit on 8/23/15.
 */
public class PeekableIteratorImpl<E> implements PeekableIterator <E> {

    private E currentElem;
    private Iterator<E> internalIterator ;

    private boolean isPeek;

    public PeekableIteratorImpl(Iterator itr){
        this.internalIterator = itr ;
    }



    public boolean hasNext() {
        return this.internalIterator.hasNext() ;
    }

    public E next() {
        if (!this.hasNext()) {
            throw new IndexOutOfBoundsException("index is out of range") ;
        }

        this.currentElem = this.internalIterator.next() ;
        this.isPeek = true ;
        return this.currentElem;

    }

    public E peek() {

        if (!this.hasNext()){
            throw new IndexOutOfBoundsException("Iterator ended") ;
        }

        if (isPeek) {
            return this.currentElem ;
        }
        this.isPeek = true ;
        return this.next() ;

    }


    public void remove() {


    }



    public static class PeekIteratorTest {



        public static void main(String[] a) {

            List<String> list = new ArrayList<String>() ;

            list.add("One");
            list.add("Two");
            list.add("Three");
            list.add("Four");
            list.add("Five");
            list.add("Six");

            PeekableIterator<String> peekItr = new PeekableIteratorImpl<String>(list.iterator()) ;
            assert(peekItr.hasNext()) ;
            String s = peekItr.peek() ;
            assert(s.equals("One")) ;

            s = peekItr.next() ;
            assert (s.equals("One")) ;

            s = peekItr.peek() ;
            assert(s.equals("One")) ;

            s = peekItr.peek() ;
            assert(s.equals("One")) ;

            s = peekItr.next() ;
            assert(s.equals("Two")) ;

            s = peekItr.peek() ;
            assert(!s.equals("One")) ;
            assert(s.equals("Two")) ;









        }
    }

}
