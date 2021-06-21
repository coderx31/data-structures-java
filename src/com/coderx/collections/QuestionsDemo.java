package com.coderx.collections;

import java.util.*;

public class QuestionsDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList(
                "Shenal", "Pamudu"
        ));
       // System.out.println(chars(names));

//        Collection names = new ArrayList(Arrays.asList(
//                "Shenal", "Pamudu", "Vajith", "Tharindu", "Pasan", "Ruchira"
//        ));
//        print(names);

//        Collection names = new ArrayList(Arrays.asList(
//                "Shenal", "Pamudu", "Shenal", "Vajith", "Tharindu", "Shenal", "Pasan", "Ruchira", "Shenal"
//        ));
//
//        System.out.println(frequency(names, "Shenal"));
//
//        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(
//                23,14,15,23,45,55,23,11,67,23
//        ));
//
//        System.out.println(frequency(numbers, 23));

        try {
            System.out.println(getLast(names));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    private static int chars(List<String> strings){
        int total = 0;
        if(strings.isEmpty()){
            return 0;
        }
        for(String s : strings){
            total += s.length();
        }
        return total;
    }

    private static void print(Collection c){
        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static <E> int frequency(Collection<E> c, E e){

        int freq = 0;
        if(c.isEmpty()){
            return 0;
        }
        // with iterator
//        Iterator<E> iterator = c.iterator();
//        while (iterator.hasNext()){
//            if(e.equals(iterator.next())){
//                freq++;
//            }
//        }
//        return freq;

        // with enhanced for loop
        for(E ee : c){
            if(ee.equals(e)){
                freq++;
            }
        }
        return freq;
    }

    private static <E> E getLast(List<E> list) throws Exception{
        if(list.isEmpty()){
            throw new Exception("List is empty!");
        }
        E last = null;
        // iterator
//        Iterator<E> iterator = list.iterator();
//        while (iterator.hasNext()){
//            last = iterator.next();
//        }
//
//        return last;

        for(E ee : list){
            last = ee;
        }
        return last;
    }
}
