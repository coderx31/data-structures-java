package com.coderx.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {22,43,13,56,78};
        printMe(a);
        System.out.println();
        int[] b = a.clone();
        b[2] = 15;
        printMe(b);
        System.out.println();
        printMe(a);


    }
    private static void printMe(int[] a){
        for(int num : a){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
