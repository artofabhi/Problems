package com.abhi.mywork.nonbook.iter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by apurohit on 8/6/15.
 */
public class FruitCollection<T> implements Serializable,Iterable<T>{


    private Collection<T> fruitCollection = new ArrayList<T>() ;


    public Iterator<T> iterator() {
        return this.fruitCollection.iterator();
    }
}
