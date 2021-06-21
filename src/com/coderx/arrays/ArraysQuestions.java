package com.coderx.arrays;

import java.util.ArrayList;

public class ArraysQuestions {
    public static void main(String[] args) {
//        int[] a = {34,12,45,10,55};
//       System.out.println(isSorted(a));
//        System.out.println(minimum(a));
//        int[] dup = {12,56,34,12,67,12,56};
//        Integer[] arr = withoutDuplicates(dup);
//        printMe(arr);


//        double[] a = {12.5, 66.7, 34.12, 45.0, 99.9};
//        System.out.println(mean(a));

//        int[] a = {1,2,3,4};
//        reverse(a);

        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8};
        printMe(concatenate(a,b));

    }
    private static void printMe(Integer[] a){
        for(Integer x : a){
            System.out.print(x+ " ");
        }
        System.out.println();
    }

    private static void printMe(int[] a){
        for(int x : a){
            System.out.print(x+" ");
        }
    }
    private static boolean isSorted(int[] a){
        boolean isSort = false;
        for(int i=1; i<a.length; i++){
            if(a[i-1] < a[i]){
                isSort =  true;
            }else{
                isSort =  false;
                break;
            }
        }
        return isSort;
    }

    private static int minimum(int[] a){
        int min = a[0];
        for(int i=0; i<a.length; i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        return min;
    }

    private static double mean(double[] a){
        double total = 0;
        for(int i=0; i<a.length; i++){
            total += a[i];
        }
        return total/a.length;
    }

    private static Integer[] withoutDuplicates(int[] a){
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            if(!b.contains(a[i])){
                b.add(a[i]);
            }
        }

        Integer[] noDup = b.toArray(new Integer[0]);
        return noDup;
    }

    private static void reverse(int[] a){
        for(int i=a.length - 1; i>= 0; i--){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static int[] concatenate(int[] a, int[] b){
        int[] c = concatenate(a,b);
        return c;
    }
}
