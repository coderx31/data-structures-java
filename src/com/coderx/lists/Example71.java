package com.coderx.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example71 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Shenal", "Pamudu", "Tharindu", "Vajith");
        System.out.println(list);
//        list.add(3, "Ruchira");
//        System.out.println(list);
//        System.out.println(list.indexOf("Pamudu"));
//        System.out.println(list.subList(1,4));
        System.out.println();
        Collections.reverse(list);
        System.out.println(list);
    }
}
