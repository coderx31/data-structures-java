package com.coderx.arrays;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        int[] a = {44, 77, 55, 22, 99, 88, 33, 66};
        printMe(a);
        Arrays.sort(a);
        printMe(a);

        int k = Arrays.binarySearch(a, 44);
        System.out.println("Arrays.binarySearch(a, 44): "+k);
        k = Arrays.binarySearch(a, 45);
        System.out.println("Arrays.binarySearch(a, 45): "+k);
        int[] b = new int[8];
        printMe(b);
        Arrays.fill(b, 55);
        printMe(b);
    }

    private static void printMe(int[] a){
        for(int x : a){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
