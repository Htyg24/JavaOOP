package org.example;

import javax.swing.*;
import java.util.Iterator;
import java.util.Random;
import java.util.SortedMap;

public class IterebleIterator implements Iterable<Integer>{
    private final int end;

    public IterebleIterator(int end) {
        this.end = end;
    }

    Random random = new Random();
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int counter = 0;
            @Override
            public boolean hasNext() {
                return counter <= end;
            }

            @Override
            public Integer next() {
                counter++;
                return random.nextInt();
            }
        };
    }

    public static void main(String[] args) {
        IterebleIterator iterator = new IterebleIterator(10);
        for (Integer integer: iterator){
            System.out.println(integer);
        }
    }
}