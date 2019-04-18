package com.hyh.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
          Integer a =  iterator.next();
            iterator.forEachRemaining(System.out::println);
        }

    }
}
