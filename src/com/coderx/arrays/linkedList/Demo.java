package com.coderx.arrays.linkedList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        // To maintain an ordered list that allows quick insertion and deletions,
        // you should use a linkedList data structure

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(66);
        numbers.add(22);
        numbers.add(44);
        numbers.add(33);
        numbers.add(55);

        numbers.stream().forEach(System.out::println);
    }
}
