package com.coderx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Simplifying {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};

        System.out.println(numbers[numbers.length - 1]); // accessing the last element


        List<String> names = new ArrayList<>(Arrays.asList(
                "Shenal", "Pamudu", "Vajith", "Tharindu", "Pasan", "Ruchira"
        ));

        System.out.println(names.get(names.size() - 1)); // accessing the last element
    }
}
