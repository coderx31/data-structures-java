package com.coderx.lists;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class QuestionDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList(
                "Shenal", "Pamudu", "Tharindu", "Vajith"
        ));

       // printForward(list);

       // printBackward(list);
        System.out.println("Before swap: "+list);
        exchange(list, 1,2);
        System.out.println("After swap: "+list);


    }

    // print using iterator
    private static void printForward(LinkedList List){
        for(ListIterator itr = List.listIterator(); itr.hasNext();){
            System.out.println(itr.next());
        }
    }

    private static void printBackward(LinkedList list){
        ListIterator itr = list.listIterator(list.size());

        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }

    private static void exchange(LinkedList list, int i, int j){
        Object ithObject = list.get(i);
        Object jthObject = list.get(j);
        list.set(i, jthObject);
        list.set(j,ithObject);
    }

}
