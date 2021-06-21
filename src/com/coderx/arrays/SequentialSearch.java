package com.coderx.arrays;

public class SequentialSearch {
    // also known as the linear search
    // least efficient search algorithm
    public static void main(String[] args) {
        int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println(search(a,33));
    }

    private static int search(int[] a, int x){
        //int ans = -1;
        for(int i=0; i< a.length; i++){
           if( a[i] == x){
               return i;
           }
        }
        return -1;
    }
}
