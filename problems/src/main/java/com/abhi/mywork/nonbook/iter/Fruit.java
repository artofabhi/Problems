package com.abhi.mywork.nonbook.iter;

import java.io.Serializable;
import java.util.Iterator;

/**
 * Created by apurohit on 8/6/15.
 */
public class Fruit implements Serializable {

    String color ;
    String name ;
    String likes ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

}
