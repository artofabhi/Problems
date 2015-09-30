package com.abhi.mywork.concurrent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apurohit on 8/22/15.
 */
public class PhaserDemo {

    public static void main(String[] a) {


        List<Runnable> tasks = new ArrayList<Runnable>() ;
        tasks.add(new Runnable() {
                      public void run() {

                      }
                  }

        );
    }

}
